<%-- 
    Document   : bidding
    Created on : 01-May-2019, 06:54:51
    Author     : Bishnu
--%>
<%@include file="buyerheader.jsp" %>

<% 
    String item_lot = request.getParameter("itemId");
    DbSelect profile = new DbSelect();
    String user_id = profile.GetUserIdFromEmail(usrEmail);
    ResultSet result = profile.DisplayItemStatusbyId(item_lot);
    result.first();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Bid
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Bid for the item
        </h2>
        <div class="form-content">
            <form class="form-type list-type" method="post" action="/Fortheby/Bidding">
                <div class="row">
                    <div class="col-sm-5 column">
                        <img src="upload/<%=result.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-sm-5">
                         <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <br>
                        <label>Min Bid:</label>
                        <input type="text" class="form-control input-lg input-design bid-design" placeholder="Enter Your Bid" name="bid_amount">
                        
                    </div>
                        <input type="hidden" name="item_lot" value="<%=item_lot%>">
                        <input type="hidden" name="user_id" value="<%=user_id%>">
                    <input type="submit" value="Add" class="btn btn-danger add-button add-item bid-btn" onclick="myAddMessage()">
                    <script>
                        function myAddMessage() {
                            alert("Bidding Successfully Added!");
                        }
                    </script>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
