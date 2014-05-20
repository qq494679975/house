package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class systemUserM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<title>My JSP 'systemUserM.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<link charset=\"UTF-8\" href=\"/MyProject/css/reset.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style>\r\n");
      out.write(".div1 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div2 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\theight: 465px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div3 {\r\n");
      out.write("\twidth: 1150px;\r\n");
      out.write("\tbackground-color: #00FFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction updatesystemuser(userid) {\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar sumfom=document.getElementById(\"sumform\");\r\n");
      out.write("\t\tsumfom.action=\"/MyProject/servlet/System_UpdateSystemUser?userid=\"+userid;\r\n");
      out.write("\t\tsumfom.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction delsystemuser(userid) {\t\r\n");
      out.write("\t\tvar a = confirm(\"确认删除用户\");\r\n");
      out.write("\t\tif(a==true){\r\n");
      out.write("\t\tvar sumfom=document.getElementById(\"sumform\");\r\n");
      out.write("\t\tsumfom.action=\"/MyProject/servlet/System_DelUser?userid=\"+userid;\r\n");
      out.write("\t\tsumfom.submit();}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction usernameidok()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar test = document.getElementById(\"myusername\").value;\r\n");
      out.write("\t\tif(test==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\tvar patt = new RegExp(\"^[0-9a-zA-Z]{0,15}$\",\"gi\");\r\n");
      out.write("\t\tif(patt.test(test)==true)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"用户名只能是英文和数字\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction sorry()\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"超级管理员不可以被删除\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"div1\">\r\n");
      out.write("\t\t<table style=\"border-style: dashed;border-color: silver;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<form method=\"post\" action=\"/MyProject/servlet/System_SUserMessage\"\r\n");
      out.write("\t\t\t\t\tid=\"sumform\" onsubmit=\"return usernameidok()\">\r\n");
      out.write("\t\t\t\t\t<td>用户名:<input type=\"text\" name=\"sysusername\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty param.sysusername?\"\":param.sysusername}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id =\"myusername\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>性别:<select name=\"sysusersex\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.sysusersex==1?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.sysusersex==0?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">女</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"查询\" /> <input type=\"reset\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"重置\" /></td>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<td><a href=\"/MyProject/myhtml/backstage/systemUseradd.html\">添加管理员</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"div2\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:180px;border-color: silver;\">用户名</th>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:180px;border-color: silver;\">真实姓名</th>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:180px;border-color: silver;\">性别</th>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:180px;border-color: silver;\">权限级别</th>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:240px;border-color: silver;\">注册时间</th>\r\n");
      out.write("\t\t\t\t<th style=\"border-style: dashed;width:180px;border-color: silver;\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div style=\"background-color:#00FFFF;margin: 0px;padding: 0px;\">\r\n");
      out.write("\t<form action=\"/MyProject/servlet/System_SUserMessage\" method=\"get\" id=\"pageForm\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"sysusername\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.sysusername}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"sysusersex\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.sysusersex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pageBar.jsp", out, false);
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
    // /myhtml/backstage/systemUserM.jsp(115,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /myhtml/backstage/systemUserM.jsp(119,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("systemuser");
    // /myhtml/backstage/systemUserM.jsp(119,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/systemUserM.jsp(119,3) '${pagemodel.result }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pagemodel.result }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.truename }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.usersex==1?\"男\":\"女\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:180px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.userid==0?\"超级管理员\":\"普通管理员\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:240px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.regdate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th style=\"width:180px\"><input type=\"button\" value=\"修改\"\r\n");
          out.write("\t\t\t\t\t\tonclick=\"updatesystemuser(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\" /> \r\n");
          out.write("\t\t\t\t\t\t<input id = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"button\" value=\"删除\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${systemuser.userid==0?\"onclick='sorry()'\":\"onclick='delsystemuser(this.id)'\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t /></th>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
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
