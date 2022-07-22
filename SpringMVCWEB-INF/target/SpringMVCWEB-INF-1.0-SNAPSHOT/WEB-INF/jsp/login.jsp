<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/21
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login">
    姓名:<input type="text" name="name">
    密码:<input type="password" name="pwd">
    <input type="submit" value="登录">
</form>
${msg}
</body>
</html>
