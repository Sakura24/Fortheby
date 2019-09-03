<%-- 
    Document   : replycontact
    Created on : 26-Apr-2019, 22:09:43
    Author     : Bishnu
--%>
<%@include file="adminheader.jsp" %>

<% 
    
    String contact_id = request.getParameter("contact_id");
    ResultSet result = dbSelect.DisplayContactForReply(contact_id);
    out.print(contact_id);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Items
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            The items of the following categories present in our auction house
        </h2>
        <div class="tab-content">
            <form class="form-type list-type">
               <%
                try {
                        while (result.next()) {
                            %>
                <div class="row">
                <div class="col-md-6">
                    Name:
                    <br>
                    Title:
                    <br>
                    Description:
                </div>      
                <div class="col-md-6">
                    <label><%= dbSelect.GetFullNameFromEmail(result.getString(2))%></label>
                    <br>
                    <label><%=result.getString(3)%></label>
                    <br>
                    <label><%=result.getString(4)%></label>
                </div>
                                  </div>
  
                <%
                        }
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }

                %>
            </form>
        </div>
            <h3 class="heading-three">
            Add The Reply
        </h3>
        <div class="form-content">
            <form name="detail" method="post" class="form-type list-type" action="/Fortheby/InsertReply">
                <label>Reply:</label>
                <textarea type="text" class="form-control input-lg" placeholder="Enter reply for feedback" name="description"></textarea>
                <input type="hidden" name="contact_id" value="<%= contact_id%>">
                <input type="submit" value="Add" class="btn btn-danger add-button add-item" >
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
