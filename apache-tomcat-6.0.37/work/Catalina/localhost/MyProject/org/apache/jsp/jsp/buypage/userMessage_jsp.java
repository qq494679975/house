package org.apache.jsp.jsp.buypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.boyang.chenweida.bean.UserInfo;
import oracle.net.aso.r;
import java.util.*;
import com.boyang.chenweida.daoimpl.*;

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
      			"/myhtml/errorpage/erroe.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
UserDaoImpl daoImpl = new UserDaoImpl(); 
  long id = (Long)session.getAttribute("id");
   UserInfo ui= daoImpl.queryById((int)id);

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form>\r\n");
      out.write("\t<table height=\"450px\" width=\"800px\" cellspacing=\"0\" border=\"1\" bordercolor=\"#33FFCC\" >\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\"bgcolor=\"#33CCFF\">用户名：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getUsername());
      out.write("\" name=\"user\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\"  bgcolor=\"#33CCFF\">性别：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getUsersex()==0?"女":"男");
      out.write("\" name=\"sex\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\"  bgcolor=\"#33CCFF\">真实姓名：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getTruename());
      out.write("\" name=\"realname\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">出生日期：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getBirthday());
      out.write("\" name=\"birthday\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">电子邮箱：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getEmail());
      out.write("\" name=\"email\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">电话号码：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getPhoneno());
      out.write("\" name=\"phone\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">地址：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getAddress());
      out.write("\" name=\"address\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">邮编：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getPostcode());
      out.write("\" name=\"youbian\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">注册时间：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getRegdate());
      out.write("\" name=\"time\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\"> 最后登录时间：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getLastaccess());
      out.write("\" name=\"logintime\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">登录次数：</td>\r\n");
      out.write("\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(ui.getUserlogin());
      out.write("\" name=\"loginnunm\" readonly=\"readonly\"/></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
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
