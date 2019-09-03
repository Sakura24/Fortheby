package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <img src =\"frontend/image/logo.jpg\" class=\"logo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Login</a>\n");
      out.write("                                <li><a href=\"#\"><b>Buyer Form</b></a>\n");
      out.write("                                <li><a href=\"#\"><b>Seller Form</b></a>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                                <li><a href=\"#\" data-toggle=\"dropdown\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"> Category</i><span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
  try {
                                                while (catResult.next()) {
                                                    num++;
                                        
      out.write("\n");
      out.write("                                        <li><a href='categories.jsp?&catId=");
      out.print(catResult.getString(1));
      out.write('\'');
      out.write('>');
      out.print( catResult.getString(2));
      out.write("</a></li>\n");
      out.write("                                        ");

                                                }
                                            } catch (Exception e) {
                                                System.out.println("Error : " + e);
                                            }

                                        
      out.write("\n");
      out.write("                                    </ul>\n");
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
      out.write("        <section class=\"image\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"heading-two text-center\">Fortheby's Auction House</h2>\n");
      out.write("                <h3 class=\"heading-three text-center\">The Buying and Selling of artistic goods</h3>\n");
      out.write("                <form class=\"form-position\">\n");
      out.write("                    <input type=\"text\" name=\"search\" class=\"form-control input-lg placement\" placeholder=\"search your desired object\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success search-btn\" value=\"Search\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"information text-center\"><b>About The Website</b></h3>\n");
      out.write("                <p class=\"description text-justify\">\n");
      out.write("                    Fotheby’s is an international auction house specialising in the sale of fine art.\n");
      out.write("                    All auction items are currently classified into five categories; these are paintings, drawings, photographic images, sculptures and carvings.\n");
      out.write("                    All items, irrespective of category, have the essential details recorded such as an item lot number.\n");
      out.write("                    The name of the artist.\n");
      out.write("                    The year the work was produced.\n");
      out.write("                    A general subject classification for the piece. (Typical subject classifications include:- landscape, seascape, portrait, figure, still life, nude, animal, abstract, or other)\n");
      out.write("                    A detailed textual description of the piece. \n");
      out.write("                    The auction date. An estimated price.\n");
      out.write("                </p>\n");
      out.write("                <div class=\"row image-position\">\n");
      out.write("                    <div class=\"image-column\">\n");
      out.write("                        <img src=\"frontend/image/carving4.jpg\" alt=\"Carving\" class=\"category\">\n");
      out.write("                        <div class=\"image-caption\">\n");
      out.write("                            <a href=\"#\">Carving</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"image-column\">\n");
      out.write("                        <img src=\"frontend/image/draw2.jpg\" alt=\"Drawing\" class=\"category\">\n");
      out.write("                        <div class=\"image-caption\">\n");
      out.write("                            <a href=\"#\">Drawing</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"image-column\">\n");
      out.write("                        <img src=\"frontend/image/paint1.jpg\" alt=\"Painting\" class=\"category\">\n");
      out.write("                        <div class=\"image-caption\">\n");
      out.write("                            <a href=\"#\">Painting</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"image-column\">\n");
      out.write("                        <img src=\"frontend/image/photo2.jpg\" alt=\"Photographic Image\" class=\"category\">\n");
      out.write("                        <div class=\"image-caption\">\n");
      out.write("                            <a href=\"#\">Photographic Image</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"image-column\">\n");
      out.write("                        <img src=\"frontend/image/sculpture4.jpg\" alt=\"Sculpture\" class=\"category\">\n");
      out.write("                        <div class=\"image-caption\">\n");
      out.write("                            <a href=\"#\">Sculpture</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>            \n");
      out.write("        </section>\n");
      out.write("        <section class=\"company\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"text-center\"><b>About Fortheby's Auction House</b></h3>\n");
      out.write("                <p class=\"description text-justify\">\n");
      out.write("                    Fotheby’s is an international auction house specialising in the sale of fine art.\n");
      out.write("                    All auction items are currently classified into five categories; these are paintings, drawings, photographic images, sculptures and carvings.\n");
      out.write("                    All items, irrespective of category, have the essential details recorded such as an item lot number.\n");
      out.write("                    The name of the artist.\n");
      out.write("                    The year the work was produced.\n");
      out.write("                    A general subject classification for the piece. (Typical subject classifications include:- landscape, seascape, portrait, figure, still life, nude, animal, abstract, or other)\n");
      out.write("                    A detailed textual description of the piece. \n");
      out.write("                    The auction date. An estimated price.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"form\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 size\">\n");
      out.write("                        <h4><b>Are you interested in joining Forthey Auction House??</b></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 size\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"buyer\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Buyer Interest Form</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"seller\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Seller Interest Form</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 spacing\">\n");
      out.write("                        <h3>Opening Hours</h3>\n");
      out.write("                        <p>Wednesday and Saturday</p>\n");
      out.write("                        <p>Each day 3 session</p>\n");
      out.write("                        <p>Each session 3 hour(morning, afternoon, evening)</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 spacing\">\n");
      out.write("                        <h3>About us</h3>\n");
      out.write("                        <p>Offices in London, Paris, New York</p>\n");
      out.write("                        <p>Head Quarters in London</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">  \n");
      out.write("                        <h3 class=\"share\">Share</h3>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"frontend/image/fb.png\" class=\"share-icon\">\n");
      out.write("                                        <h5>Facebook</h5>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"frontend/image/insta.jpg\" class=\"share-icon\">\n");
      out.write("                                        <h5>Instagram</h5>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"frontend/image/twit.png\" class=\"share-icon\">\n");
      out.write("                                        <h5>Twitter</h5>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"frontend/image/gp.jpg\" class=\"share-icon\">\n");
      out.write("                                        <h5>Google+</h5>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <hr>\n");
      out.write("                <h4 class=\"text-center\">Copyright@2019 | Fortheby Auction House</h4>\n");
      out.write("                <h4 class=\"text-center\">Term and condition</h4>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
