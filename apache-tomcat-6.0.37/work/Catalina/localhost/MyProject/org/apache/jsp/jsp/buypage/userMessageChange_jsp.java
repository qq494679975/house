package org.apache.jsp.jsp.buypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userMessageChange_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"/MyProject/js/ownMessageChange.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"div1\">\r\n");
      out.write("\t\t<form action=\"/MyProject/servlet/UserUpdate\" method=\"post\" id=\"myForm\"\r\n");
      out.write("\t\t\tonsubmit=\"return allIsOK()\">\r\n");
      out.write("\t\t\t<table border=\"1\" bordercolor=\"#6699CC\" width=\"1000px\"\r\n");
      out.write("\t\t\t\tcellspacing=\"0\" height=\"450px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">用户名:</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"400px\"><input style=\"width: 300px\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tid=\"username\" value=\"");
      out.print(session.getAttribute("buypage_userName") );
      out.write("\" readonly=\"readonly\"/><label id=\"userNameMsg1\"></label></td>\r\n");
      out.write("\t\t\t\t\t<td>用户名不可以修改,必须是英文字母或数字，长度3-15</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">性别:</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sex==\"男\"?\"checked='checked'\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" name=\"sex\"  value=\"1\"/>男\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sex==\"女\"?\"checked='checked'\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" name=\"sex\" value=\"0\" />女 <label id=\"userNameMsg4\"></label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td>只能是男或者女</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">真实姓名:</td>\r\n");
      out.write("\t\t\t\t\t<td><input style=\"width: 300px\" type=\"text\" id=\"realname\" name=\"realName\" value=\"");
      out.print(session.getAttribute("trueName") );
      out.write("\" /> <label\r\n");
      out.write("\t\t\t\t\t\tid=\"userNameMsg5\"></label></td>\r\n");
      out.write("\t\t\t\t\t<td>中文，2-10个字符</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">出生日期:</td>\r\n");
      out.write("\t\t\t\t\t<td><div id=\"div1\"></div> <input value=\"");
      out.print(session.getAttribute("birthday") );
      out.write("\" \" style=\"width: 300px\" type=\"text\" id=\"day\"\r\n");
      out.write("\t\t\t\t\t\treadonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\tonFocus=\"WdatePicker({startDate:'1980-01-01',alwaysUseStartDate:true})\"\r\n");
      out.write("\t\t\t\t\t\tonblur=\"daysamllnow()\" name=\"birthday\"/> <label id=\"userNameMsg6\"></label></td>\r\n");
      out.write("\t\t\t\t\t<td>格式yyyy-mm-dd,按次日期算出的年龄应该大于十岁</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">电子邮箱:</td>\r\n");
      out.write("\t\t\t\t\t<td><input value=\"");
      out.print(session.getAttribute("eMali") );
      out.write("\" style=\"width: 300px\" type=\"text\" id=\"email\" name=\"eMail\"/> <label id=\"userNameMsg7\"></label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>格式要正确</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">电话号码:</td>\r\n");
      out.write("\t\t\t\t\t<td><input value=\"");
      out.print(session.getAttribute("phoneno") );
      out.write("\"  style=\"width: 300px\" type=\"text\" id=\"phone\" name=\"phone\"/> <label id=\"userNameMsg8\"></label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>必须是数字</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">地址:</td>\r\n");
      out.write("\t\t\t\t\t<td><input value=\"");
      out.print(session.getAttribute("address") );
      out.write("\"  style=\"width: 300px\" type=\"text\" id=\"address\" name=\"address\"/> <label\r\n");
      out.write("\t\t\t\t\t\tid=\"userNameMsg9\"></label></td>\r\n");
      out.write("\t\t\t\t\t<td>长度不能大于100</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#00CCFF\">邮编:</td>\r\n");
      out.write("\t\t\t\t\t<td><input value=\"");
      out.print(session.getAttribute("postcode") );
      out.write("\" style=\"width: 300px\" type=\"text\" id=\"youbian\" name=\"postcode\"/> <label\r\n");
      out.write("\t\t\t\t\t\tid=\"userNameMsg10\"></label></td>\r\n");
      out.write("\t\t\t\t\t<td>6位数字</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" align=\"center\"><input type=\"submit\" value=\"提交\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"重置\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"/MyProject/myhtml/My97DatePickerBeta/My97DatePicker/WdatePicker.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
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
