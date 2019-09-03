<%-- 
    Document   : advancesearchresult
    Created on : 25-Apr-2019, 07:29:39
    Author     : Bishnu
--%>
<%@page import="dbclass.DbSearch"%>
<%@include file="header.jsp" %>
<% 
    DbSelect search = new DbSelect();
    DbSearch sort = new DbSearch();
    int cat_id = Integer.valueOf(request.getParameter("cat_id"));
    out.print("cat="+ cat_id);
    int item_lot = Integer.valueOf(request.getParameter("item_lot"));
    out.print("item_lot="+item_lot);
    String currentDate = request.getParameter("currentDate").trim();
    out.print("currentDate="+currentDate);
    String monthDate = request.getParameter("monthDate").trim();
    out.print("monthDate="+monthDate);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Search Result
</section>
<section class="detail">
    <div class="container-fluid cat">
        <div class="tab-content">
            <% 
                        try{   
                            
                            if (cat_id == 0 && item_lot == 0){
                        
                            ResultSet dateSearch = sort.SearchWithDates(currentDate, monthDate);
                            
                            while (dateSearch.next()){
                  %>
              <form class="form-type list-type">                  
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=dateSearch.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= search.CategoryNameById(dateSearch.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= dateSearch.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= dateSearch.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= dateSearch.getString(5)%></label>
                        <br>
                        <label>Classification: <%= dateSearch.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= dateSearch.getString(7) %></label>
                        <a href="guestreadmore.jsp?&itemId=<%=dateSearch.getString(1)%>&catId=<%= dateSearch.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    <%
                            }  
                        } else if ( cat_id != 0 && item_lot == 0){
                            ResultSet searchCat = sort.searchWithTwoDatesAndCat(currentDate, monthDate, cat_id);
                             while (searchCat.next()){
                    %>
                    
                    
                    <form class="form-type list-type">                  
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=searchCat.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= search.CategoryNameById(searchCat.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= searchCat.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= searchCat.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= searchCat.getString(5)%></label>
                        <br>
                        <label>Classification: <%= searchCat.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= searchCat.getString(7) %></label>
                        <a href="guestreadmore.jsp?&itemId=<%=searchCat.getString(1)%>&catId=<%= searchCat.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    
                    <% 
                                 }
                        } else if ( item_lot != 0 && cat_id == 0){
                            ResultSet searchItem = sort.searchWithTwoDatesAndItem(currentDate, monthDate, item_lot);
                            while (searchItem .next()){
                    %>
                    
                    <form class="form-type list-type">                  
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=searchItem.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= search.CategoryNameById(searchItem.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= searchItem.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= searchItem.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= searchItem.getString(5)%></label>
                        <br>
                        <label>Classification: <%= searchItem.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= searchItem.getString(7) %></label>
                        <a href="guestreadmore.jsp?&itemId=<%=searchItem.getString(1)%>&catId=<%= searchItem.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                    
                    <% 
                    }
                            
                        } else {
                            ResultSet catItem = sort.searchWithCatAndItem(currentDate, monthDate, cat_id, item_lot);
                            while (catItem.next()){
                            
                    %>
                    
                    <form class="form-type list-type">                  
                <div class="row">
                    <div class="col-md-6 item-column">
                        <img src="upload/<%=catItem.getString(17)%>" width="300" height="200" class="cat_image"/>
                    </div>
                    <div class="col-md-6">
                        <label>Category: <%= search.CategoryNameById(catItem.getString(2))%></label>
                        <br>
                        <label>Item Name: <%= catItem.getString(3)%></label>
                        <br>
                        <label>Artist Name: <%= catItem.getString(4)%></label>
                        <br>
                        <label>Created Year: <%= catItem.getString(5)%></label>
                        <br>
                        <label>Classification: <%= catItem.getString(6)%></label>
                        <br>
                        <label class='text-justify text-limit'>Description: <%= catItem.getString(7) %></label>
                        <a href="guestreadmore.jsp?&itemId=<%=catItem.getString(1)%>&catId=<%= catItem.getString(2)%>" class="read-more link"><b><i><u>read more</u></i></b></a>
                    </div>
                </div>
            </form>
                        
                       <% }
                        }
                        } catch(Exception ex){
                        
                        }
                    %>
                    
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

