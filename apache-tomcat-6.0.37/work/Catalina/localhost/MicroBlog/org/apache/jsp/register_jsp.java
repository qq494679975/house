package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<META name=\"google-site-verification\" content=\"dcJxwJj3BjHRWOqfkv5foGijNDdhCqUogRWWtNXWfEM\">\r\n");
      out.write("<META content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"css/base.css\" charset=\"utf-8\" media=\"screen\">\r\n");
      out.write("<TITLE>校园微博--分享校园生活的新鲜事！ </TITLE>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ajaxfileupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var xmlHttpRequest;\r\n");
      out.write("function show(){\r\n");
      out.write("\tdocument.getElementById(\"showhide\").style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("function hide(){\r\n");
      out.write("\tdocument.getElementById(\"showhide\").style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("function sameor(){\r\n");
      out.write("\tif(document.getElementById(\"userPassword\").value!=\"\"&&document.getElementById(\"verifypass\").value!=\"\"){\r\n");
      out.write("\t\tif(document.getElementById(\"userPassword\").value!=document.getElementById(\"verifypass\").value){\r\n");
      out.write("\t\t\tdocument.getElementById(\"verif\").innerHTML=\"两次输入密码不一致！\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\tdocument.getElementById(\"verif\").innerHTML=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tdocument.getElementById(\"verif\").innerHTML=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function ajaxFileUpload()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#loading\")\r\n");
      out.write("\t\t.ajaxStart(function(){\r\n");
      out.write("\t\t\t$(this).show();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t.ajaxComplete(function(){\r\n");
      out.write("\t\t\t$(this).hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajaxFileUpload\r\n");
      out.write("\t\t(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\turl:'uploadAction', \r\n");
      out.write("\t\t\t\tsecureuri:false,\r\n");
      out.write("\t\t\t\tfileElementId:'userHead',\r\n");
      out.write("\t\t\t\tdataType:'JSON',\r\n");
      out.write("\t\t\t\tsuccess: function (data, status)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif(typeof(data.error) != 'undefined')\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tif(data.error != '')\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(data.error);\r\n");
      out.write("\t\t\t\t\t\t}else\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\talert(data.msg);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function (data, status, e)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(e);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t)\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction createXmlHttpRequest(){\r\n");
      out.write("\t\tif(window.ActiveXObject){\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\txmlHttpRequest= new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t}catch(e){\r\n");
      out.write("\t\t\t\txmlHttpRequest = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn xmlHttpRequest;\r\n");
      out.write("\t\t}else if(window.XMLHttpRequest){\r\n");
      out.write("\t\t\treturn new XMLHttpRequest();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkExist(){\r\n");
      out.write("\t\tif(document.getElementById(\"userEmail\").value!=\"\"){\r\n");
      out.write("\t\t\txmlHttpRequest = createXmlHttpRequest();\r\n");
      out.write("\t\t\txmlHttpRequest.onreadystatechange = haoLeJiaoWo;\r\n");
      out.write("\t\t\tvar url =\"http://127.0.0.1:8080");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userExistAction.action?userEmail=\"+document.getElementById(\"userEmail\").value;\r\n");
      out.write("\t\t\txmlHttpRequest.open(\"GET\",url,true);\r\n");
      out.write("\t\t\txmlHttpRequest.send(null);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById(\"checkemail\").innerHTML=\"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction haoLeJiaoWo(){\r\n");
      out.write("\t\tif(xmlHttpRequest.readyState==4&&xmlHttpRequest.status==200){\r\n");
      out.write("\t\t\tvar msg = xmlHttpRequest.responseText;\r\n");
      out.write("\t\t\tif(msg==\"true\"){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"checkemail\").innerHTML=\"该Email可以使用！\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"checkemail\").style.color=\"green\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"checkemail\").innerHTML=\"该Email已被注册！\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"checkemail\").style.color=\"red\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<DIV id=\"container\" class=\"newlook\">\r\n");
      out.write("<DIV id=\"header\">\r\n");
      out.write("<H1><A href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"global-header-anchor\">\r\n");
      out.write("<p class=\"global-header-content\">首页</p></A></H1>\r\n");
      out.write("<DIV id=\"navigation\" class=\"ui-roundedbox\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tr\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-bl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-br\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-content\">\r\n");
      out.write("<UL>\r\n");
      out.write("  <LI><A href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">首页</A></LI>\r\n");
      out.write("  <LI><A href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">登录</A></LI>\r\n");
      out.write("  <LI><A \r\n");
      out.write("href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/register.jsp\">注册</A></LI></UL></DIV></DIV></DIV></DIV></DIV></DIV>\r\n");
      out.write("</DIV>\r\n");
      out.write("<DIV id=\"sign-up\" class=\"ui-roundedbox\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner2 ui-roundedbox-tl2\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner2 ui-roundedbox-tr2\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner2 ui-roundedbox-bl2\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner2 ui-roundedbox-br2\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-content2\">\r\n");
      out.write("<H2>注册</H2>\r\n");
      out.write("<FORM style=\"position: relative; z-index: 1;\" id=\"register\" class=\"nf lf\" method=\"post\" action=\"registerAction\">\r\n");
      out.write("\r\n");
      out.write("<DIV class=\"email \"><LABEL class=\"label_input\" for=\"userEmail\">Email</LABEL>\r\n");
      out.write("<INPUT id=\"userEmail\" class=\"input_text\" tabIndex=\"2\" name=\"userEmail\" type=\"text\" onblur=\"checkExist()\"><SPAN id=\"email-hint\">&nbsp;</SPAN>\r\n");
      out.write("<label id=\"checkemail\" style=\"font-size: medium\"></label>\r\n");
      out.write("</DIV>\r\n");
      out.write("\r\n");
      out.write("<P><LABEL class=\"label_input\" for=\"userName\">姓名</LABEL><INPUT id=\"userName\" class=\"input_text\" tabIndex=\"3\" name=\"userName\" maxLength=\"12\" type=\"text\"><SPAN \r\n");
      out.write("id=\"realname-hint\">&nbsp;</SPAN><SPAN class=\"hint\">常用网名，可使用真实姓名</SPAN></P>\r\n");
      out.write("\r\n");
      out.write("<P><LABEL class=\"label_input\" for=\"userPassword\">密码</LABEL><INPUT id=\"userPassword\" \r\n");
      out.write("class=\"input_text\" tabIndex=\"6\" name=\"userPassword\" maxLength=\"32\" \r\n");
      out.write("type=\"password\" onblur=\"sameor()\"><SPAN id=\"loginpass-hint\">&nbsp;</SPAN></P>\r\n");
      out.write("\r\n");
      out.write("<P><LABEL class=\"label_input\" for=\"verifypass\">确认密码</LABEL><INPUT id=\"verifypass\" \r\n");
      out.write("class=\"input_text\" tabIndex=\"7\" name=\"verifypass\" maxLength=\"32\" \r\n");
      out.write("type=\"password\" onblur=\"sameor()\"><SPAN id=\"verifypass-hint\">&nbsp;</SPAN><LABEL id=\"verif\" style=\"color: red;\"></LABEL></P>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("\t<LABEL class=\"label_input\" for=\"userRole\">用户类型</LABEL>\r\n");
      out.write("\t<input name=\"userRole\" type=\"radio\" value=\"0\" checked=\"checked\" onchange=\"show()\"/>学生\r\n");
      out.write("\t<input name=\"userRole\" type=\"radio\" value=\"1\" onchange=\"hide()\"/>教师\r\n");
      out.write("\t<SPAN id=\"verifypass-hint\">&nbsp;</SPAN>\r\n");
      out.write("</P>\r\n");
      out.write("\r\n");
      out.write("<P><LABEL class=\"label_input\" for=\"collegeName\">学院</LABEL><INPUT id=\"collegeName\" class=\"input_text\" tabIndex=\"3\" name=\"collegeName\" maxLength=\"12\" type=\"text\"><SPAN \r\n");
      out.write("id=\"realname-hint\">&nbsp;</SPAN><SPAN class=\"hint\">用户所在二级学院</SPAN></P>\r\n");
      out.write("\r\n");
      out.write("<P id=\"showhide\"><LABEL class=\"label_input\" for=\"clsName\">班级</LABEL><INPUT id=\"clsName\" class=\"input_text\" tabIndex=\"3\" name=\"clsName\" maxLength=\"12\" type=\"text\"><SPAN \r\n");
      out.write("id=\"realname-hint\">&nbsp;</SPAN><SPAN class=\"hint\">用户所在的班级</SPAN></P>\r\n");
      out.write("\r\n");
      out.write("<P><LABEL class=\"label_input\" for=\"userHead\">个人头像</LABEL>\r\n");
      out.write("\t<img id=\"loading\" src=\"image/loading.gif\" style=\"display:none;\">\r\n");
      out.write("\t<input id=\"userHead\" type=\"file\" size=\"20\" name=\"userHead\" class=\"input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upload}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<button class=\"button\" id=\"buttonUpload\" onclick=\"return ajaxFileUpload();\">上传</button><SPAN \r\n");
      out.write("id=\"realname-hint\">&nbsp;</SPAN><SPAN class=\"hint\">用户的头像</SPAN></P>\r\n");
      out.write("\r\n");
      out.write("<P id=\"showhide\"><LABEL class=\"label_input\" for=\"userIntroduce\">个人简介</LABEL><textarea id=\"userIntroduce\" name=\"userIntroduce\" cols=\"36\" rows=\"2\"></textarea>\r\n");
      out.write("<SPAN id=\"realname-hint\">&nbsp;</SPAN>\r\n");
      out.write("<SPAN class=\"hint\">不超过25字</SPAN>\r\n");
      out.write("</P>\r\n");
      out.write("\r\n");
      out.write("<P class=\"act\"><SPAN></SPAN><BR><INPUT class=\"signup-submit\" tabIndex=\"10\" value=\"注册\" type=\"submit\"></P></FORM>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</DIV></DIV></DIV></DIV></DIV></DIV>\r\n");
      out.write("<DIV id=\"footer\" class=\"ui-roundedbox\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tr\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-bl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-br\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-content\">\r\n");
      out.write("<P style=\"color:#FFFFFF\">© <SPAN title=\"I:1; Q:2; S:1; C:0; F:0; T:6.00; H:e02\">2013</SPAN> 福建师范大学闽南科技学院09网络工程<SPAN class=\"szinfo\"> &nbsp;&nbsp;\r\n");
      out.write("版权所有</SPAN></P>\r\n");
      out.write("</DIV></DIV></DIV></DIV></DIV></DIV></DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY></HTML>\r\n");
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
