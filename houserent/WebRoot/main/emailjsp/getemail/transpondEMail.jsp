<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">
	function savetmp(myAticon)
	{
		var savetmp_form = document.getElementById("savetmp_form1");
		savetmp_form.action=myAticon;
	}
</script>
<div class="pageContent">
	<form id="savetmp_form1" method="post" action="eamilcrud!tranEMail.action"
		class="pageForm required-validate"
		onsubmit="return iframeCallback(this,navTabAjaxDone)" >
		<div class="pageFormContent nowrap" layoutH="20">
			<div style="float: left;">
				<table>
					<tr>
						<td>
							收件人:
						</td>
						<td><input type="hidden" name="eid" value="${model.eid}"/>
						<input type="hidden" name="ehasattach" value="${model.ehasattach}"/>
							<input name="emailuser.uiusername" type="text" class="required"
								readonly="readonly" />
							<a class="btnLook" href="eamilcrud!readDD.action"
								lookupGroup="emailuser">查找带回</a>
						</td>
						<td>
							请从右边选择收件人,多个人逗号隔开
						</td>
					</tr>
					<tr>
						<td>
							主题：
						</td>
						<td>
							<input type="text" value="转发 :" name="etitle" class="required" />
						</td>
						<td>
							请输入主题
						</td>
					</tr>
					<tr>
						<td>
							上传附件：
						</td>
						<td colspan="2">
										<s:if test="model.temailattachs.size()>0">
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
												<s:iterator value="model.temailattachs" status="s">
													<tr>
														<td>
															${s.count}
														</td>
														<td>
															${eaname}
														</td>
														<td>
													<a href="eamilcrud!downAttache.action?temailattach.eaid=${eaid}"
																class="btnAttach" title="下载">下载</a>
														</td>
													</tr>
												</s:iterator>
											</tbody>
										</table>
									</div>
								</div>
							</s:if>
						</td>
					</tr>
					<tr>
						<td>
							内容：
						</td>
						<td colspan="2">
							<textarea class="editor" name="emessage" rows="17" cols="80"
								tools="mfull">${model.emessage}</textarea>
						</td>
					</tr>
					<tr>	
						<td colspan="2"></td>
						<td align="center">
							<div class="buttonActive"><div class="buttonContent"><button onclick="savetmp('eamilcrud!tranEMail.action')" type="submit">发送</button></div></div>
							<div class="buttonActive"><div class="buttonContent"><button onclick="savetmp('eamilcrud!saveEMailTemp.action')" type="submit">加入草稿箱</button></div></div>
							</td>
					</tr>
				</table>
			</div>
		</div>
	</form>

</div>
