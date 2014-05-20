<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
function testConfirmMsg(url, data){
	alertMsg.confirm("确定删除？", {
		okCall: function(){
			$.post(url, data, navTabAjaxDone, "json");
		}
	});
}
</script>

<div class="pageContent">
	<form class="pageForm required-validate"
		onsubmit="return validateCallback(this,navTabAjaxDone)"
		enctype="multipart/form-data" action="eamilcrud!delSeeEmail.action"
		method="post">
		<div class="pageFormContent nowrap" layoutH="97">
			<input type="hidden" name="umid" value="${model.umid}" />
			<dl>
				<dt>
					<a title="回复" class="button" target="navTab" rel="seeget2" href="eamilcrud!backGetEmail.action?umid=${model.umid}"><span>回复</span>
					</a>
					<a title="转发" class="button" target="navTab" rel="seeget3" href="eamilcrud!tranGetEMail.action?umid=${model.umid}"><span>转发</span>
					</a>
					<a class="button" href="javascript:;"
						onclick="testConfirmMsg('eamilcrud!delGetseeEmail.action',{'umid':'${model.umid}'})"><span>转入垃圾箱</span>
					</a>
					<a class="button" href="javascript:;"
						onclick="testConfirmMsg('eamilcrud!delrealseeEmail.action',{'umid':'${model.umid}'})"><span>彻底删除</span>
					</a>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">
								返回
							</button>
						</div>
					</div>
				</dt>
			</dl>
			<dl>
				<dt>
					<label>
						发件人：
					</label>
				</dt>
				<dd>
					${model.efromuser}
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						主题：
					</label>
				</dt>
				<dd>
					${model.etitle}
					<br />
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						附&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp件：
					</label>
				</dt>
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
									<s:iterator value="%{model.temailattachs}" status="s">
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
				<s:else>
					无上传的附件
				</s:else>
			</dl>
			<dl>
				<dt>
					<label>
						内&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp容：
					</label>
				</dt>
				<dd>
					${model.emessage}
				</dd>
			</dl>
		</div>
	</form>
</div>
