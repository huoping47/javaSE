<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/21
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
	<head>
		<title>编辑用户</title>
	</head>
	<script>
		window.onload = function () {
			window.document.getElementById("sub").onclick = function () {
				// var name =window.document.getElementById("name").value;
				// name = name.trim();
				// var rname = /^\w{3,9}$/;
				// if (! rname.test(name)){
				// 	window.document.getElementById("error").innerHTML="<span style='color:rosybrown'>请输入合法的姓名,由英文名和下划线数字组成</span>";
				// 	window.document.getElementById("name").onfocus=function () {
				// 		window.document.getElementById("error").innerHTML="";
				// 		window.document.getElementById("name").value="";
				// 	}
				// 	return;
				// }
				var age = window.document.getElementById("age").value;
				var rage = /^\d{1,3}$/;
				if (! rage.test(age)){
					window.document.getElementById("errorage").innerHTML="<span style='color:rosybrown'>请输入合法的年龄</span>";
					window.document.getElementById("age").onfocus=function () {
						window.document.getElementById("errorage").innerHTML="";
						window.document.getElementById("age").value="";
					}
				}
				// var sex =window.document.getElementsByName("sex");
				// for (let i = 0; i < sex.length; i++) {
				// 	if (sex[i].checked){
				// 		sex.
				// 	}
				// }
			}
		}
	</script>
	<body>
		<h1>修改用户信息</h1>
		<form action="" method="post" >
			姓名：<input type="text" id="name" value="张三" name="name"><span id="error"></span><br>
			年龄：<input type="text" id="age" value="21" name="age"><span id="errorage"></span><br>
			性别：<input type="radio" name="sex" value="男" checked>男
						<input type="radio" name="sex" value="女">女
			<input type="submit" value="确定" id="sub">
		</form>
	</body>
</html>
