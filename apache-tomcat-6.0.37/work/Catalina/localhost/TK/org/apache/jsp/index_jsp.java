package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("#mytank {\r\n");
      out.write("\tbackground: blue;\r\n");
      out.write("\twidth: 40px;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tleft: 200px;\r\n");
      out.write("\ttop: 360px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 360px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body onkeydown=\"dosomething(event)\">\r\n");
      out.write("\t\t<div id=\"filed\"\r\n");
      out.write("\t\t\tstyle=\"background-color: black; width: 500px; height: 400px; position: absolute;\">\r\n");
      out.write("\t\t\t<div id=\"mytank\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tvar mytank = document.getElementById(\"mytank\");\r\n");
      out.write("\t//坦克类\r\n");
      out.write("\tfunction MyTank(x, y, dtr) {\r\n");
      out.write("\t\t//x轴坐标\r\n");
      out.write("\t\tthis.x = x;\r\n");
      out.write("\t\t//y轴坐标\r\n");
      out.write("\t\tthis.y = y;\r\n");
      out.write("\t\t//坦克方向\r\n");
      out.write("\t\tthis.dtr = dtr;\r\n");
      out.write("\t\t//坦克速度\r\n");
      out.write("\t\tthis.speed = 5;\r\n");
      out.write("\t\t//初始化\r\n");
      out.write("\t\tmytank.style.left = this.x + \"px\";\r\n");
      out.write("\t\tmytank.style.top = this.y + \"px\";\r\n");
      out.write("\t\t//按钮事件\r\n");
      out.write("\t\tthis.move = function move(event) {\r\n");
      out.write("\t\t\tswitch (event.keyCode) {\r\n");
      out.write("\t\t\tcase 37:\r\n");
      out.write("\t\t\t\tthis.x -= this.speed;//左 37\r\n");
      out.write("\t\t\t\tthis.dtr = 3;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 40:\r\n");
      out.write("\t\t\t\tthis.y += this.speed;//下 40\r\n");
      out.write("\t\t\t\tthis.dtr = 2;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 39:\r\n");
      out.write("\t\t\t\tthis.x += this.speed;//右 39\r\n");
      out.write("\t\t\t\tthis.dtr = 1;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 38:\r\n");
      out.write("\t\t\t\tthis.y -= this.speed;//上 38\r\n");
      out.write("\t\t\t\tthis.dtr = 0;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tmytank.style.left = this.x + \"px\";\r\n");
      out.write("\t\t\tmytank.style.top = this.y + \"px\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tthis.fire = function fire(event) {\r\n");
      out.write("\t\t\tvar y1;\r\n");
      out.write("\t\t\tvar x1;\r\n");
      out.write("\t\t\tnewdiv = document.createElement(\"div\");\r\n");
      out.write("\t\t\tif (this.dtr == 0) {\r\n");
      out.write("\t\t\ty1 = this.y;\r\n");
      out.write("\t\t\tx1 = this.x+ 20;\r\n");
      out.write("\t\t\t} else if (this.dtr == 3) {\r\n");
      out.write("\t\t\tx1 = this.x ;\r\n");
      out.write("\t\t\ty1 = this.y+ 20;\r\n");
      out.write("\t\t\t}else if(this.dtr == 2)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\ty1 = this.y+40;\r\n");
      out.write("\t\t\tx1 = this.x+ 20;\r\n");
      out.write("\t\t\t}else if(this.dtr == 1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tx1 = this.x+40 ;\r\n");
      out.write("\t\t\ty1 = this.y+ 20;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tnewdiv.style.left = x1 + \"px\";\r\n");
      out.write("\t\t\tnewdiv.style.top = y1 + \"px\";\r\n");
      out.write("\t\t\tnewdiv.style.position = \"absolute\";\r\n");
      out.write("\t\t\tnewdiv.style.width = \"5px\";\r\n");
      out.write("\t\t\tnewdiv.style.height = \"5px\";\r\n");
      out.write("\t\t\tnewdiv.style.backgroundColor = \"green\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"filed\").appendChild(newdiv);\r\n");
      out.write("\t\t\tvar zidan = new Zidan(x1, y1, this.dtr, newdiv);\r\n");
      out.write("\t\t\t//\"+newdiv+\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction Zidan(x, y, dir, zidan) {\r\n");
      out.write("\t\tthis.x = x;\r\n");
      out.write("\t\tthis.y = y;\r\n");
      out.write("\t\tthis.dir = dir;\r\n");
      out.write("\t\tthis.speed = 5;\r\n");
      out.write("\t\tzidan.style.left = this.x + \"px\";\r\n");
      out.write("\t\tzidan.style.top = this.y + \"px\";\r\n");
      out.write("\t\tthis.move = function move(newdiv,dir) {\r\n");
      out.write("\t\t\talert(dir);\r\n");
      out.write("\t\t\tswitch (dir) {\r\n");
      out.write("\t\t\tcase 3:\r\n");
      out.write("\t\t\t\tthis.x -= this.speed;//左 37\r\n");
      out.write("\t\t\t\tthis.dtr = 3;\r\n");
      out.write("\t\t\t\twindow.setInterval(\"this.x -= this.speed;newdiv.style.left = this.x + 'px';newdiv.style.top = this.y + 'px'; alert('1');\", 50);\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 2:\r\n");
      out.write("\t\t\t\tthis.y += this.speed;//下 40\r\n");
      out.write("\t\t\t\tthis.dtr = 2;\r\n");
      out.write("\t\t\t\twindow.setInterval(\"this.y += this.speed;newdiv.style.left = this.x + 'px';newdiv.style.top = this.y + 'px';alert('1');\", 50);\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 1:\r\n");
      out.write("\t\t\t\tthis.x += this.speed;//右 39\r\n");
      out.write("\t\t\t\tthis.dtr = 1;\r\n");
      out.write("\t\t\t\twindow.setInterval(\"this.x += this.speed;newdiv.style.left = this.x + 'px';newdiv.style.top = this.y + 'px';alert('1');\", 50);\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 0:\r\n");
      out.write("\t\t\t\tthis.y -= this.speed;//上 38\r\n");
      out.write("\t\t\t\tthis.dtr = 0;\r\n");
      out.write("\t\t\t\twindow.setInterval(\"this.y -= this.speed;newdiv.style.left = this.x + 'px';newdiv.style.top = this.y + 'px';alert('1');\", 50);\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction dosomething(event) {\r\n");
      out.write("\t\t//判断是不是坦克移动\r\n");
      out.write("\t\tif (event.keyCode == 37 || event.keyCode == 38 || event.keyCode == 39\r\n");
      out.write("\t\t\t\t|| event.keyCode == 40) {\r\n");
      out.write("\t\t\thero.move(event);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//判断是不是开火\r\n");
      out.write("\t\telse if (event.keyCode == 32) {\r\n");
      out.write("\t\t\thero.fire(event);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//创建坦克\r\n");
      out.write("\tvar hero = new MyTank(220, 360, 0);\r\n");
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
