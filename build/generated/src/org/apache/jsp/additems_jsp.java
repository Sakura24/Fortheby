package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbclass.DbSelect;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class additems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminheader.jsp");
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
      out.write('\n');
      out.write('\n');
 
    DbSelect dbSelect = new DbSelect();
    String usrEmail = session.getAttribute("uemail").toString();

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
      out.write("                                <li><a href=\"addusers.jsp\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i> Users</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <div class=\"dropdown-name\">\n");
      out.write("                                    <a href=\"#\" onclick=\"myCall()\" class=\"drop-link\">");
      out.print(dbSelect.GetUserNameFromEmail(usrEmail));
      out.write(" <span class=\"caret\"></span></a>\n");
      out.write("                                    <div id=\"myList\" class=\"drop-down-content\">\n");
      out.write("                                        <a href=\"signout.jsp\">Sign Out</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("                                <script type=\"text/javascript\">\n");
      out.write("            $(window).scroll(function () {\n");
      out.write("                $('nav').toggleClass('scrolled', $(this).scrollTop() > 20);\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            function myCall() {\n");
      out.write("  document.getElementById(\"myList\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the dropdown menu if the user clicks outside of it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.drop-link')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"drop-down-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    DbSelect item = new DbSelect();
    ResultSet catResult = item.DisplayCategory();


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section class=\"item-bg\">\n");
      out.write("    Items\n");
      out.write("</section>\n");
      out.write("<section class=\"detail\">\n");
      out.write("    <div class=\"container-fluid cat\">\n");
      out.write("        <h2 class=\"heading-one text-center\">\n");
      out.write("            Add Item\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <div class=\"button\">\n");
      out.write("                <a href=\"additems.jsp\" class=\"btn btn-default add-btn active\" role=\"button\">Add</a>\n");
      out.write("                <a href=\"admindisplayitems.jsp\" class=\"btn btn-default display-btn \" role=\"button\">Display</a>\n");
      out.write("            </div>\n");
      out.write("            <form class=\"form-type list-type\" method=\"post\" action=\"/Fortheby/AddItem\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-5 column\">\n");
      out.write("                <label>Category Name:</label>\n");
      out.write("                <select name=\"cat_id\" class=\"form-control input-lg input-design\">\n");
      out.write("                    \n");
      out.write("                    ");
         try {
                            while (catResult.next()) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(catResult.getString(1));
      out.write('"');
      out.write('>');
      out.print(catResult.getString(2));
      out.write("</option>\n");
      out.write("                    ");


                            }

                        } catch (Exception e) {
                            System.out.println("Error : " + e);
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                    <label>Item Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Item Name\" name=\"item_name\">\n");
      out.write("                    <label>Artist Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Artist Name\" name=\"artist_name\">\n");
      out.write("                    <label>Created Year:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Created Year\" name=\"created_year\">\n");
      out.write("                    <label>Classification:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Classifciation\" name=\"classification\">\n");
      out.write("                    <label>Description:</label>\n");
      out.write("                    <textarea type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Description\" name=\"description\"></textarea>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                    \n");
      out.write("                    <label>Additional Information:</label>\n");
      out.write("                    <textarea type=\"text\" class=\"form-control input-lg input-design text-area\" placeholder=\"Enter Addtional features such as dimention, weight, frame available and material used\" name=\"additional\"></textarea>\n");
      out.write("                    <label>Auction Date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control input-lg input-design\" placeholder=\"Enter Auction Date\" name=\"auction_date\">\n");
      out.write("                    <label>Estimated Price:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Estimated Price\" name=\"price\">\n");
      out.write("                    <label>Image:</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control input-lg input-design\" name=\"image\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Add\" class=\"btn btn-danger add-button add-item\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/fontawesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"frontend/bootstrap/css/styles.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"frontend/bootstrap/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"frontend/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h4 class=\"text-center\">Copyright@2019 | Fortheby Auction House</h4>\n");
      out.write("        <h4 class=\"text-center\">Term and condition</h4>\n");
      out.write("    </div></footer>\n");
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
