package org.apache.jsp.myhtml.buypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.boyang.chenweida.daoimpl.McDapImpl;
import com.boyang.chenweida.dao.McDao;
import com.boyang.chenweida.bean.Mc;
import java.util.*;

public final class shangpinxinxi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <title>My JSP 'shangpinxinxi.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");
 int mcid=Integer.valueOf(request.getParameter("mcid"));
  	McDao md = new McDapImpl();
  	Mc mc = md.queryMcById(mcid);
  	System.out.println(mc);
  
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \t<table>\r\n");
      out.write("\t\t<tr> \r\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"center\"><h2>商品详细信息</h2></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td rowspan=\"3\"><img alt=\"图片\" src=\"/MyProject/mcimage/");
      out.print(mc.getPic());
      out.write("\"/></td>\r\n");
      out.write("\t\t\t<td>[商品名称]:");
      out.print(mc.getMcname());
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>[商品价格]:");
      out.print(mc.getPrice());
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>[是否缺货]:");
if(mc.getFlag()==0){
      out.print("缺货");
}else{
      out.print("有货");
}
      out.write("</td>\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(mc.getFlag());
      out.write("\" id=\"flag\"/>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><a href=\"/MyProject/myhtml/buypage/Frame_bottom_right_top_pic.jsp?pic=");
      out.print(mc.getPic());
      out.write("\" target=\"_blank\">查看图片</a></td>\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"\" id=\"spxxfirst\">\r\n");
      out.write("\t\t\t<td><input type=\"button\" value=\"加入购物车\" name=\"add\" onclick=\"spxxbuy(");
      out.print(mc.getMcid());
      out.write(")\"/></td>\r\n");
      out.write("\t\t\t<td><input type=\"button\" value=\"返回\" name=\"back\" onclick=\"spxxback()\"></td>\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"num\"/>\r\n");
      out.write("\t\t\t </form>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\">---------------------------------------------------------</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(mc.getMcdecr());
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar num =0;\r\n");
      out.write("\tfunction spxxbuy(spxxmcid)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar aa = document.getElementById(\"flag\").value;\r\n");
      out.write("\t\tif(aa==1){\r\n");
      out.write("\t\tnum--;\r\n");
      out.write("\t\tvar detailform = document.getElementById(\"spxxfirst\");\r\n");
      out.write("\t\tdocument.getElementById(\"num\").value=num;\r\n");
      out.write("\t\tdetailform.target=\"left\";\r\n");
      out.write("\t\tdetailform.action=\"servlet/BuyPage_Buy?mcidxx=\"+spxxmcid;\r\n");
      out.write("\t\tdetailform.submit();}else\r\n");
      out.write("\t\t{alert(\"商品已售馨\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction spxxback()\r\n");
      out.write("\t{\r\n");
      out.write("\t\thistory.go(document.getElementById(\"num\").value-1);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
