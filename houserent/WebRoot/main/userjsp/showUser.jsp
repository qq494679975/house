<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

	<form method="post" action="usercrud!updateUserMe.action" class="pageForm required-validate" onsubmit="return validateCallback(this)">
		<div class="pageFormContent nowrap" layoutH="97">

			<dl>
				<dt>用户名:</dt>
				<dd><input type="hidden" name="uiid"  value="${model.uiid}"/>
					<input readonly="readonly" type="text" name="uiusername"  value="${model.uiusername}"/>
				</dd>
			</dl>
			<dl>
				<dt>真实姓名：</dt>
				<dd>
					<input readonly="readonly" type="text" name="uirealname" value="${model.uirealname}" />
				</dd>
			</dl>
			<dl>
				<dt>籍贯：</dt>
				<dd>
					<input readonly="readonly" type="text" name="fromcity" value="${model.uifrom}"/>
				</dd>
			</dl>
			<dl>
				<dt>联系电话：</dt>
				<dd>
					<input readonly="readonly" type="text" name="phone" value="${model.uiphone}" />
				</dd>
			</dl>
			<dl>
				<dt>e-mail：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.uiemail}"/>
				</dd>
			</dl>
			<dl>
				<dt>账户余额：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.uimoney}元"/>
				</dd>
			</dl>
			<dl>
				<dt>注册日期：</dt>
				<dd>
					<input readonly="readonly" type="text" name="address" value="${model.uitime}"/>
				</dd>
			</dl>
		</div>