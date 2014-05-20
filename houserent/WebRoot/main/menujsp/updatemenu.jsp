<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">

	function changeRe(myRe)
	{
		var url="menucrud!menuIsOnlyup.action?_="+new Date().getTime()+"&mfatherid=${model.mfatherid}&mid=${model.mid}";
		myRe.setAttribute("remote",url);
	}
</script>
<div class="pageContent">
	
	<form method="post" action="menucrud!updateMenu" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
				<dt>菜单名称:</dt>
				<dd>
					<input type="hidden" name="mid" value="${model.mid}"/>
					<input type="hidden" name="mfatherid" value="${model.mfatherid}"/>
					<%--  --%>
					<input type="text" size="20" onchange="changeRe(this)" remote="menucrud!menuIsOnlyup.action?_=<%=new Date().getTime()%>&mfatherid=${model.mfatherid}&mid=${model.mid}"  name="mname" value="${model.mname}"  />
					<font style="color: red">不许与所在类其他菜单重复</font>
				</dd>
			</dl>
			<dl>
				<dt>菜单连接:</dt>
				<dd>
					<input readonly="readonly" size="40" type="text" name="murl" value="${model.murl}"/>
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


