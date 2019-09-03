/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dbclass.DbInsert;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bishnu
 */
public class InterestForm extends HttpServlet {

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
//            out.println("<title>Servlet InterestForm</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet InterestForm at " + request.getContextPath() + "</h1>");
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
        out.print("firstname" + request.getParameter("first_name"));
        out.print("lastname" + request.getParameter("last_name"));
        out.print("age" + request.getParameter("age"));
        out.print("contact_no" + request.getParameter("contact_no"));
        out.print("profession" + request.getParameter("profession"));
        out.print("user_type" + request.getParameter("user_type_id"));
        out.print("acc_no" + request.getParameter("acc_no"));
        out.print("sort_no" + request.getParameter("sort_no"));
        out.print("interest" + request.getParameter("interest"));
        out.print("email" + request.getParameter("email"));
        int var = 0;
        DbInsert insert = new DbInsert();
        try{
           var = insert.InterestForm(request.getParameter("first_name"), request.getParameter("last_name"), request.getParameter("age"), request.getParameter("contact_no"), request.getParameter("profession"), request.getParameter("user_type_id"), request.getParameter("acc_no"), request.getParameter("sort_no"), request.getParameter("interest"), request.getParameter("email"));
           if (var == 1){
           response.sendRedirect("/Fortheby/requestaccepted.jsp");
           }
           else {
                out.print("Error");
            }
        } 
        catch(Exception ex){
            ex.getMessage();
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
