package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
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
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>房屋租赁管理系统</title>\r\n");
      out.write("<link href=\"dwz/themes/css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/loginValidata.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\tfunction(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t);\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"login\">\r\n");
      out.write("\t\t<div id=\"login_header\">\r\n");
      out.write("\t\t\t<h1 class=\"login_logo\">\r\n");
      out.write("\t\t\t\t<a href=\"\"><img src=\"dwz/themes/default/images/login_logo.gif\" /></a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<div class=\"login_headerContent\">\r\n");
      out.write("\t\t\t\t<div class=\"navList\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">设为首页</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h2 class=\"login_title\"><img src=\"dwz/themes/default/images/login_title.png\" /></h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"login_content\">\r\n");
      out.write("\t\t\t<div class=\"loginForm\">\r\n");
      out.write("\t\t\t\t<form action=\"userlogin/login.action\" method=\"post\" onSubmit=\"return chk()\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>用户名：</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"username\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>密码：</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\" size=\"20\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>验证码：</label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"code\" maxlength=\"4\" name = \"code\" id=\"code\" type=\"text\" size=\"5\" />\r\n");
      out.write("\t\t\t\t\t\t<span><img src=\"validatecode/img.jsp\" onclick=\"this.setAttribute('src','validatecode/img.jsp')\"alt=\"\" width=\"75\" height=\"24\" /></span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"login_bar\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"sub\" id=\"btnsubmit\" type=\"submit\" value=\" \" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" id=\"message\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login_banner\"><img  src=\"dwz/themes/default/images/login_banner.jpg\" /></div>\r\n");
      out.write("\t\t\t<div class=\"login_main\">\r\n");
      out.write("\t\t\t\t<ul class=\"helpList\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"login_inner\">\r\n");
      out.write("\t\t\t\t\t<p>福建工程学院    国脉信息学院</p>\r\n");
      out.write("\t\t\t\t\t<p>网络工程 1001 陈伟达</p>\r\n");
      out.write("\t\t\t\t\t<p>版本：1.1.1v</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"login_footer\">\r\n");
      out.write("\t\t\tCopyright &copy; 2009 www.dwzjs.com Inc. All Rights Reserved.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_005ffielderror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent(null);
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }
}
