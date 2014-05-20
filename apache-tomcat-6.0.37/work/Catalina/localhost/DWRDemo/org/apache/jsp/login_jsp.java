package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type='text/javascript'\r\n");
      out.write("\tsrc='/DWRDemo/dwr/interface/CheckRegistNameBean.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/DWRDemo/dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='/DWRDemo/dwr/util.js'></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>My JSP 'login.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction checkUserName(){\r\n");
      out.write("\t\t\tvar UserName = document.getElementById(\"Name\").value;\r\n");
      out.write("\t\t\tif(UserName == \"\"){\r\n");
      out.write("\t\t\t\talert(\"请输入注册名\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"Name\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t//调用CheckRegistNameBean类里面的checkName方法\r\n");
      out.write("\t\t\t\tCheckRegistNameBean.checkMyName(UserName,showmsg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction showmsg(data){\r\n");
      out.write("\t\t\t//if(data == true)\r\n");
      out.write("\t\t\t//\tdocument.getElementById(\"div_msg\").innerHTML=\"注册名已用!\";\r\n");
      out.write("\t\t\t//else\r\n");
      out.write("\t\t\t//\tdocument.getElementById(\"div_msg\").innerHTML=\"注册名可用!\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t//document.getElementById(\"div_msg\").style.display='inline';\r\n");
      out.write("\t\t\tdocument.getElementById(\"div_msg\").innerHTML=data;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form action=\"#\" method=\"post\" name=\"LoginForm\">\r\n");
      out.write("\t\t\tLoginName:\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"Name\" size=\"20\" value=\"\"><div id=\"div_msg\"></div><p>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"检查用户名\" onclick=\"checkUserName();\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"注册\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
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
