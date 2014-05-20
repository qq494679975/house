package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class registerUserManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      			"/myhtml/errorpage/erroe.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
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
      out.write("<script>\r\n");
      out.write("\tfunction islock(userid,userlock,sex,name,status,lock)\r\n");
      out.write("\t{\t\r\n");
      out.write("\t\tvar aa = confirm(\"确认--\"+lock+\"--该用户？\");\r\n");
      out.write("\t\tif(aa==true){\r\n");
      out.write("\t\tvar rumform = document.getElementById(\"rumform\"); \r\n");
      out.write("\t\trumform.action= \"/MyProject/servlet/Userlock?rumuserid=\"+userid+\"&userlock=\"+userlock+\"&usersex=\"+sex+\"&username=\"+name+\"&userstatue=\"+status;\r\n");
      out.write("\t\trumform.submit();}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction usernameidok()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar test1 = document.getElementById(\"myusername\").value;\r\n");
      out.write("\t\tif(test1==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\tvar patt = new RegExp(\"^[0-9a-zA-Z]{0,15}$\",\"gi\");\r\n");
      out.write("\t\tif(patt.test(test1)==true)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"用户名只能是英文和数字\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<link charset=\"UTF-8\" href=\"/MyProject/css/reset.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<style>\r\n");
      out.write(".div1 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div2 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\theight: 470px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div3 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"div1\">\r\n");
      out.write("\t\t<form method=\"post\"\r\n");
      out.write("\t\t\taction=\"/MyProject/servlet/System_RegisteredUserManager\"\r\n");
      out.write("\t\t\tonsubmit=\"return usernameidok()\">\r\n");
      out.write("\t\t\t<table style=\"border-style: dashed;border-color: silver;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>用户名:<input type=\"text\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"myusername\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>性别:<select name=\"usersex\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.usersex==1?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.usersex==0?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">女</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>状态:<select name=\"userstatue\"><option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.userstatue==0?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">正常</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.userstatue==1?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">冻结</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"查询\" /> <input type=\"reset\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"重置\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"div2\">\r\n");
      out.write("\t\t<table style=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width:180px;border-style: dashed;border-color: silver;\">用户名</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:180px;border-style: dashed;border-color: silver;\">真实姓名</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:180px;border-style: dashed;border-color: silver;\">性别</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:240px;border-style: dashed;border-color: silver;\">注册时间</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:180px;border-style: dashed;border-color: silver;\">是否冻结</th>\r\n");
      out.write("\t\t\t\t<th style=\"width:180px;border-style: dashed;border-color: silver;\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"\" id=\"rumform\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"div3\">\r\n");
      out.write("\t\t<form action=\"/MyProject/servlet/System_RegisteredUserManager\"\r\n");
      out.write("\t\t\tmethod=\"get\" id=\"pageForm\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"usersex\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.usersex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"userstatue\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.userstatue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pageBar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /myhtml/backstage/registerUserManage.jsp(114,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagemodel.allCount==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<h1 style=\"text-align: center;size: 100px;\">无记录</h1>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /myhtml/backstage/registerUserManage.jsp(119,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("alluser");
    // /myhtml/backstage/registerUserManage.jsp(119,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/registerUserManage.jsp(119,4) '${pagemodel.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pagemodel.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr style=\"border-style:dashed\">\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.truename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.usersex==0?\"女\":\"男\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:240px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.regdate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.userlock==0?\"未冻结\":\"已冻结\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th style=\"width:180px\"><input\r\n");
          out.write("\t\t\t\t\t\t\tonclick=\"islock(this.id,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.userlock}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.usersex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty param.username?\"\r\n							-1\":param.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.userstatue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(",this.value)\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\ttype=\"button\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alluser.userlock==0?\" 冻结\":\"解冻\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></th>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
