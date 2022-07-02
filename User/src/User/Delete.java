package User;

import DBSql.Pro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 霍平
 * @date 2022/6/19 20:46
 * @mouse 六月
 */

public class Delete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String id = req.getParameter("id");
		try {
			conn = Pro.getCon();
			String sql = "delete from t_myHome where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			int a = pstmt.executeUpdate();
			if (a > 0) {
				UserList updatement = new UserList();
				updatement.doGet(req, resp);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
