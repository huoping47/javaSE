package com_day6_18.demo;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author 霍平
 * @date 2022/6/18 16:10
 * @mouse 六月
 */

public class ServletTest01 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        //获取所有对象的value
        String sex = getInitParameter("sex");
        String name1 = getInitParameter("name");
        //getInitParameterNames获取所有对象的name
        Enumeration<String> names = this.getInitParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String name2 = getInitParameter(name);
            out.println(name + "=" + name2 + "<br>");
        }
        //获取当前的config对象，一个servlet对应一个config
        ServletConfig servletConfig = this.getServletConfig();
        out.println(servletConfig);

    }
}
