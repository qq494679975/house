package org.apache.jsp.jsp.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"/myhtml/errorpage/erroe.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'top.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<link href=\"/MyProject/css/top_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction out()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(confirm(\"亲,你确定要离开吗？\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttop.document.location.href=\"/MyProject/servlet/System_Over\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#03A8F6\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"194\" height=\"60\" align=\"center\"\r\n");
      out.write("\t\t\t\tbackground=\"/MyProject/images/top_logo.jpg\"></td>\r\n");
      out.write("\t\t\t<td align=\"center\"\r\n");
      out.write("\t\t\t\tstyle=\"background:url(/MyProject/images/top_bg.jpg) no-repeat\"><table\r\n");
      out.write("\t\t\t\t\tcellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" height=\"33\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30\" align=\"left\"><img onClick=\"switchBar(this)\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"15\" alt=\"关闭左边管理菜单\" src=\"/MyProject/images/on-of.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"15\" border=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"320\" align=\"left\">你好,");
      out.print(session.getAttribute("userName") );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
if(session.getAttribute("userName").equals("SuperAdmin")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"top_link\">┆超级管理员</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t");
}else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"top_link\">┆普通管理员</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"80\" align=\"right\" nowrap=\"nowrap\" class=\"topbar\">官方公告：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"topbar\"><img title=\"返回首页\" height=\"23\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/home.gif\" width=\"33\" border=\"0\" />&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<table height=\"26\" border=\"0\" align=\"left\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"0\" class=\"subbg\" NAME=t1>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" class=\"topbar\"><span class=\"STYLE2\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"71\" align=\"center\" valign=\"middle\"\r\n");
      out.write("\t\t\t\t\t\t\t\tbackground=\"/MyProject/images/top_tt_bg.gif\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"out()\" style=\"color: blue\" class=\"STYLE2\">退出登录</a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr height=\"6\">\r\n");
      out.write("\t\t\t<td bgcolor=\"#1F3A65\" background=\"/MyProject/images/top_bg.jpg\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t\tvar displayBar = true;\r\n");
      out.write("\t\tfunction switchBar(obj) {\r\n");
      out.write("\t\t\tif (displayBar) {\r\n");
      out.write("\t\t\t\tparent.frame.cols = \"0,*\";\r\n");
      out.write("\t\t\t\tdisplayBar = false;\r\n");
      out.write("\t\t\t\tobj.title = \"打开左边管理菜单\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tparent.frame.cols = \"195,*\";\r\n");
      out.write("\t\t\t\tdisplayBar = true;\r\n");
      out.write("\t\t\t\tobj.title = \"关闭左边管理菜单\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t//-->\r\n");
      out.write("\t</script>\r\n");
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
}
