<%--
  Created by IntelliJ IDEA.
  User: fumenyaolang
  Date: 2015-12-09
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<% System.out.println("this is login page"); %>
<div>
    <form id="form1" action="/jdk/login" method="post">
        用户名：<input type="text" name="userName" value="fzq"/><br/>
        密码：<input type="password" name="password" value="123456"/><br/>
        <button type="submit">登陆</button>
    </form>
</div>
</body>
</html>
