package com_day6_18.demo;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 霍平
 * @date 2022/6/18 17:04
 * @mouse 六月
 */

public class ServletTest03 extends GenericServlet {
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		servletResponse.setContentType("text/html");
		PrintWriter out = servletResponse.getWriter();
		ServletContext context = this.getServletContext();
		String age = context.getInitParameter("age");
		String name = context.getInitParameter("name");
		out.println(age+"="+name);
	}
}
