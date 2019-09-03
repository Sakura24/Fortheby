<%-- 
    Document   : resetpassword
    Created on : 13-Apr-2019, 21:42:57
    Author     : Bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
        <link rel="stylesheet" href="frontend/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/font-awesome.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/fontawesome.css">
        <link rel="stylesheet" href="frontend/bootstrap/css/styles.css">
        <link href="https://fonts.googleapis.com/css?family=Lobster|Montserrat:400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Pacifico|Roboto:400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
        <script src="frontend/bootstrap/js/jquery.min.js"></script>
        <script src="frontend/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body class="login-bg">
        <div class="container login-container">
            <form method="post" action="/Fortheby/Login">
                <div class="row register-row">
                    <h3 class="text-center">Create An Account</h3>
                    <div class="col-md-6 left">
                        <label class="login-label">First Name: </label>
                        <input type="email" class="form-control input-lg input-design register-text" placeholder="Enter First Name" name="email">
                        <label class="login-label">Age: </label>
                        <input type="password" class="form-control input-lg input-design register-text" placeholder="Enter Age" name="password">
                        <label class="login-label">Contact No: </label>
                        <input type="email" class="form-control input-lg input-design register-text" placeholder="Enter Contact Number" name="email">
                        <label class="login-label">Email: </label>
                        <input type="password" class="form-control input-lg input-design register-text" placeholder="Enter Email Address" name="password">
                    </div>
                    <div class="col-md-6 right">
                        <label class="login-label">Last Name: </label>
                        <input type="email" class="form-control input-lg input-design register-text" placeholder="Enter Last Name" name="email">
                        <label class="login-label">Gender: </label>
                        <input type="password" class="form-control input-lg input-design register-text" placeholder="Enter Gender" name="password">
                        <label class="login-label">User Type: </label>
                        <input type="email" class="form-control input-lg input-design register-text" placeholder="Enter User Type" name="email">
                        <label class="login-label">Password: </label>
                        <input type="password" class="form-control input-lg input-design register-text" placeholder="Enter Password" name="password">
                        </div>
                        <input type="submit" value="Sign Up" class="btn btn-danger sign-btn"/>
                        <label  class="check"><input type="checkbox" value="">I have read and agree to the <u>Terms and Conditions</u> and <u>Privacy Policy</u></label>
                    
                </div>
            </form>
        </div>
    </body>
</html>


