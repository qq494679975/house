<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">

	<form method="post" action="noticecrud!newNotice.action"
		class="pageForm required-validate"
		onsubmit="return iframeCallback(this,navTabAjaxDone)"
		enctype="multipart/form-data">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>
					<label>
						标&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp题：
					</label>
				</dt>
				<dd>
					<s:textfield cssClass="required" name="ntitle"></s:textfield>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						有效日期：
					</label>
				</dt>
				<dd>
					<input type="text" class="required date" dateFmt="yyyy-MM-dd"
						readonly="true" minDate="{%y}-%M-{%d+1}" maxDate="2220-12-31"
						name="nouttime" />
					<br/>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						是否置顶：
					</label>
				</dt>
				<dd>

					<s:radio list="#{0:'是',1:'否'}" name="nistop" cssClass="required"></s:radio>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						内&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp容：
					</label>
				</dt>
				<dd>
					<s:textarea cssClass="editor" name="ntext" rows="6" cols="100" tools="mfull"></s:textarea>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						附&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp件：
					</label>
				</dt>
				<dd>
					<input type="file" name="fileModel.attach">
					<br />
					<input type="file" name="fileModel.attach">
					<br />
					<input type="file" name="fileModel.attach">
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