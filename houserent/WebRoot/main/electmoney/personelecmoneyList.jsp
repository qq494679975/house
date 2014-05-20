<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>

<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="electriccrud!personElecList.action" method="post">
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
			<li><a class="icon" href="electriccrud!getPersonExcel.action" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>	
			<li><a class="add" href="main/electmoney/showChart.jsp" target="navTab" title="报表"><span>查看报表</span></a></li>	
			</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30" align="center">序号</th>
				<th width="100" align="center">时间</th>
				<th width="100" align="center">发布时间</th>
				<th width="100" align="center">数目/度</th>
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
				<td>${notice.emusertime}</td>
				<td>${notice.emnum}  度</td>
				<td>${notice.emmoney/notice.emnum}  元/度</td>
				<td>${notice.emmoney} 元</td>
				<td>${notice.emtime==null?"还未提交":notice.emtime}</td>
				<s:if test="#notice.emtime==null">
				<td>
				<a title="账户余额：${notice.tuserinfo.uimoney}(元)   缴纳电费：${notice.emmoney}(元) 确认提交电费?" href="electriccrud!isrevice.action?emid=${notice.emid}" target="ajaxTodo" class="btnSelect">确认提交</a>
				</td>
				</s:if>
				<s:else>
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

