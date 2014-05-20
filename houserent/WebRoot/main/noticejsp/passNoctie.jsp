<%@ page language="java" import="java.util.*,com.softxm.hs.model.Tuserinfo" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<div class="pageContent">
	
	<form method="post" action="noticecrud!passNotice.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<input type="hidden" value="<%=request.getParameter("nnoticeid")%>" name="nnoticeid"/>
			
			<dl>
				<dt>审核人:</dt>
				<dd>
					<input readonly="readonly" type="text" name="name" maxlength="20" class="required" value="<%=((Tuserinfo)request.getSession().getAttribute("LOGIN_USER")).getUiusername() %>"/>
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>公告标题:</dt>
				<dd>
					<input readonly="readonly" type="text" name="ntitle" class="required" value="<%=request.getParameter("ntitle")%>" />
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
			<dl>
				<dt>审核时间:</dt>
				<dd>
					<input readonly="readonly" type="text" name="npasstime" class="required" value="<%=new Date().toLocaleString() %>" />
					<span class="info"></span>
				</dd>
			</dl>
			<dl>
				<dt>审核</dt>
				<dd>
					<s:radio list="#{1:'通过',2:'不通过'}"name="ispass" cssClass="required"></s:radio>
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

