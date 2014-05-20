<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="rolecrud!rolelist.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr><input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
				<td>
					角色名称：<s:textfield name="rname"></s:textfield>
				</td>
				<td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="rolecrud!intoAddPage.action" rel="addrold" target="navTab"><span>添加角色</span></a></li>
			</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="80">序号</th>
				<th width="120">角色名称</th>
				<th>角色描述</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="%{pageModel.result}" var="notice" status="s">
			<tr>
				<td>${s.count}</td>
				<td>${notice.rname}</td>
				<td>${notice.rdetail}</td>
				<td>
				<s:if test="#notice.rid!=1">
				<a title="修改" href="rolecrud!updaterolepage.action?rid=${notice.rid}" target="navTab" class="btnView">编辑</a>
				<a title="删除" href="rolecrud!deleterole.action?rid=${notice.rid}" target="ajaxTodo" class="btnDel">删除</a>
				</s:if>
				</td>
				</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

