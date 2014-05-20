package org.apache.jsp.main.menujsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody.release();
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
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function readSelect(key)\r\n");
      out.write("{\r\n");
      out.write("\tvar aaa = document.getElementById(\"aaa\");\r\n");
      out.write("\tvar url = \"menucrud!menuIsOnly.action?_=\"+new Date().getTime()+\"&mfatherid=\"+key;\r\n");
      out.write("\taaa.setAttribute(\"remote\",url);\r\n");
      out.write("\tvar menuurltext = document.getElementById(\"menuurltext\");\r\n");
      out.write("\tif(key>0){\r\n");
      out.write("\tmenuurltext.removeAttribute(\"readonly\");\r\n");
      out.write("\tmenuurltext.setAttribute(\"class\",\"required\");\r\n");
      out.write("\t}else\r\n");
      out.write("\t{\r\n");
      out.write("\t\tmenuurltext.setAttribute(\"readonly\", \"readonly\");\r\n");
      out.write("\t\tmenuurltext.removeAttribute(\"class\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeRemote()\r\n");
      out.write("{\r\n");
      out.write("\tvar aaa = document.getElementById(\"aaa\");\r\n");
      out.write("\tvar remotevalue =document.getElementById(\"xxxx\").value;\r\n");
      out.write("\tvar url = \"menucrud!menuIsOnly.action?_=\"+new Date().getTime()+\"&mfatherid=\"+remotevalue;\r\n");
      out.write("\taaa.setAttribute(\"remote\",url);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t<form method=\"post\" action=\"menucrud!newMenu.action\"\r\n");
      out.write("\t\tclass=\"pageForm required-validate\"\r\n");
      out.write("\t\tonsubmit=\"return validateCallback(this,navTabAjaxDone)\">\r\n");
      out.write("\t\t<div class=\"pageFormContent nowrap\" layoutH=\"97\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t父类别名称:\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t不选默认父菜单\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t菜单名称:\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"mname\" id=\"aaa\" class=\"required\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"changeRemote()\" remote=\"menucrud!menuIsOnly.action?_=");
      out.print(new Date().getTime());
      out.write("&mfatherid=0\"\r\n");
      out.write("\t\t\t\t\t\t/><font style=\"color: red\">不许与所在类其他菜单重复</font>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t菜单连接:\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input id=\"menuurltext\" size=\"40\" readonly=\"readonly\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tname=\"murl\" />\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"formBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"buttonActive\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"buttonContent\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t提交\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"buttonContent\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\">\r\n");
      out.write("\t\t\t\t\t\t\t\t取消\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /main/menujsp/addmenu.jsp(39,5) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("menusMap");
    // /main/menujsp/addmenu.jsp(39,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("xxxx");
    // /main/menujsp/addmenu.jsp(39,5) name = onchange type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setOnchange("readSelect(this.value)");
    // /main/menujsp/addmenu.jsp(39,5) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("0");
    // /main/menujsp/addmenu.jsp(39,5) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("请选择");
    // /main/menujsp/addmenu.jsp(39,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("mfatherid");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fonchange_005fname_005flist_005fid_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }
}
