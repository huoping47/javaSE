<%@ page import="java.util.ArrayList" %>
<%@ page import="User.UserClass" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/21
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>用户展示页面</title>
	</head>
	<script>
		window.onload = function () {
			window.document.getElementById("del").onclick = function () {
				var s = confirm("确定删除吗？");
				if (s){
					//确定删除
				}
				
			}
		}
	</script>
	<body>
		<h1 align="center" style="color: darkgray">用户展示页面</h1>
		<table border="5px" align="center" width="50%">
			<tr align="center" >
				<td>姓名</td>
				<td>年龄</td>
				<td>性别</td>
				<td>编辑</td>
			</tr>
			<%
				List<UserClass> user = (List<UserClass>)request.getAttribute("user");
				for (UserClass userClass:user){
			
			%>
			<tr align="center">
				<td><%=userClass.getName()%></td>
				<td><%=userClass.getAge()%></td>
				<td><%=userClass.getSex()%></td>
				<td>
					<a href="modify.jsp">修改</a>
					<a href="<%=request.getContextPath()%>/detail?id=<%= userClass.getId()%>">详情</a>
					<a href="javascript:void(0)">删除</a>
				</td>
			</tr>
			<%
				}
			%>
		</table>

	</body>
</html>
