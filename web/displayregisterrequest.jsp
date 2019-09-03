<%-- 
    Document   : displayregisterrequest
    Created on : 16-Apr-2019, 18:29:49
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>

<% DbSelect interest = new DbSelect();
    ResultSet result = interest.InterestForm();
    int number = 0;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="user">
    Interest Form
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Register Request
        </h2>
        <div class="form-content">
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N. </th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Age</th>
                    <th>Contact Number</th>
                    <th>Profession</th>
                    <th>User Type</th>
                    <th>Bank Account Number</th>
                    <th>Bank Sort Number</th>
                    <th class="desc-width">Interest</th>
                    <th>Email</th>
                    </tr>

                <%
                    try {
                        while (result.next()) {
                            number++;
                %>

                <tr>
                    <td><%= number%></td>
                     <td><%= result.getString(2)%></td>
                    <td><%= result.getString(3)%></td>
                    <td><%= result.getString(4)%></td>
                    <td><%= result.getString(5)%></td>
                    <td><%= result.getString(6)%></td>
                    <td><b><%= interest.UserTypeById(result.getString(7))%></b></td>
                    <td><%= result.getString(8)%></td>
                    <td><%= result.getString(9)%></td>
                    <td><%= result.getString(10)%></td>
                    <td><%= result.getString(11)%></td>  
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