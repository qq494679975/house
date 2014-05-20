package org.apache.jsp.jsp.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.boyang.chenweida.bean.SystemUser;
import com.boyang.chenweida.dao.IUserDao;
import com.boyang.chenweida.daoimpl.IUserDaoImp;

public final class ownMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private IUserDao dao = new IUserDaoImp();
	private SystemUser su = null;
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
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		su = dao.getUserById("" + session.getAttribute("id"));
		String sex = null;
		if (su.getUsersex() == 0) {
			sex = "女";
		} else {
			sex = "男";
		}
	
      out.write("\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\t<table height=\"450px\" width=\"800px\" cellspacing=\"0\" border=\"1\"\r\n");
      out.write("\t\t\tbordercolor=\"#33FFCC\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">用户名：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getUsername());
      out.write("\" name=\"user\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">性别：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\" value=\"");
      out.print(sex);
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"sex\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">真实姓名：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getTruename());
      out.write("\" name=\"realname\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">出生日期：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getBirthday());
      out.write("\" name=\"birthday\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">电子邮箱：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getEmail());
      out.write("\" name=\"email\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">电话号码：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getPhoneno());
      out.write("\" name=\"phone\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">地址：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getAddress());
      out.write("\" name=\"address\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">邮编：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getPostcode());
      out.write("\" name=\"youbian\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">注册时间：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getRegdate());
      out.write("\" name=\"time\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">最后登录时间：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getLastaccess());
      out.write("\" name=\"logintime\"\r\n");
      out.write("\t\t\t\t\treadonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" bgcolor=\"#33CCFF\">登录次数：</td>\r\n");
      out.write("\t\t\t\t<td><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(su.getUserlogin());
      out.write("\" name=\"loginnunm\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
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
}
