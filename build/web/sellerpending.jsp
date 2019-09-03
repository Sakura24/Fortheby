<%-- 
    Document   : sellerpending
    Created on : 26-Apr-2019, 17:19:16
    Author     : Bishnu
--%>
<%@include file="sellerheader.jsp" %>

<% 
    DbSelect profile = new DbSelect();
    ResultSet result = profile.SellerPendingItem(usrEmail);
    int count = profile.CountSellerPendingItem(usrEmail);
    out.print(count);
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <% if(count > 0){ %>
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
            
            <%
                try {
                    while (result.next()) {
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
                        <a href="sellerpendreadmore.jsp?&itemId=<%=result.getString(1)%>&catId=<%= result.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
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
        <% } else {%>
        <div class="null-message">
            <h3>All the items that you have kept for auction has been sold.</h3>
        </div>
        <% } %>
    </div>
</section>
<%@include file="footer.jsp" %>
