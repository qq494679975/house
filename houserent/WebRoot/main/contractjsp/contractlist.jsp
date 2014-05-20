<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="contractcrud!contractList.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					合同甲方：<s:textfield name="cuser"/>
				</td>
				<td>
					合同有效期：
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
			<li><a class="add" href="main/contractjsp/addcontract.jsp" rel="addrold" target="navTab"><span>添加合同</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30" align="center">序号</th>
				<th width="150" align="center">用户</th>
				<th width="100" align="center">合同甲方</th>
				<th width="100" align="center">合同乙方</th>
				<th align="center">合同生效日期 </th>
				<th width="100" align="center">合同有效期</th>
				<th width="100" >操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}" status="indexnum">
			<tr target="sid_user" rel="1">
				<td>${indexnum.count}</td>
				<td>${notice.tuserinfo.uiusername}</td>
				<td>${notice.cuser}</td>
				<td>${notice.cboss}</td>
				<td>${notice.cbegintime}</td>
				<td>${notice.contractyear}年</td>
				<td>
				<a title="查看合同信息" href="contractcrud!getcontract.action?cid=${notice.cid}" target="navTab" class="btnLook">查看</a>
				<a title="删除合同信息" href="contractcrud!delcontract.action?cid=${notice.cid}" target=ajaxTodo class="btnDel">删除</a>
				</td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

