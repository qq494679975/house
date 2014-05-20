<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
<script>

function readSelect(key)
{
	var aaa = document.getElementById("aaa");
	var url = "dictionarycrud!dicIsOnly.action?_="+new Date().getTime()+"&dfatherid="+key;
	aaa.setAttribute("remote",url);
}

function changeRemote()
{
	var aaa = document.getElementById("aaa");
	var remotevalue =document.getElementById("xxxx").value;
	var url = "dictionarycrud!dicIsOnly.action?_="+new Date().getTime()+"&dfatherid="+remotevalue;
	aaa.setAttribute("remote",url);
}
</script>
	<form method="post" action="dictionarycrud!newDictionary.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>父类别名称:</dt>
				<dd>
					<s:select id="xxxx" list="bigdic" headerKey="0" onchange="readSelect(this.value)" headerValue="请选择" name="dfatherid"></s:select><font style="color: red">不选默认是大类</font>
				</dd>
			</dl>
			<dl>
				<dt>数据字典名称:</dt>
				<dd>
					<input id="aaa" type="text" class="required" name="dname" remote="dictionarycrud!dicIsOnly.action?_=<%=new Date().getTime()%>&dfatherid=0" /><font style="color: red">不许与所在类数据字典名称重复</font>
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
