package org.apache.jsp.main.sendUserjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.softxm.hs.model.Tuserinfo;

public final class passSendUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"sendusercrud!sendUserPass.action\" class=\"pageForm required-validate\" onsubmit=\"return validateCallback(this,navTabAjaxDone)\">\r\n");
      out.write("\t\t<div class=\"pageFormContent nowrap\" layoutH=\"97\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.print(request.getParameter("suid"));
      out.write("\" name=\"suid\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>审核人:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input readonly=\"readonly\" type=\"text\" name=\"name\" maxlength=\"20\" class=\"required\" value=\"");
      out.print(((Tuserinfo)request.getSession().getAttribute("LOGIN_USER")).getUiusername() );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"info\"></span>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>申请人:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input readonly=\"readonly\" type=\"text\" name=\"suusername\" class=\"required\" value=\"");
      out.print(request.getParameter("suusername"));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<span class=\"info\"></span>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>审核</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fradio_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"info\"></span>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"formBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><div class=\"buttonActive\"><div class=\"buttonContent\"><button type=\"submit\">提交</button></div></div></li>\r\n");
      out.write("\t\t\t\t<li><div class=\"button\"><div class=\"buttonContent\"><button type=\"button\" class=\"close\">取消</button></div></div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_s_005fradio_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_005fradio_005f0 = (org.apache.struts2.views.jsp.ui.RadioTag) _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fradio_005f0.setParent(null);
    // /main/sendUserjsp/passSendUser.jsp(29,5) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setList("#{1:'通过',2:'不通过'}");
    // /main/sendUserjsp/passSendUser.jsp(29,5) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setName("sustatus");
    // /main/sendUserjsp/passSendUser.jsp(29,5) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fradio_005f0.setCssClass("required");
    int _jspx_eval_s_005fradio_005f0 = _jspx_th_s_005fradio_005f0.doStartTag();
    if (_jspx_th_s_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody.reuse(_jspx_th_s_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fradio_0026_005fname_005flist_005fcssClass_005fnobody.reuse(_jspx_th_s_005fradio_005f0);
    return false;
  }
}
