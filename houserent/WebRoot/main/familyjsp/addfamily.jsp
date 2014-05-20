<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
	<form method="post" action="familycrud!newFamily.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>家庭角色:</dt>
				<dd>
					<s:select list="familyrole" name="ufrole"></s:select>
				</dd>
			</dl>
			<dl>
				<dt>姓名:</dt>
				<dd>
					<input type="text" class="required" name="ufname" />
				</dd>
			</dl>
			<dl>
				<dt>身份证:</dt>
				<dd>
					<input type="text" class="required" name="ufidcard" />
				</dd>
			</dl>
			<dl>
				<dt>电话:</dt>
				<dd>
					<input  type="text" class="required" name="ufphone" />
				</dd>
			</dl>
			<dl>
				<dt>工作:</dt>
				<dd>
					<input  type="text" class="required" name="ufjob" />
				</dd>
			</dl>
			<dl>
				<dt>收入:</dt>
				<dd>
					<input  type="text" class="required" name="ufmoney" />
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
