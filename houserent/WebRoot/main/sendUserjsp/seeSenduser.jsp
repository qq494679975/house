<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="pageContent">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>
					<label>
						申请人：
					</label>
				</dt>
				<dd>
					${model.suusername }
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						申请日期：
					</label>
				</dt>
				<dd>
					${model.sutime }
				</dd>
			</dl>
			<dl>
			<dl>
				<dt>
					<label>
						审核人：
					</label>
				</dt>
				<dd>
					${model.uiusername}
				</dd>
			</dl>
			<dl>
			<dl>
				<dt>
					<label>
						审核日期：
					</label>
				</dt>
				<dd>
					${model.supasstime}
					<br/>
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						申请人电话：
					</label>
				</dt>
				<dd>
					${model.suphone}
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						审&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp核：
					</label>
				</dt>
				<dd>
					${model.sustatus==0?'未审核':model.sustatus==1?'审核已通过':'审核未通过'}
				</dd>
			</dl>
			<dl>
				<dt>
					<label>
						内&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp容：
					</label>
				</dt>
				<dd>
					${model.sumessage }
				</dd>
			</dl>
</div>
