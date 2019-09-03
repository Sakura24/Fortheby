package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class sellerprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/sellerheader.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DbSelect dbSelect = new DbSelect();
    String usrEmail = session.getAttribute("uemail").toString();
    int interestCount = dbSelect.InterestFormCount();
    ResultSet searchItem = dbSelect.DisplayPendingItem();
    int searchCount = 0;
    searchCount = dbSelect.ItemCountSoldArchieveStatus();
    String[][] searchArray = new String[searchCount][2];

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
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/jquery-ui.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/styles.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"frontend/bootstrap/js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"frontend/bootstrap/js/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"frontend/bootstrap/js/script.js\"></script>\n");
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
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"> Home</i></a></li>\n");
      out.write("                                <li><a href=\"sellerprofile.jsp\"><i class=\"fa fa-user\" aria-hidden=\"true\"> Profile</i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"> Pending Items</i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-money\" aria-hidden=\"true\"> Sold Item</i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-phone\" aria-hidden=\"true\"> Contact</i></a></li>\n");
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
      out.write("                            <form class=\"navbar-form navbar-right search-form\" action=\"searchitem.jsp\">\n");
      out.write("                                ");
  try {
                                        searchItem.first();
                                        for (int i = 0; i < searchCount; i++) {
                                            searchArray[i][0] = searchItem.getString(1);
                                            searchArray[i][1] = searchItem.getString(3);
                                            searchItem.next();
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                        }
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"ui-widget\">\n");
      out.write("                                    \n");
      out.write("                                    <select id=\"combobox\" name=\"item_lot\" class=\"form-control input-lg search-item\" style=\"width: 200px\">\n");
      out.write("                                        <option value=\"\">Select Item Name...</option>\n");
      out.write("                                        ");
 for (int i = 0; i < searchCount; i++) {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(searchArray[i][0]);
      out.write('"');
      out.write('>');
      out.print(searchArray[i][1]);
      out.write("</option>\n");
      out.write("                                        { %>\n");
      out.write("\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                     <button class=\"btn btn-danger search-btn\" type=\"submit\">\n");
      out.write("                                      <i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        </nav>\n");
      out.write("                        </header>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).scroll(function () {\n");
      out.write("                                $('nav').toggleClass('scrolled', $(this).scrollTop() > 20);\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                            function myCall() {\n");
      out.write("                                document.getElementById(\"myList\").classList.toggle(\"show\");\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                // Close the dropdown menu if the user clicks outside of it\n");
      out.write("                            window.onclick = function (event) {\n");
      out.write("                                if (!event.target.matches('.drop-link')) {\n");
      out.write("                                    var dropdowns = document.getElementsByClassName(\"drop-down-content\");\n");
      out.write("                                    var i;\n");
      out.write("                                    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("                                        var openDropdown = dropdowns[i];\n");
      out.write("                                        if (openDropdown.classList.contains('show')) {\n");
      out.write("                                            openDropdown.classList.remove('show');\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write('\n');
      out.write('\n');
 
    DbSelect profile = new DbSelect();
    ResultSet user = profile.UserProfile(usrEmail);
    user.first();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section class=\"item-bg\">\n");
      out.write("    Items\n");
      out.write("</section>\n");
      out.write("<section class=\"detail\">\n");
      out.write("<div class=\"container-fluid cat\">\n");
      out.write("        <h2 class=\"heading-one text-center\">\n");
      out.write("            Profile\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"tab-content\">\n");
      out.write("            <div class=\"row profile\">\n");
      out.write("                <div class=\"col-md-6 profile-title\">\n");
      out.write("                    Title:\n");
      out.write("                    <br>\n");
      out.write("                    First Name:\n");
      out.write("                    <br>\n");
      out.write("                    Last Name:\n");
      out.write("                    <br>\n");
      out.write("                    Address:\n");
      out.write("                    <br>\n");
      out.write("                    Contact No:\n");
      out.write("                    <br>\n");
      out.write("                    Email:\n");
      out.write("                    <br>\n");
      out.write("                    User Type:\n");
      out.write("                    <br>\n");
      out.write("                    Bank Account Number:\n");
      out.write("                    <br>\n");
      out.write("                    Bank Sort Number:\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 profile-record\">\n");
      out.write("                    ");
 if (user.getString(1).endsWith("Female")){
                        out.print("Miss/Mrs");
                    } else{
                        out.print("Mr");
                    }
                    
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(2));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(3));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(4));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(5));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(6));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(7));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(profile.UserTypeById(user.getString(8)));
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(user.getString(9));
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"frontend/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"frontend/bootstrap/css/font-awesome.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"frontend/bootstrap/css/fontawesome.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"frontend/bootstrap/css/styles.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("<script src=\"frontend/bootstrap/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"frontend/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4 spacing\">\n");
      out.write("                <h3>Opening Hours</h3>\n");
      out.write("                <p>Wednesday and Saturday</p>\n");
      out.write("                <p>Each day 3 session</p>\n");
      out.write("                <p>Each session 3 hour(morning, afternoon, evening)</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 spacing\">\n");
      out.write("                <h3>About us</h3>\n");
      out.write("                <p>Offices in London, Paris, New York</p>\n");
      out.write("                <p>Head Quarters in London</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">  \n");
      out.write("                <h3 class=\"share\">Share</h3>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"frontend/image/fb.png\" class=\"share-icon\">\n");
      out.write("                                <h5>Facebook</h5>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"frontend/image/insta.jpg\" class=\"share-icon\">\n");
      out.write("                                <h5>Instagram</h5>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"frontend/image/twit.png\" class=\"share-icon\">\n");
      out.write("                                <h5>Twitter</h5>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"frontend/image/gp.jpg\" class=\"share-icon\">\n");
      out.write("                                <h5>Google+</h5>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <hr>\n");
      out.write("        <h4 class=\"text-center\">Copyright@2019 | Fortheby Auction House</h4>\n");
      out.write("        <h4 class=\"text-center\">Term and condition</h4>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write('\n');
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
