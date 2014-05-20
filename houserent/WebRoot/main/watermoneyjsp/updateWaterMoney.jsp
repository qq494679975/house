<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
		<form method="post" action="watercrud!updateWater.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>用户名:</dt>
					<input type="hidden" value="${model.wmid}" name="wmid"/>
				<dd><input type="text" disabled="disabled" value="${model.tuserinfo.uiusername}"/>
				</dd>
			</dl>
			<dl>
				<dt>水费时间：</dt>
				<dd>
					<input disabled="disabled" type="text" name="wmusertime"  value="${model.wmusertime}"/>
				</dd>
			</dl>
			<dl>
				<dt>使用吨数：</dt>
				<dd>
					<input type="text" name="wmnum" value="${model.wmnum}" />
				</dd>
			</dl>
			<dl>
				<dt>每吨多少钱：</dt>
				<dd>
					<input type="text" name="onewatermoney" value="${model.onemoney}" />
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