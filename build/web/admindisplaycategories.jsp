<%-- 
    Document   : displaycategories
    Created on : 31-Mar-2019, 20:47:40
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>

<%
    DbSelect dbCategory = new DbSelect();
    int number = 0;
    ResultSet result = dbCategory.DisplayCategory();
    
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
                <a href="addcategories.jsp" class="btn btn-default add-btn" role="button">Add</a>
                <a href="admindisplaycategories.jsp" class="btn btn-default display-btn active" role="button">Display</a>
            </div>
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N. </th>
                    <th>Category</th>
                    <th>Image</th>
                    <th>Process</th>
                </tr>

                <%
                    try {
                        while (result.next()) {
                            int itemCount = dbCategory.ItemByCatCount(result.getString(1));
                            number++;
                %>

                <tr>
                    <td><b><%= number%></b></td>
                    <td><b><%= result.getString(2)%> [<%=itemCount%>]</b></td>
                    <td><img src="upload/<%=result.getString(3)%>" width="150" height="100" class="cat_image"/></td>
                    <td><b><i><u><a href='admindisplayitembycategory.jsp?&catId=<%=result.getString(1) %>'>View </a>|<a href='updatecategory.jsp?&catId=<%= result.getString(1)%>' > Edit</a> | <a href='deletecategory.jsp?&catId=<%= result.getString(1)%>' > Delete</a></u></i></b></td>
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