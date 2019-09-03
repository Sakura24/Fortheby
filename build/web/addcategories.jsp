<%-- 
    Document   : addcategories
    Created on : 31-Mar-2019, 22:19:21
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Categories
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Category
        </h2>
        <div class="form-content">
            <div class="button">
                <a href="addcategories.jsp" class="btn btn-default add-btn active" role="button">Add</a>
                <a href="admindisplaycategories.jsp" class="btn btn-default display-btn " role="button">Display</a>
            </div>
            <form class="form-type" method="post" action="/Fortheby/AddCategory" enctype="multipart/form-data">
                <label>Category Name:</label>
                <input type="text" class="form-control input-lg input-design" placeholder="Enter Category Name" name="cat_name">
                <label>Image Link:</label>
                <input type="file" name="file" class="form-control input-lg input-design">
                <input type="submit" value="Add" class="btn btn-danger add-button" onclick="myAddMessage()">
                <script>
                    function myAddMessage() {//used for the allert function
                        alert("Category Successfully Added!");
                    }
                </script>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
