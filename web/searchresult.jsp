<%-- 
    Document   : searchresult
    Created on : 24-Apr-2019, 21:02:59
    Author     : Bishnu
--%>
<%@include file="header.jsp" %>

<% 
    DbSelect dbSearch = new DbSelect();
    String item_lot = request.getParameter("item_lot");
    ResultSet searchResult = dbSearch.DisplayItemById(item_lot);
    searchResult.first();
%>

<section class="item-bg">
    <%=searchResult.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
                    <form class="form-type list-type">
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=searchResult.getString(17)%>" width="550" height="600" class="cat_image"/>
                    </div>
                    <div class="col-md-6 second-column">
                        <label>Category:<%= dbSearch.CategoryNameById(searchResult.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= searchResult.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= searchResult.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= searchResult.getString(5)%></label>
                        <br>
                        <label>Classification: <%= searchResult.getString(6)%></label>
                        <br>
                        <label class='text-justify'>Description: <p> <%= searchResult.getString(7) %></p></label>
                        <br>
                        <label>Auction Date: <%=searchResult.getString(8)%></label>
                        <br>
                        <label>Price: <%=searchResult.getString(9)%></label>
                        <br>
                        <label>Medium: <%=searchResult.getString(10)%></label>
                        <br>
                        <label>Framed: <%=searchResult.getString(11)%></label>
                        <br>
                        <label>Dimensions: <%=searchResult.getString(12)%></label>
                        <br>
                         <label>Image Type: <%=searchResult.getString(13)%></label>
                        <br>
                        <label>Material Used:  <%=searchResult.getString(14)%></label>
                        <br>
                        <label>Weight: <%=searchResult.getString(15)%></label>
                        <br>
                         <label>Seller: <%=dbSearch.GetUserNameFromId(searchResult.getString(16))%></label>
                        <br>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

