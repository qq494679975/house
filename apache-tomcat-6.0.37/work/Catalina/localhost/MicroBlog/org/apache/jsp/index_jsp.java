package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<META name=\"google-site-verification\" content=\"dcJxwJj3BjHRWOqfkv5foGijNDdhCqUogRWWtNXWfEM\">\r\n");
      out.write("<META content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"css/base.css\" charset=\"utf-8\" media=\"screen\">\r\n");
      out.write("<TITLE>校园微博--分享校园生活的新鲜事！ </TITLE>\r\n");
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
      out.write(" <LI><A href=\"");
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
      out.write("<TABLE id=\"columns\">\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD id=\"main\">\r\n");
      out.write("      <P id=\"headline\">校园微博，分享校园生活的新鲜事！</P>\r\n");
      out.write("      <UL id=\"slogan\">\r\n");
      out.write("        <LI id=\"what\">\r\n");
      out.write("        <P>畅所欲言<BR>记录校园生活的点滴</P></LI>\r\n");
      out.write("        <LI id=\"who\">\r\n");
      out.write("        <P>交流分享<BR>拉近彼此的心灵距离</P></LI>\r\n");
      out.write("        <LI id=\"how\">\r\n");
      out.write("        <P>想上就上<BR>支持手机登录</P></LI></UL>\r\n");
      out.write("      <P id=\"get-started\"><A href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/register.jsp\">注册</A></P></TD>\r\n");
      out.write("    <TD id=\"sidebar\">\r\n");
      out.write("      <DIV class=\"sect first-sect\">\r\n");
      out.write("      <H2>登录</H2>\r\n");
      out.write("      <FORM id=\"login\" method=\"post\" action=\"loginAction\">\r\n");
      out.write("      <P><LABEL class=\"label_input\" for=\"loginname\">Email账号：</LABEL><INPUT \r\n");
      out.write("      class=\"input_text\" tabIndex=\"1\" name=\"userEmail\" type=\"text\"></P>\r\n");
      out.write("      <P>\r\n");
      out.write("        <LABEL class=\"label_input\" for=\"loginpass\">微博密码：</LABEL>\r\n");
      out.write("        <INPUT class=\"input_text\" tabIndex=\"2\" name=\"userPassword\" maxLength=\"32\" type=\"password\"></P>\r\n");
      out.write("      <P>\r\n");
      out.write("      \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <LABEL class=\"label_check\" for=\"autologin\"></LABEL>\r\n");
      out.write("      </P>\r\n");
      out.write("      <P class=\"act\">\r\n");
      out.write("        <INPUT name=\"action\" value=\"login\" \r\n");
      out.write("      type=\"hidden\"><INPUT name=\"token\" value=\"5c5b9c82\" type=\"hidden\"><INPUT class=\"formbutton\" tabIndex=\"11\" value=\"登录\" type=\"submit\"></P></FORM>\r\n");
      out.write("      </DIV>\r\n");
      out.write("      <DIV class=\"sect\">\r\n");
      out.write("      <H2>公告</H2>\r\n");
      out.write("      <UL class=\"tlist\">\r\n");
      out.write("        <LI>欢迎使用校园微博！</LI>\r\n");
      out.write("\t\t<LI>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本微博系统主要为广大师生提</LI>\r\n");
      out.write("\t\t<LI>供一个全方位的信息分享交流平台</LI>\r\n");
      out.write("\t\t<LI>，是为服务师生交流、社团及班级</LI>\r\n");
      out.write("\t\t<LI>群组管理、学校信息发布而构建，</LI>\r\n");
      out.write("\t\t<LI>同时它也可以满足交流、分享、获</LI>\r\n");
      out.write("\t\t<LI>取、交友的需求。本微博亦提供手</LI>\r\n");
      out.write("        <LI>机版客户端。</LI>\r\n");
      out.write("  \t\t</UL>\r\n");
      out.write("  </DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("<DIV id=\"footer\" class=\"ui-roundedbox\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-tr\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-bl\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-corner ui-roundedbox-br\">\r\n");
      out.write("<DIV class=\"ui-roundedbox-content\">\r\n");
      out.write("<P style=\"color:#FFFFFF\">© <SPAN title=\"I:1; Q:2; S:1; C:0; F:0; T:6.00; H:e02\">2013</SPAN>福建师范大学闽南科技学院09网络工程<SPAN class=\"szinfo\"> &nbsp;&nbsp;\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /index.jsp(51,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${check=='fail'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      \t\t<label style=\"color: red\">账号或密码错误</label>\r\n");
        out.write("      \t");
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
}
