package org.apache.jsp.jsp.validatecode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.imageio.*;

public final class img_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

//ç»å®èå´è·å¾éæºé¢è² 
	Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
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
      response.setContentType("image/jpeg");
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
      out.write('\r');
      out.write('\n');

	//è®¾ç½®é¡µé¢ä¸ç¼å­   
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	
	//   å¨åå­ä¸­åå»ºå¾è±¡   
	int width = 60, height = 20;
	BufferedImage image = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);

	//   è·åå¾å½¢ä¸ä¸æ   
	Graphics g = image.getGraphics();

	//çæéæºç±»   
	Random random = new Random();

	//   è®¾å®èæ¯è²   
	g.setColor(getRandColor(200, 250));
	g.fillRect(0, 0, width, height);

	//è®¾å®å­ä½   
	g.setFont(new Font("Times   New   Roman", Font.PLAIN, 18));

	//ç»è¾¹æ¡   
	//g.setColor(new   Color());   
	//g.drawRect(0,0,width-1,height-1);   

	//   éæºäº§ç155æ¡å¹²æ°çº¿ï¼ä½¿å¾è±¡ä¸­çè®¤è¯ç ä¸æè¢«å¶å®ç¨åºæ¢æµå°   
	g.setColor(getRandColor(160, 200));
	for (int i = 0; i < 155; i++) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(12);
		int yl = random.nextInt(12);
		g.drawLine(x, y, x + xl, y + yl);
	}

	//   åéæºäº§ççè®¤è¯ç (4ä½æ°å­)   
	String sRand = "";
	for (int i = 0; i < 4; i++) {
		String rand = String.valueOf(random.nextInt(10));
		sRand += rand;
		//   å°è®¤è¯ç æ¾ç¤ºå°å¾è±¡ä¸­   
		g.setColor(new Color(20 + random.nextInt(110), 20 + random
				.nextInt(110), 20 + random.nextInt(110)));
		//è°ç¨å½æ°åºæ¥çé¢è²ç¸åï¼å¯è½æ¯å ä¸ºç§å­å¤ªæ¥è¿ï¼æä»¥åªè½ç´æ¥çæ   
		g.drawString(rand, 13 * i + 6, 16);
	}

	//   å°è®¤è¯ç å­å¥SESSION   
	session.setAttribute("rand", sRand);

	//   å¾è±¡çæ   
	g.dispose();

	//   è¾åºå¾è±¡å°é¡µé¢   
	ImageIO.write(image, "JPEG", response.getOutputStream());
	out.clear();
	out=pageContext.pushBody();

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
