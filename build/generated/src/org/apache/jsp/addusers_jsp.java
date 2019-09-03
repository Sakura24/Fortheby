package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclass.DbSelect;
import java.sql.ResultSet;
import dbclass.DbSelect;

public final class addusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    DbSelect dbSelect = new DbSelect();
    String usrEmail = session.getAttribute("uemail").toString();
    int interestCount = dbSelect.InterestFormCount();
    ResultSet searchItem = dbSelect.DisplayItem();
    int searchCount = 0;
    searchCount = dbSelect.ItemCountStatus();
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
      out.write("                                <li><a href=\"admindisplaycategories.jsp\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"> Category</i></a></li>\n");
      out.write("                                <li><a href=\"admindisplayitems.jsp\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"> Pending Items</i></a></li>\n");
      out.write("                                <li><a href=\"adminsolditems.jsp\"><i class=\"fa fa-money\" aria-hidden=\"true\"> Sold Item</i></a></li>\n");
      out.write("                                <li><a href=\"addauction.jsp\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"> Auction</i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-phone\" aria-hidden=\"true\"> Contact</i></a></li>\n");
      out.write("                                <li><a href=\"addusers.jsp\"><i class=\"fa fa-users\" aria-hidden=\"true\"> \n");
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
      out.write("                                        </b></i></a></li>\n");
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

    DbSelect type = new DbSelect();
    ResultSet interestResult = type.InterestForm();
    ResultSet userResult = type.filterUserType();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section class=\"item-bg\">\n");
      out.write("    Users\n");
      out.write("</section>\n");
      out.write("<section class=\"detail\">\n");
      out.write("    <div class=\"container-fluid cat\">\n");
      out.write("        <h2 class=\"heading-one text-center\">\n");
      out.write("            Add Clients\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"form-content\">\n");
      out.write("            <div class=\"user-button\">\n");
      out.write("                <a href=\"pendingregistration.jsp\" class=\"btn btn-info pend-pend-btn \" role=\"button\">\n");
      out.write("                    Pending\n");
      out.write("                    ");
 if(interestCount>0){ 
      out.write("\n");
      out.write("                       [");
      out.print(interestCount);
      out.write("]\n");
      out.write("                   ");

                   }
                    
      out.write("\n");
      out.write("                \n");
      out.write("                </a>\n");
      out.write("                <a href=\"addusers.jsp\" class=\"btn btn-info pend-pend-btn active\" role=\"button\">Add</a>\n");
      out.write("                <a href=\"displayusers.jsp\" class=\"btn btn-info pend-pend-btn\" role=\"button\">Display</a>\n");
      out.write("            </div>\n");
      out.write("            <form class=\"form-type list-type\" method=\"post\" action=\"/Fortheby/AddUser\">\n");
      out.write("                <label>Client:</label>\n");
      out.write("                <select name=\"form_id\" class=\"form-control input-lg input-design\">\n");
      out.write("                    <option value=\"0\">-------Select Customer-----</option>\n");
      out.write("                    ");
         try {
                            while (interestResult.next()) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(interestResult.getString(1));
      out.write('"');
      out.write('>');
      out.print(interestResult.getString(2));
      out.write(' ');
      out.print(interestResult.getString(3));
      out.write("</option>\n");
      out.write("                    ");


                            }

                        } catch (Exception e) {
                            System.out.println("Error : " + e);
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <label>Username: </label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Username\" name=\"username\">\n");
      out.write("                <label>Secondary Contact No:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Contact Number\" name=\"contact_no\">\n");
      out.write("                <label>Address: </label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Address\" name=\"address\">\n");
      out.write("                <label>User Type: </label>\n");
      out.write("                        <select name=\"user_type_id\" class=\"form-control input-lg input-design\">\n");
      out.write("                            <option value=\"0\">-------Select Type-----</option>\n");
      out.write("                            ");
         try {
                                    while (userResult.next()) {

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(userResult.getString(1));
      out.write('"');
      out.write('>');
      out.print(userResult.getString(2));
      out.write("</option>\n");
      out.write("                            ");


                                    }

                                } catch (Exception e) {
                                    System.out.println("Error : " + e);
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                <label>Email Address: </label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-lg input-design\" placeholder=\"Enter Email Address\" name=\"email\">\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" id=\"psw\" class=\"form-control input-lg input-design\" placeholder=\"Enter Password\" name=\"password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" required>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Add\" class=\"btn btn-danger add-button add-user\">\n");
      out.write("            </form>\n");
      out.write("            <div id=\"msg\">\n");
      out.write("                <h3>Password must contain the following:</h3>\n");
      out.write("                <p id=\"pass-letter\" class=\"invalid\">A <b>lowercase</b> letter</p>\n");
      out.write("                <p id=\"pass-capital\" class=\"invalid\">A <b>capital (uppercase)</b> letter</p>\n");
      out.write("                <p id=\"pass-number\" class=\"invalid\">A <b>number</b></p>\n");
      out.write("                <p id=\"pass-length\" class=\"invalid\">Minimum <b>8 characters</b></p>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                var myInput = document.getElementById(\"psw\");\n");
      out.write("                var letter = document.getElementById(\"pass-letter\");\n");
      out.write("                var capital = document.getElementById(\"pass-capital\");\n");
      out.write("                var number = document.getElementById(\"pass-number\");\n");
      out.write("                var length = document.getElementById(\"pass-length\");\n");
      out.write("\n");
      out.write("// When the user clicks on the password field, show the message box\n");
      out.write("                myInput.onfocus = function () {\n");
      out.write("                    document.getElementById(\"msg\").style.display = \"block\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("// When the user clicks outside of the password field, hide the message box\n");
      out.write("                myInput.onblur = function () {\n");
      out.write("                    document.getElementById(\"msg\").style.display = \"none\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("// When the user starts to type something inside the password field\n");
      out.write("                myInput.onkeyup = function () {\n");
      out.write("                    // Validate lowercase letters\n");
      out.write("                    var lowerCaseLetters = /[a-z]/g;\n");
      out.write("                    if (myInput.value.match(lowerCaseLetters)) {\n");
      out.write("                        letter.classList.remove(\"invalid\");\n");
      out.write("                        letter.classList.add(\"valid\");\n");
      out.write("                    } else {\n");
      out.write("                        letter.classList.remove(\"valid\");\n");
      out.write("                        letter.classList.add(\"invalid\");\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Validate capital letters\n");
      out.write("                    var upperCaseLetters = /[A-Z]/g;\n");
      out.write("                    if (myInput.value.match(upperCaseLetters)) {\n");
      out.write("                        capital.classList.remove(\"invalid\");\n");
      out.write("                        capital.classList.add(\"valid\");\n");
      out.write("                    } else {\n");
      out.write("                        capital.classList.remove(\"valid\");\n");
      out.write("                        capital.classList.add(\"invalid\");\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Validate numbers\n");
      out.write("                    var numbers = /[0-9]/g;\n");
      out.write("                    if (myInput.value.match(numbers)) {\n");
      out.write("                        number.classList.remove(\"invalid\");\n");
      out.write("                        number.classList.add(\"valid\");\n");
      out.write("                    } else {\n");
      out.write("                        number.classList.remove(\"valid\");\n");
      out.write("                        number.classList.add(\"invalid\");\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Validate length\n");
      out.write("                    if (myInput.value.length >= 8) {\n");
      out.write("                        length.classList.remove(\"invalid\");\n");
      out.write("                        length.classList.add(\"valid\");\n");
      out.write("                    } else {\n");
      out.write("                        \n");
      out.write("                        length.classList.remove(\"valid\");\n");
      out.write("                        length.classList.add(\"invalid\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
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
