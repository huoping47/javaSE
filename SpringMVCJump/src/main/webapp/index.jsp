<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/20
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/one.action">1.请求转发页面(默认)</a>
<a href="${pageContext.request.contextPath}/two.action">2.请求转发action</a>
<a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a>
<a href="${pageContext.request.contextPath}/four.action">4.重定向action</a>

<a href="${pageContext.request.contextPath}/five.action">携带数据</a>

<form action="${pageContext.request.contextPath}/date.action">
    日期:<input type="date" name="mydate">
    <input type="submit" value="提交">
</form>
</body>
</html>
