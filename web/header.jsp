<%-- 
    Document   : header
    Created on : 31-Mar-2019, 20:43:09
    Author     : Bishnu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>

<% 
    DbSelect catList = new DbSelect();
    ResultSet catResult = catList.DisplayCategory();
    Integer num = 0;
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
        <link rel="stylesheet" href="frontend/bootstrap/css/styles.css">
        <link href="https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
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
                                <li><a href="login.jsp"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a>
                                <li><a href="interestform.jsp"><b>Buyer/Seller Interest Form</b></a>
                            </ul>
                        </div>
                        <div class="col-sm-6">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li>
                                    <div class="dropdown-name">
                                        <a href="#" onclick="myCall()" class="drop-link"><i class="fa fa-list-ul" aria-hidden="true"></i> Categories<span class="caret"></span></a>
                                        <div id="myList" class="drop-down-content">
                                                <%  try {
                                                        while (catResult.next()) {
                                                            num++;
                                                %>
                                                <a href='categories.jsp?&catId=<%=catResult.getString(1)%>'><%= catResult.getString(2)%></a>
                                                    <%
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Error : " + e);
                                                        }

                                                    %>
                                        </div>
                                    </div>
                                </li>
                                <li><a href="#"><i class="fa fa-list-alt" aria-hidden="true"></i> Catalogue</a></li>
                                <li><a href="#"><i class="fa fa-calendar" aria-hidden="true"></i> Auction Calendar</a></li>
                                <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Contact</a></li>
                            </ul>
                        </div>
                    </div>
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
window.onclick = function(event) {
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