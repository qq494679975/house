<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">
	function savetmp(myAticon)
	{
		var savetmp_form = document.getElementById("savetmp_form");
		savetmp_form.action=myAticon;
	}
</script>
<div class="pageContent">
	<form id="savetmp_form" method="post" action="eamilcrud!sendEMail.action"
		class="pageForm required-validate"
		onsubmit="return iframeCallback(this,navTabAjaxDone)" enctype="multipart/form-data">
		<div class="pageFormContent nowrap" layoutH="20">
			<div style="float: left;">
				<table>
					<tr>
						<td>
							收件人:
						</td>
						<td>
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
							<input type="text" name="etitle" class="required" />
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
							<input type="file" name="fileModel.attach" />
							<br />
							<input type="file" name="fileModel.attach" />
							<br />
							<input type="file" name="fileModel.attach" />
							<br />
						</td>
					</tr>
					<tr>
						<td>
							内容：
						</td>
						<td colspan="2">
							<textarea class="editor" name="emessage" rows="17" cols="80"
								tools="mfull"></textarea>
						</td>
					</tr>
					<tr>	
						<td colspan="2"></td>
						<td align="center">
							<div class="buttonActive"><div class="buttonContent"><button onclick="savetmp('eamilcrud!sendEMail.action')" type="submit">发送</button></div></div>
							
							<div class="buttonActive"><div class="buttonContent"><button onclick="savetmp('eamilcrud!saveEMailTemp.action')" type="submit">加入草稿箱</button></div></div>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</form>

</div>
