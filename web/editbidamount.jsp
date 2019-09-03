<%-- 
    Document   : editbidamount
    Created on : 01-May-2019, 12:20:33
    Author     : Bishnu
--%>
<%@include file="buyerheader.jsp" %>

<% 
    String bid_id = request.getParameter("bidId");
    out.print(bid_id);
    ResultSet result = dbSelect.DisplayOldBidById(bid_id);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
     Bidding
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
           Edit the bidding amount 
        </h2>
        <div class="tab-content">
            <%
                try {
                    while (result.next()) {
            %>
            <div class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(1)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Item Name: <%= result.getString(2)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Bidders Name: <%=dbSelect.GetUserNameFromId(result.getString(4))%></label>
                        <form method="post" action="/Fortheby/UpdateBidAmount">
                            <label>Bidding Amount</label>
                            <input type="text" name="bid_amount" value="<%=result.getString(5)%>" class="form-control input-lg input-design bid-design">
                            <input type="hidden" name="bid_id" value="<%=bid_id%>">
                            <input type="submit" value="Edit" class="btn btn-danger add-button add-item edit-bid" onclick="myAddMessage()">
                        </form>
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
    </div>
</section>
<%@include file="footer.jsp" %>


