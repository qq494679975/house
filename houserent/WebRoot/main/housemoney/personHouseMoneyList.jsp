<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="housecrud!getPersonHouse.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
				<td>
					日期：
						<s:textfield name="starttime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" />
				</td>
				<td>到:<s:textfield name="endtime" cssClass="date" dateFmt="yyyy-MM-dd"
						readonly="true" />
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
			<li><a class="icon" href="housecrud!getPersonExcel.action" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>	</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30" align="center">序号</th>
				<th width="100" align="center">时间</th>
				<th width="100" align="center">发布时间</th>
				<th width="100" align="center">总钱数</th>
				<th align="center" width="100">交钱时间</th>
				<th align="center" width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}" status="indexnum">
			<tr target="sid_user" rel="1">
				<td>${indexnum.count}</td>
				<td>${notice.time}</td>
				<td>${notice.husertime}</td>
				<td>${notice.hmmoney} 元</td>
				<td>${notice.hmtime==null?"还未提交":notice.hmtime}</td>
				<td>
				<s:if test="#notice.hmtime==null">
				<a title="确认提交房租" href="housecrud!isrevice.action?hmid=${notice.hmid}" target="ajaxTodo" class="btnSelect">确认提交</a>
				</s:if>
				<s:else>
					已提交
				</s:else></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

