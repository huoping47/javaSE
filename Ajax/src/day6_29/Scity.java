package day6_29;


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
 * @date 2022/6/29 22:23
 * @mouse 六月
 */
@WebServlet("/Sarea")
public class Scity extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String st = req.getParameter("pid");
		//连接数据库,并且把查询出来的数据给返回到前端
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer str = new StringBuffer();
		try {
			//注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接对象
			String url = "jdbc:mysql://localhost:3306/user";
			String user = "root";
			String pwd = "ZXChuoping1314.";
			conn = DriverManager.getConnection(url,user,pwd);
			//预编译sql语句
			String sql ="";
			if (st == null) {
				sql = "select cid,city from t_area where pid is null";
				pstmt = conn.prepareStatement(sql);
			}else{
				sql = "select cid,city from t_area where pid = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,st);
			}
			//执行sql语句
			//返回结果集
			rs = pstmt.executeQuery();
			str.append("[");
			while (rs.next()) {
				String cid = rs.getString("cid");
				String city = rs.getString("city");
				str.append("{\"cid\":");
				str.append("\""+cid+"\",");
				str.append("\"city\":");
				str.append("\""+city+"\"},");
			}
			String substring = str.substring(0, str.length() - 1);
			out.println(substring+"]");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			//释放资源
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

	}
}
