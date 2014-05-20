package org.apache.jsp.main.contractjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addcontract_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody.release();
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
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t<form method=\"post\" action=\"contractcrud!newContract.action\" class=\"pageForm required-validate\" onsubmit=\"return validateCallback(this,navTabAjaxDone)\">\r\n");
      out.write("\t\t<div class=\"pageFormContent nowrap\" layoutH=\"97\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>账号:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"required\" name=uiusername remote=\"systemcrud!userLive.action\"/><font style=\"color: red\">账号名</font>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>合同甲方:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"required\" name=\"cuser\" /><font style=\"color: red\">请填写正确的名字</font>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>合同乙方:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"required\" name=\"cboss\" /> <font style=\"color: red\">请填写正确的名字</font>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>合同有效期:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input   type=\"text\" class=\"required\" name=\"contractyear\" /><font style=\"color: red\">例如 10 代表10年</font>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>合同内容:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005ftextarea_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005ftextarea_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent(null);
    // /main/contractjsp/addcontract.jsp(33,4) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("40");
    // /main/contractjsp/addcontract.jsp(33,4) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCols("100");
    // /main/contractjsp/addcontract.jsp(33,4) null
    _jspx_th_s_005ftextarea_005f0.setDynamicAttribute(null, "class", new String("required"));
    // /main/contractjsp/addcontract.jsp(33,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("cmessage");
    // /main/contractjsp/addcontract.jsp(33,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setValue("根据《中华人民共和国合同法》及相关法律法规的规定，甲、乙双方在平等、自愿的基础上，就甲方将房屋出租给乙方使用，乙方承租甲方房屋事宜，为明确双方权利义务，经协商一致，订立本合同。\r\n\r\n　　第一条 甲方保证所出租的房屋符合国家对租赁房屋的有关规定。\r\n\r\n　　第二条 房屋的坐落、面积、装修、设施情况\r\n\r\n　　1、甲方出租给乙方的房屋位于 （省、市）(区、县) ；门牌号为\r\n\r\n　　2、出租房屋面积共　平方米（建筑面积/使用面积/套内面积）。\r\n\r\n　　3、该房屋现有装修及设施、设备情况详见合同附件。\r\n\r\n　　该附件作为甲方按照本合同约定交付乙方使用和乙方在本合同租赁期满交还该房屋时的验收依据。\r\n\r\n　　第三条 甲方应提供房产证（或具有出租权的有效证明）、身份证明（营业执照）等文件，乙方应提供身份证明文件。双方验证后可复印对方文件备存。所有复印件仅供本次租赁使用。\r\n\r\n　　第四条 租赁期限、用途\r\n\r\n　　1、该房屋租赁期共　　个月。自　年　月　日起至　年　月　日止。\r\n\r\n　　2、乙方向甲方承诺，租赁该房屋仅作为　　　使用。\r\n\r\n　　3、租赁期满，甲方有权收回出租房屋，乙方应如期交还。\r\n\r\n　　乙方如要求续租，则必须在租赁期满 个月之前书面通知甲方，经甲方同意后，重新签订租赁合同。\r\n\r\n　　第五条 租金及支付方式\r\n\r\n　　1、 该房屋每月租金为　　元（大写　万　仟　佰　拾　元整）。\r\n\r\n租金总额为　　元（大写　万　仟　佰　拾　元整）。\r\n\r\n　　2、 房屋租金支付方式如下：\r\n\r\n　　甲方收款后应提供给乙方有效的收款凭证。\r\n\r\n　　第六条 租赁期间相关费用及税金\r\n\r\n　　1、 甲方应承担的费用：\r\n\r\n　　（1）租赁期间，房屋和土地的产权税由甲方依法交纳。如果发生政府有关部门征收本合同中未列出项目但与该房屋有关的费用，应由甲方负担。\r\n\r\n　　（2） 。\r\n\r\n　　2、乙方交纳以下费用：\r\n\r\n　　（1）乙方应按时交纳自行负担的费用。\r\n\r\n　　（2）甲方不得擅自增加本合同未明确由乙方交纳的费用。\r\n\r\n　　第七条 房屋修缮与使用\r\n\r\n　　1、在租赁期内，甲方应保证出租房屋的使用安全。该房屋及所属设施的维修责任除双方在本合同及补充条款中约定外，均由甲方负责（乙方使用不当除外）。\r\n\r\n　　甲方提出进行维修须提前　日书面通知乙方，乙方应积极协助配合。\r\n\r\n　　乙方向甲方提出维修请求后，甲方应及时提供维修服务。\r\n\r\n　　对乙方的装修装饰部分甲方不负有修缮的义务。\r\n\r\n　　2、乙方应合理使用其所承租的房屋及其附属设施。如因使用不当造成房屋及设施损坏的，乙方应立即负责修复或经济赔偿。\r\n\r\n　　乙方如改变房屋的内部结构、装修或设置对房屋结构有影响的设备，设计规模、范围、工艺、用料等方案均须事先征得甲方的书面同意后方可施工。租赁期满后或因乙方责任导致退租的，除双方另有约定外，甲方有权选择以下权利中的一种：\r\n\r\n　　（1）依附于房屋的装修归甲方所有。\r\n\r\n　　（2）要求乙方恢复原状。\r\n\r\n　　（3）向乙方收取恢复工程实际发生的费用。\r\n\r\n　　第八条 房屋的转让与转租\r\n\r\n　　1、租赁期间，甲方有权依照法定程序转让该出租的房屋，转让后，本合同对新的房屋所有人和乙方继续有效。\r\n2、 未经甲方同意，乙方不得转租、转借承租房屋。\r\n\r\n　　3、甲方出售房屋，须在　　个月前书面通知乙方，在同等条件下，乙方有优先购买权。\r\n\r\n　　第九条 合同的变更、解除与终止\r\n\r\n　　1、双方可以协商变更或终止本合同。\r\n\r\n　　2、甲方有以下行为之一的，乙方有权解除合同：\r\n\r\n　（1）不能提供房屋或所提供房屋不符合约定条件，严重影响居住。\r\n\r\n　（2）甲方未尽房屋修缮义务，严重影响居住的。\r\n\r\n　　3、房屋租赁期间，乙方有下列行为之一的，甲方有权解除合同，收回出租房屋；\r\n\r\n　（1）未经甲方书面同意，转租、转借承租房屋。\r\n\r\n　（2）未经甲方书面同意，拆改变动房屋结构。\r\n\r\n　（3）损坏承租房屋，在甲方提出的合理期限内仍未修复的。\r\n\r\n　（4）未经甲方书面同意，改变本合同约定的房屋租赁用途。\r\n\r\n　（5）利用承租房屋存放危险物品或进行违法活动。\r\n\r\n　（6）逾期未交纳按约定应当由乙方交纳的各项费用，已经给甲方造成严重损害的。\r\n\r\n　（7）拖欠房租累计　　个月以上。\r\n\r\n　　4、租赁期满前，乙方要继续租赁的，应当在租赁期满 个月前书面通知甲方。如甲方在租期届满后仍要对外出租的，在同等条件下，乙方享有优先承租权。\r\n\r\n　　5、租赁期满合同自然终止。\r\n\r\n　　6、因不可抗力因素导致合同无法履行的，合同终止。\r\n\r\n　　第十条 房屋交付及收回的验收\r\n\r\n　　1、甲方应保证租赁房屋本身及附属设施、设备处于能够正常使用状态。\r\n\r\n　　2、验收时双方共同参与，如对装修、器物等硬件设施、设备有异议应当场提出。当场难以检测判断的，应于 日内向对方主张。\r\n\r\n　　3、乙方应于房屋租赁期满后，将承租房屋及附属设施、设备交还甲方。\r\n\r\n　　4、乙方交还甲方房屋应当保持房屋及设施、设备的完好状态，不得留存物品或影响房屋的正常使用。对未经同意留存的物品，甲方有权处置。\r\n\r\n　　第十一条 甲方违约责任处理规定\r\n\r\n　　1、甲方因不能提供本合同约定的房屋而解除合同的，应支付乙方本合同租金总额 %的违约金。甲方除应按约定支付违约金外，还应对超出违约金以外的损失进行赔偿。\r\n\r\n　　2、如乙方要求甲方继续履行合同的，甲方每逾期交房一日，则每日应向乙方支付日租金　　倍的滞纳金。甲方还应承担因逾期交付给乙方造成的损失。\r\n\r\n　　3、由于甲方怠于履行维修义务或情况紧急，乙方组织维修的，甲方应支付乙方费用或折抵租金，但乙方应提供有效凭证。\r\n\r\n　　4、甲方违反本合同约定，提前收回房屋的，应按照合同总租金的 %向乙方支付违约金，若支付的违约金不足弥补乙方损失的，甲方还应该承担赔偿责任。\r\n\r\n　　5、甲方因房屋权属瑕疵或非法出租房屋而导致本合同无效时，甲方应赔偿乙方损失。");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fvalue_005frows_005fname_005fcols_005fclass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }
}
