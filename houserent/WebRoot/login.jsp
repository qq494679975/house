<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>房屋租赁系统</title>
<link rel="stylesheet" href="css/lanrenzhijia.css" type="text/css"
	media="screen" />
<style type="text/css">
.progress {
	width: 1px;
	height: 14px;
	color: white;
	font-size: 12px;
	overflow: hidden;
	background-color: navy;
	padding-left: 5px;
}
</style>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script>
function textCounter(field,counter,maxlimit,linecounter) {
	// text width//
	var fieldWidth =  parseInt(field.offsetWidth);
	var charcnt = field.value.length;        

	// trim the extra text
	if (charcnt > maxlimit) { 
		field.value = field.value.substring(0, maxlimit);
	}

	else { 
	// progress bar percentage
	var percentage = parseInt(100 - (( maxlimit - charcnt) * 100)/maxlimit) ;
	document.getElementById(counter).style.width =  parseInt((fieldWidth*percentage)/100)+"px";
	document.getElementById(counter).innerHTML="已输: "+percentage+"%"
	// color correction on style from CCFFF -> CC0000
	setcolor(document.getElementById(counter),percentage,"background-color");
	}
}

function setcolor(obj,percentage,prop){
	obj.style[prop] = "rgb(80%,"+(100-percentage)+"%,"+(100-percentage)+"%)";
}
$(document).ready(function(){
	$("#shengqing").click(function(){
		var url = 'login!userMessage.action?su_username='+$("#su_username").val()+"&su_phone="+$("#su_phone").val()+"&su_message="+$("#maxcharfield").val();
		$.getJSON(url,function(result){
			if(result.falg)
			{
				alert("申请成功");
				window.location="login.jsp";
			}else
			{
				alert("申请失败，请检查数据");
			}
		});
	});
	$("#submitbtn").click(function(){
		var url = 'sendusercrud!userLogin.action?tuserinfo.uiusername='+$("#username").val()+"&tuserinfo.uipassword="+$("#password").val()+"&tuserinfo.code="+$("#code").val();
		$.getJSON(url,function(result){
		if(result.message=='true')
		{
			location.href="menucrud!getAllMenu.action";
		}else
		{
		document.getElementById("message11111").innerHTML=result.message;
		}});
	});
	
	$("#shengqing").click(function(){
	   var url='sendusercrud!addSendUser.action?suusername='+$("#su_username").val()+"&suphone="+$("#su_phone").val()+"&sumessage="+$("#maxcharfield").val();
		$.getJSON(url,function(result){
		if(result.result=='true')
		{
			alert("申请成功,工作人员将近期内联系您");
			$("#su_username").val("");
			$("#su_phone").val("");
			$("#maxcharfield").val("");
			location.reload();
		}else
		{
			alert(result.message);
		}});
	});
	$("#su_username").blur(function(){
		var text = $("#su_username").val();
		if(text)
		{
			document.getElementById("lable1").innerHTML="";
		}else{
			document.getElementById("lable1").innerHTML="申请人为空";
		}
	});
	
	$("#su_phone").focusout(function(){
		var text = $("#su_phone").val();
		if(!text)
		{
			document.getElementById("lable2").innerHTML="电话为空";
		}else{
			document.getElementById("lable2").innerHTML="";
		}
	});
});
</script>
</head>
<body>
	<div id="content">
		<div id="littleBoxes" class="littleBoxes">
			<div class="boxlink bg1" style="top: 0px; left: 0px;">
				<a href="">help</a>
				<div class="boxcontent">
					<p>
						尽量避免在公共场合（如网吧等）上网登陆网上信访及投诉咨询系统。
						不管您在任何场合上网登陆网上信访及投诉咨询系统，离开时一定要关闭浏览器。
						网站内有些内容是以弹出窗口显示的，如果您的电脑安装了上网助手可能会导致有些内容点击后不能访问。 最佳分辨率为1024×768 <br />管理员联系电话：XXXX-XXXXXXX
					</p>
				</div>
			</div>
			<div class="bg5"
				style="background-position: -90px 0; top: 0px; left: 95px;"></div>
			<div class="bg5"
				style="background-position: -180px 0; top: 0px; left: 190px;"></div>
			<div class="bg5"
				style="background-position: -270px 0; top: 0px; left: 285px;"></div>
			<div class="bg5"
				style="background-position: 0 -90px; top: 95px; left: 0px;"></div>
			<div class="boxlink bg2" style="top: 95px; left: 95px;">
				<a href="">登陆</a>
				<div class="boxcontent">
					<p>
						<label> 用户名： </label> <input type="text" id="username"
							name="uiusername" size="20" value="${username}"
							class="login_input" />
					</p>
					<br />
					<p>
						<label> 密&nbsp&nbsp&nbsp&nbsp码： </label> <input type="password"
							id="password" name="uipassword" size="20" class="login_input" />
					</p>
					<br />
					<p>
						<label> 验证码： </label> <input class="code" maxlength="4"
							name="code" id="code" type="text" size="5" /> <img
							src="validatecode/img.jsp"
							onclick="this.setAttribute('src','validatecode/img.jsp')" alt=""
							width="75" height="24" />
					</p>
					<br />
					<div class="login_bar">
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<input style="width: 100px; height: 30px" type="button"
							id="submitbtn" value="登陆" />
					</div>
					<br />
					<div align="center" id="message11111"></div>
				</div>
			</div>
			<div class="bg5"
				style="background-position: -180px -90px; top: 95px; left: 190px;"></div>
			<div class="bg5"
				style="background-position: -270px -90px; top: 95px; left: 285px;"></div>
			<div class="bg5"
				style="background-position: 0 -180px; top: 190px; left: 0px;"></div>
			<div class="bg5"
				style="background-position: -90px -180px; top: 190px; left: 95px;"></div>
			<div class="boxlink bg3" style="top: 190px; left: 190px;">
				<a href="">申请租房</a>
				<div class="boxcontent">
					<p>
						<label> 申&nbsp&nbsp请&nbsp&nbsp人: </label> <input type="text"
							id="su_username" name="su_username" size="20" class="login_input" /><label
							id="lable1"></label>
					</p>
					<p>
						<label> 联系电话: </label> <input type="text" id="su_phone"
							name="su_phone" size="20" class="login_input" /><label
							id="lable2"></label>
					</p>
					<p>
						<label> 申请理由: </label>
						<textarea rows="7" cols="38" name="maxcharfield" id="maxcharfield"
							onKeyDown="textCounter(this,'progressbar1',1500)"
							onKeyUp=textCounter(this,
							'progressbar1', 1500);
onFocus="textCounter(this,'progressbar1',1500)"></textarea>
					<div id="progressbar1" class="progress"></div>
					<script>
	textCounter(document.getElementById("maxcharfield"), "progressbar1", 1500)
</script>
					</p>
					<p>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<input style="width: 100px; height: 25px" type="button"
							value="提交申请" id="shengqing" />
					</p>
				</div>
			</div>
			<div class="bg5"
				style="background-position: -270px -180px; top: 190px; left: 285px;"></div>
			<div class="bg5"
				style="background-position: 0 -270px; top: 285px; left: 0px;"></div>
			<div class="bg5"
				style="background-position: -90px -270px; top: 285px; left: 95px;"></div>
			<div class="bg5"
				style="background-position: -180px -270px; top: 285px; left: 190px;"></div>
			<div class="boxlink bg4" style="top: 285px; left: 285px;">
				<a href="">About Me</a>
				<div class="boxcontent">
					<p>作者：陈伟达</p>
					<p>专业：网络工程</p>
					<p>版本：1.1.1v</p>
					<p>From：福建工程学院-国脉信息学院</p>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="js/lanrenzhijia.js"></script>
</body>
</html>

