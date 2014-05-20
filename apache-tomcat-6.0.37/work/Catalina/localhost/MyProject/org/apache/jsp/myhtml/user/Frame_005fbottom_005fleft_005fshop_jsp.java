package org.apache.jsp.myhtml.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.boyang.chenweida.servlet.System_login;
import java.util.*;
import com.boyang.chenweida.model.McCar;
import com.boyang.chenweida.bean.Mc;

public final class Frame_005fbottom_005fleft_005fshop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>My JSP 'Frame_bottom_left_shop.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");

	McCar mc = (McCar) session.getAttribute("mcCar");

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction update(mcid) {\r\n");
      out.write("\t\tvar r = confirm(\"确认修改商品的数目？\");\r\n");
      out.write("\t\tif (r == true) {\r\n");
      out.write("\t\t\tvar num = document.getElementById(\"mcnumid\" + mcid);\r\n");
      out.write("\t\t\tvar patt = new RegExp(\"[0-9]+\", \"gi\");\r\n");
      out.write("\t\t\tif (patt.test(num.value)) {\r\n");
      out.write("\t\t\t\tif (num.value > 0) {\r\n");
      out.write("\t\t\t\t\tvar form_1 = document.getElementById(\"form_first\");\r\n");
      out.write("\t\t\t\t\tform_1.action = \"/MyProject/servlet/Car_Update?mcnum=\"\r\n");
      out.write("\t\t\t\t\t\t\t+ num.value + \"&mcid=\" + mcid;\r\n");
      out.write("\t\t\t\t\tform_1.submit();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"修改的数目必须大于0\");\r\n");
      out.write("\t\t\t\t\tlocation.href = \"/MyProject/myhtml/user/Frame_bottom_left_shop.jsp\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"必须为数字\");\r\n");
      out.write("\t\t\t\tlocation.href = \"/MyProject/myhtml/user/Frame_bottom_left_shop.jsp\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction del(mcid) {\r\n");
      out.write("\t\tvar r = confirm(\"确认删除商品？\");\r\n");
      out.write("\t\tif (r == true) {\r\n");
      out.write("\t\t\tvar form_1 = document.getElementById(\"form_first\");\r\n");
      out.write("\t\t\tform_1.action = \"/MyProject/servlet/Car_del?mcid=\" + mcid;\r\n");
      out.write("\t\t\tform_1.submit();\r\n");
      out.write("\t\t\t//changePage();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clean() {\r\n");
      out.write("\t\tvar size1 =\r\n");
      out.print(mc.getSize());
      out.write("\r\n");
      out.write("\t;\r\n");
      out.write("\t\tif (size1 > 0) {\r\n");
      out.write("\t\t\tvar r = confirm(\"确认清空购物车？\");\r\n");
      out.write("\t\t\tif (r == true) {\r\n");
      out.write("\t\t\t\tvar form_1 = document.getElementById(\"form_second\");\r\n");
      out.write("\t\t\t\tform_1.action = \"/MyProject/servlet/Car_Empty\";\r\n");
      out.write("\t\t\t\tform_1.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"购物车没有任何物品\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction againbuy() {\r\n");
      out.write("\t\tvar form_1 = document.getElementById(\"form_second\");\r\n");
      out.write("\t\tform_1.target = \"_top\";\r\n");
      out.write("\t\tform_1.action = \"/MyProject/\";\r\n");
      out.write("\t\tform_1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction pay() {\r\n");
      out.write("\t\tvar size1 =\r\n");
      out.print(mc.getSize());
      out.write("\r\n");
      out.write("\t;\r\n");
      out.write("\t\tif (size1 > 0) {\r\n");
      out.write("\t\t\tvar form_1 = document.getElementById(\"form_second\");\r\n");
      out.write("\t\t\tform_1.target = \"right\";\r\n");
      out.write("\t\t\tform_1.action = \"/MyProject/myhtml/user/orderyes.html\";\r\n");
      out.write("\t\t\tform_1.submit();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"购物车没有任何物品\");\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction changePage() {\r\n");
      out.write("\t\tvar left = window.parent.document.getElementById(\"leftpage\");\r\n");
      out.write("\t\tleft.setAttribute(\"src\",\r\n");
      out.write("\t\t\t\t\"/MyProject/myhtml/buypage/Frame_bottom_left.jsp?time=\"+Math.random());\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"changePage()\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h1 style=\"text-align: center;\">购物车管理</h1>\r\n");
      out.write("\t\t<table style=\"border-style:dashed;  border-color: blue;\" id=\"mytable\">\r\n");
      out.write("\t\t\t<tr style=\"border-style:dashed;\">\r\n");
      out.write("\t\t\t\t<td style=\"width: 250px\">商品缩略图</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">商品名称</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">商品单价</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">商品数量</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">商品小计</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 250px\">操作</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				mc = (McCar) session.getAttribute("mcCar");
				if (mc != null) {
					List<Mc> mc1 = mc.getCar();
					System.out.println(mc1);
					for (int i = 0; i < mc1.size(); i++) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr id=\"tr");
      out.print(mc1.get(i).getMcid());
      out.write("\" style=\"border-style:dashed;\">\r\n");
      out.write("\t\t\t\t<td style=\"width: 250px\"><img style=\"width:60px;height: 45px; \"\r\n");
      out.write("\t\t\t\t\tsrc=\"/MyProject/mcimage/");
      out.print(mc1.get(i).getPic());
      out.write("\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">");
      out.print(mc1.get(i).getMcname());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">");
      out.print(mc1.get(i).getPrice());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(mc1.get(i).getQuantity());
      out.write("\" name=\"mcnum\"\r\n");
      out.write("\t\t\t\t\tid=\"mcnumid");
      out.print(mc1.get(i).getMcid());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">");
      out.print(mc1.get(i).getPrice() * mc1.get(i).getQuantity());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 250px\">\r\n");
      out.write("\t\t\t\t\t<form method=\"post\" action=\"\" id=\"form_first\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"");
      out.print(mc1.get(i).getMcid());
      out.write("\" type=\"button\" value=\"修改\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"update(this.id)\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\tid=\"");
      out.print(mc1.get(i).getMcid());
      out.write("\" type=\"button\" value=\"删除\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"del(this.id)\" />\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
				}
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"width: 200px\">商品总类数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.size }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 300px\">商品总个数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.num }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 300px\">商品总价:￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mcCar.totalPrice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<form method=\"post\" action=\"\" id=\"form_second\">\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" value=\"清空购物车\" onclick=\"clean()\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" value=\"继续购物\" onclick=\"againbuy()\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" value=\"结算中心\" onclick=\"pay()\" /></td>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
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
