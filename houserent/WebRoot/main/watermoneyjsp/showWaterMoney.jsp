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
					<input readonly="readonly" type="text" name="fromcity" value="${model.wmusertime}"/>
				</dd>
			</dl>
			<dl>
				<dt>使用吨数：</dt>
				<dd>
					<input readonly="readonly" type="text" name="phone" value="${model.wmnum}" />
				</dd>
			</dl>
			<dl>
				<dt>每吨多少钱 ：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.wmmoney/model.wmnum}"/>
				</dd>
			</dl>
			<dl>
				<dt>总共金钱 ：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.wmmoney}"/>
				</dd>
			</dl>
			<dl>
				<dt>电费提交时间：</dt>
				<dd>
					<input readonly="readonly" type="text" name="address" value="${model.wmtime==null?'还未提交':model.wmtime}"/>
				</dd>
			</dl>
		</div>