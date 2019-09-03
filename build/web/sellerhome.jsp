<%-- 
    Document   : sellerhome
    Created on : 29-Apr-2019, 06:02:33
    Author     : Bishnu
--%>
<%@page import="dbclass.DbDate"%>
<%@include file="sellerheader.jsp" %>
<%
    DbSelect item = new DbSelect();
    ResultSet result = item.DisplayCategory();

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="jumbotron cat_jumbo">
            <h3 class="text-center">Categories</h3>
        <div class="table-content">
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                
                <div class="row home_row">
                    <% 
                     try {
                    while (result.next()) {
                      
                    

                %>
                
                    <div class="home_column">
                        <div class="home_list">
                            <a href='customerdisplayfoodbycat.jsp?&catId=<%=result.getString(1) %>'><img src="upload/<%=result.getString(3)%>" width="250" height="150" class="home_image"/></a>
                        </div>
                        <a href='customerdisplayfoodbycat.jsp?&catId=<%=result.getString(1) %>' class="home_name"><b><i><u><%= result.getString(2) %></b></i></u></a>
                    </div>
                    
                    <%

                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            %>

                </div>
            </table>
        </div>
        </div>
            <%
    ResultSet itemImage = item.DisplayItemBySoldArchieve();

%>
            <div class="jumbotron cat_jumbo">
            <h3 class="text-center">Upcoming Events</h3>
        <div class="table-content">
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                
                <div class="row home_row">
                    <% 
                     try {
                    while (itemImage.next()) {
                      
                    

                %>
                
                    <div class="home_column">
                        <div class="home_list">
                            <a href='customerdisplayfoodbycat.jsp?&catId=<%=itemImage.getString(1) %>'><img src="upload/<%=itemImage.getString(17)%>" width="250" height="150" class="home_image"/></a>
                        </div>
                        <a href='customerdisplayfoodbycat.jsp?&catId=<%=itemImage.getString(1) %>' class="home_name"><b><i><u><%= itemImage.getString(3) %></b></i></u></a>
                    </div>
                    
                    <%

                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            %>

                </div>
            </table>
        </div>
        </div>
            
            <% 
            DbDate date = new DbDate();
            String currDate = date.currentDate();
            String addDate = date.addedDate();
            ResultSet upcoming = item.DisplayImageByDate(currDate, addDate);
            %>
            
            <div class="jumbotron cat_jumbo">
            <h3 class="text-center">Items</h3>
        <div class="table-content">
            <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                
                <div class="row home_row">
                    <% 
                     try {
                    while (upcoming.next()) {
                      
                    

                %>
                
                    <div class="home_column">
                        <div class="home_list">
                            <a href='customerdisplayfoodbycat.jsp?&catId=<%=upcoming.getString(1) %>'><img src="upload/<%=upcoming.getString(17)%>" width="250" height="150" class="home_image"/></a>
                        </div>
                        <a href='customerdisplayfoodbycat.jsp?&catId=<%=upcoming.getString(1) %>' class="home_name"><b><i><u><%= upcoming.getString(3) %></b></i></u></a>
                    </div>
                    
                    <%

                    }

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }

            %>

                </div>
            </table>
        </div>
        </div>
    </body>
</html>
