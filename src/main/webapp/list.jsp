<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'list.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body style="text-align: center">
<a href="${pageContext.request.contextPath}/toadddept.action"></a>
<table border="1" style="margin: auto">
    <thead>
    <tr>
        <th>客户id</th>
        <th>客户名称</th>
        <th>客户地址</th>
        <th>邮箱地址</th>
        <th>邮政编码</th>
<th>操作</th>
    </tr>
    </thead>
        <c:forEach var="d" items="${list}">
            <tr>
                <td>${d.customid}</td>
                <td>${d.cname}</td>
                <td>${d.caddress}</td>
                <td>${d.cemail}</td>
                <td>${d.cpost}</td>
                <td><a href="${pageContext.request.contextPath}/toupdatedept.action?custome.customid=${d.customid}">修改</a>
                    <a href="${pageContext.request.contextPath}/deletedept.action?custome.customid=${d.customid}">删除</a></td>

            </tr>
        </c:forEach>

</table>

</body>
</html>

