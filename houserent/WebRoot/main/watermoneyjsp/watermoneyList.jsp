<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="watercrud!watermoneyList.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					用户：<s:textfield name="uiusername"/>
				</td>
				<td>
					水费日期：
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
				<li><a class="add" href="watercrud!toaddpage.action" rel="addrold" target="navTab"><span>添加水费</span></a></li>
			<li><a class="icon" href="watercrud!getAllExcel.action" target="dwzExport" targetType="navTab" title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30" align="center">序号</th>
				<th width="150" align="center">用户</th>
				<th width="100" align="center">用户余额</th>
				<th width="100" align="center">时间</th>
				<th width="100" align="center">数目/顿</th>
				<th width="100" align="center">钱数</th>
				<th align="center" width="100">交钱时间</th>
				<th width="80" >操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}" status="indexnum">
			<tr target="sid_user" rel="1">
				<td>${indexnum.count}</td>
				<td>${notice.tuserinfo.uiusername}</td>
				<td>${notice.tuserinfo.uimoney}</td>
				<td>${notice.wmusertime}</td>
				<td>${notice.wmnum}</td>
				<td>${notice.wmmoney}</td>
				<td>${notice.wmtime==null?"还未提交":notice.wmtime}</td>
				<td>
				<s:if test="wmtime==null">
				<a title="修改水费" href="watercrud!toUpdatePage.action?wmid=${notice.wmid}" target="navTab" class="btnView">修改</a>
				<a title="删除水费" href="watercrud!delWater.action?wmid=${notice.wmid}" target="ajaxTodo" class="btnDel">删除</a>	
				<a title="查看水费" href="watercrud!showWater.action?wmid=${notice.wmid}" target="navTab" class="btnLook">查看</a>
				<!-- <a title="确认提交水费" href="watercrud!isrevice.action?wmid=${notice.wmid}" target="ajaxTodo" class="btnSelect">确认提交</a>
				 --></s:if>
				<s:else>
				<a title="删除水费" href="watercrud!delWater.action?wmid=${notice.wmid}" target="ajaxTodo" class="btnDel">删除</a>	
				<a title="查看水费" href="watercrud!showWater.action?wmid=${notice.wmid}" target="navTab" class="btnLook">查看</a>
				</s:else>
				</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

