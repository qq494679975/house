package org.apache.jsp.main.userjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"usercrud!updateUserMe.action\" class=\"pageForm required-validate\" onsubmit=\"return validateCallback(this)\">\r\n");
      out.write("\t\t<div class=\"pageFormContent nowrap\" layoutH=\"97\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>用户名:</dt>\r\n");
      out.write("\t\t\t\t<dd><input type=\"hidden\" name=\"userid\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<input readonly=\"readonly\" type=\"text\" name=\"username\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>真实姓名：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"realname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"required username\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>性别：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name =\"sex\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.sex==1?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" />男\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name =\"sex\" value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.sex==2?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/>女\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>婚否：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name =\"marry\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.marry==1?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" />是\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name =\"marry\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.marry==0?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/>否\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>籍贯：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"fromcity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.fromcity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>身份证：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"idcard\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.idcard}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  class=\"idcard\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>联系电话：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"phone\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>e-mail：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"email\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>手机：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"mbphone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.mbphone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"mbphone\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>住址：</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"formBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><div class=\"buttonActive\"><div class=\"buttonContent\"><button type=\"submit\">提交</button></div></div></li>\r\n");
      out.write("\t\t\t\t<li><div class=\"button\"><div class=\"buttonContent\"><button type=\"reset\">重置</button></div></div></li>\r\n");
      out.write("\t\t\t\t<li><div class=\"button\"><div class=\"buttonContent\"><button type=\"button\" class=\"close\">取消</button></div></div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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
