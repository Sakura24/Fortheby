/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dbclass.DbInsert;
import dbclass.DbInt;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Bishnu
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class AddItem extends HttpServlet {

    DbInt initialize = new DbInt();
    Connection con = initialize.makeConnection();
    PreparedStatement pstm;
    int var = 0;

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
//            out.println("<title>Servlet AddItem</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AddItem at " + request.getContextPath() + "</h1>");
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
        String item_lot=""; // creaitn the string values
        String cat_id = "";
        String item_name = "";
        String artist_name="";
        String created_year = "";
        String classify = "";
        String description = "";
        String medium = "";
        String framed = "";
        String dimension = "";
        String image_type = "";
        String material = "";
        String weight = "";
        String auction_date = "";
        String price = "";
        String seller_id = "";
        String fileName = "";
        //String filePath = "";
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List fileItems = upload.parseRequest(request);
            Iterator collect = fileItems.iterator();
            while (collect.hasNext()) {
                FileItem item = (FileItem) collect.next();
                if (item.isFormField()) {
                    if (item.getFieldName().equals("item_lot")) {
                        item_lot = item.getString();
                        response.getWriter().print("item_lot= " + item_lot);
                    }
                    if (item.getFieldName().equals("cat_id")) {
                        cat_id = item.getString();
                        response.getWriter().print("cat_id= " + cat_id);
                    }
                    if (item.getFieldName().equals("item_name")) {
                        item_name = item.getString();
                        response.getWriter().print("item_name=" + item_name);
                    }
                    if (item.getFieldName().equals("artist_name")) {
                        artist_name = item.getString();
                        response.getWriter().print("artist_name=" +artist_name);
                    }
                    if (item.getFieldName().equals("created_year")) {
                        created_year = item.getString();
                        response.getWriter().print("created_year=" + created_year);
                    }
                    if (item.getFieldName().equals("classify")) {
                        classify = item.getString();
                        response.getWriter().print("classify=" + classify);
                    }
                    if (item.getFieldName().equals("description")) {
                        description = item.getString();
                        response.getWriter().print("description=" + description);
                    }
                    
                    if (item.getFieldName().equals("auction_date")) {
                        auction_date = item.getString();
                        response.getWriter().print("auction_date =" + auction_date);
                    }
                    if (item.getFieldName().equals("price")) {
                        price = item.getString();
                        response.getWriter().print("price=" + price);
                    }
                    
                    if (item.getFieldName().equals("medium")) {
                        medium = item.getString();
                        response.getWriter().print("medium=" + medium);
                    }
                    
                    if (item.getFieldName().equals("framed")) {
                        framed = item.getString();
                        response.getWriter().print("frame=" + framed);
                    }
                    
                    if (item.getFieldName().equals("dimension")) {
                        dimension = item.getString();
                        response.getWriter().print("dimension=" + dimension);
                    }
                    
                    if (item.getFieldName().equals("image_type")) {
                        image_type = item.getString();
                        response.getWriter().print("image_type=" + image_type);
                    }
                    
                    if (item.getFieldName().equals("material")) {
                        material = item.getString();
                        response.getWriter().print("material=" + material);
                    }
                    
                    if (item.getFieldName().equals("weight")) {
                        weight = item.getString();
                        response.getWriter().print("weight=" + weight);
                    }
                    
                    if (item.getFieldName().equals("user_id")) {
                        seller_id = item.getString();
                        response.getWriter().print("seller_id=" + seller_id);
                    }
                } else {
                    fileName = item.getName();
                    response.getWriter().print(fileName);
                    File file = new File("E:\\assignmentbackups\\Fortheby\\web\\upload\\" + fileName);
                    item.write(file);
                }
            }
            pstm = con.prepareStatement("INSERT INTO items (item_lot, cat_id, item_name, artist_name, created_year, classify, description, auction_date, price, medium, framed, dimension, image_type, material, weight, seller_id, image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, item_lot);
            pstm.setString(2, cat_id);
            pstm.setString(3, item_name);
            pstm.setString(4, artist_name);
            pstm.setString(5, created_year);
            pstm.setString(6, classify);
            pstm.setString(7, description);
            pstm.setString(8, auction_date);
            pstm.setString(9, price);
            pstm.setString(10, medium);
            pstm.setString(11, framed);
            pstm.setString(12, dimension);
            pstm.setString(13, image_type);
            pstm.setString(14, material);
            pstm.setString(15, weight);
            pstm.setString(16, seller_id);
            pstm.setString(17, fileName);
            var = pstm.executeUpdate();
            out.print(var);
            if (var == 1) {
                response.sendRedirect("/Fortheby/admindisplayitems.jsp");
            } else {
                out.print("Error");
            }
           
        } catch (Exception ex) {
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
