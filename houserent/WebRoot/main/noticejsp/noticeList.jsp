<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="noticecrud!noticelist.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					公告标题：<s:textfield name="ntitle" />
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="main/noticejsp/addnotice.jsp" target="navTab"><span>添加</span></a></li>
			<li class="line">line</li>
			</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th>标题</th>
				<th width="140">创建时间</th>
				<th width="100" align="center">有效期</th>
				<th width="150">是否审核</th>
				<th width="80" align="center">是否有附件</th>
				<th width="80" align="center">是否置顶</th>
				<th width="120">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}">
			<tr target="sid_user" rel="1">
				<td>${ntitle}</td>
				<td><s:property value="nrelestime"/></td>
				<td><s:property value="nouttime"/></td>
				<td>${ispass==0?'未审核':ispass==1?'审核已经通过':'审核没有通过' }</td>
				<td>${nhasattach==1?'是':'否'}</td>
				<td>${nistop==0?'是':'否'}</td>
				<s:if test="ispass==0">
				<td>
					<a title="修改公告信息" href="noticecrud!toUpdatePage.action?nnoticeid=${nnoticeid}" target="navTab" rel="noticeedit" class="btnView">编辑</a>
					<a title="删除公告信息" href="noticecrud!delNotice.action?nnoticeid=${nnoticeid}" target="ajaxTodo" class="btnDel">删除</a>
					<a title="审核公告" href="main/noticejsp/passNoctie.jsp?nnoticeid=${nnoticeid}&ntitle=${ntitle}" target="navTab" rel="passnotice" class="btnAssign">审核</a>
					<a title="查看公告" href="noticecrud!showNotice.action?nnoticeid=${nnoticeid}" target="navTab" rel="passnotice" class="ckbox">查看</a>
				
				</td>
				</s:if>
				<s:else><td>
					<a title="删除公告信息" href="noticecrud!delNotice.action?nnoticeid=${nnoticeid}" target="ajaxTodo" class="btnDel">删除</a>
					<a title="查看公告" href="noticecrud!showNotice.action?nnoticeid=${nnoticeid}" target="navTab" rel="passnotice" class="ckbox">查看</a>
				</td></s:else>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp"%>
</div>

