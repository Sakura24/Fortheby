<%-- 
    Document   : addauction
    Created on : 24-Apr-2019, 19:34:03
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<section class="item-bg">
    Auction
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Auction Details
        </h2>
        <div class="form-content">
            <div class="button">
                <a href="addauction.jsp" class="btn btn-default add-btn active" role="button">Add</a>
                <a href="admindisplayauction.jsp" class="btn btn-default display-btn " role="button">Display</a>
            </div>
            <form class="form-type" method="post" action="/Fortheby/AddAuction">
                <label>Auction Title:</label>
                <input type="text" class="form-control input-lg input-design" placeholder="Enter Auction Title" name="title">
               <label>Auction Location</label>
                <input type="text" class="form-control input-lg input-design" placeholder="Enter Auction Location" name="location">
                <label>Date:</label>
                <input type="date" class="form-control input-lg input-design" placeholder="Enter Auction Date" name="date">
                <label>Auction Lot:</label>
                <input type="text" class="form-control input-lg input-design" placeholder="Enter Auction Lot" name="auction_lot">
                <label>Period:</label>
                <input type="text" class="form-control input-lg input-design" placeholder="Enter Auction Period" name="period">
                <input type="submit" value="Add" class="btn btn-danger add-button" onclick="myAddMessage()">
                <script>
                    function myAddMessage() {
                        alert("Auction Detail Successfully Added!");
                    }
                </script>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
