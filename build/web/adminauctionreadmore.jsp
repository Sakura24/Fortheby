<%-- 
    Document   : adminauctionreadmore
    Created on : 27-Apr-2019, 07:16:38
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%
    
    String auction_id = request.getParameter("auction_id");
    ResultSet result = dbSelect.AuctionDetailById(auction_id);
    result.first();
    
%>

<section class="item-bg">
    <%=result.getString(8)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
              <form class="form-type list-type">
                <div class="row">
                     <div class="modify">
                        <a href="updateitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Edit</i></u></a>
                        <a href="deleteitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Delete</u></i></a>
                    </div>
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(14)%>" width="550" height="650" class="cat_image"/>
                    </div>
                    <div class="col-md-6 second-column">
                        <label>Auction Title:<%= result.getString(1)%></label>
                        <br>
                        <label>Location: <%= result.getString(2)%></label>
                        <br>
                        <label>Auction Date: <%= result.getString(3)%></label>
                        <br>
                        <label>Lot Reference Number: <%= result.getString(5)%></label>
                        <br>
                        <label>Auction Period: <%= result.getString(4)%></label>
                        <br>
                        <label>Lot Number:<%= result.getString(6) %>/label>
                        <br>
                        <label>Period/Date of Production:: <%=result.getString(7)%></label>
                        <br>
                        <label>Piece Title: <%=result.getString(8)%></label>
                        <br>
                         <label>Price: <%=result.getString(9)%></label>
                        <br>
                         <label>Dimension: <%=result.getString(10)%></label>
                        <br>
                        <label>Framed: <%=result.getString(11)%></label>
                        <br>
                         <label>Artist:: <%=result.getString(12)%></label>
                        <br>
                         <label class='text-justify'>Description: <%=result.getString(13)%></label>
                        
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

