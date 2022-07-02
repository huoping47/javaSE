<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/27
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
	<head>
		<title>用户验证测试</title>
	</head>
	<body>
		<script>
			window.onload = function () {
				document.getElementById("user").onfocus = function (){
					window.document.getElementById("error").innerHTML = "";
				}
				document.getElementById("user").onblur = function (){
					var userValue = document.getElementById("user").value;
					if (userValue===""){
						window.document.getElementById("error").innerHTML = "<font color = 'red'>请您输入姓名</font>"
						return;
					}else{
						var xhr = new XMLHttpRequest();
						xhr.onreadystatechange = function () {
							if (xhr.readyState===4) {
								if (xhr.status ===200) {
									window.document.getElementById("error").innerHTML = xhr.responseText;
								}else{
									alert(xhr.status);
								}
							}
						}
						xhr.open("POST","/Ajax/Test02",true);
						xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded")
						xhr.send("uname="+userValue);
					}
				}
			}
		</script>
		用户名：<input type="text" id="user"><span id="error"></span>
	</body>
</html>
