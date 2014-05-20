<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="watercrud!getPersonWater.action" method="post">
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
			<li><a class="icon" href="watercrud!getPersonExcel.action" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
			<li><a class="add" href="main/watermoneyjsp/showChart.jsp" target="navTab" title="报表"><span>查看报表</span></a></li>	</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30" align="center">序号</th>
				<th width="100" align="center">时间</th>
				<th width="100" align="center">发布时间</th>
				<th width="100" align="center">数目/顿</th>
				<th align="center" width="100">单位钱数</th>
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
				<td>${notice.wmusertime}</td>
				<td>${notice.wmnum}  吨</td>
				<td>${notice.wmmoney/notice.wmnum}  元/吨</td>
				<td>${notice.wmmoney} 元</td>
				<td>${notice.wmtime==null?"还未提交":notice.wmtime}</td>
				<s:if test="#notice.wmtime==null">
				<td>
					<a title="账户余额：${notice.tuserinfo.uimoney}(元)   缴纳水费：${notice.wmmoney}(元)确认提交水费?" href="watercrud!isrevice.action?wmid=${notice.wmid}" target="ajaxTodo" class="btnSelect">确认提交</a>
				</td>
				</s:if><s:else>
				<td>
					已提交
				</td>
				</s:else>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

