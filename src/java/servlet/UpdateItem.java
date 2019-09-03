/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dbclass.DbUpdate;
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
public class UpdateItem extends HttpServlet {

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
//            out.println("<title>Servlet UpdateItem</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UpdateItem at " + request.getContextPath() + "</h1>");
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
        String itemLot = request.getParameter("itemLot");
        out.print(itemLot);
        String cat_id = request.getParameter("cat_id");
        out.print(cat_id);
        String item_name = request.getParameter("item_name");
        out.print(item_name);
        String artist_name = request.getParameter("artist_name");
        out.print(artist_name);
        String created_year = request.getParameter("created_year");
        out.print(created_year);
        String classify = request.getParameter("classify");
        out.print(classify);
        String description = request.getParameter("description");
        out.print(description);
        String auction_date = request.getParameter("auction_date");
        out.print(auction_date);
        String price = request.getParameter("price");
        out.print(price);
        String medium = request.getParameter("medium");
        out.print(medium);
        String framed = request.getParameter("framed");
        out.print(framed);
        String dimension = request.getParameter("dimension");
        out.print(dimension);
        String image_type = request.getParameter("image_type");
        out.print(image_type);
         String material = request.getParameter("material");
        out.print(material);
         String weight = request.getParameter("weight");
        out.print(weight);
        String auction_id = request.getParameter("auction_id");
        out.print(auction_id);
        DbUpdate update = new DbUpdate();
        int var = 0;
        int var2 = 0;
        out.print("var1=" + var);
        var = update.UpdateItem(cat_id, item_name, artist_name, created_year, classify, description, auction_date, price, medium, framed, dimension, image_type, material, weight, itemLot);
        var2 = update.UpdateAuctionId(auction_id, itemLot);
        out.print("var11=" + var);
        out.print("var2="+ var2);
        if((var == 1)&& (var2 == 1)) {
        response.sendRedirect("/Fortheby/admindisplayitems.jsp");
        }else {
                out.print("Error");
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
