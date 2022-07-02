package User;

import DBsql.ConnectMysql;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author 霍平
 * @date 2022/6/22 20:38
 * @mouse 六月
 */

@WebServlet({"/List","/detail"})
public class UserList1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		if (request.getServletPath().equals("/List")) {
			doList(request,response);
		} else if (request.getServletPath().equals("/detail")) {
			doDetail(request,response);
		}

	}

	/**
	 * 查看用户详情方法
	 * @param request
	 * @param response
	 */
	private void doDetail(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter writer = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		ArrayList<UserClass> list = new ArrayList<UserClass>();
		try {
			writer = response.getWriter();
			String id = request.getParameter("id");
			writer.println(id);
			 conn = ConnectMysql.getConn();
			 String sql = "select * from t_myHome where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			rs =psmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				String sex = rs.getString("sex");
				String birthday = rs.getString("birthday");

				UserClass us = new UserClass();
				us.setName(name);
				us.setAge(age);
				us.setSex(sex);
				us.setBirthday(birthday);

				list.add(us);

				request.setAttribute("us",list);
				request.getRequestDispatcher("detail.jsp").forward(request, response);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ServletException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 	查询用户列表方法
	 */
	private void doList(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<UserClass> ar = new ArrayList<>();
		PreparedStatement pstm = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			PrintWriter out = response.getWriter();
			conn = ConnectMysql.getConn();
			out.println(conn);
			String sql = "select * from t_myHome";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				String sex = rs.getString("sex");
				int id = rs.getInt("id");

				UserClass uce = new UserClass();
				uce.setAge(age);
				uce.setName(name);
				uce.setSex(sex);
				uce.setId(id);

				ar.add(uce);
			}
			request.setAttribute("user",ar);
			request.getRequestDispatcher("UserList.jsp").forward(request,response);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ServletException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}finally {
			ConnectMysql.closeSql(rs,pstm,conn);
		}
	}

}
