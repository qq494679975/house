<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script>
function readSelect(key)
{
	var aaa = document.getElementById("aaa");
	var url = "menucrud!menuIsOnly.action?_="+new Date().getTime()+"&mfatherid="+key;
	aaa.setAttribute("remote",url);
	var menuurltext = document.getElementById("menuurltext");
	if(key>0){
	menuurltext.removeAttribute("readonly");
	menuurltext.setAttribute("class","required");
	}else
	{
		menuurltext.setAttribute("readonly", "readonly");
		menuurltext.removeAttribute("class");
	}
}

function changeRemote()
{
	var aaa = document.getElementById("aaa");
	var remotevalue =document.getElementById("xxxx").value;
	var url = "menucrud!menuIsOnly.action?_="+new Date().getTime()+"&mfatherid="+remotevalue;
	aaa.setAttribute("remote",url);
	
}
</script>
<div class="pageContent">
	<form method="post" action="menucrud!newMenu.action"
		class="pageForm required-validate"
		onsubmit="return validateCallback(this,navTabAjaxDone)">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>
					父类别名称:
				</dt>
				<dd>
					<s:select list="menusMap" id="xxxx"
						onchange="readSelect(this.value)" headerKey="0" headerValue="请选择"
						name="mfatherid"></s:select>
					不选默认父菜单
				</dd>
			</dl>
			<dl>
				<dt>
					菜单名称:
				</dt>
				<dd>
				<%--remote="menu/menusCRUD!menuIsOnly.action?_=<%=new Date().getTime()%>&menuid=0"  --%>
					<input type="text" name="mname" id="aaa" class="required"
						onclick="changeRemote()" remote="menucrud!menuIsOnly.action?_=<%=new Date().getTime()%>&mfatherid=0"
						/><font style="color: red">不许与所在类其他菜单重复</font>
				</dd>
			</dl>
			<dl>
				<dt>
					菜单连接:
				</dt>
				<dd>
					<input id="menuurltext" size="40" readonly="readonly" type="text"
						name="murl" />
				</dd>
			</dl>
		</div>
		<div class="formBar">
			<ul>
				<li>
					<div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">
								提交
							</button>
						</div>
					</div>
				</li>
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
	</form>

</div>


