package day6_27;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @author 霍平
 * @date 2022/6/27 21:17
 * @mouse 六月
 */
@WebServlet( "/Test02")
public class Test02 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String uname = req.getParameter("uname");
		//默认名字是不存在的
		boolean flg = false;
		//连接数据库
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","ZXChuoping1314.");
			String sql = "select UserName from user where UserName=?";
			//预编译sql语句
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,uname);
			//执行sql语句，返回结果集
			rs = pstmt.executeQuery();
			if (rs.next()) {
				flg = true;
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
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
		}

		if (flg){
			out.println("<font color='red'> 名字已经存在了</font>");
		}else{
			out.println("<font color = 'green'>该用户名可以使用</font>");
		}
	}
}
