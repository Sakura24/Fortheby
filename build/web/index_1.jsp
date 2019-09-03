<%-- 
    Document   : index
    Created on : 31-Mar-2019, 20:38:36
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <section class="image">
            <div class="container">
                <h2 class="heading-two text-center">Fortheby's Auction House</h2>
                <h3 class="heading-three text-center">The Buying and Selling of artistic goods</h3>
                <form class="form-position">
                    <input type="text" name="search" class="form-control input-lg placement" placeholder="search your desired object">
                    <input type="submit" class="btn btn-success search-btn" value="Search">
                </form>
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
                        <img src="frontend/image/drawing1.jpeg" alt="Drawing" class="category">
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
                                    <a href="#" class="btn btn-primary">Buyer Interest Form</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="seller">
                                    <a href="#" class="btn btn-primary">Seller Interest Form</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%@include file="footer.jsp" %>