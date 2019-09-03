<%-- 
    Document   : admindisplayreply
    Created on : 26-Apr-2019, 22:47:05
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<%    
    String contact_id = session.getAttribute("contact_id").toString();
    ResultSet result = dbSelect.ReplyDetail(Integer.valueOf(contact_id));
    result.first();
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Send Message
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Send message to the administrator
        </h2>
        <div class="tab-content">
            <form class="form-type list-type">
            <div class="row">
                <div class="col-md-6">
                    Feedback Date:
                    <br>
                    Reply Date:
                    <br>
                    Description:
                    <br>
                    Customer Name:
                    <br>
                    Title
                    <br>
                    Feedback Description:
                    <br>
                    Reply Description:
                </div>   
                <div class="col-md-6">
                    <label><%=result.getString(4)%></label>
                    <br>
                    <label><%=result.getString(6)%></label>
                    <br>
                    <label><%= dbSelect.GetFullNameFromEmail(result.getString(1))%></label>
                    <br>
                    <label><%=result.getString(2)%></label>
                    <br>
                    <label><%=result.getString(3)%></label>
                    <br>
                    <label><%=result.getString(5)%></label>
                </div>
            </div>
                <a href="#"><a href="admindisplaycontact.jsp" class="btn btn-warning send-btn" role="button">Send</a></a>
            </form>
        </div>
    </div>
</section>
                <%@include file="footer.jsp" %>