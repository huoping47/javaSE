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
import java.sql.SQLException;

/**
 * @author 霍平
 * @date 2022/6/19 19:48
 * @mouse 六月
 */

public class Updates extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String name = req.getParameter("username");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");
		String birthday = req.getParameter("birthday");
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;
		try {
			conn = Pro.getCon();
			String sql = "update t_myHome set name=?,age=?,sex=?,birthday=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,age);
			pstmt.setString(3,sex);
			pstmt.setString(4,birthday);
			pstmt.setString(5,id);
			rs = pstmt.executeUpdate();
			if (rs >=1) {
				UserList up = new UserList();
				up.doGet(req, resp);
			}else{
				out.println("执行失败");
			}
//			UserList userList = new UserList();
//			userList.doGet(req, resp);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			Pro.close(conn,pstmt,null);
		}
	}
}
