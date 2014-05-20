package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class MyJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link href=\"images/default/julying-weather.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.weather.js\"></script> \r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("\t<script> \r\n");
      out.write("\t\r\n");
      out.write("\t;var jQueryWeatherConfig = {\r\n");
      out.write("\t\tlang : {\r\n");
      out.write("\t\t\tday : '白天',\r\n");
      out.write("\t\t\tnight : '夜晚',\r\n");
      out.write("\t\t\ttemp : '°C',\r\n");
      out.write("\t\t\twind : '级风',\r\n");
      out.write("\t\t\twangzimo : '王子墨'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tconvert : function(sky){\r\n");
      out.write("\t\t\tvar weatherInfo = {\r\n");
      out.write("\t\t\t\t\tcloudy \t\t: ['多云','多云转阴','晴转多云','阴转多云'],\r\n");
      out.write("\t\t\t\t\tovercast\t: ['阴','雾','沙尘暴','浮尘','扬沙','强沙尘暴'],\r\n");
      out.write("\t\t\t\t\trainy\t\t: ['多云转小雨','小雨转多云','小雨','中雨','大雨','暴雨','大暴雨','特大暴雨','冻雨','小雨转中雨','中雨转大雨','大雨转暴雨','暴雨转大暴雨','大暴雨转特大暴雨','阵雨','雷阵雨','雷阵雨伴有冰雹'],\r\n");
      out.write("\t\t\t\t\tsleet\t\t: ['雨夹雪'],\r\n");
      out.write("\t\t\t\t\tsnow\t\t: ['阵雪','小雪','中雪','大雪','暴雪','小雪转中雪','中雪转大雪','大雪转暴雪','中雪转小雪','大雪转中雪','暴雪转大雪'],\r\n");
      out.write("\t\t\t\t\tsunshine\t: ['晴']\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tweather = '',\r\n");
      out.write("\t\t\t\tstate = '';\r\n");
      out.write("\t\t\tfor( state in weatherInfo ){\r\n");
      out.write("\t\t\t\tif( $.inArray( sky , weatherInfo[state] ) > -1 ){\r\n");
      out.write("\t\t\t\t\tweather = state;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\treturn weather || state || 'sunshine'  ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.getScript('http://php.weather.sina.com.cn/iframe/index/w_cl.php?code=js&day=0&city=&charset=utf-8', function(){\r\n");
      out.write("\t\t\t//window.SWther 这是返回的天气情况\r\n");
      out.write("\t\t\tvar city, dataInfo = window.SWther.w ;\r\n");
      out.write("\t\t\tfor( var city in dataInfo ); //获取 天气\r\n");
      out.write("\t\t\tdataInfo = dataInfo[city][0];\r\n");
      out.write("\t\t\t//jQueryWeatherConfig \r\n");
      out.write("\t\t\tvar weatherData = {\r\n");
      out.write("\t\t\t\tcity : city ,\r\n");
      out.write("\t\t\t\tdate : SWther.add.now.split(' ')[0] || '',\r\n");
      out.write("\t\t\t\tday_weather: dataInfo.s1,\r\n");
      out.write("\t\t\t\tnight_weather :dataInfo.s2,\r\n");
      out.write("\t\t\t\tday_temp: dataInfo.t1,\r\n");
      out.write("\t\t\t\tnight_temp: dataInfo.t2,\r\n");
      out.write("\t\t\t\tday_wind:dataInfo.p1,\r\n");
      out.write("\t\t\t\tnight_wind: dataInfo.p2\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar hour = (new Date( SWther.add.now )).getHours();\r\n");
      out.write("\t\t\tvar sky = hour > 18 ? weatherData.day_weather : weatherData.night_weather ;\r\n");
      out.write("\t\t\tvar weatherBox = $('#debug').weather({ sky : jQueryWeatherConfig.convert( sky ), weatherData : weatherData , config : jQueryWeatherConfig });\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t//weatherBox 是 整个天气图标的跟节点的 jQuery ，所以可以直接操作，可以自己随意扩展效果。\r\n");
      out.write("\t\t\t//setTimeout(function(){\r\n");
      out.write("\t\t\t//\tweatherBox.hide( );\r\n");
      out.write("\t\t\t//}, 1000 );\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//setTimeout(function(){\r\n");
      out.write("\t\t\t//\tweatherBox.show();\r\n");
      out.write("\t\t\t//}, 2000 );\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"http://sighttp.qq.com/authd?IDKEY=d01512b4843bdedcbb3ce23f610a189d0e5627a2960a72a3\" title=\"天气预报\" target=\"_blank\" class=\"qq\">\r\n");
      out.write("\t<div id=\"debug\" style=\"position:relative;\"></div> \r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
}
