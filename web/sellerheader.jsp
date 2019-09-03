<%-- 
    Document   : adminheader
    Created on : 01-Apr-2019, 18:10:23
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%
    DbSelect dbSelect = new DbSelect();
    String usrEmail = session.getAttribute("uemail").toString();
    int interestCount = dbSelect.InterestFormCount();
    ResultSet searchItem = dbSelect.DisplayPendingItem();
    int searchCount = 0;
    searchCount = dbSelect.ItemCountSoldArchieveStatus();
    String[][] searchArray = new String[searchCount][2];
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Fortheby Auction House</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="frontend/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/font-awesome.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/fontawesome.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/jquery-ui.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/styles.css">
        <link href="https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
        <script src="frontend/bootstrap/js/jquery-ui.js"></script>
        <script src="frontend/bootstrap/js/jquery-1.10.2.js"></script>
        <script src="frontend/bootstrap/js/script.js"></script>
        <script src="frontend/bootstrap/js/jquery.min.js"></script>
        <script src="frontend/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header class="header">
            <nav class="navbar navbar-static-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <img src ="frontend/image/logo.jpg" class="logo">
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="sellerhome.jsp"><i class="fa fa-home" aria-hidden="true"> Home</i></a></li>
                                <li><a href="sellerprofile.jsp"><i class="fa fa-user" aria-hidden="true"> Profile</i></a></li>
                                <li><a href="sellerpending.jsp"><i class="fa fa-picture-o" aria-hidden="true"> Pending Items</i></a></li>
                                <li><a href="sellersold.jsp"><i class="fa fa-money" aria-hidden="true"> Sold Item</i></a></li>
                                <li><a href="sellercontact.jsp"><i class="fa fa-phone" aria-hidden="true"> Contact</i></a></li>
                            </ul>
                        </div>
                        <div class="col-sm-6">
                            <ul class="nav navbar-nav navbar-right">
                                <div class="dropdown-name">
                                    <a href="#" onclick="myCall()" class="drop-link"><b><%=dbSelect.GetUserNameFromEmail(usrEmail)%></b> <span class="caret"></span></a>
                                    <div id="myList" class="drop-down-content">
                                        <a href="signout.jsp">Sign Out</a>
                                    </div>
                                </div>
                            </ul>
                            <form class="navbar-form navbar-right search-form" action="sellersearch.jsp">
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
                                    
                                    <select id="combobox" name="item_lot" class="form-control input-lg search-item" style="width: 200px">
                                        <option value="">Select Item Name...</option>
                                        <% for (int i = 0; i < searchCount; i++) {%>
                                        <option value="<%=searchArray[i][0]%>"><%=searchArray[i][1]%></option>
                                        { %>

                                        <% }%>
                                    </select>
                                     <button class="btn btn-danger search-btn" type="submit">
                                      <i class="fa fa-search" aria-hidden="true"></i></button>
                            </form>
                        </div>
                        </nav>
                        </header>
                        <script type="text/javascript">
                            $(window).scroll(function () {
                                $('nav').toggleClass('scrolled', $(this).scrollTop() > 20);
                            });

                            function myCall() {
                                document.getElementById("myList").classList.toggle("show");
                            }

                // Close the dropdown menu if the user clicks outside of it
                            window.onclick = function (event) {
                                if (!event.target.matches('.drop-link')) {
                                    var dropdowns = document.getElementsByClassName("drop-down-content");
                                    var i;
                                    for (i = 0; i < dropdowns.length; i++) {
                                        var openDropdown = dropdowns[i];
                                        if (openDropdown.classList.contains('show')) {
                                            openDropdown.classList.remove('show');
                                        }
                                    }
                                }
                            }
                        </script>
