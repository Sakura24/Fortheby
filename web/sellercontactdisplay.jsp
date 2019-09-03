<%-- 
    Document   : sellercontactdisplay
    Created on : 26-Apr-2019, 20:52:42
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@include file="sellerheader.jsp" %>
<%
    ResultSet result = dbSelect.DisplayContact(usrEmail);
    int number = 0;

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Categories
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
             <div class="button">
                <a href="sellercontact.jsp" class="btn btn-default add-btn " role="button">Add</a>
                <a href="sellercontactdisplay.jsp" class="btn btn-default display-btn active " role="button">Display</a>
            </div>
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N. </th>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Process</th>
                </tr>

                <%                    try {
                        while (result.next()) {
                            number++;
                %>

                <tr>
                    <td><b><%= number%></b></td>
                    <td><b><%= result.getString(3)%></b></td>
                    <td><b><%= result.getString(4)%></b></td>  
                    <td><b><i><u><a href='sellerdisplayreply.jsp?&contact_id=<%= result.getString(1)%>' > Reply</a> | <a href='deletecategory.jsp?&contact_id=<%= result.getString(1)%>' > Delete</a></u></i></b></td>
                </tr>

                <%
                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </table>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>