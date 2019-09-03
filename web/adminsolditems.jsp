<%-- 
    Document   : adminsolditems
    Created on : 26-Apr-2019, 10:20:38
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<% 
    DbSelect dbSold = new DbSelect();
    ResultSet result = dbSold.DisplaySoldItem();
    Integer number = 0;
    int count = dbSold.ItemSoldStatusCount();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Sold Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            The following are the sold items list
        </h2>
        <div class="tab-content">
            <div class="button">
                <a href="archieveitem.jsp" class="btn btn-default display-btn" role="button">Archieve
                <% if(count>0){ %>
                       [<%=count%>]
                   <%
                   }
                    %>
                </a>
                <a href="admindisplayitems.jsp" class="btn btn-default add-btn active" role="button">Display</a>
            </div>

            <%
                try {
                    while (result.next()) {
                        number++;
            %>

            <form class="form-type list-type">
                <div class="row">
                    <div class="modify">
                        <a href="deleteitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Delete</u></i></a>
                    </div>
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=result.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= dbSelect.CategoryNameById(result.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= result.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= result.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= result.getString(5)%></label>
                        <br>
                        <label>Classification: <%= result.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= result.getString(7) %></label>
                        <a href="adminsoldreadmore.jsp?&itemId=<%=result.getString(1)%>&catId=<%= result.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    <form method="post" action="/Fortheby/ArchieveItem" onclick="myArchievedMessage()">
                        <input type="hidden" name="item_lot" value="<%=result.getString(1)%>">
                        <input type="hidden" name="status" value="<%=result.getString(18)%>">
                        <input type="submit" value="Archieve" class="btn btn-light unarchieve-btn">
                    </form>
                        <input type="submit" value="Sold" class="btn btn-light sold">
                    </form>
                        <script>
                    function myArchievedMessage() {
                        alert("Successfully Archieved!");
                    }
                </script>
                    
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