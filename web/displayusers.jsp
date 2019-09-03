<%-- 
    Document   : displayusers
    Created on : 14-Apr-2019, 10:59:05
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>

<% 
        DbSelect pending = new DbSelect();
        ResultSet userResult = pending.DisplayUsers();
        int number =  0;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Users
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Clients
        </h2>
        <div class="form-content">
            <div class="user-button">
                <a href="pendingregistration.jsp" class="btn btn-info pend-pend-btn" role="button">
                    Pending
                    <% if(interestCount>0){ %>
                       [<%=interestCount%>]
                   <%
                   }
                    %>
                
                </a>
                <a href="addusers.jsp" class="btn btn-info pend-pend-btn" role="button">Add</a>
                <a href="displayusers.jsp" class="btn btn-info pend-pend-btn active" role="button">Display</a>
            </div>
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N.: </th>
                    <th>First Name: </th>
                    <th>Last Name: </th>
                    <th>Age: </th>
                    <th>Contact Number: </th>
                    <th>Profession: </th>
                    <th>User Type: </th>
                    <th>Bank Account Number: </th>
                    <th>Bank Sort Code: </th>
                    <th class="add-width">Interest</th>
                    <th>Email:</th>
                </tr>
                <%
                    try {
                        while (userResult.next()) {
                            number++;
                %>

                <tr>
                    <td><%= number%></td>
                    <td><b><%= userResult.getString(1)%></b></td>
                    <td><b><%= userResult.getString(2)%></b></td>
                    <td><%= userResult.getString(3)%></td>
                    <td><%= userResult.getString(4)%></td>
                    <td><%= userResult.getString(5)%></td>
                    <td><b><%= userResult.getString(6)%></b></td>
                    <td><%= userResult.getString(7)%></td>
                    <td><%= userResult.getString(8)%></td>
                    <td><b><%= pending.UserTypeById(userResult.getString(9))%></b></td>
                    <td><%= userResult.getString(10)%></td>
                    
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
                