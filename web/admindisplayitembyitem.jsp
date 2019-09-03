<%-- 
    Document   : displayitems
    Created on : 01-Apr-2019, 21:46:29
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%
    DbSelect dbcategory = new DbSelect();
    String itemId = request.getParameter("itemId").trim();
    int number = 0;
    ResultSet result = dbcategory.DisplayItemById(itemId);
    result.first();
    String category = dbcategory.CategoryNameById(result.getString(2));
%>

<%@include file="adminheader.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="paintbg">
    <% out.print(category);%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            <%= result.getString(3)%>
        </h2>
        <div class="tab-content">
            <table>
                <tr>
                    <th>Category</th>
                    <td><%= dbcategory.CategoryNameById(result.getString(2))%></td>
                </tr>
                <tr>
                    <th>Item Name</th>
                    <td><%= result.getString(3)%></td>
                <tr>
                    <th>Created Year</th>
                    <td><%= result.getString(4)%></td>
                </tr>
                <tr>
                    <th>Classification</th>
                    <td><%= result.getString(5)%></td>
                </tr>
                <tr>
                    <th>Description</th>
                    <td><%= result.getString(6)%></td>
                </tr>
                <tr>
                    <th>Auction Date</th>
                    <td><%= result.getString(7)%></td>
                </tr>
                <tr>
                    <th>Estimated Price</th>
                    <td><%= result.getString(8)%></td>
                </tr>
            </table>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
