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
 * @date 2022/6/19 19:16
 * @mouse 六月
 */

public class Update extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String path = req.getContextPath();
		String id = req.getParameter("id");
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<title>修改页面</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h4>修改信息</h4>");
		out.print("<form action='"+path+"/Updates?id="+id+"' method='post'>");
		try {
			conn = Pro.getCon();
			String sql = "select age,name,sex,birthday from t_myHome where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String age =rs.getString("age");
				String sex = rs.getString("sex");
				String birthday = rs.getString("birthday");
				out.print("姓名：<input type='text' name='username' value='"+name+"'><br>");
				out.print("年龄：<input type='text' name='age' value='"+age+"'><br>");
				out.print("性别：<input type='text' name='sex' value='"+("1".equals(sex)?"男":"女")+"'><br>");
				out.print("生日：<input type='text' name='birthday' value='"+birthday+"'>");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			Pro.close(conn,pstmt,rs);
		}
		out.print("<input type='submit' value='提交' >");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}
}
