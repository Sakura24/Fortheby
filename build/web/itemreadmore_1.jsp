<%-- 
    Document   : itemreadmore
    Created on : 18-Apr-2019, 14:00:26
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>
<%
    DbSelect item = new DbSelect();
    String catId = request.getParameter("catId");
    String name = item.CategoryNameById(catId);
    String itemId = request.getParameter("itemId");
    ResultSet result = item.DisplayCatalogue(itemId);
    result.first(); 
    int auctionCount = item.AuctionCountById(itemId);
     out.print("aaa=" +auctionCount);
    
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
                     <div class="modify">
                        <a href="updateitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Edit</i></u></a>
                        <a href="deleteitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Delete</u></i></a>
                    </div>
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(16)%>" width="550" height="600" class="cat_image"/>
                    </div>
                    <% if (auctionCount > 0 ){%>
                    <div class="col-md-6 second-column">
                        <label>Category:<%= dbSelect.CategoryNameById(result.getString(1))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(2)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(4)%></label>
                        <br>
                        <label>Classification: <%= result.getString(5)%></label>
                        <br>
                        <label class='text-justify'>Description: <p> <%= result.getString(6) %></p></label>
                        <br>
                        <label>Auction Date: <%=result.getString(7)%></label>
                        <br>
                        <label>Price: <%=result.getString(8)%></label>
                        <br>
                         <label>Medium Used: <%=result.getString(9)%></label>
                        <br>
                         <label>Framed <%=result.getString(10)%></label>
                        <br>
                        <label>Dimensions: <%=result.getString(11)%></label>
                        <br>
                         <label>Image Type: <%=result.getString(12)%></label>
                        <br>
                         <label>Material Used: <%=result.getString(13)%></label>
                        <br>
                         <label>Weight: <%=result.getString(14)%></label>
                        <br>
                        <label>Seller: <%=item.GetUserNameFromId(result.getString(15))%></label>
                        <br>
                        <label>Auction Title: <%=result.getString(17)%></label>
                        <br>
                        <label>Auction Location: <%=result.getString(18)%></label>
                        <br>
                        <label>Auction Date: <%=result.getString(19)%></label>
                        <br>
                        <label>Lot Number: <%=result.getString(20)%></label>
<br>
                        <label>Period: <%=result.getString(21)%></label>
                        
                    </div>
                    <% } else { 
                        ResultSet itemResult = dbSelect.DisplayItemStatusbyId(itemId);
                    
                    %>
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
                        <label>Price: <%=result.getString(9)%></label>
                        <br>
                         <label>Medium Used: <%=result.getString(10)%></label>
                        <br>
                         <label>Framed <%=result.getString(11)%></label>
                        <br>
                        <label>Dimensions: <%=result.getString(13)%></label>
                        <br>
                         <label>Image Type: <%=result.getString(14)%></label>
                        <br>
                         <label>Material Used: <%=result.getString(15)%></label>
                        <br>
                         <label>Weight: <%=result.getString(16)%></label>
                        <br>
                        <label>Seller: <%=item.GetUserNameFromId(result.getString(17))%></label>
                        <br>

 <%                   } 
 %>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
