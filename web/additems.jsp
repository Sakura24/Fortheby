<%-- 
    Document   : addcarving
    Created on : 18-Apr-2019, 07:45:59
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@include file="adminheader.jsp" %>

<%    DbSelect item = new DbSelect();
    ResultSet catResult = item.DisplayCategory();
    ResultSet userResult = item.Users();
    
    int count = item.ItemStatusCount();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Item
        </h2>
        <h4 class="text-center">please insert <code>none</code> if some fields are not needed</h4>
        <div class="form-content">
            <div class="user-button">
                <a href="archieveitem.jsp" class="btn btn-info pend-pend-btn" role="button">Archieve
                    <% if (count > 0) {%>
                    [<%=count%>]
                    <%
                        }
                    %>
                </a>
                <a href="additems.jsp" class="btn btn-info pend-pend-btn active" role="button">Add</a>
                <a href="admindisplayitems.jsp" class="btn btn-info pend-pend-btn" role="button">Display</a>
            </div>
            <form class="form-type list-type" method="post" action="/Fortheby/AddItem" enctype="multipart/form-data">
                <div class="row">
                    <div class="col-sm-5 column">
                        <label>Lot Number:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Lot Number" name="item_lot">
                        <label>Category Name:</label>
                        <select name="cat_id" class="form-control input-lg input-design" id="cat_select">

                            <%         try {
                                    while (catResult.next()) {

                            %>

                            <option value="<%=catResult.getString(1)%>"><%=catResult.getString(2)%></option>
                            <%

                                    }

                                } catch (Exception e) {
                                    System.out.println("Error : " + e);
                                }

                            %>

                        </select>
                        <label>Item Name:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Item Name" name="item_name">
                        <label>Artist Name:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Artist Name" name="artist_name">
                        <label>Created Year:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Created Year" name="created_year">
                        <label>Classification:</label>
                        <select name="classify" class="form-control input-lg input-design">
                            <option value="Landscape">Landscape</option>
                            <option value="Seascape">Seascape</option>
                            <option value="Portrait">Portrait</option>
                            <option value="Figure">Figure</option>
                            <option value="Still Life">Still Life</option>
                            <option value="Nude">Nude</option>
                            <option value="Animal">Animal</option>
                            <option value="Abstract">Abstract</option>
                            <option value="Other">Other</option>
                        </select>
                        <label>Description:</label>
                        <textarea type="text" class="form-control input-lg input-design" placeholder="Enter Description" name="description"></textarea>
                        <label>Auction Date:</label>
                        <input type="date" class="form-control input-lg input-design" placeholder="Enter Auction Date" name="auction_date">
                        <label>Estimated Price:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Estimated Price" name="price">

                    </div>
                    <div class="col-sm-5">

                        <label>Medium Used: </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Medium For Drawing/Painting" name="medium">
                        <label>Frame: </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Frame For Drawing/Painting" name="framed">
                        <label>Dimensions(cm): </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Dimensions in cm" name="dimension">
                        <label>Image Type: </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Image Type For Photography" name="image_type">
                        <label>Material Used: </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Medium For Carving/Sculpture" name="material">
                        <label>Weight(kg): </label>
                        <input type="text" class="form-control input-lg input-design text-area" placeholder="Enter Weight in kg" name="weight">
                        <label>Seller Name:</label>
                        <select name="user_id" class="form-control input-lg input-design" id="cat_select">
                            <option value ="0">-----Select Seller-------</option>
                            <%         try {
                                    while (userResult.next()) {
                                        
                            %>

                            <option value="<%=userResult.getString(1)%>"><%=userResult.getString(2)%></option>
                            <%

                                    }

                                } catch (Exception e) {
                                    System.out.println("Error : " + e);
                                }

                            %>

                        </select>
                        <label>Image:</label>
                        <input type="file" class="form-control input-lg input-design" name="image">
                    </div>
                    <input type="submit" value="Add" class="btn btn-danger add-button add-item" onclick="myAddMessage()">
                    <script>
                        function myAddMessage() {
                            alert("Item Successfully Added!");
                        }
                    </script>
                </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
