package com_day6_16.demo;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @author 霍平
 * @date 2022/6/17 18:50
 * @mouse 六月
 */

public class ServletTest01 implements Servlet {

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		servletResponse.setContentType("text/html");
		//连接数据库
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter pw = servletResponse.getWriter();
		pw.print("<h1>标题</h1>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("JDBC:mysql://localhost:3306/test02","root","ZXChuoping1314.");
			String sql = "select * from t_student";
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while (rs.next()){
				String age = rs.getString("age") ;
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				pw.print("age="+age+"<br>"+"name="+name+"<br>"+"sex="+sex+"<br>");
			}
		} catch (ClassNotFoundException |
				 SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
			if (pw != null) {
				pw.close();
			}
		}
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}
}
