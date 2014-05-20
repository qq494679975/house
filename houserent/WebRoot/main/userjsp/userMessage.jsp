<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">
	
	<form method="post" action="systemcrud!updatePersonMessage.action" class="pageForm required-validate" onsubmit="return validateCallback(this)">
		<div class="pageFormContent nowrap" layoutH="97">

			<dl>
				<dt>用户名:</dt>
				<dd><input type="hidden" name="uiid"  value="${LOGIN_USER.uiid}"/>
					<input readonly="readonly" type="text" name="uiusername"  value="${LOGIN_USER.uiusername}"/>
				</dd>
			</dl>
			<dl>
				<dt>真实姓名：</dt>
				<dd>
					<input type="text" name="uirealname" value="${LOGIN_USER.uirealname}" class="required username"/>
				</dd>
			</dl>
			<dl>
				<dt>籍贯：</dt>
				<dd>
					<input type="text" name="uifrom" value="${LOGIN_USER.uifrom}"/>
				</dd>
			</dl>
			<dl>
				<dt>联系电话：</dt>
				<dd>
					<input type="text" name="uiphone" value="${LOGIN_USER.uiphone}" />
				</dd>
			</dl>
			<dl>
				<dt>e-mail：</dt>
				<dd>
					<input type="text" name="uiemail" value="${LOGIN_USER.uiemail}" class="email"/>
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

