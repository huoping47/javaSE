<%@ page import="com.jsp_class.demo.UserTest" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/25
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	UserTest userTest = new UserTest();
	userTest.setAge(21);
	userTest.setName("张三");
	userTest.setSex("男");
	request.setAttribute("user",userTest);
%>
${user.name}
<%
	ArrayList<String> list = new ArrayList<>();
	list.add("zhangsan");
	list.add("lisi");
	list.add("wangwu");
	request.setAttribute("list",list);
%>
<c:forEach items="${list}" var="lis">
	值：${lis}
	<br>
</c:forEach>