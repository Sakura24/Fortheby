package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class admindisplayitembycategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DbSelect dbCategory = new DbSelect();
    String catId = request.getParameter("catId").trim();
    String category = dbCategory.CategoryNameById(catId);
    //out.print(category);
    int number = 0;
    ResultSet result = dbCategory.DisplayItemByCatId(catId);

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                                <li><a href=\"addcategories.jsp\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"> Category</i></a></li>\n");
      out.write("                                <li><a href=\"additems.jsp\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i></i> Items</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i> Auction Calendar</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><h6>Mijala Shakya</h6></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
 if (catId.endsWith("1")) {

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"carving\">\n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</section>\n");
      out.write("    \n");

    }

      out.write('\n');
      out.write('\n');
 if (catId.endsWith("2")) {

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"drawing\">\n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</section>\n");
      out.write("    \n");

    }

      out.write('\n');
      out.write('\n');
 if (catId.endsWith("3")) {

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"painting\">\n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</section>\n");
      out.write("    \n");

    }

      out.write('\n');
      out.write('\n');
 if (catId.endsWith("4")) {

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"photo\">\n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</section>\n");
      out.write("    \n");

    }

      out.write('\n');
      out.write('\n');
 if (catId.endsWith("5")) {

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"sculpture\">\n");
      out.write("    ");
      out.print(category);
      out.write("\n");
      out.write("</section>\n");
      out.write("    \n");

    }

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"detail\">\n");
      out.write("    <div class=\"container-fluid cat\">\n");
      out.write("        <h2 class=\"heading-one text-center\">\n");
      out.write("            All the items of ");
      out.print(category);
      out.write(" present in Fortheby Auction House.\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <div class=\"row cat_row\">\n");
      out.write("                    ");
 
                     try {
                    while (result.next()) {
//                    count = result.getString(1);
//                    catCount = cat.FoodItemByCatCount(count);    
                    

                
      out.write("\n");
      out.write("                    <div class=\"cat_column\">\n");
      out.write("                        <div class=\"category\">\n");
      out.write("                            <a href=\"customerdisplayfoodbycat.jsp?&catId=");
      out.print(result.getString(1) );
      out.write("\"><img src=\"upload=f\" altmomo=\"Snow\" class=\"cat_img\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <a href='customerdisplayfoodbycat.jsp?&catId=");
      out.print(result.getString(1) );
      out.write("' class=\"cat_name\"><b><i><u>");
      out.print( result.getString(2) );
      out.write(" [</b></i></u></a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");


                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            ");

                try {
                    while (result.next()) {
                        number++;
            
      out.write("\n");
      out.write("            <div class=\"item-list\">\n");
      out.write("                <div class=\"row img-spacing\">\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <img src=\"frontend/image/bg.jpg\" width=\"400\" height=\"300\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label class=\"item-name\">\n");
      out.write("                            <h4><b>Item name: ");
      out.print(result.getString(3));
      out.write("</b></h4>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"item-name\">\n");
      out.write("                            <h4><b>Item name: ");
      out.print(result.getString(4));
      out.write("</b></h4>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"item-name\">\n");
      out.write("                            <h4><b>Item name: ");
      out.print(result.getString(7));
      out.write("</b></h4>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"item-name\">\n");
      out.write("                            <h4><b>Item name: ");
      out.print(result.getString(8));
      out.write("</b></h4>\n");
      out.write("                        </label>\n");
      out.write("                        <br>\n");
      out.write("                        <a href=\"admindisplayitembyitem.jsp?&itemId=");
      out.print(result.getString(1));
      out.write("\" class=\"btn btn-default view-btn\" role=\"button\">View More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
