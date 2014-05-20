<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="eamilcrud!sendEmail.action" method="post">
	<div class="searchBar">
		<div class="subBar">
			<ul>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a title="确实要删除这些记录吗?" target="selectedTodo" rel="esids" postType="string" href="eamilcrud!delMoreEmail.action" class="delete"><span>批量删除</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="112">
		<thead>
			<tr>
				<th width="22"><input type="checkbox" group="esids" class="checkboxCtrl"></th>
				<th width="40">查看</th>
				<th width="200" align="center">收件人</th>
				<th align="center">主题</th>
				<th width="150" align="center">时间</th>
				<th width="40">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="%{pageModel.result}" var="se">
				<tr>
				<td ><input type="checkbox" name="esids" value="${se.umid}"/></td>
				<td ><a title="查看邮件" href="eamilcrud!seeEmail.action?umid=${se.umid}" target="navTab" rel="passnotice" class="btnEdit">查看</a>
				</td>
				<td >${se.etouser}</td>
				<td >${se.etitle }</td>
				<td >${se.etime}</td>
				<td><a title="删除邮件" href="eamilcrud!delEmail.action?umid=${se.umid}" target="ajaxTodo" class="btnDel">删除</a>
					</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp"%>
</div>
