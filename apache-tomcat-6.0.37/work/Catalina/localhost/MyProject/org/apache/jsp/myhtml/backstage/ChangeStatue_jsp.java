package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ChangeStatue_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>My JSP 'ChangeStatue.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function textCounter(field,counter,maxlimit,linecounter) {\r\n");
      out.write("\t// text width//\r\n");
      out.write("\tvar fieldWidth =  parseInt(field.offsetWidth);\r\n");
      out.write("\tvar charcnt = field.value.length;        \r\n");
      out.write("\r\n");
      out.write("\t// trim the extra text\r\n");
      out.write("\tif (charcnt > maxlimit) { \r\n");
      out.write("\t\tfield.value = field.value.substring(0, maxlimit);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\telse { \r\n");
      out.write("\tvar percentage = parseInt(100 - (( maxlimit - charcnt) * 100)/maxlimit) ;\r\n");
      out.write("\tdocument.getElementById(counter).style.width =  parseInt((fieldWidth*percentage)/100)+\"px\";\r\n");
      out.write("\tdocument.getElementById(counter).innerHTML=\"已输: \"+percentage+\"%\"\r\n");
      out.write("\t//设置颜色\r\n");
      out.write("\tsetcolor(document.getElementById(counter),percentage,\"background\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setcolor(obj,percentage,prop){\r\n");
      out.write("\tobj.style[prop] = \"rgb(80%,\"+(100-percentage)+\"%,\"+(100-percentage)+\"%)\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"/MyProject/servlet/System_OrderSubmib\" method=\"post\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>订单编号：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"orderid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.orderid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>订单状态：</td>\r\n");
      out.write("\t\t\t\t<td><select name=\"statue\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">通过</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">未通过</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>订单反馈：</td>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t<textarea rows=\"5\" cols=\"40\" name=\"msg\" id=\"tjdesr\" \r\n");
      out.write("\t\t\t\t\t\t\tonKeyDown=\"textCounter(this,'progressbar1',300)\" \r\n");
      out.write("\t\t\t\t\t\t\tonKeyUp=\"textCounter(this,'progressbar1',300)\" \r\n");
      out.write("\t\t\t\t\t\t\tonFocus=\"textCounter(this,'progressbar1',300)\" ></textarea><br />\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"progressbar1\" class=\"progress\"></div>\r\n");
      out.write("\t\t\t\t\t<script>textCounter(document.getElementById(\"tjdesr\"),\"progressbar1\",300);</script>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>审核人：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name =\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" style=\"text-align: center;\"><input type=\"submit\" value=\"审核\" />&nbsp;<input type=\"reset\"\r\n");
      out.write("\t\t\t\t\tvalue=\"重置\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name = \"ordeusername\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ordeusername }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name = \"ordestarttime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ordestarttime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name = \"ordeendtime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ordeendtime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name = \"ordermcname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ordermcname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name = \"ordemcstatue\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ordemcstatue }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
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
