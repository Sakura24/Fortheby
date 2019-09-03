package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class adminheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    DbSelect dbSelect = new DbSelect();
    String usrEmail = session.getAttribute("uemail").toString();
    int interestCount = dbSelect.InterestFormCount();
    int count = dbSelect.ItemCount();
    ResultSet itemResult = dbSelect.DisplayItem();
    String [][] countArray = new String[count][];

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Fortheby Auction House</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/fontawesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/styles.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"frontend/bootstrap/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"frontend/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <nav class=\"navbar navbar-fixed-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <img src =\"frontend/image/logo.jpg\" class=\"logo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                                <li><a href=\"addcategories.jsp\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"> Category</i></a></li>\n");
      out.write("                                <li><a href=\"additems.jsp\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i></i> Items</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i> Auction Calendar</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact</a></li>\n");
      out.write("                                <li><a href=\"addusers.jsp\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i> \n");
      out.write("                                        Users<b class=\"notify\">\n");
      out.write("                                            ");
 if (interestCount > 0) {
      out.write("\n");
      out.write("                                            [");
      out.print(interestCount);
      out.write("]\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </b></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <div class=\"dropdown-name\">\n");
      out.write("                                    <a href=\"#\" onclick=\"myCall()\" class=\"drop-link\"><b>");
      out.print(dbSelect.GetUserNameFromEmail(usrEmail));
      out.write("</b> <span class=\"caret\"></span></a>\n");
      out.write("                                    <div id=\"myList\" class=\"drop-down-content\">\n");
      out.write("                                        <a href=\"signout.jsp\">Sign Out</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </ul>\n");
      out.write("                            <form class=\"navbar-form navbar-right\" action=\"searchitem.jsp\">\n");
      out.write("<!--                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"search\">\n");
      out.write("                                    <div class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-danger search-btn\" type=\"submit\">\n");
      out.write("                                            <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>-->\n");
      out.write("                                <label for=\"pwd\">Company Name:</label>\n");
      out.write("                    ");
  try {
                         itemResult.first();
                             for (int i = 0; i < count; i++) {
                                    countArray[i][0] = itemResult.getString(1);
                                    countArray[i][1] = itemResult.getString(2);
                               itemResult.next();
                             }
                        } catch (Exception e) {
                            e.printStackTrace();
                         }
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"ui-widget\">\n");
      out.write("\n");
      out.write("                        <select id=\"combobox\" name=\"party_id\" class=\"form-control input-lg\">\n");
      out.write("                            <option value=\"\">Select one...</option>\n");
      out.write("                            ");
 for(int i=0;i<count;i++)
                     { 
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(countArray[i][0]);
      out.write('"');
      out.write('>');
      out.print(countArray[i][1]);
      out.write("</option>\n");
      out.write("                            { %>\n");
      out.write("\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Search\" class=\"btn btn-primary sbutton\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(window).scroll(function () {\n");
      out.write("                $('nav').toggleClass('scrolled', $(this).scrollTop() > 20);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function myCall() {\n");
      out.write("                document.getElementById(\"myList\").classList.toggle(\"show\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("// Close the dropdown menu if the user clicks outside of it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (!event.target.matches('.drop-link')) {\n");
      out.write("                    var dropdowns = document.getElementsByClassName(\"drop-down-content\");\n");
      out.write("                    var i;\n");
      out.write("                    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("                        var openDropdown = dropdowns[i];\n");
      out.write("                        if (openDropdown.classList.contains('show')) {\n");
      out.write("                            openDropdown.classList.remove('show');\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
