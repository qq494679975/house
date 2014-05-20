<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<div class="pageContent">
	<form method="post" action="rolecrud!update.action" class="pageForm required-validate" onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>角色名称：</dt>
				<dd>
					<input type="hidden" value="${model.rid}" name="rid"/>
					<%-- --  -->--%>
					<input type="text" value="${model.rname}"  name="rname"  remote="rolecrud!roleIsonly.action?rid=${model.rid}" class="required" /><font style="color: red">不许与其他角色名重复</font>
				</dd>
			</dl>
			<dl>
				<dt>角色描述：</dt>
				<dd>
					<input type="text" name="rdetail" value="${model.rdetail}" />
				</dd>
			</dl>
			<dl>  
				<dt>功能：</dt>
					<ul class="tree treeFolder treeCheck expand" oncheck="kkk" >
						<s:iterator var="bigMenu" value="menus.{? #this.mfatherid==0}">
							<li><a tname="roles" tvalue="${bigMenu.mid}" <s:property value="#bigMenu.mid in model.roles?'checked':''"/>>${bigMenu.mname}</a>
									<ul>
										<s:iterator var="smallMenu" value="menus.{? #this.mfatherid==#bigMenu.mid}">
													<li><a tname="roles" tvalue="${smallMenu.mid}" <s:property value="#smallMenu.mid in model.roles?'checked':''"/>>${smallMenu.mname}</a></li>
										</s:iterator>
									</ul>
							</li>
						</s:iterator>
					</ul>
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
<script type="text/javascript">
function kkk(){
	var json = arguments[0], result="";
//	alert(json.checked);

	$(json.items).each(function(i){
		result += "<p>name:"+this.name + " value:"+this.value+" text: "+this.text+"</p>";
	});
	$("#resultBox").html(result);
	
}
</script>
