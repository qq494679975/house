package org.apache.jsp.myhtml.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>My JSP 'buy.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("// 判断电子邮箱\r\n");
      out.write("function emailIsOK() {\r\n");
      out.write("\tvar emali = $(\"email\").value;\r\n");
      out.write("\tif (isNotNull(emali)) {\r\n");
      out.write("\t\tvar email1 = new RegExp(\r\n");
      out.write("\t\t\t\t\"^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$\");\r\n");
      out.write("\t\tif (email1.test(emali)) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"邮箱格式错误\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"邮箱不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function $(id) {\r\n");
      out.write("\treturn document.getElementById(id);\r\n");
      out.write("}\r\n");
      out.write("// 判断是否为空\r\n");
      out.write("function isNotNull(str) {\r\n");
      out.write("\tif (str == \"\")\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\tvar patt = new RegExp(\"^[ ]+$\");\r\n");
      out.write("\treturn !patt.test(str);\r\n");
      out.write("}\r\n");
      out.write("function username() {\r\n");
      out.write("\tvar value = $(\"truename\").value;\r\n");
      out.write("\tif (isNotNull(value)) {\r\n");
      out.write("\t\tvar patt = new RegExp(\"^[\\u4e00-\\u9fa5]{2,10}$\");\r\n");
      out.write("\t\tif (patt.test(value)) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"收货人格式错误\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"收货人不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// 判断电话号码\r\n");
      out.write("function phoneidok() {\r\n");
      out.write("\tvar emali = $(\"phone\").value;\r\n");
      out.write("\tif (isNotNull(emali)) {\r\n");
      out.write("\t\t// 电话号码只能是7位8位11位\r\n");
      out.write("\t\tvar phone = new RegExp(\"^[0-9]{1,12}$\");\r\n");
      out.write("\t\tif (phone.test(emali)) {\r\n");
      out.write("\t\t\tif ((emali.length == 7) || (emali.length == 8)\r\n");
      out.write("\t\t\t\t\t|| (emali.length == 11)) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"电话长度不对，只能为7位或者8位或者11位\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"电话号码格式错误\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"电话号码不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// 判断地址\r\n");
      out.write("function addressisok() {\r\n");
      out.write("\tvar emali = $(\"address\").value;\r\n");
      out.write("\tif (isNotNull(emali)) {\r\n");
      out.write("\t\tif (emali.length < 100) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"地址格式错误\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"地址不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// 判断邮编\r\n");
      out.write("function youbianidok() {\r\n");
      out.write("\tvar emali = $(\"youbian\").value;\r\n");
      out.write("\tif (isNotNull(emali)) {\r\n");
      out.write("\t\tvar phone = new RegExp(\"^[0-9]{6}$\");\r\n");
      out.write("\t\tif (phone.test(emali)) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"邮编格式错误\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\talert(\"邮编不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\tfunction isgo(){\r\n");
      out.write("\t// 判断信息\r\n");
      out.write("\tif (username()&& emailIsOK() && phoneidok() && addressisok() && youbianidok()) {\r\n");
      out.write("\t\treturn window.confirm(\"确认输入的信息无误？\");\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"post\" action=\"servlet/Car_pay\" onsubmit=\"return isgo()\">\r\n");
      out.write("\t\t<table width=\"400\" border=\"1\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">所购商品种类数:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.size }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"buytype\"\r\n");
      out.write("\t\t\t\t\treadonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">所购商品总件数:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.num }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"quantity\"\r\n");
      out.write("\t\t\t\t\treadonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">价格总计:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.totalPrice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"totalprice\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">订单时间:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" value=\"");
      out.print(new Date().toLocaleString());
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"buytime\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">付款方式:</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
if (request.getParameter("select_first").equals("0")) {
      out.print("在线支付");
} else {
      out.print("货到付款");
}
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"paytype\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收获方式:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
if (request.getParameter("select_second").equals("0")) {
      out.print("平邮");
} else {
      out.print("EMS");
}
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"receivedtype\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">------------------------------------------</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"userid\" />\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收货人姓名:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"truename\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trueName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"username\" /></td>\r\n");
      out.write("\t\t\t\t<td>必填，中文，2-10个</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收获人地址:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"address\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"address\" /></td>\r\n");
      out.write("\t\t\t\t<td>必填，3-100个字符</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收获人邮编:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"youbian\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"postcode\" /></td>\r\n");
      out.write("\t\t\t\t<td>必填，6个数字</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收获人电话:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"phone\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneno }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"phoneno\" /></td>\r\n");
      out.write("\t\t\t\t<td>必填</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#00CCFF\" align=\"right\">收获人邮箱:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"email\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${eMali }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"email\" /></td>\r\n");
      out.write("\t\t\t\t<td>必填，格式要正确</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\"><input type=\"submit\" value=\"下订单\"\r\n");
      out.write("\t\t\t\t\tname=\"ok\" />&nbsp;&nbsp; <input type=\"reset\" value=\"重置\" name=\"no\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
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
