package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collection;
import java.util.Iterator;
import org.apache.catalina.manager.JspHelper;
import org.apache.catalina.Session;

public final class sessionsList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html \n");
      out.write("     PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write("     \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n");
 String path = (String) request.getAttribute("path");
   String submitUrl = JspHelper.escapeXml(response.encodeURL(
           ((HttpServletRequest) pageContext.getRequest()).getRequestURI() +
           "?path=" + path));
   Collection activeSessions = (Collection) request.getAttribute("activeSessions");

      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\"/>\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\"/><!-- HTTP 1.0 -->\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache,must-revalidate\"/><!-- HTTP 1.1 -->\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\"/><!-- 0 is an invalid value and should be treated as 'now' -->\n");
      out.write("\t<meta http-equiv=\"content-language\" content=\"en\"/>\n");
      out.write("\t<meta name=\"author\" content=\"Cedrik LIME\"/>\n");
      out.write("\t<meta name=\"copyright\" content=\"copyright 2005-2013 the Apache Software Foundation\"/>\n");
      out.write("\t<meta name=\"robots\" content=\"noindex,nofollow,noarchive\"/>\n");
      out.write("\t<title>Sessions Administration for ");
      out.print( JspHelper.escapeXml(path) );
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Sessions Administration for ");
      out.print( JspHelper.escapeXml(path) );
      out.write("</h1>\n");
      out.write("\n");
      out.write("<p>Tips:</p>\n");
      out.write("<ul>\n");
      out.write("\t<li>Click on a column to sort.</li>\n");
      out.write("\t<li>To view a session details and/or remove a session attributes, click on its id.</li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"error\">");
      out.print( JspHelper.escapeXml(request.getAttribute("error")) );
      out.write("</div>\n");
      out.write("<div class=\"message\">");
      out.print( JspHelper.escapeXml(request.getAttribute("message")) );
      out.write("</div>\n");
      out.write("\n");
      out.write("<form action=\"");
      out.print( submitUrl );
      out.write("\" method=\"post\" id=\"sessionsForm\">\n");
      out.write("\t<fieldset><legend>Active HttpSessions informations</legend>\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" id=\"sessionsFormAction\" value=\"injectSessions\"/>\n");
      out.write("\t\t<input type=\"hidden\" name=\"sort\" id=\"sessionsFormSort\" value=\"");
      out.print( JspHelper.escapeXml(request.getAttribute("sort")) );
      out.write("\"/>\n");
      out.write("\t\t");
 String order = (String) request.getAttribute("order");
		   if (order == null || "".equals(order)) {
		   	order = "ASC";
		   }
		
      out.write("\n");
      out.write("\t\t<input type=\"hidden\" name=\"order\" id=\"sessionsFormSortOrder\" value=\"");
      out.print( JspHelper.escapeXml(order) );
      out.write("\"/>\n");
      out.write("\t\t<input type=\"submit\" name=\"refresh\" id=\"refreshButton\" value=\"Refresh Sessions list\" onclick=\"document.getElementById('sessionsFormAction').value='refreshSessions'; return true;\"/>\n");
      out.write("\t\t");
      out.print( JspHelper.formatNumber(activeSessions.size()) );
      out.write(" active Sessions<br/>\n");
      out.write("\t\t<table border=\"1\" cellpadding=\"2\" cellspacing=\"2\" width=\"100%\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='id'; document.getElementById('refreshButton').click(); return true;\">Session Id</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='locale'; document.getElementById('refreshButton').click(); return true;\">Guessed Locale</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='user'; document.getElementById('refreshButton').click(); return true;\">Guessed User name</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='CreationTime'; document.getElementById('refreshButton').click(); return true;\">Creation Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='LastAccessedTime'; document.getElementById('refreshButton').click(); return true;\">Last Accessed Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='UsedTime'; document.getElementById('refreshButton').click(); return true;\">Used Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='InactiveTime'; document.getElementById('refreshButton').click(); return true;\">Inactive Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='TTL'; document.getElementById('refreshButton').click(); return true;\"><span title=\"Time To Live\">TTL</span></a></th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t");
 if (activeSessions.size() > 10) { 
      out.write("\n");
      out.write("\t\t\t<tfoot>");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='id'; document.getElementById('refreshButton').click(); return true;\">Session Id</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='locale'; document.getElementById('refreshButton').click(); return true;\">Guessed Locale</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='user'; document.getElementById('refreshButton').click(); return true;\">Guessed User name</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='CreationTime'; document.getElementById('refreshButton').click(); return true;\">Creation Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='LastAccessedTime'; document.getElementById('refreshButton').click(); return true;\">Last Accessed Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='UsedTime'; document.getElementById('refreshButton').click(); return true;\">Used Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='InactiveTime'; document.getElementById('refreshButton').click(); return true;\">Inactive Time</a></th>\n");
      out.write("\t\t\t\t\t<th><a onclick=\"document.getElementById('sessionsFormSort').value='TTL'; document.getElementById('refreshButton').click(); return true;\"><span title=\"Time To Live\">TTL</span></a></th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tfoot>\n");
      out.write("\t\t\t");
 } // end if 
      out.write("\n");
      out.write("\t\t\t<tbody>\n");
 Iterator iter = activeSessions.iterator();
   while (iter.hasNext()) {
   	Session currentSession = (Session) iter.next();
   	String currentSessionId = JspHelper.escapeXml(currentSession.getId());

      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("<input type=\"checkbox\" name=\"sessionIds\" value=\"");
      out.print( currentSessionId );
      out.write("\" /><a href=\"");
      out.print( submitUrl );
      out.write("&amp;action=sessionDetail&amp;sessionId=");
      out.print( currentSessionId );
      out.write('"');
      out.write('>');
      out.print( currentSessionId );
      out.write("</a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.guessDisplayLocaleFromSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.guessDisplayUserFromSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.getDisplayCreationTimeForSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.getDisplayLastAccessedTimeForSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.getDisplayUsedTimeForSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.getDisplayInactiveTimeForSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print( JspHelper.getDisplayTTLForSession(currentSession) );
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
 } // end while 
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<p style=\"text-align: center;\">\n");
      out.write("\t\t\t<input type=\"submit\" name=\"invalidate\" value=\"Invalidate selected Sessions\" onclick=\"document.getElementById('sessionsFormAction').value='invalidateSessions'; return true;\"/>\n");
      out.write("\t\t</p>\n");
      out.write("\t</fieldset>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<form method=\"get\" action=\"");
      out.print(request.getContextPath());
      out.write("/html\">\n");
      out.write("  <p style=\"text-align: center;\">\n");
      out.write("    <input type=\"submit\" value=\"Return to main page\" />\n");
      out.write("  </p>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
