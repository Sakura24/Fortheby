<%-- 
    Document   : advancesearch
    Created on : 25-Apr-2019, 05:03:45
    Author     : Bishnu
--%>
<%@page import="dbclass.DbDate"%>
<%@include file="header.jsp" %>

<%    DbSelect cat = new DbSelect();
    DbDate currDate = new DbDate();
    String currentDate = currDate.currentDate();
    String monthDate = currDate.addedDate();
    ResultSet result = cat.DisplayCategory();
    int searchCount = 0;
    ResultSet searchItem = cat.DisplayItemBySoldArchieve();
    searchCount = cat.ItemCountSoldArchieveStatus();
    String[][] searchArray = new String[searchCount][2];
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="search-bg">
    <div class="container search-container">
        <h3 class="text-center">Advance Search</h3>
        <form action="advancesearchresult.jsp" class="adv-form">
            <label>Category Name:</label>
            <select name="cat_id" class="form-control input-lg search-design" id="cat_select">
                <option value="0">-------Select Category-----</option>
                <%         try {
                        while (result.next()) {

                %>

                <option value="<%=result.getString(1)%>"><%=result.getString(2)%></option>
                <%

                        }

                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </select>
            <label>Lot Item Name:</label>        
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

                <select id="combobox" name="item_lot" class="form-control input-lg search-design">
                    <option value="0" placement>Select Item Name...</option>
                    <% for (int i = 0; i < searchCount; i++) {%>
                    <option value="<%=searchArray[i][0]%>"><%=searchArray[i][1]%></option>
                    { %>

                    <% }%>
                </select>
            </div>
                <div class="row">
                    <div class="col-lg-6">
                        <label>From:</label>
                        <input type="Date" name="currentDate"  value="<%=currentDate%>" class="form-control input-lg search-date-design">
                    </div>
                    <div class="col-lg-6">
                        <label>To: </label>
                        <input type="Date" name="monthDate"  value="<%=monthDate%>" class="form-control input-lg search-date-design">
                    </div>
                </div>
                    <input type="submit" value="Search" class="btn btn-warning advance-search-button">
        </form>
    </div>
</section>
<%@include file="footer.jsp" %>