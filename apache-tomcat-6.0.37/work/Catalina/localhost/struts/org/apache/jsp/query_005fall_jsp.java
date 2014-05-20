package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class query_005fall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("    <title>My JSP 'query.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction $(id){\r\n");
      out.write(" \t\treturn document.getElementById(id);\r\n");
      out.write("\t}\r\n");
      out.write(" \tfunction getinfo(userid){\r\n");
      out.write("  \t\tdocument.getElementById(\"infouserid\").value=$(\"userid_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infousername\").value=$(\"username_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"inforealname\").value=$(\"realname_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infopwd\").value=$(\"pwd_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infosex\").value=$(\"sex_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infonativeplace\").value=$(\"nativeplace_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infoidcardno\").value=$(\"idcardno_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infophone\").value=$(\"phone_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infoemail\").value=$(\"email_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infomobile\").value=$(\"mobile_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infoaddress\").value=$(\"address_\"+userid).value;\r\n");
      out.write("  \t\tdocument.getElementById(\"infomarital\").value=$(\"marital_\"+userid).value;\r\n");
      out.write("  \t\twindow.showModalDialog(\"");
      out.print(path);
      out.write("/query_user.jsp\",this,\"width=200px,height=200px\");\r\n");
      out.write("\t }\r\n");
      out.write("\tfunction edit(userid){\r\n");
      out.write("\t\tvar id=document.getElementById(\"userid_\"+userid);\r\n");
      out.write("\t\tvar username=document.getElementById(\"username_\"+userid);\r\n");
      out.write("\t\tvar realname=document.getElementById(\"realname_\"+userid);\r\n");
      out.write("\t\tvar pwd=document.getElementById(\"pwd_\"+userid);\r\n");
      out.write("\t\tvar sex=document.getElementById(\"sex_\"+userid);\r\n");
      out.write("\t\tvar nativeplace=document.getElementById(\"nativeplace_\"+userid);\r\n");
      out.write("\t\tvar idcardno=document.getElementById(\"idcardno_\"+userid);\r\n");
      out.write("\t\tvar phone=document.getElementById(\"phone_\"+userid);\r\n");
      out.write("\t\tvar email=document.getElementById(\"email_\"+userid);\r\n");
      out.write("\t\tvar mobile=document.getElementById(\"mobile_\"+userid);\r\n");
      out.write("\t\tvar address=document.getElementById(\"address_\"+userid);\r\n");
      out.write("\t\tvar marital=document.getElementById(\"marital_\"+userid);\r\n");
      out.write("\t\tid.readOnly=false;\r\n");
      out.write("\t\tusername.readOnly=false;\r\n");
      out.write("\t\trealname.readOnly=false;\r\n");
      out.write("\t\tpwd.readOnly=false;\r\n");
      out.write("\t\tsex.readOnly=false;\r\n");
      out.write("\t\tnativeplace.readOnly=false;\r\n");
      out.write("\t\tidcardno.readOnly=false;\r\n");
      out.write("\t\tphone.readOnly=false;\r\n");
      out.write("\t\temail.readOnly=false;\r\n");
      out.write("\t\tmobile.readOnly=false;\r\n");
      out.write("\t\taddress.readOnly=false;\r\n");
      out.write("\t\tmarital.readOnly=false;\r\n");
      out.write("\t\tvar compile=document.getElementById(\"compile_\"+userid);\r\n");
      out.write("\t\tcompile.value=\"保存\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction save(userid){\r\n");
      out.write("\t\tvar id=document.getElementById(\"userid_\"+userid);\r\n");
      out.write("\t\tvar username=document.getElementById(\"username_\"+userid);\r\n");
      out.write("\t\tvar realname=document.getElementById(\"realname_\"+userid);\r\n");
      out.write("\t\tvar pwd=document.getElementById(\"pwd_\"+userid);\r\n");
      out.write("\t\tvar sex=document.getElementById(\"sex_\"+userid);\r\n");
      out.write("\t\tvar nativeplace=document.getElementById(\"nativeplace_\"+userid);\r\n");
      out.write("\t\tvar idcardno=document.getElementById(\"idcardno_\"+userid);\r\n");
      out.write("\t\tvar phone=document.getElementById(\"phone_\"+userid);\r\n");
      out.write("\t\tvar email=document.getElementById(\"email_\"+userid);\r\n");
      out.write("\t\tvar mobile=document.getElementById(\"mobile_\"+userid);\r\n");
      out.write("\t\tvar address=document.getElementById(\"address_\"+userid);\r\n");
      out.write("\t\tvar marital=document.getElementById(\"marital_\"+userid);\r\n");
      out.write("\t\tid.readOnly=true;\r\n");
      out.write("\t\tusername.readOnly=true;\r\n");
      out.write("\t\trealname.readOnly=true;\r\n");
      out.write("\t\tpwd.readOnly=true;\r\n");
      out.write("\t\tsex.readOnly=true;\r\n");
      out.write("\t\tnativeplace.readOnly=true;\r\n");
      out.write("\t\tidcardno.readOnly=true;\r\n");
      out.write("\t\tphone.readOnly=true;\r\n");
      out.write("\t\temail.readOnly=true;\r\n");
      out.write("\t\tmobile.readOnly=true;\r\n");
      out.write("\t\taddress.readOnly=true;\r\n");
      out.write("\t\tmarital.readOnly=true;\r\n");
      out.write("\t\tdocument.getElementById(\"compile_\"+userid).value=\"编辑\";\r\n");
      out.write("\t\tlocation.href=\"");
      out.print(path);
      out.write("/user/UserAction!queryUser\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("<form method=\"post\" action=\"user/UserAction!query\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>用户ID</th>\r\n");
      out.write("        <th>用户名</th>\r\n");
      out.write("        <th>真实姓名</th>\r\n");
      out.write("        <th>密码</th>\r\n");
      out.write("        <th>性别</th>\r\n");
      out.write("        <th>籍贯</th>\r\n");
      out.write("        <th>身份证号码</th>\r\n");
      out.write("        <th>电话号码</th>\r\n");
      out.write("        <th>电子邮件</th>\r\n");
      out.write("        <th>手机</th>\r\n");
      out.write("        <th>住址</th>\r\n");
      out.write("        <th>婚否</th>\r\n");
      out.write("        <th>\r\n");
      out.write("          <input type=\"submit\" value=\"查询列表\" />\r\n");
      out.write("          <input type=\"button\" value=\"添加用户\" onclick=\"location.href='");
      out.print(path);
      out.write("/save_user.jsp';\" />\r\n");
      out.write("        </th>\r\n");
      out.write("      </tr>\r\n");
      out.write("</form>\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" id=\"infouserid\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infousername\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"inforealname\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infopwd\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infosex\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infonativeplace\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infoidcardno\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infophone\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infoemail\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infomobile\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infoaddress\" value=\"\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"infomarital\" value=\"\"/>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /query_all.jsp(125,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    // /query_all.jsp(125,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/query_all.jsp(125,0) '${requestScope.userList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.userList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <tr>\r\n");
          out.write("        <td><input id=\"userid_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"  name=\"userid\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"2\" /></td>\r\n");
          out.write("        <td><input id=\"username_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"username\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"5\" /></td>\r\n");
          out.write("        <td><input id=\"realname_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"realname\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"5\" /></td>\r\n");
          out.write("        <td><input id=\"pwd_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"pwd\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.pwd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"5\" /></td>\r\n");
          out.write("        <td><input id=\"sex_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"sex\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"5\" /></td>\r\n");
          out.write("        <td><input id=\"nativeplace_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"nativeplace\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.nativeplace}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"5\" /></td>\r\n");
          out.write("        <td><input id=\"idcardno_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"idcardno\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"20\" /></td>\r\n");
          out.write("        <td><input id=\"phone_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"phone\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"10\" /></td>\r\n");
          out.write("        <td><input id=\"email_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"email\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"10\" /></td>\r\n");
          out.write("        <td><input id=\"mobile_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"mobile\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"10\" /></td>\r\n");
          out.write("        <td><input id=\"address_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"address\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"10\" /></td>\r\n");
          out.write("        <td><input id=\"marital_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"marital\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.marital}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"readonly\" size=\"2\" /></td>\r\n");
          out.write("        <td>\r\n");
          out.write("          <input type=\"button\" value=\"查看\" onclick=\"getinfo(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\" />\r\n");
          out.write("          <input id=\"compile_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"button\" value=\"编辑\" onclick=\"javascript:document.getElementById('compile_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("').value=='编辑'?edit('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'):save(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\" />\r\n");
          out.write("        </td>\r\n");
          out.write("      </tr>\r\n");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
