package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.boyang.chenweida.dao.*;
import com.boyang.chenweida.bean.McType;
import com.boyang.chenweida.daoimpl.*;

public final class tianjia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>My JSP 'tianjia.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/MyProject/css/reset.css\">\r\n");
      out.write("\r\n");

	McTypeDao mcType = new McTypeImpl();
	List<McType> allTypes = mcType.getAllType();

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
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
      out.write("\t\t\toption.value = -1;\r\n");
      out.write("\t\t\toption.text = \"--请选择--\";\r\n");
      out.write("\t\t\tlittle.add(option);\r\n");
      out.write("\t\t\tfor ( var i = 1; i < newoption.length + 1; i++) {\r\n");
      out.write("\t\t\t\tvar option = new Option();\r\n");
      out.write("\t\t\t\toption.value = newindex[i - 1];\r\n");
      out.write("\t\t\t\toption.text = newoption[i - 1];\r\n");
      out.write("\t\t\t\tlittle.add(option);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction $(name)\r\n");
      out.write("\t{\treturn document.getElementById(name);\r\n");
      out.write("\t}\r\n");
      out.write("\t// 判断是否为空\r\n");
      out.write("\tfunction isNotNull(str) {\r\n");
      out.write("\t\tif (str == \"\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\tvar patt = new RegExp(\"^[ ]+$\");\r\n");
      out.write("\t\treturn !patt.test(str);\r\n");
      out.write("\t}\r\n");
      out.write("\t//判断商品名称\r\n");
      out.write("\tfunction mcname()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"tjname\").value;\r\n");
      out.write("\t\tif (isNotNull(mcname)) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"商品名称不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//判断大类ID\r\n");
      out.write("\tfunction bigid()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"thingbig\").value;\r\n");
      out.write("\t\tif (mcname!=-1) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"大类id不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//判断小类ID\r\n");
      out.write("\tfunction smallid()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"thingsmall\").value;\r\n");
      out.write("\t\tif (mcname!=-1) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"小类id不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//判断商品名称\r\n");
      out.write("\tfunction mcprice()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"tjprice\").value;\r\n");
      out.write("\t\tif (isNotNull(mcname)) {\r\n");
      out.write("\t\t\tvar patt = new RegExp(\"^[0-9]+[.]{0,1}[0-9]{0,2}$\");\r\n");
      out.write("\t\t\tif (patt.test(mcname)) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"价格格式错误数字，只能是数字，且位数只可以是两位\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"价格不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//判断图片\r\n");
      out.write("\r\n");
      out.write("\tfunction mcpic()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"tjpic\").value;\r\n");
      out.write("\t\tif (isNotNull(mcname)) {\r\n");
      out.write("\t\t\tvar extend = $(\"tjpic\").value.substring($(\"tjpic\").value.lastIndexOf(\".\")+1);\r\n");
      out.write("\t\t\tif(!(extend==\"jpg\"||extend==\"gif\"||extend==\"png\"||extend==\"bmp\")){\r\n");
      out.write("   \t\t\t\talert(\"请上传后缀名为jpg,gif,png,bmp的文件!\"); \r\n");
      out.write("   \t\t\t\treturn false; \r\n");
      out.write("\t\t\t\t}else {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\talert(\"图片不能为空\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction mcdesr()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar mcname= $(\"tjdesr\").value;\r\n");
      out.write("\t\t\tif (isNotNull(mcname)) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"商品描述不能为空\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction allisok()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(mcname() && bigid() && smallid() && mcprice() && mcpic()&& mcdesr())\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"提交成功\");\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction textCounter(field,counter,maxlimit,linecounter) {\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"/MyProject/servlet/System_McAdd\" method=\"post\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\" onsubmit=\"return allisok()\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><br>商品名称:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"tjname\" name=\"mcname\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>所属大类:</td>\r\n");
      out.write("\t\t\t\t<td><select name=\"bigtypeid\" id=\"thingbig\" onChange=\"test1()\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t");

							for (int i = 0; i < allTypes.size(); i++) {
								if (allTypes.get(i).getFatherid() == 0) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option value=\"");
      out.print(allTypes.get(i).getGoodstypeid());
      out.write('"');
      out.write('>');
      out.print(allTypes.get(i).getTypename());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t");

							}
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>所属小类:</td>\r\n");
      out.write("\t\t\t\t<td><select name=\"smalltypeid\" id=\"thingsmall\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>商品价格:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"tjprice\" type=\"text\" value=\"\" name=\"price\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>添加时间:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" value=\"");
      out.print(new Date().toLocaleString());
      out.write("\"\r\n");
      out.write("\t\t\t\t\tname=\"createdate\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>商品图片:</td>\r\n");
      out.write("\t\t\t\t<td><input  id=\"tjpic\" type=\"file\" value=\"\" name=\"pic\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>商品描述:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<textarea rows=\"5\" cols=\"40\" name=\"mcdecr\" id=\"tjdesr\" \r\n");
      out.write("\t\t\t\t\t\t\tonKeyDown=\"textCounter(this,'progressbar1',300)\" \r\n");
      out.write("\t\t\t\t\t\t\tonKeyUp=\"textCounter(this,'progressbar1',300)\" \r\n");
      out.write("\t\t\t\t\t\t\tonFocus=\"textCounter(this,'progressbar1',300)\" ></textarea><br />\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"progressbar1\" class=\"progress\"></div>\r\n");
      out.write("\t\t\t\t\t<script>textCounter(document.getElementById(\"tjdesr\"),\"progressbar1\",300);</script>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>是否缺货:</td>\r\n");
      out.write("\t\t\t\t<td><select name=\"flag\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">是</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">否</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"提交\"\r\n");
      out.write("\t\t\t\t\tname=\"tijiao\" />&nbsp;<input type=\"reset\" value=\"重置\"\r\n");
      out.write("\t\t\t\t\tname=\"chongzhi\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
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
    // /myhtml/backstage/tianjia.jsp(32,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/tianjia.jsp(32,1) '${allTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /myhtml/backstage/tianjia.jsp(32,1) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("s");
    // /myhtml/backstage/tianjia.jsp(32,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
}
