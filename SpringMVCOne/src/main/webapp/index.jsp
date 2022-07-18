<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/18
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="${pageContext.request.contextPath}/req.action"></a>--%>
<form action="${pageContext.request.contextPath}/req.action" method="post">
    <input type="submit" value="按钮">
</form>
<br><br>
<h1>1.单个数据提交</h1>
<form action="${pageContext.request.contextPath}/DateOne.action" method="post">
    姓名:<input type="text" name="name">
    年龄:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
<br><br>
<h1>2.对象封装数据提交</h1>
<form action="${pageContext.request.contextPath}/DateTwo.action" method="post">
    姓名:<input type="text" name="twoName">
    年龄:<input type="text" name="twoAge">
    <input type="submit" value="提交">
</form>
<br><br>
<h1>3.使用占位符提交</h1>
<a href="${pageContext.request.contextPath}/three/张三/15.action">占位符提交</a>
<br><br>
<h1>4.参数名称不一致解决方案</h1>
<form action="${pageContext.request.contextPath}/four.action">
    姓名:<input type="text" name="name">
    年龄:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
<br><br>
<h1>5.手工提取</h1>
<form action="${pageContext.request.contextPath}/five.action">
    姓名:<input type="text" name="name">
    年龄:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
