<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="pageHeader">
	<form id="pagerForm" method="post"
		onsubmit="return dwzSearch(this,'dialog');"
		action="eamilcrud!readDD.action">
		<div class="searchBar">
			<table class="searchContent">
				<tr>
					<td>
						<input type="hidden" name="currentPage"
							value="${pageModel.currentPage}" />
						<input type="hidden" name="pageSize" value="${pageModel.pageSize}" />
						<s:select list="userDD" headerKey="0" headerValue="家庭类型"
							name="emailuser.did"></s:select>
					</td>
				</tr>
			</table>
			<div class="subBar">
				<ul>

					<li>
						<div class="buttonActive">
							<div class="buttonContent">
								<button type="submit">
									检索
								</button>
							</div>
						</div>
					</li>
					<li>
						<div class="button">
							<div class="buttonContent">
								<button type="button" multLookup="emailuser" warn="请选择部门">
									选择带回
								</button>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</form>
</div>
<div class="pageContent">

	<table class="table" layoutH="118" targetType="dialog" width="100%">
		<thead>
			<tr>
				<th width="30">
					<input type="checkbox" class="checkboxCtrl" group="emailuser" />
				</th>
				<th orderfield="orgName">
					家庭类型
				</th>
				<th orderfield="creator">
					用户账号
				</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="%{pageModel.result}" var="eu">
				<tr>
					<td>
						<input type="checkbox" name="emailuser"
							value="{id:'${eu.uiid }', uiusername:'${eu.uiusername }'}" />
					</td>
					<td>
						${eu.dname }
					</td>
					<td>
						${eu.uiusername }
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>每页</span>
			<select class="combox" name="numPerPage" onchange="dwzPageBreak({targetType:dialog, numPerPage:'1'})">
				<s:iterator begin="1" end="5" var="i">
				<option value="${i*10}" ${i*10==pageModel.pageSize?'selected':''}>
					${i*10}
				</option>
			</s:iterator>
			</select>
			<span>条，共${pageModel.allCount}条</span>
		</div>
		<div class="pagination" targetType="dialog"
		totalCount="${pageModel.allCount}" numPerPage="${pageModel.pageSize }"
		pageNumShown="10" currentPage="${pageModel.currentPage}"></div>
	
	</div>
</div>
