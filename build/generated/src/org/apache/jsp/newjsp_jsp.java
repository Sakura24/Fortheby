package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form id=\"myForm\">\n");
      out.write("\n");
      out.write("                    <label><h4><b>Beneficiary Name</b></h4></label>\n");
      out.write("                    <input type=\"text\"  id=\"beneName\" name=\"beneName\" ng-model=\"data.beneName\"  class=\"item-input-wrapper\" >\n");
      out.write("                    <br> \n");
      out.write("\n");
      out.write("                    <label><h4><b>Source Account Number</b></h4></label>\n");
      out.write("                    <select id=\"originAcc\"   style=\"margin: auto; width:100%; \" ng-model=\"data.origin\" ng-options=\"account.account for account in accountsArr\">\n");
      out.write("                    <option value=\"\" selected=\"selected\">--Select Account--</option>\n");
      out.write("                    </select><br><br>\n");
      out.write("\n");
      out.write("                    <label><h4><b>Transfer Amount</b></h4></label>\n");
      out.write("                    <input type=\"number\"  id=\"amount\" name=\"amount\" ng-model=\"data.amount\" class=\"item-input-wrapper\"   decimal-places onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46'>\n");
      out.write("                     <br>  \n");
      out.write("\n");
      out.write("                    <label><h4><b>Beneficiary Account Number</b></h4></label>\n");
      out.write("                    <input type=\"text\"  id=\"beneAcc\" name=\"beneAcc\" ng-model=\"data.beneAcc\"  class=\"item-input-wrapper\"  >\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label><h4><b>Transaction Type</b></h4></label>\n");
      out.write("                    <select id=\"transtype\"   style=\"margin: auto; width:100%; \" ng-model=\"data.transtype\" ng-options=\"type.type for type in types\" ng-change=\"hideFields()\">\n");
      out.write("                    <option value=\"\" selected=\"selected\">--Select Transaction Type--</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label><h4><b>Select Bank</b></h4></label>\n");
      out.write("                    <select id=\"beneBank\"   style=\"margin: auto; width:100%; \" ng-model=\"data.beneBank\" ng-options=\"bank.bank for bank in banks\" ng-disabled=\"disableFields\">\n");
      out.write("                    <option value=\"\" selected=\"selected\">--Select Bank--</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label><h4><b>Branch Name</b></h4></label>\n");
      out.write("                    <select id=\"bname\"   style=\"margin: auto; width:100%; \" ng-model=\"data.bname\" ng-options=\"bname.bname for bname in bname\" ng-disabled=\"disableFields\">\n");
      out.write("                    <option value=\"\" selected=\"selected\">--Select Branch Name--</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br><br>   \n");
      out.write("\n");
      out.write("                    <label><h4><b>Fund Transfer Remarks</b></h4></label>\n");
      out.write("                    <input type=\"text\"  id=\"narration\" name=\"narration\" ng-model=\"data.narration\" class=\"item-input-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <ion-checkbox ng-model=\"isChecked\">Save as beneficiary</ion-checkbox>\n");
      out.write("\n");
      out.write("                    <div class=\"col\" style=\"text-align: center\">\n");
      out.write("                    <button align=\"left\" class=\"button button-block button-reset\" style=\"display: inline-block;width:100px;text-align:center \" ng-click=\"reset()\" padding-top=\"true\">Reset</button>\n");
      out.write("\n");
      out.write("                    <button class=\"button button-block button-positive\"  style=\"display: inline-block;width:100px;margin-left:auto; margin-right:auto; \" ng-click=\"thirdPartySubmit(data)\" padding-top=\"true\" >Transfer</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("         </form>\n");
      out.write("    </ion-content>\n");
      out.write("</ion-view>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
