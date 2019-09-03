<%-- 
    Document   : deleteauction
    Created on : 27-Apr-2019, 09:11:02
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%
    String auctionId = request.getParameter("auctionId");
    out.print(auctionId);
    DbSelect display = new DbSelect();
    ResultSet item = display.AuctionDetailById(auctionId);
    item.first();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    <%=item.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid delete-confirm">
        <div class="confirm">
            <h3 class="text-center"> Do you want to delete the selected item?</h3>
            <ul>
                <li><a href="/Fortheby/DeleteAuction?&auctionId=<%=item.getString(1)%>" onclick="myDeleteMessage()"><b><i><u>Yes?</u></i></b></a></li>
                <li><a href="admindisplayauction.jsp"><b><i><u>No?</u></i><b></a></li>
                                 <script>
                                    function myDeleteMessage() {
                                        alert("Item Successfully Deleted!");
                                    }
                                </script>
            </ul>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

