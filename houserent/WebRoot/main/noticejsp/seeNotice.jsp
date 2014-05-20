<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">

		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>
					<label>
						标&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp题：
					</label>
				</dt>
				<dd>
					${model.ntitle }
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						有效日期：
					</label>
				</dt>
				<dd>
					${model.nouttime}
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
					${model.nistop==0?'是':'否'}
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						审&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp核：
					</label>
				</dt>
				<dd>
					${model.ispass==0?'未审核':model.ispass==1?'审核已通过':'审核未通过'}
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						内&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp容：
					</label>
				</dt>
				<dd>
					${model.ntext}
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
									<s:iterator value="%{model.tnoticeattachs}" status="s" >
										<tr>
											<td>
												${s.count}
											</td>
											<td>
												${naname}
											</td>
											<td>
												<a href="noticecrud!downAttach.action?attachs=${naattachid}"
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

		</div>
		<div class="formBar">
			<ul>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">
								取消
							</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
</div>
