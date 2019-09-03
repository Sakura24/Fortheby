<%-- 
    Document   : admindisplayitems
    Created on : 03-Apr-2019, 17:48:59
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>

<%    DbSelect item = new DbSelect();
    ResultSet result = item.DisplayPendingItem();
    Integer number = 0;
    int count = item.ItemPendingArchieveCount();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
            <div class="user-button">
                <a href="archieveitem.jsp" class="btn btn-info pend-pend-btn" role="button">Archieve
                <% if(count>0){ %>
                       [<%=count%>]
                   <%
                   }
                    %>
                </a>
                <a href="additems.jsp" class="btn btn-info pend-pend-btn" role="button">Add</a>
                <a href="admindisplayitems.jsp" class="btn btn-info pend-pend-btn active" role="button">Display</a>
            </div>

            <%
                try {
                    while (result.next()) {
                        number++;
            %>

            <form class="form-type list-type">
                <div class="row">
                    <div class="modify">
                        <a href="updateitem.jsp?&itemLot=<%=result.getString(1)%>" class="link"><i><u>Edit</i></u></a>
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
                        <a href="itemreadmore.jsp?&itemId=<%=result.getString(1)%>&catId=<%= result.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    <form method="post" action="/Fortheby/ArchieveItem" onclick="myArchievedMessage()">
                        <input type="hidden" name="item_lot" value="<%=result.getString(1)%>">
                        <input type="hidden" name="status" value="<%=result.getString(18)%>">
                        <input type="submit" value="Archieve" class="btn btn-light unarchieve-btn">
                    </form>
                        <form method="post" action="/Fortheby/SoldStatus">
                        <input type="hidden" name="item_lot" value="<%=result.getString(1)%>">
                        <input type="hidden" name="sold_status" value="<%=result.getString(17)%>">
                        <input type="submit" value="Sell" class="btn btn-light sold">
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