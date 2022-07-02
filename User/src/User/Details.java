package User;

import DBSql.Pro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 霍平
 * @date 2022/6/19 18:53
 * @mouse 六月
 */

public class Details extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;");
		PrintWriter out = resp.getWriter();
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String id = req.getParameter("id");
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<title>用户详情页面</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h4>用户详情</h4>");
		try {
			conn = Pro.getCon();
			String sql = "select * from t_myHome where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				String sex = rs.getString("sex");
				String birthday = rs.getString("birthday");
				out.print("				 名字：<span>"+name+"</span><br>");
				out.print("		年龄：<span>"+age+"</span><br>");
				out.print("		性别：<span>"+(sex.equals("1")?"男":"女")+"</span><br>");
				out.print("		生日：<span>"+birthday+"</span><br>");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		out.print("<button onclick='window.history.go(-1)'>返回</button>");
		out.print("</body>");
		out.print("</html>");
	}
}
