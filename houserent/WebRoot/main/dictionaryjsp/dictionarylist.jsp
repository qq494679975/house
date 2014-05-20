<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

	<div id="pageContent">
<table class="table" width="100%" layoutH="50">
	<thead>
		<tr>
			<th width="50px">序号</th>
			<th width="400px" >字典名称</th>
			<th width="300px">父类ID</th>
			<th width="150px">操作&nbsp&nbsp&nbsp&nbsp<a class="add" href="dictionarycrud!toAddPage.action" target="navTab"><span>【添加字典】</span></a></th>
		</tr>
	</thead>
	<tbody>
	<% int a = 0; %>
		<s:iterator status="s" var="bigmenu" value="tdictionarys.{? #this.dfatherid==0}">
		<tr>
		<% a++; %>
			<td ><%=a %></td>
			<td align="left">${bigmenu.dname}</td>
			<td align="left">${bigmenu.dfatherid }</td>
			<td ><a title="修改" href="dictionarycrud!toUpdatePage?ddid=${bigmenu.ddid}" onclick="" target="navTab" class="btnView">编辑</a>
				<a title="删除" href="dictionarycrud!deleteDic?ddid=${bigmenu.ddid}&dfatherid=${bigmenu.dfatherid}" target="ajaxTodo" class="btnDel">删除</a></td>
		</tr>
			<s:iterator status="s" var="smallmenu" value="tdictionarys.{? #this.dfatherid==#bigmenu.ddid}">
			<tr>
			<% a++; %>
			<td ><%=a %></td>
			<td align="right">${smallmenu.dname}</td>
			<td align="right">${smallmenu.dfatherid }</td>
			<td ><a title="修改" href="dictionarycrud!toUpdatePage?ddid=${smallmenu.ddid}" target="navTab" class="btnView">编辑</a>
				<a title="删除" href="dictionarycrud!deleteDic?ddid=${smallmenu.ddid}&dfatherid=${smallmenu.dfatherid}" target="ajaxTodo" class="btnDel">删除</a></td>
		</tr>
			</s:iterator>
		</s:iterator>
	</tbody>
</table>
</div>