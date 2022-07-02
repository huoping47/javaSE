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
 * @date 2022/6/28 20:04
 * @mouse 六月
 */
@WebServlet("/Test03")
public class Test03 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		//连接数据库
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","ZXChuoping1314.");
			String sql = "select * from user";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			StringBuffer stringBuffer = new StringBuffer();
			String html;
			stringBuffer.append("[");
			while (rs.next()) {
				String useName = rs.getString("UserName");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");
				//var str = [{''username'':''zhangsan'','age':21,'sex':男},{'username'':''zhangsan'','age':21,'sex':男}];
				stringBuffer.append("{\"username\":\""+useName+"\",");
				stringBuffer.append("\"age\":\""+age+"\",");
				stringBuffer.append("\"sex\":\""+sex+"\"},");
			}
			String substring = stringBuffer.substring(0, stringBuffer.length() - 1);
			out.println(substring+"]");
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
	}
}
