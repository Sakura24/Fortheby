<%-- 
    Document   : admindisplayauction
    Created on : 27-Apr-2019, 06:14:35
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>
<% 
    ResultSet result = dbSelect.AuctionDetail();
    int number = 0;
%>
<section class="item-bg">
    Auction
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            The list of Auction Items of the upcoming month
        </h2>
        <div class="tab-content">
            <div class="button">
                <a href="addauction.jsp" class="btn btn-default add-btn active" role="button">Add</a>
                <a href="admindisplayauction.jsp" class="btn btn-default display-btn " role="button">Display</a>
            </div>
                     <table cellspacing="0" class="table table-striped table-responsive table-sm" >
                <tr>
                    <th>S.N. </th>
                    <th>Title</th>
                    <th>Location</th>
                    <th>Date</th>
                    <th>Lot Number</th>
                    <th>Period</th>
                    <th>Process</th>
                </tr>

                <%
                    try {
                        while (result.next()) {
                            number++;
                %>

                <tr>
                    <td><b><%= number%></b></td>
                    <td><b><%= result.getString(2)%></b></td>
                    <td><b><%= result.getString(3)%></b></td>
                    <td><b><%= result.getString(4)%></b></td>
                    <td><b><%= result.getString(5)%></b></td>
                    <td><b><%= result.getString(6)%></b></td>
                    <td><b><i><u><a href='updateauction.jsp?&auctionId=<%= result.getString(1)%>' > Edit</a> | <a href='deleteauction.jsp?&auctionId=<%= result.getString(1)%>' > Delete</a></u></i></b></td>
                </tr>

                <%
                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </table>
                
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>

