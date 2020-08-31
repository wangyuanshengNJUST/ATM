<%--
  Created by IntelliJ IDEA.
  User: 王元圣
  Date: 2020/8/29
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="draw1" method="post">
    <input type="text" name= "money" placeholder="请输入取款金额"/>
    <input type="hidden" name="username" value=${username}>
    <input type="submit" value="确认">
</form>
</body>
</html>
