package com_day6_18.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author 霍平
 * @date 2022/6/18 17:24
 * @mouse 六月
 */

public class HttpTest01 extends HttpServlet {
	/**
	*重写了doGet方法,前端只能通过GET方法来提交数据，不能使用POST方法提交数据
	 * 如果是重写了POST方法，前端就只能使用POST方法提交数据
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		req.getRequestDispatcher("/test").forward(req,resp);
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			String s = names.nextElement();
			String s1 = req.getParameter(s);
			writer.print(s+"="+s1+"<br>");
		}
		String username = req.getParameter("username");
		String userpasw = req.getParameter("userpasw");
		String[] aihaos = req.getParameterValues("aihao");
		writer.print("username="+username +",userpasw="+userpasw+",aihao =" );
		for (String aihao:aihaos){
			writer.print(aihao+",");
		}
		String method = req.getMethod();
		writer.print(method+"<br>");
		String servletPath = req.getServletPath();
		writer.print(servletPath+"<br>");
		String reqServletPath = req.getContextPath();
		writer.print(reqServletPath+"<br>");
	}
}
