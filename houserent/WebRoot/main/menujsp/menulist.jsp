<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
	<div id="pageContent">
<table class="table" width="100%" layoutH="50">
	<thead>
		<tr>
			<th width="50px">序号</th>
			<th width="200px" >菜单名称</th>
			<th>菜单连接</th>
			<th width="100px">父类ID</th>
			<th width="200px">排序</th>
			<th width="120px">操作&nbsp&nbsp&nbsp&nbsp<a class="add" href="menucrud!getAllFather" target="navTab"><span>【添加菜单】</span></a></th>
		</tr>
	</thead>
	<tbody>
	<% int a = 0; %>
		<s:iterator status="s" var="bigmenu" value="menus.{? #this.mfatherid==0}">
		<tr>
		<% a++; %>
			<td ><%=a %></td>
			<td align="left">${bigmenu.mname}</td>
			<td align="center">父菜单，无连接</td>
			<td align="left">${bigmenu.mfatherid }</td>
				<td align="center">
				<s:if test="!#s.first">
				<a href="menucrud!upMenu?mid=${bigmenu.mid}&morder=${bigmenu.morder}&mfatherid=${bigmenu.mfatherid}" target="ajaxTodo" >上移</a>
				</s:if>
				<s:if test="!#s.last">
				<a href="menucrud!downMenu?mid=${bigmenu.mid}&morder=${bigmenu.morder}&mfatherid=${bigmenu.mfatherid}" target="ajaxTodo" >下移</a>
				</s:if>
			</td>
			<td ><a title="修改" href="menucrud!toUpdatePage?mid=${bigmenu.mid}" onclick="" target="navTab" class="btnView">编辑</a>
				<a title="删除" href="menucrud!delMenu?mid=${bigmenu.mid}&mfatherid=${bigmenu.mfatherid}" target="ajaxTodo" class="btnDel">删除</a></td>
		</tr>
			<s:iterator status="s" var="smallmenu" value="menus.{? #this.mfatherid==#bigmenu.mid}">
			<tr>
			<% a++; %>
			<td ><%=a %></td>
			<td align="right">${smallmenu.mname}</td>
			<td align="center">${smallmenu.murl}</td>
			<td align="right">${smallmenu.mfatherid }</td>
			<td align="center">
			<s:if test="!#s.first">
				<a href="menucrud!upMenu?mid=${smallmenu.mid}&morder=${smallmenu.morder}&mfatherid=${smallmenu.mfatherid}" target="ajaxTodo" >上移</a>
				</s:if>
				<s:if test="!#s.last">
				<a href="menucrud!downMenu?mid=${smallmenu.mid}&morder=${smallmenu.morder}&mfatherid=${smallmenu.mfatherid}" target="ajaxTodo" >下移</a>
				</s:if>
			</td>
			<td ><a title="修改" href="menucrud!toUpdatePage?mid=${smallmenu.mid}" target="navTab" class="btnView">编辑</a>
				<a title="删除" href="menucrud!delMenu?mid=${smallmenu.mid}&mfatherid=${smallmenu.mfatherid}" target="ajaxTodo" class="btnDel">删除</a></td>
		</tr>
			</s:iterator>
		</s:iterator>
	</tbody>
</table>
</div>