package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class First_005fDemo_005fMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");


String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction query()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar from = document.getElementById(\"pageForm\");\r\n");
      out.write("\t\t\tvar params=document.getElementById(\"username\").value;\r\n");
      out.write("\t\t\tfrom.action=\"user/query_user.action?para=\"+params;\r\n");
      out.write("\t\t\tfrom.method=\"post\";\r\n");
      out.write("\t\t\tfrom.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction del(id)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar username = document.getElementById(\"username\").value;\r\n");
      out.write("\t\t\tvar from = document.getElementById(\"pageForm\");\r\n");
      out.write("\t\t\talert(id);\r\n");
      out.write("\t\t\tfrom.action=\"user/del_user.action?userid=\"+id+\"&para=\"+username;\r\n");
      out.write("\t\t\tfrom.method=\"post\";\r\n");
      out.write("\t\t\tfrom.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction save(id)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar username = document.getElementById(\"a1\"+id).value;\r\n");
      out.write("\t\t\tvar sex = document.getElementById(\"a2\"+id).value;\r\n");
      out.write("\t\t\tvar realname = document.getElementById(\"a3\"+id).value;\r\n");
      out.write("\t\t\tvar city = document.getElementById(\"a4\"+id).value;\r\n");
      out.write("\t\t\tvar cardnum = document.getElementById(\"a5\"+id).value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar phoneno = document.getElementById(\"a6\"+id).value;\r\n");
      out.write("\t\t\tvar email = document.getElementById(\"a7\"+id).value;\r\n");
      out.write("\t\t\tvar mbphone = document.getElementById(\"a8\"+id).value;\r\n");
      out.write("\t\t\tvar address = document.getElementById(\"a9\"+id).value;\r\n");
      out.write("\t\t\tvar marry = document.getElementById(\"a10\"+id).value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar from = document.getElementById(\"pageForm\");\r\n");
      out.write("\t\t\tvar params=document.getElementById(\"username\").value;\r\n");
      out.write("\t\t\tfrom.action=\"user/update_user.action?info.userid=\"+id+\"&info.username=\"+username+\"&info.sex=\"+sex+\"&info.realname=\"+realname+\"&info.city=\"+city+\"&info.cardnum=\"+cardnum+\"&info.phoneno=\"+phoneno+\"&info.email=\"+email+\"&info.mbphone=\"+mbphone+\"&info.address=\"+address+\"&info.marry=\"+marry+\"&para=\"+params;\r\n");
      out.write("\t\t\tfrom.method=\"post\";\r\n");
      out.write("\t\t\tfrom.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction add()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttop.location.href=\"First_Demo.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \t\t<table>\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("  \t\t\t<td>用户名:<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty para?\"\":para}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"username\"/></td>\r\n");
      out.write("  \t\t\t<td><input type=\"button\" value=\"查询\" onclick=\"query()\"/></td>\r\n");
      out.write("  \t\t\t<td><input type=\"button\" value=\"注册\" onclick=\"add()\"/></td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("  \t\t</table>\r\n");
      out.write("  \t\t<form action=\"user/query_user.action\" method=\"post\" id=\"pageForm\">\r\n");
      out.write("  \t\t\t<table>\r\n");
      out.write("  \t\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t\t<td>用户名</td>\r\n");
      out.write("  \t\t\t\t\t<td>性别</td>\r\n");
      out.write("  \t\t\t\t\t<td>真实姓名</td>\r\n");
      out.write("  \t\t\t\t\t<td>籍贯</td>\r\n");
      out.write("  \t\t\t\t\t<td>身份证号码</td>\r\n");
      out.write("  \t\t\t\t\t<td>电话号码</td>\r\n");
      out.write("  \t\t\t\t\t<td>电子邮件</td>\r\n");
      out.write("  \t\t\t\t\t<td>手机</td>\r\n");
      out.write("  \t\t\t\t\t<td>住址</td>\r\n");
      out.write("  \t\t\t\t\t<td>结婚</td>\r\n");
      out.write("  \t\t\t\t\t<td>操作</td>\r\n");
      out.write("  \t\t\t\t</tr>\r\n");
      out.write("  \t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("  \t\t\t</table>\r\n");
      out.write("  \t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pageBar.jsp", out, false);
      out.write("\r\n");
      out.write("  \t\t</form>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /First_Demo_Message.jsp(91,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("userinfot");
    // /First_Demo_Message.jsp(91,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/First_Demo_Message.jsp(91,6) '${pagemodel.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pagemodel.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  \t\t\t\t\t<tr>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a1");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width: 80px\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a2");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width: 40px\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a3");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width: 80px\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a4");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a5");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.cardnum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a6");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.phoneno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a7");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a8");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.mbphone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a9");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td><input id=\"a10");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width: 40px\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.marry}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></td>\r\n");
          out.write("  \t\t\t\t\t<td>\r\n");
          out.write("  \t\t\t\t\t<input type=\"button\" value=\"删除\"  onclick=\"del(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"/>\r\n");
          out.write("  \t\t\t\t\t<input type=\"button\" value=\"保存\"onclick=\"save(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfot.userid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"/></td>\r\n");
          out.write("  \t\t\t\t</tr>\r\n");
          out.write("  \t\t\t\t");
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
