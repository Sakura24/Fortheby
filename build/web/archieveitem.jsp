<%-- 
    Document   : archieveitem
    Created on : 24-Apr-2019, 13:34:52
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%    DbSelect item = new DbSelect();
    ResultSet result = item.DisplayItemByStatus();
    Integer number = 0;
    int count = item.ItemStatusCount();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <% if (count > 0 ){ %>
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
             <div class="button">
                <a href="archieveitem.jsp" class="btn btn-default add-btn active" role="button">Archieve
                <% if(count>0){ %>
                       [<%=count%>]
                   <%
                   }
                    %>
                </a>
                <a href="admindisplayitems.jsp" class="btn btn-default display-btn" role="button">Display</a>
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
                        <a href="adminsoldreadmore.jsp?&itemId=<%=result.getString(1)%>&catId=<%= result.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    <form method="post" action="/Fortheby/UnarchieveItem" onclick="myArchievedMessage()">
                        <input type="hidden" name="item_lot" value="<%=result.getString(1)%>">
                        <input type="hidden" name="status" value="<%=result.getString(18)%>">
                        <input type="submit" value="Unarchieve" class="btn btn-light unarchieve-btn">
                    </form>
                        <script>
                    function myArchievedMessage() {
                        alert("Successfully Unarchieved!");
                    }
                </script>
            <%
                    }
                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            %>
        </div>
        <% } else{ %>
        <div class="null-message">
            <h3>No Item has been archieved</h3>
        </div>
        <% } %>
    </div>
</section>
<%@include file="footer.jsp" %>