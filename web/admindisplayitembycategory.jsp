<%-- 
    Document   : displayitembycategory
    Created on : 02-Apr-2019, 12:00:30
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@include file="adminheader.jsp" %>
<%
    DbSelect item = new DbSelect();
    String catId = request.getParameter("catId");
    String name = item.CategoryNameById(catId);
    ResultSet result = item.DisplayItemByCatId(catId);
     int itemCount = item.ItemByCatCount(catId);
    int number = 0;
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% if (catId.endsWith("1") || name.equals("Carvings")) {
%>

<section class="carving">
    <%=name%>
</section>
    
<%
    } else if (catId.endsWith("2") || name.equals("Drawings")) {
%>

<section class="drawing">
    <%=name%>
</section>
    
<%
    } else if (catId.endsWith("3") || name.equals("Paintings")){
%>
>

<section class="painting">
    <%=name%>
</section>
    
<%
    } else if (catId.endsWith("4") || name.equals("Photographic Images")) {
%>

<section class="photo">
    <%=name%>
</section>
    
<%
    } else if (catId.endsWith("5") || name.equals("Sculptures")) {
%>

<section class="sculpture">
    <%=name%>
</section>
    
<%
    } else {
%>

<section class="item-bg">
    <%=name%>
</section>

<% } %>

<section class="detail">
    <div class="container-fluid cat">
         <% if(itemCount > 0) { %>
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
            <div class="button">
                <a href="additems.jsp" class="btn btn-default add-btn" role="button">Add</a>
                <a href="admindisplaycategories.jsp" class="btn btn-default display-btn active" role="button">Display</a>
            </div>

            <%
                try {
                    while (result.next()) {
                        number++;
            %>

            <form class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= dbSelect.CategoryNameById(result.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(5)%></label>
                        <br>
                        <label>Classification: <%= result.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= result.getString(7) %></label>
                        <a href="itemreadmore.jsp?&itemId=<%=result.getString(1)%>&catId=<%= result.getString(2)%>" class="read-more"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
            <%
                    }
                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            %>
        </div>
        <% } else{ %>
        <div class="null-message">
            <h3>All the items of these category has either been sold out / Items of this category is not present in our auction house at the moment.</h3>
        </div>
        <% } %>
    </div>
</section>
<%@include file="footer.jsp" %>