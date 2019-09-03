<%-- 
    Document   : deletecategory
    Created on : 01-Apr-2019, 20:23:36
    Author     : Bishnu
--%>

<%
    String catId = request.getParameter("catId").trim();
    //out.print(catId);
%>

<%@include file="adminheader.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="img">
    Categories
</section>
<section class="detail">
    <div class="container-fluid delete-confirm">
        <div class="confirm">
            <h3 class="text-center"> Do you want to delete the selected category?</h3>
            <ul>
                <li><a href="/Fortheby/DeleteCategory?&catId=<%=catId%>" onclick="myDeleteMessage()"><b><i><u>Yes?</u></i></b></a></li>
                <li><a href="displaycategories.jsp"><b><i><u>No?</u></i><b></a></li>
                                <script>
                                    function myDeleteMessage() {
                                        alert("Category Successfully Deleted!");
                                    }
                                </script>
                                </ul>
                                </div>
                                </div>
                                </section>
                                <%@include file="footer.jsp" %>

