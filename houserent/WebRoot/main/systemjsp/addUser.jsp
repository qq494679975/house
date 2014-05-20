<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	
	<form method="post" action="systemcrud!newUser.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>账号：</dt>
				<dd>
					<%--  --%>
					<input type="text" name="uiusername" class="required" remote="systemcrud!userIsLive.action"/>
				</dd>
			</dl>
			<dl>
				<dt>密码：</dt>
				<dd>
					<input id="w_validation_pwd" type="password"  name="uipassword" class="required alphanumeric" minlength="3" maxlength="15" alt="字母、数字、下划线 3-20位"/>

				</dd>
			</dl>
			<dl>
				<dt>确认密码：</dt>
				<dd>
					<input type="password" name="passwordtemp" class="required" equalto="#w_validation_pwd"/>
				</dd>
			</dl>
			<dl>
				<dt>真实姓名：</dt>
				<dd>
					<input type="text" name="uirealname" class="required username" />
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>家庭类型：</dt>
				<dd>
					<s:select list="familytype" name="uifamilytype"></s:select>
				</dd>
			</dl>
			<dl>
				<dt>籍贯：</dt>
				<dd>
					<input type="text" name="uifrom" />
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>电子邮件：</dt>
				<dd>
					<input type="text" name="uiemail" class="email"/>
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>手机：</dt>
				<dd>
					<input type="text" name="uiphone" class="mbphone"/>
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>选择角色：</dt>
				<dd>
				<s:checkboxlist list="roles" name="troles" cssClass="required" ></s:checkboxlist>
				</dd>
			</dl>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">提交</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div></li>
			</ul>
		</div>
	</form>
	
</div>

