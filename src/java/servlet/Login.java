/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dbclass.DbInsert;
import dbclass.DbInt;
import dbclass.DbSelect;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bishnu
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Login</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        DbInt initial = new DbInt();
        HttpSession session = request.getSession();
        Connection con = initial.makeConnection();
        try {
            String uemail = request.getParameter("email"); // get hte stirng value form the form 
            String pass = request.getParameter("password");
            int email = initial.ValidateUser(request.getParameter("email"));
            out.print("email =" + email);
            out.print("email =" + pass);
            if (email == 1) {
                int password = initial.ValidatePassword(request.getParameter("email"), request.getParameter("password"));
                out.print(password);
                if (password == 1) {
                    session.setAttribute("uemail", uemail);
                    String user_type_id = initial.ValidateUserForRole(uemail);
                    out.print("user_type is =" + user_type_id);
                    String.valueOf(session.getAttribute("uemail"));
                    if (user_type_id.equals("1")) {
                            response.sendRedirect("/Fortheby/admindisplaycategories.jsp"); // give locaion of the new page
                        }
                    else if (user_type_id.equals("2")) {
                        response.sendRedirect("/Fortheby/buyerheader.jsp");
                    }
                    else if (user_type_id.equals("3")) {
                        response.sendRedirect("/Fortheby/sellerheader.jsp");
                    } else {
                        out.print("your user type is not inserted in the system");
                    }
                }
            }
            else if ((session.getAttribute("uemail") == null) || (session.getAttribute("uemail") == "")) {
                out.print("email is empty");
                response.sendRedirect("/spicebox/error.jsp");
            }
            else {
                        response.sendRedirect("/spicebox/error.jsp");
                    }
            
        } catch (Exception e) {
            System.out.println("Error:" + e);

        }
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
