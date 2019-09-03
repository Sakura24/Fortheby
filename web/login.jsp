<%-- 
    Document   : login
    Created on : 07-Apr-2019, 13:17:49
    Author     : Bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
            <div class="row login-row">
                <div class="col-md-6 img-row">
                    <img src="frontend/image/hammer.jpg" width="600" height="560" class="hammer-img"/>
                </div>
                <div class="col-md-6 account">
                    <h2 class="text-center">Account Login</h2>
                    <form method="post" action="/Fortheby/Login" class="login-form">
                        <label class="login-label">Email: </label>
                        <input type="text" class="form-control input-lg input-design" placeholder="Enter Email Address" name="email">
                        <label class="login-label">Password: </label>
                        <input type="password" class="form-control input-lg input-design" placeholder="Enter Password" name="password">
                        <a href="#" class="password">Forgot Password?</a>
                        <input type="submit" value="Login" class="btn btn-danger login-btn">
                    </form>
                    <h5 class="text-center register">Don't have an account?<a href="register.jsp" class="link"> Sign up</a></h5>
                </div>
            </div>
        </div>
    </body>
</html>
