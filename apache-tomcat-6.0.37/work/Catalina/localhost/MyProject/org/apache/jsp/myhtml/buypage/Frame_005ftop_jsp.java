package org.apache.jsp.myhtml.buypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.boyang.chenweida.dao.*;
import com.boyang.chenweida.bean.McType;
import com.boyang.chenweida.daoimpl.*;
import java.util.*;

public final class Frame_005ftop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/MyProject/css/Frame_top.css\" />\r\n");

	McTypeDao mcType = new McTypeImpl();
	List<McType> allTypes = mcType.getAllType();
	session.setAttribute("allTypes", allTypes);

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar arr = new Array();\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\tvar isok = 0;\r\n");
      out.write("\tfunction mouseOver(obj) {\r\n");
      out.write("\t\tobj.style.backgroundImage = \"url(/MyProject/images/over_b_bg.jpg)\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction mouseOut(obj) {\r\n");
      out.write("\t\tobj.style.backgroundImage = \"url(/MyProject/images/norm_b_bg.jpg)\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar selvalue;\r\n");
      out.write("\tfunction bigSelect() {\r\n");
      out.write("\t\tvar temp = new Array();\r\n");
      out.write("\t\tvar text = new Array();\r\n");
      out.write("\t\ttemp[0] = 0;\r\n");
      out.write("\t\ttext[0] = \"--请选择--\";\r\n");
      out.write("\t\tvar select = document.getElementById(\"thingbig\");\r\n");
      out.write("\t\tvar j = 1;\r\n");
      out.write("\t\tfor ( var i = 0; i < arr.length; i++) {\r\n");
      out.write("\t\t\tif (arr[i][2] == 0) {\r\n");
      out.write("\t\t\t\ttemp[j] = arr[i][0];\r\n");
      out.write("\t\t\t\ttext[j] = arr[i][1];\r\n");
      out.write("\t\t\t\tj++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfor ( var i = 0; i < j; i++) {\r\n");
      out.write("\t\t\tdocument.getElementById(\"thingbig\").add(\r\n");
      out.write("\t\t\t\t\tnew Option(text[i], temp[i]), i);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction test() {\r\n");
      out.write("\t\tvar a = document.getElementById(\"thingbig\");// 得到对象的引用\r\n");
      out.write("\t\tvar little = document.getElementById(\"thingsmall\");// 得到对象的引用\r\n");
      out.write("\t\tlittle.length = 0;\r\n");
      out.write("\t\tselvalue = a.options[a.options.selectedIndex].value;// 得到当前选择的当前对象的值\r\n");
      out.write("\t\tif (selvalue == 0) {\r\n");
      out.write("\t\t\tvar option = new Option();\r\n");
      out.write("\t\t\toption.value = 0;\r\n");
      out.write("\t\t\toption.text = \"--请选择--\";\r\n");
      out.write("\t\t\tlittle.add(option);// 设置到小类对应的下拉列表\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar newoption = new Array();// 定义数组\r\n");
      out.write("\t\t\tvar newindex = new Array();// 记住选择的下标\r\n");
      out.write("\t\t\tvar j = 0;\r\n");
      out.write("\t\t\tfor ( var i = 0; i < arr.length; i++) {\r\n");
      out.write("\t\t\t\tif (arr[i][2] == selvalue) {\r\n");
      out.write("\t\t\t\t\t// 得到对应的小类\r\n");
      out.write("\t\t\t\t\tnewoption[j] = arr[i][1];\r\n");
      out.write("\t\t\t\t\tnewindex[j] = arr[i][0];\r\n");
      out.write("\t\t\t\t\tj++;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar option = new Option();\r\n");
      out.write("\t\t\toption.value = 0;\r\n");
      out.write("\t\t\toption.text = \"--请选择--\";\r\n");
      out.write("\t\t\tlittle.add(option);\r\n");
      out.write("\t\t\tfor ( var i = 1; i < newoption.length + 1; i++) {\r\n");
      out.write("\t\t\t\tvar option = new Option();\r\n");
      out.write("\t\t\t\toption.value = newindex[i - 1];\r\n");
      out.write("\t\t\t\toption.text = newoption[i - 1];\r\n");
      out.write("\t\t\t\tif(arguments[0]==newindex[i - 1])\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\toption.selected=\"selected\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tlittle.add(option);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction go()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar formgo = document.getElementById(\"formgo\");\r\n");
      out.write("\t\tformgo.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction out()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(confirm(\"亲,你确定要离开吗？\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ttop.document.location.href=\"/MyProject/servlet/User_Over\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t///MyProject/servlet/User_Over\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t<img src=\"/MyProject/images/logo.gif\" style=\"margin-top: -30px;\" />\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\"\r\n");
      out.write("\t\t\t\thref=\"/MyProject/myhtml/buypage/Frame.html\" target=\"_top\"\r\n");
      out.write("\t\t\t\tclass=\"tab\" id=\"homepagetab\">首页</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				if (request.getSession().getAttribute("buypage_userName") != null) {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\"\r\n");
      out.write("\t\t\t\thref=\"/MyProject/myhtml/user/left.html\" target=\"left\" class=\"tab\">会员中心</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\"\r\n");
      out.write("\t\t\t\thref=\"/MyProject/login_buypage.html\" target=\"_top\" class=\"tab\">会员中心</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				if (request.getSession().getAttribute("buypage_userName") != null) {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\"\r\n");
      out.write("\t\t\t\thref=\"/MyProject/jsp/buypage/orderquery.jsp\" target=\"right\" class=\"tab\">查看订单&nbsp;&nbsp;&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\"\r\n");
      out.write("\t\t\t\thref=\"/MyProject/login_buypage.html\" target=\"_top\" class=\"tab\">查看订单&nbsp;&nbsp;&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a \r\n");
      out.write("\t\t\t\t");
