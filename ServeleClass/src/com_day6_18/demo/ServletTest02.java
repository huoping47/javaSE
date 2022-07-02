package com_day6_18.demo;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 霍平
 * @date 2022/6/18 16:50
 * @mouse 六月
 */

public class ServletTest02 extends GenericServlet {
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		servletResponse.setContentType("text/html");
		PrintWriter out = servletResponse.getWriter();
		//返回与服务器上的指定 URL 对应的对象。ServletContext
		ServletContext context = this.getServletContext();
		//获取服务器的根的名字
		String path = context.getContextPath();
		//获取这个文件中的绝对路径
		String realPath = context.getRealPath("index.html");
		String age = context.getInitParameter("age");
		String name = context.getInitParameter("name");
		out.println(path);
		out.println(name);
		out.println(age);
		out.println(realPath);
	}
}
