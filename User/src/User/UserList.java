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
 * @date 2022/6/19 17:18
 * @mouse 六月
 */

public class UserList extends HttpServlet {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String path = req.getContextPath();
		out.print("<!DOCTYPE html>");
		out.print("<html lang='en'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<title>用户列表</title>");
		out.print("</head>");
		out.print("<style>");
		out.print("	table{");
		out.print("			color: black;");
		out.print("				width: 50%;");
		out.print("				border-block-color: lavender;");
		out.print("				}");
		out.print("</style>");
		out.print("<body>");
		out.print("<h1 align='center'>用户列表</h1>");
		out.print("<table align='center' border='3'>");
		out.print("<tr>");
		out.print("<td>姓名</td>");
		out.print("<td>年龄</td>");
		out.print("<td>性别</td>");
		out.print("<td>更多操作</td>");
		out.print("</tr>");
		try {
			conn = Pro.getCon();
			String sql = "select name,age,sex,id from t_myHome";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				String sex = rs.getString("sex");
				String id = rs.getString("id");
				out.print("<tr>");
				out.print("<td>"+name+"</td>");
				out.print("<td>"+age+"</td>");
				out.print("<td>"+(sex.equals("1")?"男":"女")+"</td>");
				out.print("<td>");
				out.print("<a href='"+path+"/Update?id="+id+"'>修改</a>");
				out.print("<a href='"+path+"/Delete?id="+id+"'>删除</a>");
				out.print("<a href='"+path+"/Details/one?id="+id+"'>详情</a>");
				out.print("</td>");
				out.print("</tr>");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			Pro.close(conn,pstmt,rs);
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
}
