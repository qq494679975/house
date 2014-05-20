<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">
	
	<form method="post" action="systemcrud!updateUserTip.action" class="pageForm required-validate" onsubmit="return validateCallback(this,tipAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">

			<dl>
				<dt>是否显示小贴士：</dt>
				<dd>
					<s:radio list="#{0:'是',1:'否'}" value="%{tip.tshow}" name="tip.tshow"></s:radio>
				</dd>
			</dl>
			<dl>
				<dt>周期：</dt>
				<dd>
					<input type="text" name="tip.ttime" value="${requestScope.tip.ttime}" class="required digits" maxlength="3" minlength="1">
				</dd>
			</dl>
			
			<dl>
				<dt>是否显示公告：</dt>
				<dd>
					<s:radio list="#{0:'是',1:'否'}" value="%{tip.tnorice}" name="tip.tnorice"></s:radio>
				</dd>
			</dl>
				<dl>
				<dt>是否显示邮件：</dt>
				<dd>
				
					<s:radio list="#{0:'是',1:'否'}" value="%{tip.temail}" name="tip.temail"></s:radio>
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