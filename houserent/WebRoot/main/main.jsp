<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>OA</title>
<link href="dwz/themes/azure/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="dwz/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>

<link href="dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>



<script src="dwz/js/speedup.js" type="text/javascript"></script>


<script src="dwz/js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="dwz/js/jquery.cookie.js" type="text/javascript"></script>
<script src="dwz/js/jquery.validate.js" type="text/javascript"></script>
<script src="dwz/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="dwz/xheditor/xheditor-1.1.14-zh-cn.min.js" type="text/javascript"></script>
<script src="dwz/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>


<script src="dwz/js/dwz.core.js" type="text/javascript"></script>
<script src="dwz/js/dwz.util.date.js" type="text/javascript"></script>
<script src="dwz/js/dwz.validate.method.js" type="text/javascript"></script>
<script src="dwz/js/dwz.regional.zh.js" type="text/javascript"></script>
<script src="dwz/js/dwz.barDrag.js" type="text/javascript"></script>
<script src="dwz/js/dwz.drag.js" type="text/javascript"></script>
<script src="dwz/js/dwz.tree.js" type="text/javascript"></script>
<script src="dwz/js/dwz.accordion.js" type="text/javascript"></script>
<script src="dwz/js/dwz.ui.js" type="text/javascript"></script>
<script src="dwz/js/dwz.theme.js" type="text/javascript"></script>
<script src="dwz/js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="dwz/js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="dwz/js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="dwz/js/dwz.navTab.js" type="text/javascript"></script>
<script src="dwz/js/dwz.tab.js" type="text/javascript"></script>
<script src="dwz/js/dwz.resize.js" type="text/javascript"></script>
<script src="dwz/js/dwz.dialog.js" type="text/javascript"></script>
<script src="dwz/js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="dwz/js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="dwz/js/dwz.cssTable.js" type="text/javascript"></script>
<script src="dwz/js/dwz.stable.js" type="text/javascript"></script>
<script src="dwz/js/dwz.taskBar.js" type="text/javascript"></script>
<script src="dwz/js/dwz.ajax.js" type="text/javascript"></script>
<script src="dwz/js/dwz.pagination.js" type="text/javascript"></script>
<script src="dwz/js/dwz.database.js" type="text/javascript"></script>
<script src="dwz/js/dwz.datepicker.js" type="text/javascript"></script>
<script src="dwz/js/dwz.effects.js" type="text/javascript"></script>
<script src="dwz/js/dwz.panel.js" type="text/javascript"></script>
<script src="dwz/js/dwz.checkbox.js" type="text/javascript"></script>
<script src="dwz/js/dwz.history.js" type="text/javascript"></script>
<script src="dwz/js/dwz.combox.js" type="text/javascript"></script>
<script src="dwz/js/dwz.print.js" type="text/javascript"></script>
<script src="dwz/js/dwz.showTip.js" type="text/javascript"></script>
<!--
<script src="bin/dwz.min.js" type="text/javascript"></script>
-->
<script src="dwz/js/dwz.regional.zh.js" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
	DWZ.init("dwz/dwz.frag.xml", {
	//	loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
		loginUrl:"login.jsp",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"currentPage", numPerPage:"pageSize", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		debug:false,	// 调试模式 【true|false】
		mainTabURL:"main/MyJsp.jsp",//我的首页选项卡的路径
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"themes"}); // themeBase 相对于index页面的主题base路径
			showTip.init({
				isShow:${tip.tshow==0?'true':'false'},
				period:${tip.ttime},
				showNotice:${tip.tnorice==0?'true':'false'},
				showEmail:${tip.temail==0?'true':'false'},
				url:"systemcrud!readTip.action",
				callback:function(data){
					var msg="<ul>";
					if(this.showNotice){
					msg+="<li><a href=\"noticecrud!personNoticeList.action\" rel=\"oa12\" title=\"我的公告\" target=\"navTab\">您有"+data.noticenum+"个未读公告</a></li>";}
					if(this.showEmail){
					msg+="<li><a href=\"eamilcrud!receieveEMail.action\" rel=\"oa16\" title=\"我的邮件\" target=\"navTab\">您有"+data.emailnum+"个未读邮件</a></li>";}
					msg+="</ul>";
					showTip.info(msg);
				}
			});
		}
	});
	
	
});
function outsystem()
{
	if(confirm("确认退出？"))
	{
		top.document.location.href="systemcrud!user_out.action";
	}
}

</script>
</head>

<body scroll="no">
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<a class="logo" >标志</a>
				<ul class="nav">
					<li><a onclick="outsystem()">退出</a></li>
				</ul>
				<ul class="themeList" id="themeList">
					<li theme="default"><div class="selected">蓝色</div></li>
					<li theme="default"><div>绿色</div></li>
					<!--<li theme="red"><div>红色</div></li>-->
					<li theme="purple"><div>紫色</div></li>
					<li theme="silver"><div>银色</div></li>
					<li theme="azure"><div>天蓝</div></li>				
				</ul>
			</div>
		
			
		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>

				<div class="accordion" fillSpace="sidebar">
					<s:iterator value="menus.{? #this.mfatherid==0}" var="big">
					<div class="accordionHeader">
						<h2><span>Folder</span>${mname}</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree">
						<s:iterator value="menus.{? #this.mfatherid==#big.mid}" var="small">
						<li><a href="${small.murl}" target="navTab" rel="oa${mid}">${small.mname}</a></li>
						</s:iterator>
						</ul>
					</div>
					</s:iterator>
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main" url="MyJsp.jsp"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">我的主页</a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox" id="maintabshow">
					</div>
				</div>
			</div>
		</div>

	</div>

	<div id="footer">Copyright &copy; 2013 <a href="demo_page2.html" target="dialog">InAction团队</a> Tel：</div>


</body>
</html>