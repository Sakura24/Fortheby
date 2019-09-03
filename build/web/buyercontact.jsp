<%-- 
    Document   : buyercontact
    Created on : 26-Apr-2019, 23:30:56
    Author     : Bishnu
--%>
<%@include file="buyerheader.jsp" %>
<%
    String seller_id= "";
    ResultSet user_id = dbSelect.GetSellerIdFromEmail(usrEmail);
    if (user_id.next()) {
        seller_id = (user_id.getString(1)); 
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Categories
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Category
        </h2>
        <div class="form-content">
            <div class="button">
                <a href="buyercontact.jsp" class="btn btn-default add-btn " role="button">Add</a>
                <a href="buyercontactdisplay.jsp" class="btn btn-default display-btn active " role="button">Display</a>
            </div>
        <form action="/Fortheby/BuyerInsertContact" method="post" class="form-type">
            <label>Contact Title:</label>
            <input type="text" name="title" placeholder="Enter Contact Title" class="form-control input-lg">
            <br>
            <label>Contact Description:</label>        
            <textarea type="text" name="description" placeholder="Enter Contact Description" class="form-control input-lg"></textarea>
            <input type="hidden" value="<%=seller_id%>"  name="seller_id">
            <input type="submit" value="Submit" class="btn btn-warning advance-search-button">
        </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
