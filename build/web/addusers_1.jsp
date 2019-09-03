<%-- 
    Document   : addusers
    Created on : 14-Apr-2019, 08:46:25
    Author     : Bishnu
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclass.DbSelect"%>
<%@include file="adminheader.jsp" %>

<%
    DbSelect type = new DbSelect();
    ResultSet userResult = type.DisplayUserType();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="item-bg">
    Users
</section>
<section class="detail">
    <div class="container-fluid cat">
        <h2 class="heading-one text-center">
            Add Users
        </h2>
        <div class="form-content">
            <div class="button">
                <a href="addusers.jsp" class="btn btn-default add-btn active" role="button">Add</a>
                <a href="displayusers.jsp" class="btn btn-default display-btn " role="button">Display</a>
            </div>
            <form class="form-type list-type" method="post" action="/Fortheby/AddUser">
                <div class="row">
                    <div class="col-sm-5 column">
                        <label>First Name:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter First Name" name="first_name">
                        <label>Age:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Age" name="age">
                        <label>Contact No:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Contact Number" name="contact_no">
                        <label>Email:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Email Address" name="email">
                        <label>User Type:</label>
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
                    </div>
                    <div class="col-sm-5">
                        <label>Last Name</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Last Name" name="last_name">
                        <label>Address:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Contact Address" name="address">
                        <label>Gender:</label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Female/Male" name="gender">
                        <label>Password</label>
                        <input type="password" id="psw" class="form-control input-lg input-design" placeholder="Enter Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
                    </div>
                </div>
                <input type="submit" value="Add" class="btn btn-danger add-button add-user">
            </form>
            <div id="msg">
                <h3>Password must contain the following:</h3>
                <p id="pass-letter" class="invalid">A <b>lowercase</b> letter</p>
                <p id="pass-capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
                <p id="pass-number" class="invalid">A <b>number</b></p>
                <p id="pass-length" class="invalid">Minimum <b>8 characters</b></p>
            </div>
            <script>
                var myInput = document.getElementById("psw");
                var letter = document.getElementById("pass-letter");
                var capital = document.getElementById("pass-capital");
                var number = document.getElementById("pass-number");
                var length = document.getElementById("pass-length");

// When the user clicks on the password field, show the message box
                myInput.onfocus = function () {
                    document.getElementById("msg").style.display = "block";
                }

// When the user clicks outside of the password field, hide the message box
                myInput.onblur = function () {
                    document.getElementById("msg").style.display = "none";
                }

// When the user starts to type something inside the password field
                myInput.onkeyup = function () {
                    // Validate lowercase letters
                    var lowerCaseLetters = /[a-z]/g;
                    if (myInput.value.match(lowerCaseLetters)) {
                        letter.classList.remove("invalid");
                        letter.classList.add("valid");
                    } else {
                        letter.classList.remove("valid");
                        letter.classList.add("invalid");
                    }

                    // Validate capital letters
                    var upperCaseLetters = /[A-Z]/g;
                    if (myInput.value.match(upperCaseLetters)) {
                        capital.classList.remove("invalid");
                        capital.classList.add("valid");
                    } else {
                        capital.classList.remove("valid");
                        capital.classList.add("invalid");
                    }

                    // Validate numbers
                    var numbers = /[0-9]/g;
                    if (myInput.value.match(numbers)) {
                        number.classList.remove("invalid");
                        number.classList.add("valid");
                    } else {
                        number.classList.remove("valid");
                        number.classList.add("invalid");
                    }

                    // Validate length
                    if (myInput.value.length >= 8) {
                        length.classList.remove("invalid");
                        length.classList.add("valid");
                    } else {
                        length.classList.remove("valid");
                        length.classList.add("invalid");
                    }
                }
            </script>

        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
