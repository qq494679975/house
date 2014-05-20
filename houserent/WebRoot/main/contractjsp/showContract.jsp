<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
		<div class="pageFormContent nowrap" layoutH="97">
				<dt>合同甲方:</dt>
				<dd>
					<input type="text" class="required" disabled="disabled" value="${model.cuser }" name="cuser" />
				</dd>
			</dl>
			<dl>
				<dt>合同乙方:</dt>
				<dd>
					<input type="text" class="required"  disabled="disabled" value="${model.cboss }" name="cboss" />
				</dd>
			</dl>
			<dl>
				<dt>合同开始时间:</dt>
				<dd>
					<input type="text" class="required" disabled="disabled"  value="${model.cbegintime }" name="contractyear" />
				</dd>
			</dl>
			<dl>
				<dt>合同有效期:</dt>
				<dd>
					<input type="text" class="required" disabled="disabled"  value="${model.contractyear }" name="contractyear" />
				</dd>
			</dl>
			<dl>
				<dt>合同内容:</dt>
				<dd>
				<textarea disabled rows="40" cols="100"  class="required" name="cmessage">${model.cmessage }</textarea>
				</dd>
			</dl>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="button"><div class="buttonContent"><button type="button" class="close">返回</button></div></div></li>
			</ul>
		</div>
	
</div>
