package org.apache.jsp.jsp.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>My JSP 'left.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<link href=\"/MyProject/css/left_css.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<SCRIPT language=JavaScript>\r\n");
      out.write("\tfunction showsubmenu(sid) {\r\n");
      out.write("\t\twhichEl = eval(\"submenu\" + sid);\r\n");
      out.write("\t\tif (whichEl.style.display == \"none\") {\r\n");
      out.write("\t\t\teval(\"submenu\" + sid + \".style.display=\\\"\\\";\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\teval(\"submenu\" + sid + \".style.display=\\\"none\\\";\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<body bgcolor=\"16ACFF\">\r\n");
      out.write("\t<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\tbackground=\"/MyProject/images/tablemde.jpg\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#16ACFF\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td><TABLE width=\"97%\" border=0 align=right cellPadding=0\r\n");
      out.write("\t\t\t\t\tcellSpacing=0 class=leftframetable>\r\n");
      out.write("\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background:url(/MyProject/images/left_tt.gif) no-repeat\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD width=\"20\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(1);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight=25>用户管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD><TABLE id=submenu1 cellSpacing=0 cellPadding=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD width=\"2%\"><IMG src=\"/MyProject/images/closed.gif\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD height=23><a href=\"/MyProject/myhtml/backstage/registerUserManage.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=right>注册用户管理</a></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

			if (session.getAttribute("id").equals(0)) {
		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD><IMG src=\"/MyProject/images/closed.gif\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD height=23><A href=\"/MyProject/myhtml/backstage/systemUserM.jsp\" target=\"right\">管理员管理</A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");

			}
		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><table class=\"leftframetable\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\tcellpadding=\"0\" width=\"97%\" align=\"right\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background:url(/MyProject/images/left_tt.gif) no-repeat\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"20\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"titledaohang\" style=\"CURSOR: hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonClick=\"showsubmenu(2);\"><span class=\"STYLE1\">商品管理</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><table id=\"submenu2\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"7%\"><img src=\"/MyProject/images/closed.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"93%\" height=\"23\"><a href=\"/MyProject/myhtml/backstage/tableAdd.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"right\">商品类别管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><img src=\"/MyProject/images/closed.gif\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td height=\"23\"><a href=\"/MyProject/myhtml/backstage/goodsMessageM.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"right\">商品信息管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><TABLE class=leftframetable cellSpacing=0 cellPadding=0\r\n");
      out.write("\t\t\t\t\twidth=\"97%\" align=right border=0>\r\n");
      out.write("\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background:url(/MyProject/images/left_tt.gif) no-repeat\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD width=\"20\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(4);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight=25>订单管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD><TABLE id=submenu4 cellSpacing=0 cellPadding=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD width=\"2%\"><IMG src=\"/MyProject/images/closed.gif\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD height=23><A href=\"/MyProject/myhtml/backstage/orderManagement.jsp\" target=right>订单管理</A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><TABLE class=leftframetable cellSpacing=0 cellPadding=0\r\n");
      out.write("\t\t\t\t\twidth=\"97%\" align=right border=0>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background:url(/MyProject/images/left_tt.gif) no-repeat\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"20\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"titledaohang\" style=\"CURSOR: hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonClick=\"showsubmenu(3)\"><span class=\"STYLE1\">个人资料管理</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><table id=\"submenu3\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"7%\"><img src=\"/MyProject/images/closed.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"93%\" height=\"23\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"/MyProject/jsp/backstage/ownMessage.jsp\" target=\"right\">显示个人资料</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"7%\"><img src=\"/MyProject/images/closed.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"93%\" height=\"23\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"/MyProject/jsp/backstage/ownMessageChange.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"right\">个人资料修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><img src=\"/MyProject/images/closed.gif\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td height=\"23\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"/MyProject/myhtml/backstage/xiugaimima.html\" target=\"right\">密码修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</TABLE></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><TABLE class=leftframetable cellSpacing=0 cellPadding=0\r\n");
      out.write("\t\t\t\t\twidth=\"97%\" align=right border=0>\r\n");
      out.write("\t\t\t\t</TABLE></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_top.jpg\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"8\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<TABLE class=leftframetable cellSpacing=1 cellPadding=1 width=\"97%\"\r\n");
      out.write("\t\t\t\t\talign=right border=0>\r\n");
      out.write("\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD height=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background:url(/MyProject/images/left_tt.gif) no-repeat\"><table\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD width=\"20\"></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD class=STYLE1 height=25>系统信息</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD height=105><span class=\"STYLE2\"><IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/closed.gif\">版权所有：陈伟达<br> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/closed.gif\">设计制作：陈伟达<br> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/closed.gif\">技术支持：陈伟达<br> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/closed.gif\">帮助中心：陈伟达<br> <IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/closed.gif\">系统版本：1.0</span></TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td height=\"5\" background=\"/MyProject/images/tableline_bottom.jpg\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
}
