<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="sendusercrud!sendUserList.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					申请人：<s:textfield name="suusername"/>
				</td>
				<td>
					申请日期：
						<s:textfield name="starttime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" />
				</td>
				<td>到:<s:textfield name="endtime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" />
				</td>
				<td>
				
				</td>
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
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th width="150" style="text-align: center">申请人</th>
				<th style="text-align: center">申请时间</th>
				<th width="100" style="text-align: center">状态</th>
				<th width="150">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="perno" status="s" value="%{pageModel.result}">
			<tr target="sid_user" rel="1">
				<td>${s.count }</td>
				<td style="text-align: center">${perno.suusername}</td>
				<td style="text-align: center">${perno.sutime}</td>
				<td style="text-align: center"> ${perno.sustatus==0?'未审核':perno.sustatus==1?'审核已通过':'审核未通过'}</td>
				<td>
					<s:if test="sustatus==0">
					<a title="删除申请信息" href="sendusercrud!deleteUserOrder.action?suid=${perno.suid}" target="ajaxTodo" class="btnDel">删除</a>
					<a title="审核申请" href="main/sendUserjsp/passSendUser.jsp?suusername=${perno.suusername}&suid=${perno.suid}" target="navTab" rel="passnotice" class="btnAssign">审核</a>
					<a title="查看申请" href="sendusercrud!sendUserOrder.action?suid=${perno.suid}" target="navTab" rel="passnotice" class="ckbox">查看</a>
				
					</s:if>
					<s:else>
						<a title="删除申请信息" href="sendusercrud!deleteUserOrder.action?suid=${perno.suid}" target="ajaxTodo" class="btnDel">删除</a>
						<a title="查看申请" href="sendusercrud!sendUserOrder.action?suid=${perno.suid}" target="navTab" rel="passnotice" class="ckbox">查看</a>
				</s:else>
				</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>
