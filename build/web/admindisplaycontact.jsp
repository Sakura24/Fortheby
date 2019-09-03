<%-- 
    Document   : admindisplaycontact
    Created on : 26-Apr-2019, 21:56:47
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<% 
    ResultSet result = dbSelect.DisplayAdminContact();
    int number = 0;
    int count = dbSelect.CountDisplayAdminContact();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Send Message
</section>
<section class="detail">
    <div class="container-fluid cat">
         <% if (count > 0){ %>
        <h2 class="heading-one text-center">
            Send message to the administrator
        </h2>
        <div class="tab-content">
            <div class="button">
                <a href="addcategories.jsp" class="btn btn-default add-btn" role="button">Add</a>
                <a href="admindisplaycategories.jsp" class="btn btn-default display-btn active" role="button">Display</a>
            </div>
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N. </th>
                    <th>Name</th>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Process</th>
                </tr>

                <%
                    try {
                        while (result.next()) {
                            number++;
                %>

                <tr>
                    <td><b><%= number%></b></td>
                    <td><b><%= dbSelect.GetFullNameFromEmail(result.getString(2))%></b></td>
                     <td><b><%= result.getString(3)%></b></td>
                     <td><b><%= result.getString(4)%></b></td>
                    <td><b><i><u><a href='replycontact.jsp?&contact_id=<%= result.getString(1)%>' > Reply</a></u></i></b></td>
                </tr>

                <%
                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </table>
        </div>
            <% } else{ %>
        <div class="null-message">
            <h3>All the recent queries have currently been answered. No new queries have been send by the seller or buyer </h3>
        </div>
        <% } %>
    </div>
</section>
<%@include file="footer.jsp" %>
