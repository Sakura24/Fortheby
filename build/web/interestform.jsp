<%-- 
    Document   : interestform
    Created on : 16-Apr-2019, 16:07:04
    Author     : Bishnu
--%>
<%@include file="header.jsp" %>
<%    DbSelect user = new DbSelect();
    ResultSet userResult = user.filterUserType();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="user">
    Interest Form
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Register Request
        </h2>
        <div class="form-content">
            <form class="form-type list-type" method="post" action="/Fortheby/InterestForm">
                <div class="row">
                    <div class="col-sm-5 column">
                        <label>First Name: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter First Name" name="first_name">
                        <label>Gender</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Gender" name="gender">
                        <label>Profession: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Your Profession" name="profession">
                        <label>Bank Account Number: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Bank Account Number" name="acc_no" title="Must be entered to store your details in our database" required>
                        <label>Interest Description: </label>
                        <textarea type="text" class="form-control input-lg input-design" placeholder="Ente Your Interest In Buying/ Seeling Items" name="interest"></textarea>
                    </div>
                    <div class="col-sm-5">
                        <label>Last Name: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Last Name" name="last_name">
                        <label>Contact No: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Contact Number" name="contact_no">
                        <label>User Type: </label>
                        <select name="user_type_id" class="form-control input-lg input-design">
                            <option value="0">-------Select Type-----</option>
                            <%         try {
                                    while (userResult.next()) {

                            %>

                            <option value="<%=userResult.getString(1)%>"><%=userResult.getString(2)%></option>
                            <%

                                    }

                                } catch (Exception e) {
                                    System.out.println("Error : " + e);
                                }

                            %>

                        </select>
                        <label>Bank Sort Number: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Bank Sort Number Name" name="sort_no" title="Must be entered to store your details in our database" required>
                        <label>Email: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Your Email" name="email">

                    </div>
                </div>
                <input type="submit" value="Add" class="btn btn-danger add-button add-user">
            </form>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
