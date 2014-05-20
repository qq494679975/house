<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
		<form method="post" action="housecrud!newHouseM.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>用户名:</dt>
				<dd><s:select list="usernamelist" name="uiid"></s:select>
				</dd>
			</dl>
			<dl>
				<dt>房租发布时间：</dt>
				<dd>
					<input disabled="disabled" type="text" name="husertime"  value="<%=new Date().toLocaleString() %>"/>
				</dd>
			</dl>
			<dl>
				<dt>房租：</dt>
				<dd>
					<input type="text" name="hmmoney"  />
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