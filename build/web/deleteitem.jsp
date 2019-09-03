<%-- 
    Document   : deleteitem
    Created on : 24-Apr-2019, 06:40:29
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>

<%
    String itemLot = request.getParameter("itemLot");
    out.print(itemLot);
    DbSelect display = new DbSelect();
    ResultSet item = display.DisplayItemById(itemLot);
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
            <img src="upload/<%=item.getString(17)%>" width="150" height="100">
            <ul>
                <li><a href="/Fortheby/DeleteItem?&itemLot=<%=item.getString(1)%>" onclick="myDeleteMessage()"><b><i><u>Yes?</u></i></b></a></li>
                <li><a href="admindisplayitems.jsp"><b><i><u>No?</u></i><b></a></li>
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
