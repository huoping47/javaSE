<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/7/19
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.6.0.js"></script>
</head>
<body>
<a href="javascript:showList()">展示所有的学生</a>
<div id="showStu"></div>
<script type="text/javascript">
    function showList() {
        $.ajax({
            url: "${pageContext.request.contextPath}/list.action",
            type: "get",
            dataType: "JSON",
            success: function (list) {
                let htmls = "";
                $.each(list, function (arr, date) {
                    htmls += date.name + "------" + date.age + "<br>";
                })
                $("#showStu").html(htmls)
            }
        });
    }
</script>
</body>
</html>
