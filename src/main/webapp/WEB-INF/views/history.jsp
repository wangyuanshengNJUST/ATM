<%@ page import="com.text.po.History" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王元圣
  Date: 2020/8/31
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<body>
<table border="1">
<tr>
    <th>用户</th>
    <th>操作类型</th>
    <th>金额</th>
    <th>时间</th>
</tr>
<c:forEach items="${histories}" var="History">

    <tr>
       <td> ${History.username}</td>
        <td> ${History.type}</td>
        <td> ${History.money}</td>
        <td> ${History.time}</td>
    </tr>

</c:forEach>
</table>
</body>
</html>