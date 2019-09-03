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
public class AddUser extends HttpServlet {

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
//            out.println("<title>Servlet AddUser</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AddUser at " + request.getContextPath() + "</h1>");
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
        int var = 0;
        String first_name = request.getParameter("first_name");
        out.print(first_name);
        String last_name = request.getParameter("last_name");
        out.print(last_name);
        String age = request.getParameter("age");
        out.print(age);
        String gender = request.getParameter("gender");
        out.print(gender);
        String address = request.getParameter("address");
        out.print(address);
        String contact_no = request.getParameter("contact_no");
        out.print(contact_no);
        String user_type_id = request.getParameter("user_type_id");
        out.print(user_type_id);
        int type_id = Integer.parseInt(user_type_id);
        String email = request.getParameter("email");
        out.print(email);
        String password = request.getParameter("password");
        out.print(password);
        try{
            DbInsert insert = new DbInsert();
            var = insert.User(first_name, last_name, age, gender, address, contact_no, user_type_id, email,password);
            out.print(var);
            if (var == 1) {
                    response.sendRedirect("/Fortheby/displayusers.jsp");
                }
            else {
                out.print("Error");
            }
            
        }catch (Exception ex){
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
