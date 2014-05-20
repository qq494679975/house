<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="com.softxm.hs.model.Tuserinfo" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  		<div style="float: left;">
       <img src="images/welcome.jpg" />
       </div>
       <div style="float: left;color: red;font-size: large;">
       
      	本次登陆时间:<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(session.getAttribute("logintime"))%><br/><br/>
    
       	当前用户:<%=((Tuserinfo)(session.getAttribute("LOGIN_USER"))).getUiusername()%><br/><br/>
       	
       	</div>
  </body>
</html>
