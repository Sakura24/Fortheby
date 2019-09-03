<%-- 
    Document   : sellerreadmore
    Created on : 26-Apr-2019, 17:42:28
    Author     : Bishnu
--%>
<%@include file="sellerheader.jsp" %>
<% 
    DbSelect item = new DbSelect();
    String catId = request.getParameter("catId");
    String name = item.CategoryNameById(catId);
    String itemId = request.getParameter("itemId");
    String status = item.AuctionStatusById(itemId); 
    int intStatus = Integer.parseInt(status);
    
    
%>
<% 
    if (intStatus == 0){
        ResultSet result = item.DisplayItemSoldStatusbyId(itemId);
        result.first(); 
         String rate = item.DisplayCommission(itemId, usrEmail);
         int intRate = Integer.parseInt(rate);
         out.print(intRate);
         String soldPrice = item.DisplaySoldPrice(itemId, usrEmail);
         out.print(soldPrice);
         int intSold = Integer.parseInt(soldPrice);
         int afterCom = intSold - intRate;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    <%=result.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
              <form class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(17)%>" width="550" height="600" class="cat_image"/>
                    </div>
                    <div class="col-md-6 second-column">
                        <label>Category:<%= dbSelect.CategoryNameById(result.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(5)%></label>
                        <br>
                        <label>Classification: <%= result.getString(6)%></label>
                        <br>
                        <label class='text-justify'>Description: <p> <%= result.getString(7) %></p></label>
                        <br>
                        <label>Auction Date: <%=result.getString(8)%></label>
                        <br>
                        <label>Minimum Selling Price: <%=result.getString(9)%></label>
                        <br>
                        <label>Sold Price: <%=soldPrice%></label>
                        <br>
                        <label>After Commission: <%=afterCom%></label>
                        <br>
                         <label>Medium Used: <%=result.getString(10)%></label>
                        <br>
                         <label>Framed <%=result.getString(11)%></label>
                        <br>
                        <label>Dimensions: <%=result.getString(12)%></label>
                        <br>
                         <label>Image Type: <%=result.getString(13)%></label>
                        <br>
                         <label>Material Used: <%=result.getString(14)%></label>
                        <br>
                         <label>Weight: <%=result.getString(15)%></label>
                        <br>
                        <label>Seller: <%=item.GetUserNameFromId(result.getString(16))%></label>
                        <br>
                        <label>Buyer: <%=item.GetUserNameFromId(result.getString(22))%></label>
                        <br>
                    </div>
<% } else { 
        ResultSet result = item.DisplaySoldCatalogue(itemId);
        result.first(); 
       String rate = item.DisplayCommission(itemId, usrEmail);
         int intRate = Integer.parseInt(rate);
         out.print(intRate);
         String soldPrice = item.DisplaySoldPrice(itemId, usrEmail);
         out.print(soldPrice);
         int intSold = Integer.parseInt(soldPrice);
         int afterCom = intSold - intRate;

%>

<section class="item-bg">
    <%=result.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
              <form class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(18)%>" width="550" height="700" class="cat_image"/>
                    </div>
                    <div class="col-md-6 second-column">
                        <label>Auction Title: <%=result.getString(19)%></label>
                        <br>
                        <div class="row">
                            <div class="col-lg-6">
                                <label>Auction Location: <%=result.getString(20)%></label>
                        <br>
                        <label>Lot Reference Number: <%= result.getString(1)%></label>
                        <br>
                            </div>
                        <div class="col-lg-6">
                            <label>Auction Date: <%=result.getString(21)%></label>
                        <br>
                        <label>Period: <%=result.getString(23)%></label>
                        <br>
                        </div>
                        </div>                        
                        <label>Lot Number: <%=result.getString(22)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(5)%></label>
                        <br>
                        <label>Category:<%= dbSelect.CategoryNameById(result.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Classification: <%= result.getString(6)%></label>
                        <br>
                        <label>Auction Date: <%=result.getString(8)%></label>
                         <br>
                        <label>Minimum Selling Price: <%=result.getString(9)%></label>
                        <br>
                        <label>Sold Price: <%=soldPrice%></label>
                        <br>
                        <label>After Commission: <%=afterCom%></label>
                        <br>
                         <label>Medium Used: <%=result.getString(10)%></label>
                        <br>
                         <label>Framed <%=result.getString(11)%></label>
                        <br>
                        <label>Dimensions: <%=result.getString(12)%></label>
                        <br>
                         <label>Image Type: <%=result.getString(13)%></label>
                        <br>
                         <label>Material Used: <%=result.getString(14)%></label>
                        <br>
                         <label>Weight: <%=result.getString(15)%></label>
                        <br>
                        <label>Seller: <%=item.GetUserNameFromId(result.getString(16))%></label>
                        <br>
                         <label>Buyer <%=item.GetUserNameFromId(result.getString(17))%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <label class='text-justify'>Description: <p> <%= result.getString(7) %></p></label>
                        <br>
                    </div>
<% } %>
                </div>
              </form>
        </div>
    </div>
</section>
                <%@include file="footer.jsp" %>
                

