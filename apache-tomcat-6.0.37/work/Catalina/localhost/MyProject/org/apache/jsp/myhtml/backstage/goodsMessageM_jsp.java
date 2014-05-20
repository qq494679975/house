package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.boyang.chenweida.dao.*;
import com.boyang.chenweida.bean.McType;
import com.boyang.chenweida.daoimpl.*;

public final class goodsMessageM_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/MyProject/css/goodsMessageM.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/MyProject/css/reset.css\">\r\n");
 McTypeDao mcType = new McTypeImpl();
	List<McType> allTypes = mcType.getAllType();
	
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar arr = new Array();\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\tvar selvalue;\r\n");
      out.write("\tfunction test1() {\r\n");
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
      out.write("\tfunction typeBack(bigtypeid,smalltypeid)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(bigtypeid){\r\n");
      out.write("\t\tvar big = document.getElementById(\"thingbig\");\r\n");
      out.write("\t\tbig.value=bigtypeid;\r\n");
      out.write("\t\ttest1(smalltypeid);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction gmmdel(mcid)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar a = window.confirm(\"确认删除商品？\");\r\n");
      out.write("\t\tvar pic =document.getElementById(mcid);\r\n");
      out.write("\t\tvar picstr = pic.value.split(\".\");\r\n");
      out.write("\t\tif(a==true){\r\n");
      out.write("\t\t\tvar gmmform = document.getElementById(\"gmmform\");\r\n");
      out.write("\t\t\tgmmform.action=\"/MyProject/servlet/System_McMessageDel?mcid=\"+mcid+\"&pic=\"+picstr[0]+\"&pictype=\"+picstr[1];\r\n");
      out.write("\t\t\tgmmform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction gmmupdate(mcid)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar gmmform = document.getElementById(\"gmmform\");\r\n");
      out.write("\t\tgmmform.action=\"/MyProject/servlet/System_McMessageUpdate?mcid=\"+mcid\r\n");
      out.write("\t\t");
      out.write("gmmform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction addMc()\r\n");
      out.write("\t{\r\n");
      out.write("\t\twindow.location.href=\"/MyProject/myhtml/backstage/tianjia.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"typeBack(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty param.bigtypeid?\"0\":param.bigtypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty param.smalltypeid?\"0\":param.smalltypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\">\r\n");
      out.write("\t<div class=\"div1\">&nbsp;  \r\n");
      out.write("\t\t<input type=\"button\" value=\"添加商品\" onclick=\"addMc()\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("<form method=\"post\" action=\"/MyProject/servlet/System_McMessageQuery\" id=\"gmmform\">\r\n");
      out.write("\t<div class=\"div2\">\r\n");
      out.write("\t\t所属大类<select id=\"thingbig\" name=\"bigtypeid\" onChange=\"test1()\">\r\n");
      out.write("\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t\t");
for(int i =0;i<allTypes.size();i++){ 
				if(allTypes.get(i).getFatherid()==0){
			
      out.write("\r\n");
      out.write("\t\t\t<option value=\"");
      out.print(allTypes.get(i).getGoodstypeid());
      out.write('"');
      out.write(' ');
      out.write(' ');
      out.print(String.valueOf(allTypes.get(i).getGoodstypeid()).equals(request.getParameter("bigtypeid")) ?"selected='selected'":"");
      out.write('>');
      out.print(allTypes.get(i).getTypename());
      out.write("</option>\r\n");
      out.write("\t\t\t");
}}
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</select> 所属小类<select id=\"thingsmall\" name=\"smalltypeid\">\r\n");
      out.write("\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t</select> 关键字\r\n");
      out.write("\t\t<input type=\"text\" class=\"text\" name=\"mcname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.mcname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/> 价格\r\n");
      out.write("\t\t<select style=\"width: 200px;\" name=\"gmmprice\" >\r\n");
      out.write("\t\t\t<option value=\"-1\">--------请选择---------</option>\r\n");
      out.write("\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==1?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" >0---------------500</option>\r\n");
      out.write("\t\t\t<option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==2?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">500------------2000</option>\r\n");
      out.write("\t\t\t<option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==3?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">2000-----------4000</option>\r\n");
      out.write("\t\t\t<option value=\"4\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==4?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">4000-----------7000</option>\r\n");
      out.write("\t\t\t<option value=\"5\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==5?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">7000----------10000</option>\r\n");
      out.write("\t\t\t<option value=\"6\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice==6?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">10000以上</option>\r\n");
      out.write("\t\t\t<option></option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"查询\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<div class=\"div3\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width: 210px\">商品图片</th>\r\n");
      out.write("\t\t\t\t<th style=\"width: 310px\">名称</th>\r\n");
      out.write("\t\t\t\t<th style=\"width: 210px\">单价</th>\r\n");
      out.write("\t\t\t\t<th style=\"width: 210px\">是否缺货</th>\r\n");
      out.write("\t\t\t\t<th style=\"width: 210px\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<div class=\"div4\">\r\n");
      out.write("\t<form action=\"/MyProject/servlet/System_McMessageQuery\" method=\"get\" id=\"pageForm\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"bigtypeid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bigtypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"smalltypeid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.smalltypeid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"mcname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.mcname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"gmmprice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.gmmprice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pageBar.jsp", out, false);
      out.write("\r\n");
      out.write("\t</form>\r\n");
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
    // /myhtml/backstage/goodsMessageM.jsp(30,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/goodsMessageM.jsp(30,1) '${allTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /myhtml/backstage/goodsMessageM.jsp(30,1) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("s");
    // /myhtml/backstage/goodsMessageM.jsp(30,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /myhtml/backstage/goodsMessageM.jsp(150,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagemodel.allCount==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<h1 style=\"text-align: center;size: 100px;\">无记录</h1>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /myhtml/backstage/goodsMessageM.jsp(154,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("pmmc");
    // /myhtml/backstage/goodsMessageM.jsp(154,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/goodsMessageM.jsp(154,3) '${pagemodel.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pagemodel.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<th style=\"width: 210px\"><img style=\"width:80px;\" src=\"mcimage/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.pic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/></th>\r\n");
          out.write("\t\t\t\t<th style=\"width: 310px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.mcname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t<th style=\"width: 210px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.price}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t<th style=\"width: 210px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.flag==0?\"缺货\":\"有货\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t<th style=\"width: 210px\">\r\n");
          out.write("\t\t\t\t\t<input type=\"button\" value=\"修改\" onclick=\"gmmupdate(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.mcid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"/>\r\n");
          out.write("\t\t\t\t\t<input type=\"button\" value=\"删除\" onclick=\"gmmdel(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.mcid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"/>\r\n");
          out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.pic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pmmc.mcid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t</th>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
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
}
