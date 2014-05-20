package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<title>房屋租赁系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/lanrenzhijia.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".progress {\r\n");
      out.write("\twidth: 1px;\r\n");
      out.write("\theight: 14px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: navy;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function textCounter(field,counter,maxlimit,linecounter) {\r\n");
      out.write("\t// text width//\r\n");
      out.write("\tvar fieldWidth =  parseInt(field.offsetWidth);\r\n");
      out.write("\tvar charcnt = field.value.length;        \r\n");
      out.write("\r\n");
      out.write("\t// trim the extra text\r\n");
      out.write("\tif (charcnt > maxlimit) { \r\n");
      out.write("\t\tfield.value = field.value.substring(0, maxlimit);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\telse { \r\n");
      out.write("\t// progress bar percentage\r\n");
      out.write("\tvar percentage = parseInt(100 - (( maxlimit - charcnt) * 100)/maxlimit) ;\r\n");
      out.write("\tdocument.getElementById(counter).style.width =  parseInt((fieldWidth*percentage)/100)+\"px\";\r\n");
      out.write("\tdocument.getElementById(counter).innerHTML=\"已输: \"+percentage+\"%\"\r\n");
      out.write("\t// color correction on style from CCFFF -> CC0000\r\n");
      out.write("\tsetcolor(document.getElementById(counter),percentage,\"background-color\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setcolor(obj,percentage,prop){\r\n");
      out.write("\tobj.style[prop] = \"rgb(80%,\"+(100-percentage)+\"%,\"+(100-percentage)+\"%)\";\r\n");
      out.write("}\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#shengqing\").click(function(){\r\n");
      out.write("\t\tvar url = 'login!userMessage.action?su_username='+$(\"#su_username\").val()+\"&su_phone=\"+$(\"#su_phone\").val()+\"&su_message=\"+$(\"#maxcharfield\").val();\r\n");
      out.write("\t\t$.getJSON(url,function(result){\r\n");
      out.write("\t\t\tif(result.falg)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(\"申请成功\");\r\n");
      out.write("\t\t\t\twindow.location=\"login.jsp\";\r\n");
      out.write("\t\t\t}else\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(\"申请失败，请检查数据\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#submitbtn\").click(function(){\r\n");
      out.write("\t\tvar url = 'sendusercrud!userLogin.action?tuserinfo.uiusername='+$(\"#username\").val()+\"&tuserinfo.uipassword=\"+$(\"#password\").val()+\"&tuserinfo.code=\"+$(\"#code\").val();\r\n");
      out.write("\t\t$.getJSON(url,function(result){\r\n");
      out.write("\t\tif(result.message=='true')\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tlocation.href=\"menucrud!getAllMenu.action\";\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tdocument.getElementById(\"message11111\").innerHTML=result.message;\r\n");
      out.write("\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#shengqing\").click(function(){\r\n");
      out.write("\t   var url='sendusercrud!addSendUser.action?suusername='+$(\"#su_username\").val()+\"&suphone=\"+$(\"#su_phone\").val()+\"&sumessage=\"+$(\"#maxcharfield\").val();\r\n");
      out.write("\t\t$.getJSON(url,function(result){\r\n");
      out.write("\t\tif(result.result=='true')\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"申请成功,工作人员将近期内联系您\");\r\n");
      out.write("\t\t\t$(\"#su_username\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#su_phone\").val(\"\");\r\n");
      out.write("\t\t\t$(\"#maxcharfield\").val(\"\");\r\n");
      out.write("\t\t\tlocation.reload();\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(result.message);\r\n");
      out.write("\t\t}});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#su_username\").blur(function(){\r\n");
      out.write("\t\tvar text = $(\"#su_username\").val();\r\n");
      out.write("\t\tif(text)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"lable1\").innerHTML=\"\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById(\"lable1\").innerHTML=\"申请人为空\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#su_phone\").focusout(function(){\r\n");
      out.write("\t\tvar text = $(\"#su_phone\").val();\r\n");
      out.write("\t\tif(!text)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"lable2\").innerHTML=\"电话为空\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById(\"lable2\").innerHTML=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<div id=\"littleBoxes\" class=\"littleBoxes\">\r\n");
      out.write("\t\t\t<div class=\"boxlink bg1\" style=\"top: 0px; left: 0px;\">\r\n");
      out.write("\t\t\t\t<a href=\"\">help</a>\r\n");
      out.write("\t\t\t\t<div class=\"boxcontent\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t尽量避免在公共场合（如网吧等）上网登陆网上信访及投诉咨询系统。\r\n");
      out.write("\t\t\t\t\t\t不管您在任何场合上网登陆网上信访及投诉咨询系统，离开时一定要关闭浏览器。\r\n");
      out.write("\t\t\t\t\t\t网站内有些内容是以弹出窗口显示的，如果您的电脑安装了上网助手可能会导致有些内容点击后不能访问。 最佳分辨率为1024×768 <br />管理员联系电话：XXXX-XXXXXXX\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -90px 0; top: 0px; left: 95px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -180px 0; top: 0px; left: 190px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -270px 0; top: 0px; left: 285px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: 0 -90px; top: 95px; left: 0px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"boxlink bg2\" style=\"top: 95px; left: 95px;\">\r\n");
      out.write("\t\t\t\t<a href=\"\">登陆</a>\r\n");
      out.write("\t\t\t\t<div class=\"boxcontent\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 用户名： </label> <input type=\"text\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"uiusername\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"login_input\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 密&nbsp&nbsp&nbsp&nbsp码： </label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"password\" name=\"uipassword\" size=\"20\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 验证码： </label> <input class=\"code\" maxlength=\"4\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"code\" id=\"code\" type=\"text\" size=\"5\" /> <img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"validatecode/img.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"this.setAttribute('src','validatecode/img.jsp')\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"75\" height=\"24\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<div class=\"login_bar\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\t<input style=\"width: 100px; height: 30px\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"submitbtn\" value=\"登陆\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" id=\"message11111\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -180px -90px; top: 95px; left: 190px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -270px -90px; top: 95px; left: 285px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: 0 -180px; top: 190px; left: 0px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -90px -180px; top: 190px; left: 95px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"boxlink bg3\" style=\"top: 190px; left: 190px;\">\r\n");
      out.write("\t\t\t\t<a href=\"\">申请租房</a>\r\n");
      out.write("\t\t\t\t<div class=\"boxcontent\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 申&nbsp&nbsp请&nbsp&nbsp人: </label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"su_username\" name=\"su_username\" size=\"20\" class=\"login_input\" /><label\r\n");
      out.write("\t\t\t\t\t\t\tid=\"lable1\"></label>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 联系电话: </label> <input type=\"text\" id=\"su_phone\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"su_phone\" size=\"20\" class=\"login_input\" /><label\r\n");
      out.write("\t\t\t\t\t\t\tid=\"lable2\"></label>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label> 申请理由: </label>\r\n");
      out.write("\t\t\t\t\t\t<textarea rows=\"7\" cols=\"38\" name=\"maxcharfield\" id=\"maxcharfield\"\r\n");
      out.write("\t\t\t\t\t\t\tonKeyDown=\"textCounter(this,'progressbar1',1500)\"\r\n");
      out.write("\t\t\t\t\t\t\tonKeyUp=textCounter(this,\r\n");
      out.write("\t\t\t\t\t\t\t'progressbar1', 1500);\r\n");
      out.write("onFocus=\"textCounter(this,'progressbar1',1500)\"></textarea>\r\n");
      out.write("\t\t\t\t\t<div id=\"progressbar1\" class=\"progress\"></div>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\ttextCounter(document.getElementById(\"maxcharfield\"), \"progressbar1\", 1500)\r\n");
      out.write("</script>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\t<input style=\"width: 100px; height: 25px\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"提交申请\" id=\"shengqing\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -270px -180px; top: 190px; left: 285px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: 0 -270px; top: 285px; left: 0px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -90px -270px; top: 285px; left: 95px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"bg5\"\r\n");
      out.write("\t\t\t\tstyle=\"background-position: -180px -270px; top: 285px; left: 190px;\"></div>\r\n");
      out.write("\t\t\t<div class=\"boxlink bg4\" style=\"top: 285px; left: 285px;\">\r\n");
      out.write("\t\t\t\t<a href=\"\">About Me</a>\r\n");
      out.write("\t\t\t\t<div class=\"boxcontent\">\r\n");
      out.write("\t\t\t\t\t<p>作者：陈伟达</p>\r\n");
      out.write("\t\t\t\t\t<p>专业：网络工程</p>\r\n");
      out.write("\t\t\t\t\t<p>版本：1.1.1v</p>\r\n");
      out.write("\t\t\t\t\t<p>From：福建工程学院-国脉信息学院</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/lanrenzhijia.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
