<%-- 
    Document   : index
    Created on : 31-Mar-2019, 20:38:36
    Author     : Bishnu
--%>
<%@include file="header.jsp" %>
<% 
    DbSelect dbSelect = new DbSelect();
    int searchCount = 0;
    ResultSet searchItem = dbSelect.DisplayItemBySoldArchieve();
    searchCount = dbSelect.ItemCountSoldArchieveStatus();
    String[][] searchArray = new String[searchCount][2];
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <section class="image">
            <div class="container">
                <h2 class="heading-two text-center">Fortheby's Auction House</h2>
                <h3 class="heading-three text-center">The Buying and Selling of artistic goods</h3>
                <form class="form-position" action="searchresult.jsp">
                                <%  try {
                                        searchItem.first();
                                        for (int i = 0; i < searchCount; i++) {
                                            searchArray[i][0] = searchItem.getString(1);
                                            searchArray[i][1] = searchItem.getString(3);
                                            searchItem.next();
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                        }%>
                                <br>
                                <div class="ui-widget">
                                    
                                    <select id="combobox" name="item_lot" class="form-control input-lg search-item" style="width: 500px">
                                        <option value="" placement>Select Item Name...</option>
                                        <% for (int i = 0; i < searchCount; i++) {%>
                                        <option value="<%=searchArray[i][0]%>"><%=searchArray[i][1]%></option>
                                        { %>

                                        <% }%>
                                    </select>
                                     <input type="submit" value="Search" class="btn btn-warning search-button">

                                </div>
                            </form>
                                    <h4 class="text-center adv-search"><a href="advancesearch.jsp"><i><u>Advance Search</u></i></a></h4>
            </div>
        </section>
        <section class="about">
            <div class="container">
                <h3 class="information text-center"><b>About The Website</b></h3>
                <p class="description text-justify">
                    Fotheby’s is an international auction house specialising in the sale of fine art.
                    All auction items are currently classified into five categories; these are paintings, drawings, photographic images, sculptures and carvings.
                    All items, irrespective of category, have the essential details recorded such as an item lot number.
                    The name of the artist.
                    The year the work was produced.
                    A general subject classification for the piece. (Typical subject classifications include:- landscape, seascape, portrait, figure, still life, nude, animal, abstract, or other)
                    A detailed textual description of the piece. 
                    The auction date. An estimated price.
                </p>
                <div class="row image-position">
                    <div class="image-column">
                        <img src="frontend/image/carving4.jpg" alt="Carving" class="category">
                        <div class="image-caption">
                            <a href="#">Carving</a>
                        </div>
                    </div>
                    <div class="image-column">
                        <img src="frontend/image/drawing3.jpg" alt="Drawing" class="category">
                        <div class="image-caption">
                            <a href="#">Drawing</a>
                        </div>
                    </div>
                    <div class="image-column">
                        <img src="frontend/image/paint1.jpg" alt="Painting" class="category">
                        <div class="image-caption">
                            <a href="#">Painting</a>
                        </div>
                    </div>
                    <div class="image-column">
                        <img src="frontend/image/photo2.jpg" alt="Photographic Image" class="category">
                        <div class="image-caption">
                            <a href="#">Photographic Image</a>
                        </div>
                    </div>
                    <div class="image-column">
                        <img src="frontend/image/sculpture4.jpg" alt="Sculpture" class="category">
                        <div class="image-caption">
                            <a href="#">Sculpture</a>
                        </div>
                    </div>
                </div>            
        </section>
        <section class="company">
            <div class="container">
                <h3 class="text-center"><b>About Fortheby's Auction House</b></h3>
                <p class="description text-justify">
                    Fotheby’s is an international auction house specialising in the sale of fine art.
                    All auction items are currently classified into five categories; these are paintings, drawings, photographic images, sculptures and carvings.
                    All items, irrespective of category, have the essential details recorded such as an item lot number.
                    The name of the artist.
                    The year the work was produced.
                    A general subject classification for the piece. (Typical subject classifications include:- landscape, seascape, portrait, figure, still life, nude, animal, abstract, or other)
                    A detailed textual description of the piece. 
                    The auction date. An estimated price.
                </p>
            </div>
        </section>
        <section class="form">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 size">
                        <h4><b>Are you interested in joining Forthey Auction House??</b></h4>
                    </div>
                    <div class="col-sm-6 size">
                        <div class="row">
                            <div class="col-sm-3">
                                <div class="buyer">
                                    <a href="interestform.jsp" class="btn btn-primary">Buyer Interest Form</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="seller">
                                    <a href="interestform.jsp" class="btn btn-primary">Seller Interest Form</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="footer.jsp" %>