<%-- 
    Document   : updateitem
    Created on : 23-Apr-2019, 12:01:22
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@include file="adminheader.jsp" %>

<% 
    DbSelect item = new DbSelect();
    String itemLot = request.getParameter("itemLot");
    ResultSet result = item.DisplayItemById(itemLot);
    result.first();
    ResultSet catResult = item.DisplayCategory();
    ResultSet auction = item.AuctionDetail();
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    <%=result.getString(3)%>
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Edit Item
        </h2>
        <h4 class="text-center">please insert <code>none</code> if some fields are not needed</h4>
        <div class="form-content">
            <form class="form-type list-type" method="post" action="/Fortheby/UpdateItem">
                <div class="row">
                    <div class="col-sm-5 column">
                        <label>Category Name:</label>
                        <select name="cat_id" class="form-control input-lg input-design" id="cat_select">
                            <option value="<%=result.getString(2)%>"><%=item.CategoryNameById(result.getString(2))%></option>
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
                        <input type="text" class="form-control input-lg input-design" value="<%=result.getString(3)%>" name="item_name">
                        <label>Artist Name:</label>
                        <input type="text" class="form-control input-lg input-design" value="<%=result.getString(4)%>" name="artist_name">
                        <label>Created Year:</label>
                        <input type="text" class="form-control input-lg input-design" value="<%=result.getString(5)%>" name="created_year">
                        <label>Classification:</label>
                        <select name="classify" class="form-control input-lg input-design">
                            <option value="<%=result.getString(6)%>"><%=result.getString(6)%></option>
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
                        <textarea type="text" class="form-control input-lg input-design" name="description"><%=result.getString(7)%></textarea>
                        <label>Auction Date:</label>
                        <input type="date" class="form-control input-lg input-design" value="<%=result.getString(8)%>" name="auction_date">
                        
                    </div>
                    <div class="col-sm-5">
                        <label>Estimated Price:</label>
                        <input type="text" class="form-control input-lg input-design" value="<%=result.getString(9)%>" name="price">
                        <label>Medium Used: </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(10)%>" name="medium">
                        <label>Frame: </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(11)%>" name="framed">
                        <label>Dimensions(cm): </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(12)%>" name="dimension">
                        <label>Image Type: </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(13)%>" name="image_type">
                        <label>Material Used: </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(14)%>" name="material">
                        <label>Weight(kg): </label>
                        <input type="text" class="form-control input-lg input-design text-area" value="<%=result.getString(15)%>" name="weight">
                        <label>Auction Title: </label>
                        <select name="auction_id" class="form-control input-lg input-design" id="cat_select">
                            <option value="0">------Select Auction Title-------</option>

                            <%         try {
                                    while (auction.next()) {

                            %>

                            <option value="<%=auction.getString(1)%>"><%=auction.getString(2)%></option>
                            <%

                                    }

                                } catch (Exception e) {
                                    System.out.println("Error : " + e);
                                }

                            %>

                        </select>
                        </select>
                    </div>
                </div>
                    <input type="hidden" value="<%=itemLot%>" name="itemLot">
                    <input type="submit" value="Edit" class="btn btn-danger add-button update-item" onclick="myUpdateMessage()">
                    <script>
                    function myUpdateMessage() {
                        alert("Item Successfully Updated!");
                    }
                </script>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

