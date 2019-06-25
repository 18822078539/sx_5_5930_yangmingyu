<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'save.jsp' starting page</title>
    
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
  <h1>添加</h1>
    <form action="savedept.action" method="post">
    	客户名称：<input type="text" name="custome.cname" /><br>
    	客户地址：<input type="text" name="custome.caddress" /><br>
        邮箱地址：<input type="text" name="custome.cemail" /><br>
        邮政编码：<input type="text" name="custome.cpost" /><br>
    	<input type="submit" />
    </form>
  </body>
</html>
