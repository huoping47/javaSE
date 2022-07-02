<%--
  Created by IntelliJ IDEA.
  User: 霍平
  Date: 2022/6/27
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax测试</title>
  </head>
  <body>
    <script>
        window.onload = function () {
          document.getElementById("submit").onclick=function () {
            //创建Aiax核心对象
            var xhr = new XMLHttpRequest();
            //注册回调函数
            xhr.onreadystatechange = function () {
              if (xhr.readyState===4){
                if (xhr.status===200){
                  document.getElementById("txt").innerHTML = xhr.responseText;
                }
              }
            }
            //打开通道
            xhr.open("GET","Test01",true);
            //发送请求
            xhr.send();
          }
          document.getElementById("clear").onclick=function () {
            //创建Aiax核心对象
            var xhr = new XMLHttpRequest();
            //注册回调函数
            xhr.onreadystatechange = function () {
              if (xhr.readyState===4){
                if (xhr.status===200){
                  document.getElementById("txt").innerHTML = xhr.responseText;
                }
              }
            }
            // //打开通道
            // xhr.open("GET","Test01",true);
            // //发送请求
            // xhr.send();
            document.getElementById("txt").innerHTML="";
          }
        }
    </script>
    <input type="button" id="submit" value="提交">
    <span id="txt"></span>
    <input type="button" id="clear" value="清空">
    <form action="" enctype="application/x-www-form-urlencoded"></form>
  </body>
</html>
