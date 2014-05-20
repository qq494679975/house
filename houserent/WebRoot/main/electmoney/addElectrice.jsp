<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
		<form method="post" action="electriccrud!newElec.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>用户名:</dt>
				<dd><s:select list="usernamelist" name="uiid"></s:select>
				</dd>
			</dl>
			<dl>
				<dt>电费时间：</dt>
				<dd>
					<input disabled="disabled" type="text" name="emusertime"  value="<%=new Date().toLocaleString() %>"/>
				</dd>
			</dl>
			<dl>
				<dt>使用度数：</dt>
				<dd>
					<input type="text" name="emnum"  />
				</dd>
			</dl>
			<dl>
				<dt>每度多少钱：</dt>
				<dd>
					<input type="text" name="emmoneybyone"  />
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