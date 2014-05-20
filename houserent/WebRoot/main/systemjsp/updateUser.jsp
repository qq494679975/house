<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<div class="pageContent">
	<form method="post" rel="asdasdasd" action="systemcrud!updateUser.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
					<input type="hidden" name="uiid" value="${model.uiid}"/>
			<dl>
				<dt>用户名：</dt>
				<dd>
					<input type="text" name="uiusername" value="${model.uiusername}" readonly="readonly" class="required" />
				</dd>
			</dl>
			<dl>
				<dt>真实姓名：</dt>
				<dd>
					<input type="text" name="uirealname" class="required username" value="${model.uirealname}"/>
				</dd>
			</dl>
			<dl>
				<dt>家庭类型：</dt>
				<dd>
					<s:select list="familytype" name="uifamilytype" value="%{model.uifamilytype}" ></s:select>
				</dd>
			</dl>
			<dl>
				<dt>籍贯：</dt>
				<dd>
					<input type="text" name="uifrom" value="${model.uifrom}"/>
				</dd>
			</dl>
			<dl>
				<dt>联系电话：</dt>
				<dd>
					<input type="text" name="uiphone" class="phone" value="${model.uiphone}"/>
				</dd>
			</dl>
			<dl>
				<dt>e-mail：</dt>
				<dd>
					<input type="text" name="uiemail" class="email" value="${model.uiemail}"/>
				</dd>
			</dl>
			<dl>
				<dt>选择角色：</dt>
				<dd>
				<s:checkboxlist list="roles" name="troles" cssClass="required" value="model.troles.{rid}"></s:checkboxlist>
				</dd>
			</dl>
			<dl>
				<dt>用户余额：</dt>
				<dt>${model.uimoney}</dt>
				<dd>
				<a title="用户余额清零?" href="systemcrud!delmoney.action?uiid=${model.uiid}" target="ajaxTodo"" target="ajaxTodo" class="btnView">余额清零</a>
				</dd>
			</dl>
			</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">提交</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="reset">重置</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div></li>
			</ul>
		</div>
	</form>
	
</div>

