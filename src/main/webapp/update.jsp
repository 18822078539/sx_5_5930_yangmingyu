<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
  <h1>修改</h1>
  <div>${msg}</div>
  <div>${msg1}</div>
    <form action="updatedept.action" method="post">
    	客户id:&nbsp&nbsp&nbsp&nbsp<input type="text" value="${dept.customid}" name="custome.customid" /><br>
        客户名称：<input type="text" value="${dept.cname}" name="custome.cname" /><br>
    	客户地址：<input type="text" value="${dept.caddress}" name="custome.caddress" /><br>
        邮箱地址：<input type="text" value="${dept.cemail}" name="custome.cemail" /><br>
        邮政编码：<input type="text" value="${dept.cpost}" name="custome.cpost" /><br>
        <input type="submit" />
    </form>
  </body>
</html>
