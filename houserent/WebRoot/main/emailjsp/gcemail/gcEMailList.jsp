<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="eamilcrud!queryGCEMail.action" method="post">
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
			<li><a title="确实要删除这些记录吗?" target="selectedTodo" rel="esids" postType="string" href="eamilcurd!delGCMoreEmail.action" class="delete"><span>批量删除</span></a></li>
			<li><a title="恢复到收件箱" target="selectedTodo" rel="esids" postType="string" href="eamilcrud!relGCtMoreEmail.action" class="delete"><span>批量恢复</span></a></li>
		
		</ul>
	</div>
	<table class="table" width="100%" layoutH="112">
		<thead>
			<tr>
				<th width="22"><input type="checkbox" group="esids" class="checkboxCtrl"></th>
				<th width="40">查看</th>
				<th width="200" align="center">发件人</th>
				<th align="center">主题</th>
				<th width="150" align="center">时间</th>
				<th width="70">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="%{pageModel.result}" var="se">
				<tr>
				<td ><input type="checkbox" name="esids" value="${se.umid}"/></td>
				<td ><a title="${se.umisread==0?"文件未读":"文件已读"}" href="eamilcrud!seeGCEmail.action?umid=${se.umid}" target="navTab" rel="gcsee" class="${se.umisread==0?"btnLook":"btnSelect"}">查看</a>
				</td>
				<td >${se.efromuser}</td>
				<td >${se.etitle }</td>
				<td >${se.etime}</td>
				<td><a title="删除邮件" href="eamilcrud!delGCEmail.action?umid=${se.umid}" target="ajaxTodo" class="btnDel">彻底删除</a>
					<a title="恢复邮件" href="eamilcrud!relGCtEmail.action?umid=${se.umid}" target="ajaxTodo" class="btnView">恢复到收件箱</a>
					</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp"%>
</div>

