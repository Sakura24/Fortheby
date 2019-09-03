<%-- 
    Document   : editauction
    Created on : 27-Apr-2019, 08:25:15
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<% 
    String auctionId = request.getParameter("auctionId").trim();
    out.print(auctionId);
    ResultSet result = dbSelect.AuctionDetailById(auctionId);
    result.first();
    

%>
%>

<section class="item-bg">
    Auction
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Edit Auction Details
        </h2>
        <div class="form-content">
            <form class="form-type" method="post" action="/Fortheby/EditAuction">
                <label>Auction Title:</label>
                <input type="text" class="form-control input-lg input-design" value="<%=result.getString(2)%>" name="title">
               <label>Auction Location</label>
                <input type="text" class="form-control input-lg input-design" value="<%=result.getString(3)%>" name="location">
                <label>Date:</label>
                <input type="date" class="form-control input-lg input-design" value="<%=result.getString(4)%>" name="date">
                <label>Auction Lot:</label>
                <input type="text" class="form-control input-lg input-design" value="<%=result.getString(5)%>" name="auction_lot">
                <label>Period:</label>
                <input type="text" class="form-control input-lg input-design" value="<%=result.getString(6)%>" name="period">
                 <input type="hidden" class="form-control input-lg input-design" value="<%=auctionId%>" name="auction_id">
                <input type="submit" value="Edit" class="btn btn-danger add-button" onclick="myAddMessage()">
                <script>
                    function myAddMessage() {
                        alert("Auction Detail  Edited Successfully!");
                    }
                </script>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
