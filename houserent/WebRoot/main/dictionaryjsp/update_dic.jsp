<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="pageContent">
<script type="text/javascript">
	function changeRe(myRe)
	{
		var url="dictionarycrud!dicIsOnlyUp.action?_="+new Date().getTime()+"&dfatherid=${model.dfatherid}&ddid=${model.ddid}";
		myRe.setAttribute("remote",url);
	}
</script>
	<form method="post" action="dictionarycrud!updatedic.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>父类别名称:</dt>
				<dd>
					<s:select list="bigdic" headerKey="0" headerValue="请选择" name="dfatherid" value="model.dfatherid"></s:select>不选默认是大类
				</dd>
			</dl>
			<dl>
				<dt>数据字典名称:</dt>
				<dd>
					<input type="hidden" name="ddid" value="${model.ddid}"/>
					<%-- --%>
					<input type="text" name="dname" class="required" value="${model.dname}" onchange="changeRe(this)" remote="dictionarycrud!dicIsOnlyUp.action?_=<%=new Date().getTime()%>&dfatherid=${model.dfatherid}&ddid=${model.ddid}">
					<font style="color: red">不许与所在类数据字典名称重复</font>
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
