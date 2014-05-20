<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="org.apache.struts2.components.Include"%>


<div class="pageHeader">
	<form id="pagerForm" onsubmit="return navTabSearch(this);" action="systemcrud!userlist.action" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
				<input type="hidden" name="currentPage" value="${pageModel.currentPage}"/>
				<input type="hidden" name="pageSize" value="${pageModel.pageSize}"/>
					账号：<s:textfield name="uiusername"/>
				</td>
				<td>
					姓名：<s:textfield name="uirealname"/>
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
			<li><a class="add" href="systemcrud!toAddPage.action" target="navTab"><span>添加用户</span></a></li>
			<li><a class="add" href="main/systemjsp/addMoney.jsp" target="navTab"><span>用户充值</span></a></li>
			<li class="line">line</li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th width="80">账号</th>
				<th width="100">真实姓名</th>
				<th width="150" align="center">手机</th>
				<th>地址</th>
				<th width="80">用户状态</th>
				<th width="80">用户余额</th>
				<th width="80">修改</th>
				<th width="80">已出租/未出租</th>
			</tr>
		</thead>
		
		<tbody>
			<s:iterator var="notice" value="%{pageModel.result}" status="indexnum">
			<tr target="sid_user" rel="1">
				<td>${indexnum.count}</td>
				<td>${notice.uiusername}</td>
				<td>${notice.uirealname}</td>
				<td>${notice.uiphone}</td>
				<td>${notice.uifrom}</td>
				<td>${notice.uiislock==0?"正常":"冻结"}</td>
				<td>${notice.uimoney}</td>
				<td>
				<s:if test="#notice.uiid!=1">
				<a title="修改信息" href="systemcrud!toUpdatePage.action?uiid=${notice.uiid}" target="navTab" class="btnView">编辑</a>
				<a title="删除用户" href="systemcrud!deleteUser.action?uiid=${notice.uiid}" target="ajaxTodo" class="btnDel">删除</a></td>
				</s:if>
				<s:if test="#notice.uiid!=1">
				<s:if test="#notice.uiislock==1">
				<td style="background-color: red;">
				<a title="是否修改成已出租" href="systemcrud!lockOrUnlock.action?uiid=${notice.uiid}&uiislock=${notice.uiislock}" target="ajaxTodo" rel="noticeedit" >
				未出租
				</a>
				</td>
				</s:if>
				<s:else>
				<td style="background-color: green;">
				<a title="是否修改成未出租" href="systemcrud!lockOrUnlock.action?uiid=${notice.uiid}&uiislock=${notice.uiislock}" target="ajaxTodo" rel="noticeedit" >
				已出租
				</a>
				</s:else>
				</s:if>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<%@include file="/common/pagebar.jsp" %>
</div>

