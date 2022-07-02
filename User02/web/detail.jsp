<%@ page import="java.util.List" %>
<%@ page import="User.UserClass" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/22
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
	<head>
		<title>详情页面</title>
	</head>
	<body>
		<h1>用户详情</h1>
		<%
			ArrayList<UserClass> list = (ArrayList<UserClass>)request.getAttribute("us");
			for (UserClass userClass:list){
			%>
		<hr>
		姓名：<span><%=userClass.getName()%></span><br>
		年龄：<span><%=userClass.getAge()%></span><br>
		性别：<span><%=userClass.getSex()%></span><br>
		生日：<span><%=userClass.getBirthday()%></span>
		<%
			}
		%>
	</body>
</html>
