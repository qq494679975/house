<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<div class="pageContent">
	
	<form method="post" action="systemcrud!updatePassword.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>原始密码：</dt>
				<dd>		<%//remote="usercrud!passwordIsOK.action" %>
					<input type="password" name="uipassword" maxlength="15"  class="required" />
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>新密码：</dt>
				<dd>
					<input id="w_validation_pwd" type="password" name="passwordtemp" class="required alphanumeric" minlength="3" maxlength="15" alt="字母、数字、下划线 6-20位"/>
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>确认密码：</dt>
				<dd>
					<input type="password" name="newpassword" class="required" equalto="#w_validation_pwd"/>
					<span class="info"></span>
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

