<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/20
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    导入jstl核心标签库--%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%--    导入jstl格式化标签库--%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
</head>
<body>
<h2>date............................</h2>
单个日期显示:${mydate}<br>

<table width="50%" border="2px">
    <tr>
        <th>学生</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${students}" var="list">
        <tr>
            <td>${list.name}</td>
                <%--            <td>${list.birthday}</td>--%>
            <td><fmt:formatDate value="${list.birthday}"></fmt:formatDate></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
