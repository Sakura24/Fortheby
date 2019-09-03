<%-- 
    Document   : sellinfo
    Created on : 25-Apr-2019, 21:31:49
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<% 
    DbSelect dbSold = new DbSelect();
    String item_lot = request.getParameter("item_lot").trim();
    out.print(item_lot);
    ResultSet userResult = dbSold.Buyer();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="search-bg">
    <div class="container search-container">
        <h3 class="text-center">Selling Details</h3>
        <form action="/Fortheby/UpdateSoldInfo" class="adv-form" method="post">
            <label>Selling Price:</label>
            <input type="text" name="sold_price"  Placeholder="Enter Selling Price" class="form-control input-lg search-date-design">
            <br>
            <label>Buyer Name:</label>
            <select name="user_id" class="form-control input-lg search-date-design" id="cat_select">
                <option value="0">-------Select Buyer Name-----</option>
                <%         try {
                        while (userResult.next()) {

                %>

                <option value="<%=userResult.getString(1)%>"><%=userResult.getString(2)%></option>
                <%

                        }

                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </select>  
                    <input type="hidden" value="<%=item_lot%>" name="item_lot">
                    <input type="submit" value="Add" class="btn btn-warning advance-search-button">
        </form>
    </div>
</section>
<%@include file="footer.jsp" %>