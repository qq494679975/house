package org.apache.jsp.myhtml.backstage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.boyang.chenweida.dao.McTypeDao;
import com.boyang.chenweida.daoimpl.McTypeImpl;
import com.boyang.chenweida.bean.McType;

public final class tableAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<title>My JSP 'tableAdd.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");

	McTypeDao mcType = new McTypeImpl();
	List<McType> allTypes = mcType.getAllType();
	session.setAttribute("allTypes", allTypes);

      out.write("\r\n");
      out.write("<link href=\"/MyProject/css/tableAdd.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<script>\r\n");
      out.write("var arr = new Array();\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("function $(id) {\r\n");
      out.write("\treturn document.getElementById(id);\r\n");
      out.write("}\r\n");
      out.write("function newAdd() {\r\n");
      out.write("\tvar fatherid = $(\"tafatherid\");\r\n");
      out.write("\tvar McType =$(\"taMcType\");\r\n");
      out.write("\tif(isok(McType.value)==true){\r\n");
      out.write("\t\tvar a = 0;\r\n");
      out.write("\t\tfor(var i=0;i<arr.length;i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(arr[i][1]==McType.value)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\ta = 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(a==0){\r\n");
      out.write("\t\t\tvar taform = $(\"taform\");\r\n");
      out.write("\t\t\ttaform.action=\"/MyProject/servlet/System_McTypeAdd?McType=\"+McType.value+\"&fatherid=\"+fatherid.value;\r\n");
      out.write("\t\t\ttaform.submit();\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t\talert(\"加入的类名重复\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"加入的类名长度必须在3-15\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function add() {\r\n");
      out.write("\t// 得到tbody节点\r\n");
      out.write("\tvar tab = $(\"table\").lastChild;\r\n");
      out.write("\tfor ( var i = 0; i < arr.length; i++) {\r\n");
      out.write("\t\tif (arr[i][2] == 0) {\r\n");
      out.write("\t\t\t// 添加父亲\r\n");
      out.write("\t\t\taddFatherTd(tab, arr[i][0], arr[i][1], arr[i][2]);\r\n");
      out.write("\t\t\tfor ( var j = 0; j < arr.length; j++) {\r\n");
      out.write("\t\t\t\t// 添加孩子\r\n");
      out.write("\t\t\t\tif (arr[j][2] == arr[i][0]) {\r\n");
      out.write("\t\t\t\t\taddSonTd(tab, arr[j][0], arr[j][1], arr[j][2]);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addFatherTd(tab, t1, t2, t3) {\r\n");
      out.write("\t// 等到位置\r\n");
      out.write("\tvar len = tab.rows.length;\r\n");
      out.write("\t// 添加tr\r\n");
      out.write("\tvar mytr = tab.insertRow(len);\r\n");
      out.write("\r\n");
      out.write("\t// 添加td\r\n");
      out.write("\tvar td1 = mytr.insertCell(0);\r\n");
      out.write("\tvar td2 = mytr.insertCell(1);\r\n");
      out.write("\tvar td3 = mytr.insertCell(2);\r\n");
      out.write("\tvar td4 = mytr.insertCell(3);\r\n");
      out.write("\r\n");
      out.write("\t// 添加td的样式\r\n");
      out.write("\ttd1.style.border = \"dashed\";\r\n");
      out.write("\ttd2.style.border = \"dashed\";\r\n");
      out.write("\ttd3.style.border = \"dashed\";\r\n");
      out.write("\ttd4.style.border = \"dashed\";\r\n");
      out.write("\ttd1.style.textAlign = \"center\";\r\n");
      out.write("\r\n");
      out.write("\ttd1.innerHTML = t1\r\n");
      out.write("\t\t\t+ \"<img onclick='clickimg(this)' src='/MyProject/images/-.gif' alt='change' id='\"\r\n");
      out.write("\t\t\t+ t1 + \"'/>\";\r\n");
      out.write("\ttd2.innerHTML = \"<input type='text' id='text\"+t1+\"' value='\" + t2 + \"'/>\";\r\n");
      out.write("\ttd3.innerHTML = t3;\r\n");
      out.write("\ttd4.innerHTML = \"<input type='button' value='修改' onclick = 'change(\"+t1+\")'/><input type='button' value='删除' onclick = 'del(\"+t1+\")'/>\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addSonTd(tab, t1, t2, t3) {\r\n");
      out.write("\tvar len = tab.rows.length;\r\n");
      out.write("\tvar mytr = tab.insertRow(len);\r\n");
      out.write("\r\n");
      out.write("\tvar td1 = mytr.insertCell(0);\r\n");
      out.write("\tvar td2 = mytr.insertCell(1);\r\n");
      out.write("\tvar td3 = mytr.insertCell(2);\r\n");
      out.write("\tvar td4 = mytr.insertCell(3);\r\n");
      out.write("\r\n");
      out.write("\tmytr.setAttribute(\"id\", t3);\r\n");
      out.write("\t\r\n");
      out.write("\ttd2.style.border = \"dashed\";\r\n");
      out.write("\t\r\n");
      out.write("\ttd3.style.border = \"dashed\";\r\n");
      out.write("\ttd4.style.border = \"dashed\";\r\n");
      out.write("\r\n");
      out.write("\ttd1.style.textAlign = \"center\";\r\n");
      out.write("\ttd2.style.textAlign = \"right\";\r\n");
      out.write("\ttd3.style.textAlign = \"right\";\r\n");
      out.write("\r\n");
      out.write("\ttd1.innerHTML = t1;\r\n");
      out.write("\ttd2.innerHTML = \"<input type='text' id='text\"+t1+\"' value='\" + t2 + \"'/>\";\r\n");
      out.write("\ttd3.innerHTML = t3;\r\n");
      out.write("\ttd4.innerHTML = \"<input type='button' value='修改' onclick = 'change(\"+t1+\")'/><input type='button' value='删除' onclick = 'del(\"+t1+\")'/>\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function clickimg(img) {\r\n");
      out.write("\tvar tr = document.getElementsByTagName(\"tr\");\r\n");
      out.write("\tfor(var i=0;i<tr.length;i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(tr[i].id==img.id)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif (tr[i].style.display == \"none\") {\r\n");
      out.write("\t\t\tif (window.XMLHttpRequest)\r\n");
      out.write("\t\t\t\t  {// code for IE7, Firefox, Opera, etc.\r\n");
      out.write("\t\t\t\t\ttr[i].style.display = \"table-row\";\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\telse if (window.ActiveXObject)\r\n");
      out.write("\t\t\t\t  {// code for IE6, IE5\r\n");
      out.write("\t\t\t\t\ttr[i].style.display = \"block\";\r\n");
      out.write("\t\t\t\t  }else\r\n");
      out.write("\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\ttr[i].style.display = \"table-row\";\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\timg.src=\"/MyProject/images/-.gif\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\ttr[i].style.display = \"none\";\r\n");
      out.write("\t\t\t\timg.src=\"/MyProject/images/+.gif\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function del(goodid) {\r\n");
      out.write("\tvar aa = confirm(\"如果删除的是父节点，将删除对应的子节点,并且删除对应的节点下面的商品,确定删除?\")\r\n");
      out.write("\tif(aa==true){\r\n");
      out.write("\tvar taform = $(\"taform\");\r\n");
      out.write("\tvar text = $(\"text\"+goodid);\r\n");
      out.write("\ttaform.action=\"/MyProject/servlet/System_MctypeDel?goodid=\"+goodid+\"&goodname=\"+text.value;\r\n");
      out.write("\ttaform.submit();}\r\n");
      out.write("}\r\n");
      out.write("function change(goodid) {\r\n");
      out.write("\tvar aa = confirm(\"确认更新该类名称？\")\r\n");
      out.write("\tif(aa==true){\r\n");
      out.write("\tvar taform = $(\"taform\");\r\n");
      out.write("\tvar text = $(\"text\"+goodid);\r\n");
      out.write("\ttaform.action=\"/MyProject/servlet/System_McTypeUpdate?goodid=\"+goodid+\"&goodname=\"+text.value;\r\n");
      out.write("\ttaform.submit();}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function isok(username)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(username.length>=3&username.length<=15)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"add()\">\r\n");
      out.write("\t<div id=\"div\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"添加类别\" onclick=\"newAdd()\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"div1\">\r\n");
      out.write("\t\t<form action=\"\" method=\"post\" id=\"taform\">\r\n");
      out.write("\t\t\t<table id=\"table\">\r\n");
      out.write("\t\t\t\t<tr style=\"background-color: blue;\">\r\n");
      out.write("\t\t\t\t\t<th id=\"bh\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th id=\"lbmc\">类别名称</th>\r\n");
      out.write("\t\t\t\t\t<th id=\"flbmc\">父类别编号</th>\r\n");
      out.write("\t\t\t\t\t<th id=\"cc\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"div2\">\r\n");
      out.write("\t\t<span>类别名称:<input type=\"text\" id=\"taMcType\" /> 不能重复，3-15</span> <span>父类名称:\r\n");
      out.write("\r\n");
      out.write("\t\t\t<select id=\"tafatherid\">\r\n");
      out.write("\t\t\t\t<option value=\"-1\">无</option>\r\n");
      out.write("\t\t\t\t");

					for (int i = 0; i < allTypes.size(); i++) {
						if (allTypes.get(i).getFatherid() == 0) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"");
      out.print(allTypes.get(i).getGoodstypeid());
      out.write('"');
      out.write('>');
      out.print(allTypes.get(i).getTypename());
      out.write("\r\n");
      out.write("\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t");

					}
					}
				
      out.write("\r\n");
      out.write("\t\t</select>大类父类为无</span>\r\n");
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
    // /myhtml/backstage/tableAdd.jsp(31,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/myhtml/backstage/tableAdd.jsp(31,0) '${allTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /myhtml/backstage/tableAdd.jsp(31,0) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("s");
    // /myhtml/backstage/tableAdd.jsp(31,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
