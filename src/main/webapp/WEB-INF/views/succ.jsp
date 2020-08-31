<%@ page import="java.math.BigDecimal" %><%--
  Created by IntelliJ IDEA.
  User: 王元圣
  Date: 2020/8/28
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>成功</title>
</head>
<body>
<div>
    <p>您好 用户名： ${username}   欢迎登陆</p>
</div>
<form action="Check" method="post">
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="查询余额"/>
</form>
<form action="save" method="post">
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="存款"/>
</form>
<form action="draw" method="post">
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="取款"/>
</form>
<form action="history" method="post">
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="查询历史"/>
</form>
<form action="logout" method="post">
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="注销账户"/>
</form>
<form action="exit" method="post">
    <input type="submit" value="退出登录"/>
</form>
</body>
</html>