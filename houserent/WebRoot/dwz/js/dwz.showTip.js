/**
 * @author ZhangHuihua@msn.com
 */
$.setRegional("showTip", {
	title:{info:"小贴士提示信息"},
	butMsg:{ok:"确定"}
});
var showTip = {
	_boxId: "#showtipMsgBox",
	_bgId: "#alertBackground",
	_closeTimer: null,
	_closeTipTimer:null,
	isShow:true,//是否显示小贴士
	period:10,//显示周期
	showNotice:true,//是否显示最新公告
	showEmail:true,//是否显示最新邮件
	url:"",//获取最新公告和邮件的url
	callback:null,//读取信息之后的处理函数
	init:function(options){
		//初始化方法
		this.isShow=options.isShow;
		this.period=options.period;
		this.showEmail=options.showEmail;
		this.showNotice=options.showNotice;
		this.url=options.url;
		this.callback=options.callback;
		this.getTip();
	},
	getTip:function(){//获取小贴士提示信息内容
		if(this.url){//判断是否设置了url
			if(this.isShow){//判断设置了显示小贴士
				var ajaxbg = $("#background,#progressBar");
				$.ajax(this.url,{
					beforeSend:function(){
						ajaxbg.hide();//隐藏loging背景
					},
					success:function(data){
						showTip.callback.call(showTip,data);//调用外部设置的回调函数
					}
				})
			}
		}
	}
	,
	cancelCurrent:function(){//取消当前定时获取服务端小贴士的定时器
		if (this._closeTipTimer) {
			clearTimeout(this._closeTipTimer);
			this._closeTipTimer = null;
		}
	},
	_types: {info:"info"},

	_getTitle: function(key){
		return $.regional.showTip.title[key];
	},

	_keydownOk: function(event){
		if (event.keyCode == DWZ.keyCode.ENTER) event.data.target.trigger("click");
		return false;
	},
	_keydownEsc: function(event){
		if (event.keyCode == DWZ.keyCode.ESC) event.data.target.trigger("click");
	},
	/**
	 * 
	 * @param {Object} type
	 * @param {Object} msg
	 * @param {Object} buttons [button1, button2]
	 */
	_open: function(type, msg, buttons){
		$(this._boxId).remove();
		var butsHtml = "";
		if (buttons) {
			for (var i = 0; i < buttons.length; i++) {
				var sRel = buttons[i].call ? "callback" : "";
				butsHtml += DWZ.frag["showTipButFrag"].replace("#butMsg#", buttons[i].name).replace("#callback#", sRel);
			}
		}
		var boxHtml = DWZ.frag["showTipFlag"].replace("#type#", type).replace("#title#", this._getTitle(type)).replace("#message#", msg).replace("#butFragment#", butsHtml);
		
		$(boxHtml).appendTo("body").css({bottom:"0px"}).animate({up:"100px"}, 500);
		
		$("#showtipMsgBox .msg a").click(function(event){
			var $this = $(this);
			var title = $this.attr("title") || "新选项卡";
			var tabid = $this.attr("rel") || "_blank";

			var url=$this.attr("href");
			navTab.openTab(tabid, url,{title:title, fresh:true, external:false});
			event.preventDefault();
		});
		if (this._closeTimer) {
			clearTimeout(this._closeTimer);
			this._closeTimer = null;
		}
		if (this._types.info == type || this._types.correct == type){
			this._closeTimer = setTimeout(function(){showTip.close()}, 3500);
		} else {
			$(this._bgId).show();
		}
		
		//用于屏蔽点击回车，触发click事件，再次打开alert
		$('<input type="text" style="width:0;height:0;" name="_alertFocusCtr"/>').appendTo(this._boxId).focus().hide();
		
		var jButs = $(this._boxId).find("a.button");
		var jCallButs = jButs.filter("[rel=callback]");
		var jDoc = $(document);
		
		for (var i = 0; i < buttons.length; i++) {
			if (buttons[i].call) jCallButs.eq(i).click(buttons[i].call);
			if (buttons[i].keyCode == DWZ.keyCode.ENTER) {
				jDoc.bind("keydown",{target:jButs.eq(i)}, this._keydownOk);
			}
			if (buttons[i].keyCode == DWZ.keyCode.ESC) {
				jDoc.bind("keydown",{target:jButs.eq(i)}, this._keydownEsc);
			}
		}
	},
	close: function(){
		$(document).unbind("keydown", this._keydownOk).unbind("keydown", this._keydownEsc);
	
		$(this._boxId).slideUp(500, function(){
			$(this).remove();
		});
		$(this._bgId).hide();
		if(this.isShow){
			_closeTipTimer=setTimeout("showTip.getTip()",showTip.period*1000);
		}
	},
	_alert: function(type, msg, options) {
		var op = {okName:$.regional.alertMsg.butMsg.ok, okCall:null};
		$.extend(op, options);
		var buttons = [
			{name:op.okName, call: op.okCall, keyCode:DWZ.keyCode.ENTER}
		];
		this._open(type, msg, buttons);
	},
	info: function(msg, options) {
		this._alert(this._types.info, msg, options);
	}

};

