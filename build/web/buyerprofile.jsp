<%-- 
    Document   : buyerprofile
    Created on : 26-Apr-2019, 18:58:12
    Author     : Bishnu
--%>
<%@include file="buyerheader.jsp" %>
<% 
    DbSelect profile = new DbSelect();
    ResultSet user = profile.UserProfile(usrEmail);
    user.first();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
<div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Profile
        </h2>
        <div class="tab-content">
            <form class="form-type list-type">
            <div class="row profile">
                <div class="col-md-6 profile-title">
                    Title:
                    <br>
                    <br>
                    First Name:
                    <br>
                    <br>
                    Last Name:
                    <br>
                    <br>
                    Address:
                    <br>
                    <br>
                    Primary Contact No:
                    <br>
                    <br>
                    Secondary Contact No:
                    <br>
                    <br>
                    Email:
                    <br>
                    <br>
                    User Type:
                    <br>
                    <br>
                    Bank Account Number:
                    <br>
                    <br>
                    Bank Sort Number:
                    
                </div>
                <div class="col-md-6 profile-record">
                    <% if (user.getString(1).endsWith("Female")){
                        out.print("Miss/Mrs");
                    } else{
                        out.print("Mr");
                    }
                    %>
                    <br>
                    <br>
                    <%=user.getString(2)%>
                    <br>
                    <br>
                    <%=user.getString(3)%>
                    <br>
                    <br>
                    <%=user.getString(4)%>
                    <br>
                    <br>
                    <%=user.getString(5)%>
                    <br>
                    <br>
                    <%=user.getString(6)%>
                    <br>
                    <br>
                    <%=user.getString(7)%>
                    <br>
                    <br>
                    <%=profile.UserTypeById(user.getString(8))%>
                    <br>
                    <br>
                    <%=user.getString(9)%>
                    <br>
                    <br>
                    <%=user.getString(10)%>
                </div>
            </div>
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
