<%-- 
    Document   : biditem
    Created on : 01-May-2019, 12:03:49
    Author     : Bishnu
--%>
<%@include file="buyerheader.jsp" %>

<% 
    String user_id = dbSelect.GetUserIdFromEmail(usrEmail);
    out.print(user_id);
    ResultSet result = dbSelect.DisplayUserBid(user_id);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Bidding
</section>
<section class="detail">
    <div class="container-fluid cat">
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
                        <label>Bidders Name: <%=dbSelect.GetUserNameFromId(result.getString(4))%></label>
                        <br>
                        <label>Bidding Amount: <%= result.getString(5)%></label>
                        <p><a href="editbidamount.jsp?&bidId=<%=result.getString(6)%>" class="link"><b><u><i>Edit Bid Amount</i></u></b></a></p>
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

