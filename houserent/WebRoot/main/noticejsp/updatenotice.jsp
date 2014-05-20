<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">

	<form method="post" action="noticecrud!updateNotice.action"
		class="pageForm required-validate"
		onsubmit="return iframeCallback(this,navTabAjaxDone)"
		enctype="multipart/form-data">
		<div class="pageFormContent nowrap" layoutH="97">
			<input type="hidden" name="nnoticeid" value="${model.nnoticeid}" />
			<input type="hidden" name="nhasattach" value="${model.nhasattach}" />
			<dl>
				<dt>
					<label>
						标&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp题：
					</label>
				</dt>
				<dd>
					<s:textfield cssClass="required" name="ntitle" value="%{model.ntitle}"></s:textfield>
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
						name="nouttime" value="${model.nouttime}" />
					<br />
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						是否置顶：
					</label>
				</dt>
				<dd>

					<s:radio list="#{0:'是',1:'否'}" name="nistop" cssClass="required"
						value="%{model.nistop}"></s:radio>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						内&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp容：
					</label>
				</dt>
				<dd>
					<s:textarea cssClass="editor" name="ntext" rows="6" cols="100" tools="mfull"
						value="%{model.ntext}"></s:textarea>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						附&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp件：
					</label>
				</dt>
				<s:if test="model.tnoticeattachs!=null">
					<div class="panel  collapse" defH="100">
						<h1>
							已上传的附件
						</h1>
						<div>
							<table class="table" width="90%">
								<thead>
									<tr>
										<th width="50">
											序号
										</th>
										<th>
											附件名称
										</th>
										<th width="100">
											操作
										</th>
									</tr>
								</thead>
								<tbody>
									<s:iterator value="model.tnoticeattachs" status="s">
										<tr>
											<td>
												${s.count}
											</td>
											<td>
												${naname}
											</td>
											<td>
												<a href="noticecrud!delAttach.action?nnoticeid=${model.nnoticeid}&attachs=${naattachid}"
													target="ajaxTodo" class="btnDel" title="删除">删除 </a><a
													href="noticecrud!downAttach.action?attachs=${naattachid}"
													class="btnAttach" title="下载">下载</a>
											</td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
						</div>
					</div>
					<s:iterator begin="%{model.tnoticeattachs.size()}" end="2">
						<input type="file" name="fileModel.attach" />
						<br>
					</s:iterator>
				</s:if>
				<s:else>
					<dd>
						<input type="file" name="fileModel.attach">
						<br />
						<input type="file" name="fileModel.attach">
						<br />
						<input type="file" name="fileModel.attach">
					</dd>
				</s:else>
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