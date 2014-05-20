<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="noticecrud!personNoticeList.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					标题：<s:textfield name="ntitle"/>
				</td>
				<td>
					有效期：
						<s:textfield name="starttime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" minDate="{%y}-%M-{%d+1}" maxDate="2220-12-31"/>
				</td>
				<td>到:<s:textfield name="endtime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" minDate="{%y}-%M-{%d+1}" maxDate="2220-12-31"/>
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
				<th width="40">查看</th>
				<th >标题</th>
				<th width="80">发布者</th>
				<th width="150">发布时间</th>
				<th width="150">有效期</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="perno" status="s" value="%{pageModel.result}">
			<tr target="sid_user" rel="1">
				<td>${s.count }</td>
				<td><a title="${perno.idread==0?"公告未读":"公告已读"}" rel="personno" href="noticecrud!seeNoticeP.action?nnoticeid=${perno.nnoticeid}" target="navTab" class="${perno.idread==0?"btnLook":"btnSelect"}"></td>
				<td>${perno.ntitle}</td>
				<td>${perno.uiusername}</td>
				<td><s:property value="#perno.npasstime"/></td>
				<td>${perno.nouttime}</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>
