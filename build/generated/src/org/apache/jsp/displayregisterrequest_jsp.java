package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class displayregisterrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("\n");
 
    DbSelect catList = new DbSelect();
    ResultSet catResult = catList.DisplayCategory();
    Integer num = 0;

      out.write("\n");
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
      out.write("                                <li><a href=\"login.jsp\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Login</a>\n");
      out.write("                                <li><a href=\"interestform.jsp\"><b>Buyer Form</b></a>\n");
      out.write("                                <li><a href=\"#\"><b>Seller Form</b></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"dropdown-name\">\n");
      out.write("                                        <a href=\"#\" onclick=\"myCall()\" class=\"drop-link\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i> Categories<span class=\"caret\"></span></a>\n");
      out.write("                                        <div id=\"myList\" class=\"drop-down-content\">\n");
      out.write("                                                ");
  try {
                                                        while (catResult.next()) {
                                                            num++;
                                                
      out.write("\n");
      out.write("                                                <a href='categories.jsp?&catId=");
      out.print(catResult.getString(1));
      out.write('\'');
      out.write('>');
      out.print( catResult.getString(2));
      out.write("</a>\n");
      out.write("                                                    ");

                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Error : " + e);
                                                        }

                                                    
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i> Catalogue</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i> Auction Calendar</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(window).scroll(function () {\n");
      out.write("                $('nav').toggleClass('scrolled', $(this).scrollTop() > 20);\n");
      out.write("            });\n");
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
      out.write("        </script>");
      out.write('\n');
      out.write('\n');
 DbSelect interest = new DbSelect();
    ResultSet result = interest.InterestForm();
    int number = 0;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section class=\"user\">\n");
      out.write("    Interest Form\n");
      out.write("</section>\n");
      out.write("<section class=\"detail\">\n");
      out.write("    <div class=\"container-fluid cat\">\n");
      out.write("        <h2 class=\"heading-one text-center\">\n");
      out.write("            Add Register Request\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <table cellspacing=\"0\" class=\"table table-striped table-responsive table-sm\" >\n");
      out.write("                <tr>\n");
      out.write("                    <th>S.N. </th>\n");
      out.write("                    <th>Category</th>\n");
      out.write("                    <th>Item Name</th>\n");
      out.write("                    <th>Artist Name</th>\n");
      out.write("                    <th>Created Year</th>\n");
      out.write("                    <th>Classification</th>\n");
      out.write("                    <th class=\"desc-width\">Description</th>\n");
      out.write("                    <th class=\"add-width\">Additional</th>\n");
      out.write("                    <th>Auction Date</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>Process</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    try {
                        while (result.next()) {
                            number++;
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( number);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( interest.UserTypeById(result.getString(2)));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(3));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(4));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(5));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(6));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(7));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(8));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(9));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( result.getString(10));
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                
      out.write("\n");
      out.write("            </table>\n");
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