if (request.getSession().getAttribute("buypage_userName") == null) {
      out.write("\r\n");
      out.write("\t\t\t\ttarget=\"_top\" href=\"/MyProject/login_buypage.html\" ");
} else {
      out.write(" target=\"right\" href=\"/MyProject/myhtml/user/Frame_bottom_left_shop.jsp\" ");
}
      out.write(" class=\"tab1\"\r\n");
      out.write("\t\t\t\tid=\"carts\">购物车</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				if (request.getSession().getAttribute("buypage_userName") == null) {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"/MyProject/login_buypage.html\" target=\"_top\"\r\n");
      out.write("\t\t\t\tclass=\"tab1\">登录</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t<li><a onclick=\"out()\" style=\"color: green\" target=\"_top\"\r\n");
      out.write("\t\t\t\tclass=\"tab1\">用户:");
      out.print(session.getAttribute("buypage_userName"));
      out.write("退出</a> ");

 	}
 
      out.write(' ');

 	if (request.getSession().getAttribute("buypage_userName") == null) {
 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><a href=\"/MyProject/myhtml/buypage/zhuce.html\" target=\"right\"\r\n");
      out.write("\t\t\t\tclass=\"tab1\">注册</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"/MyProject/login_backstage.html\" target=\"_top\"\r\n");
      out.write("\t\t\t\tclass=\"tab1\">后台管理</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"second\" align=\"center\" style=\"margin:5px\">\r\n");
      out.write("\t\t<form action=\"/MyProject/servlet/BuyPage_QueryThing\" method=\"get\"\r\n");
      out.write("\t\t\ttarget=\"right\" id=\"formgo\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>商品搜索</td>\r\n");
      out.write("\t\t\t\t\t<td>商品大类</td>\r\n");
      out.write("\t\t\t\t\t<td><select id=\"thingbig\" name=\"bigtypeid\" onChange=\"test()\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>商品小类</td>\r\n");
      out.write("\t\t\t\t\t<td><select id=\"thingsmall\" name=\"smalltypeid\">\r\n");
      out.write("\t\t\t\t\t\t\t<option selected=\"selected\" value=\"0\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>关键字[商品名称]</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-bottom:8px\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"text\" name=\"mcname\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"padding-top:-30px\"> <img alt=\"查询\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/MyProject/images/search.gif\" onclick=\"go()\"/></span>\r\n");
      out.write("\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /myhtml/buypage/Frame_top.jsp(31,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/buypage/Frame_top.jsp(31,1) '${allTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /myhtml/buypage/Frame_top.jsp(31,1) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("s");
    // /myhtml/buypage/Frame_top.jsp(31,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("small");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\r\n");
          out.write("\tarr[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = new Array(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${small.goodstypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${small.typename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${small.fatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /myhtml/buypage/Frame_top.jsp(204,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("bigtype");
    // /myhtml/buypage/Frame_top.jsp(204,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/buypage/Frame_top.jsp(204,7) '${allTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /myhtml/buypage/Frame_top.jsp(205,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigtype.fatherid==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigtype.goodstypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigtype.typename}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
