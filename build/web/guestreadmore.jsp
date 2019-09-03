<%-- 
    Document   : guestreadmore
    Created on : 24-Apr-2019, 13:12:20
    Author     : Bishnu
--%>
<%@include file="header.jsp" %>

<%
    DbSelect item = new DbSelect();
    String catId = request.getParameter("catId");
    String name = item.CategoryNameById(catId);
    String itemId = request.getParameter("itemId");
    ResultSet result = item.DisplayItemById(itemId);
    result.first(); 
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    <%=result.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
              <form class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(17)%>" width="550" height="600" class="cat_image"/>
                    </div>
                    <div class="col-md-6 second-column">
                        <label>Category:<%= item.CategoryNameById(result.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(5)%></label>
                        <br>
                        <label>Classification: <%= result.getString(6)%></label>
                        <br>
                        <label class='text-justify'>Description: <p> <%= result.getString(7) %></p></label>
                        <br>
                        <label>Auction Date: <%=result.getString(8)%></label>
                        <br>
                        <label>Price: <%=result.getString(9)%></label>
                        <br>
                         <label>Medium Used: <%=result.getString(10)%></label>
                        <br>
                         <label>Framed <%=result.getString(11)%></label>
                        <br>
                        <label>Dimensions: <%=result.getString(12)%></label>
                        <br>
                         <label>Image Type: <%=result.getString(13)%></label>
                        <br>
                         <label>Material Used: <%=result.getString(14)%></label>
                        <br>
                         <label>Weight: <%=result.getString(15)%></label>
                         <br>
                         <label>Seller: <%=item.GetUserNameFromId(result.getString(16))%></label>
                        <br>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
