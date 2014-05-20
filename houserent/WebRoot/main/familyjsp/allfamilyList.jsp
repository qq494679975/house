<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="familycrud!allFamilyList.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					账号：<s:textfield name="uiusername"/>
				</td>
				<td>家庭类型：
				</td>
				<td>
				<s:select list="%{familytype}" headerKey="0" headerValue="请选择" name="uifamilytype"></s:select>	
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
				<th width="30" align="center">序号</th>
				<th width="80" align="center">账号</th>
				<th width="150" align="center">联系电话</th>
				<th align="center">家庭类型</th>
				<th width="80" align="center">家庭收入</th>
				<th width="200" align="center">入住时间</th>
				<th width="50" >操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}" status="indexnum">
			<tr target="sid_user" rel="1">
				<td>${indexnum.count}</td>
				<td>${notice.uiusername}</td>
				<td>${notice.uiphone}</td>
				<td>${notice.dname}</td>
				<td>${notice.money==null?"还未填写":notice.money}</td>
				<td>${notice.uitime}</td>
				<td>
				<a title="查看家庭信息" href="familycrud!toAllFamilyPage.action?uiid=${notice.uiid}" target="navTab" class="btnLook">查看</a>
				</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

