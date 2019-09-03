<%-- 
    Document   : updatecategory
    Created on : 01-Apr-2019, 18:45:50
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<% 
    DbSelect category = new DbSelect();
    String catId = request.getParameter("catId").trim();
    String cat = category.CategoryNameById(catId);
    ResultSet result = category.DisplayCategoryById(Integer.valueOf(request.getParameter("catId")));
    result.first();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% if (catId.endsWith("1")) {
%>

<section class="carving">
    <%=cat%>
</section>
    
<%
    }
%>

<% if (catId.endsWith("2")) {
%>

<section class="drawing">
    <%=cat%>
</section>
    
<%
    }
%>

<% if (catId.endsWith("3")) {
%>

<section class="painting">
    <%=cat%>
</section>
    
<%
    }
%>

<% if (catId.endsWith("4")) {
%>

<section class="photo">
    <%=cat%>
</section>
    
<%
    }
%>

<% if (catId.endsWith("5")) {
%>

<section class="sculpture">
    <%=cat%>
</section>
    
<%
    }
%>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Edit Category
        </h2>
        <div class="form-content">
            <div class="button">
                <a href="addcategories.jsp" class="btn btn-default add-btn active" role="button">Add</a>
                <a href="displaycategories.jsp" class="btn btn-default display-btn " role="button">Display</a>
            </div>
            <form class="form-type" method="post" action="/Fortheby/UpdateCategory">
                <label>Category Name:</label>
                <input type="text" class="form-control input-lg input-design" value="<%= result.getString(2)%> " name="cat_name">
                <input type="hidden" value="<%= catId%>" name="catId"/>
                <input type="submit" value="Edit" class="btn btn-danger add-button" onclick="myUpdateMessage()">
                <script>
                    function myUpdateMessage() {
                        alert("Category Successfully Updated!");
                    }
                </script>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
