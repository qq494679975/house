package org.apache.jsp.main.menujsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class menulist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
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
      out.write("\t<div id=\"pageContent\">\r\n");
      out.write("<table class=\"table\" width=\"100%\" layoutH=\"50\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"50px\">序号</th>\r\n");
      out.write("\t\t\t<th width=\"200px\" >菜单名称</th>\r\n");
      out.write("\t\t\t<th>菜单连接</th>\r\n");
      out.write("\t\t\t<th width=\"100px\">父类ID</th>\r\n");
      out.write("\t\t\t<th width=\"200px\">排序</th>\r\n");
      out.write("\t\t\t<th width=\"120px\">操作&nbsp&nbsp&nbsp&nbsp<a class=\"add\" href=\"menu/menusCRUD!queryMtoadd\" target=\"navTab\"><span>【添加菜单】</span></a></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t");
 int a = 0; 
      out.write("\r\n");
      out.write("\t\t");
      //  s:iterator
      org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
      _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fiterator_005f0.setParent(null);
      // /main/menujsp/menulist.jsp(17,2) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fiterator_005f0.setStatus("s");
      // /main/menujsp/menulist.jsp(17,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fiterator_005f0.setVar("bigmenu");
      // /main/menujsp/menulist.jsp(17,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fiterator_005f0.setValue("menus.{? #this.dfatherid==0}");
      int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fiterator_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t");
 a++; 
          out.write("\r\n");
          out.write("\t\t\t<td >");
          out.print(a );
          out.write("</td>\r\n");
          out.write("\t\t\t<td align=\"left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.menuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td align=\"center\">父菜单，无连接</td>\r\n");
          out.write("\t\t\t<td align=\"left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.dfatherid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_005fif_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</td>\r\n");
          out.write("\t\t\t<td ><a title=\"修改\" href=\"menu/menusCRUD!queryOneMenu?menuid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"\" target=\"navTab\" class=\"btnView\">编辑</a>\r\n");
          out.write("\t\t\t\t<a title=\"删除\" href=\"menu/menusCRUD!delMenu?menuid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&dfatherid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"ajaxTodo\" class=\"btnDel\">删除</a></td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t\t");
          //  s:iterator
          org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
          _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
          _jspx_th_s_005fiterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
          // /main/menujsp/menulist.jsp(35,3) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fiterator_005f1.setStatus("s");
          // /main/menujsp/menulist.jsp(35,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fiterator_005f1.setVar("smallmenu");
          // /main/menujsp/menulist.jsp(35,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_s_005fiterator_005f1.setValue("menus.{? #this.dfatherid==#bigmenu.menuid}");
          int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
          if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_s_005fiterator_005f1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t");
 a++; 
              out.write("\r\n");
              out.write("\t\t\t<td >");
              out.print(a );
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"right\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.menuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.meunurl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"right\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.dfatherid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"center\">\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t");
              if (_jspx_meth_s_005fif_005f3(_jspx_th_s_005fiterator_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t\t<td ><a title=\"修改\" href=\"menu/menusCRUD!queryOneMenu?menuid=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" target=\"navTab\" class=\"btnView\">编辑</a>\r\n");
              out.write("\t\t\t\t<a title=\"删除\" href=\"menu/menusCRUD!delMenu?menuid=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("&dfatherid=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" target=\"ajaxTodo\" class=\"btnDel\">删除</a></td>\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f1);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /main/menujsp/menulist.jsp(25,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("!#s.first");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"menu/menusCRUD!upmenu?menuid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&seqnum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.seqnum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&dfatherid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"ajaxTodo\" >上移</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /main/menujsp/menulist.jsp(28,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("!#s.last");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"menu/menusCRUD!downmenu?menuid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&seqnum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.seqnum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&dfatherid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bigmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"ajaxTodo\" >下移</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /main/menujsp/menulist.jsp(43,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("!#s.first");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"menu/menusCRUD!upmenu?menuid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&seqnum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.seqnum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&dfatherid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"ajaxTodo\" >上移</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f1);
    // /main/menujsp/menulist.jsp(46,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("!#s.last");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"menu/menusCRUD!downmenu?menuid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.menuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&seqnum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.seqnum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&dfatherid=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smallmenu.dfatherid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"ajaxTodo\" >下移</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }
}
