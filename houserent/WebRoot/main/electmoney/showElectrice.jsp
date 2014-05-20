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
				<dt>电费时间：</dt>
				<dd>
					<input readonly="readonly" type="text" name="fromcity" value="${model.emusertime}"/>
				</dd>
			</dl>
			<dl>
				<dt>使用度数：</dt>
				<dd>
					<input readonly="readonly" type="text" name="phone" value="${model.emnum}" />
				</dd>
			</dl>
			<dl>
				<dt>总共金钱 ：</dt>
				<dd>
					<input readonly="readonly" type="text" name="email" value="${model.emmoney}"/>
				</dd>
			</dl>
			<dl>
				<dt>电费提交时间：</dt>
				<dd>
					<input readonly="readonly" type="text" name="address" value="${model.emtime==null?'还未提交':model.emtime}"/>
				</dd>
			</dl>
		</div>