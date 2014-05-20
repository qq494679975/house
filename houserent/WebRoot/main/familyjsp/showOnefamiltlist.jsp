<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'familtlist.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		
<table class="table" width="100%" layoutH="50">
	<thead>
		<tr>
			<th width="40px">序号</th>
			<th width="100px">家庭角色</th>
			<th width="100px">名字</th>
			<th width="200px">身份证</th>
			<th width="150px">电话</th>
			<th width="300px">工作</th>
			<th width="100px">收入</th>
			<th width="150px">操作&nbsp&nbsp&nbsp&nbsp</th>
		</tr>
	</thead>
	<tbody>
	<% int a = 0; %>
		<s:iterator status="s" var="bigmenu" value="families">
		<tr>
		 <% a++; %>
			<td ><%=a %></td>
			<td align="center">${bigmenu.dname}</td>
			<td align="center">${bigmenu.ufname }</td>
			<td align="center">${bigmenu.ufidcard }</td>
			<td align="center">${bigmenu.ufphone }</td>
			<td align="center">${bigmenu.ufjob }</td>
			<td align="center">${bigmenu.ufmoney }</td>
			<td ><a title="修改" href="familycrud!toUpdatePageAllFamily.action?ufid=${bigmenu.ufid}" rel="familyedit"  target="navTab" class="btnView">编辑</a>
				<a title="删除" href="familycrud!deleteAllFamily.action?ufid=${bigmenu.ufid}" target="ajaxTodo" class="btnDel">删除</a></td>
		</tr>
		</s:iterator>
		<tr>
			<td>总人数:</td>
			<td colspan="3" align="center">${allnum}</td>
			<td>总收入</td>
			<td colspan="3" align="center">${allmoney}￥</td>
		</tr>
	</tbody>
</table>
	</body>
</html>
