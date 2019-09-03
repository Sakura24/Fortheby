<%-- 
    Document   : pendingregistration
    Created on : 17-Apr-2019, 10:02:42
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>
<% 
        DbSelect pending = new DbSelect();
        ResultSet interest = pending.FilterInterestForm();
        //int interestCount = pending.InterestFormCount();
        int number =  0;
%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Users
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Pending Users
        </h2>
        <% if(interestCount > 0) { %>
        <div class="form-content">
            <div class="user-button">
                <a href="pendingregistration.jsp" class="btn btn-info pend-pend-btn active" role="button">
                    Pending
                   <% if(interestCount>0){ %>
                       [<%=interestCount%>]
                   <%
                   }
                    %>
                    
                    </a>
                <a href="addusers.jsp" class="btn btn-info pend-pend-btn" role="button">Add</a>
                <a href="displayusers.jsp" class="btn btn-info pend-pend-btn" role="button">Display</a>
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
                        while (interest.next()) {
                            number++;
                %>

                <tr>
                    <td><%= number%></td>
                    <td><b><%= interest.getString(1)%></b></td>
                    <td><b><%= interest.getString(2)%></b></td>
                    <td><%= interest.getString(3)%></td>
                    <td><%= interest.getString(4)%></td>
                    <td><%= interest.getString(5)%></td>
                    <td><b><%= interest.getString(6)%></b></td>
                    <td><%= interest.getString(7)%></td>
                    <td><%= interest.getString(8)%></td>
                    <td><%= interest.getString(9)%></td>
                    <td><%= interest.getString(10)%></td>
                    
                </tr>

                <%
                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </table>
             <% } else{ %>
        <div class="null-message">
            <h3>No Register Requesr Has Been Placed Till Now.</h3>
        </div>
        <% } %>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
        
