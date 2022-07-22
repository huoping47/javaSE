<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/20
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
main....................
<%-- request.setAttribute("requestUsers", users);
        session.setAttribute("sessionUsers", users);
        model.addAttribute("modelUsers", users);
        map.put("mapUsers", users);
        modelMap.addAttribute("modelMapUsers", users);--%>
requestUsers:${requestUsers.name} + ${requestUsers.age}<br>
sessionUsers:${sessionUsers}<br>
modelUsers:${modelUsers}<br>
mapUsers:${mapUsers}<br>
modelMapUsers:${modelMapUsers}<br>
</body>
</html>
