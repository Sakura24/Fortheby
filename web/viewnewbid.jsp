<%-- 
    Document   : viewbid
    Created on : 01-May-2019, 09:18:57
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<%  DbSelect item = new DbSelect();
    ResultSet result = item.DisplayNewBid();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Bidding
</section>
<section class="detail">
    <div class="container-fluid cat">
       <% if(bidCount > 0){ %>
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
                        <img src="upload/<%=result.getString(1)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Item Name: <%= result.getString(2)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Bidders Name: <%=item.GetUserNameFromId(result.getString(4))%></label>
                        <br>
                        <label>Bidding Amount: <%= result.getString(5)%></label>
                    </div>
                </div>
            </form>     
                <form method="post" action="/Fortheby/BidStatus">
                        <input type="hidden" name="bid_id" value="<%=result.getString(6)%>">
                        <input type="submit" value="Mark Seen" class="btn btn-light bid-status">
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
            <h3>No New Bidding has been done on any items</h3>
        </div>
        <% } %>
        
    </div>
</section>
<%@include file="footer.jsp" %>

