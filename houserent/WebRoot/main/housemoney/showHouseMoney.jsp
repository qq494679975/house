<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

		<div class="pageFormContent nowrap" layoutH="97">

			<dl>
				<dt>用户名:</dt>
				<dd><input readonly="readonly" type="text" name="uiusername"  value="${model.tuserinfo.uiusername}"/>
				</dd>
			</dl>
			<dl>
				<dt>真实姓名：</dt>
				<dd>
					<input readonly="readonly" type="text" name="uirealname" value="${model.tuserinfo.uirealname}" />
				</dd>
			</dl>
			<dl>
				<dt>联系电话：</dt>
				<dd>
					<input readonly="readonly" type="text" name="uirealname" value="${model.tuserinfo.uiphone}" />
				</dd>
			</dl>
			<dl>
				<dt>时间：</dt>
				<dd>
					<input readonly="readonly" type="text" name="fromcity" value="${model.husertime}"/>
				</dd>
			</dl>
			<dl>
				<dt>总共金钱 ：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.hmmoney}"/>
				</dd>
			</dl>
			<dl>
				<dt>房租提交时间：</dt>
				<dd>
					<input readonly="readonly" type="text" name="address" value="${model.hmtime==null?'还未提交':model.hmtime}"/>
				</dd>
			</dl>
		</div>