<%--
  Created by IntelliJ IDEA.
  User: arartawil
  Date: 30/03/18
  Time: 03:37 م
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login &amp; Register </title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    <title>Title</title>
</head>
<body>

    <!-- Top content -->
    <div class="top-content">

        <div class="inner-bg">
            <div class="container">

                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text">
                        <h1> Login &amp; Register Forms</h1>

                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-5">

                        <div class="form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Login to our site</h3>
                                    <p>Enter username and password to log on:</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div>
                            <form id="form2" action="${pageContext.request.contextPath}/loginreg" method="post" >
                            <div class="form-bottom">
                                <div class="login-form">
                                    <div class="form-group">
                                        <input type="text" name="txt_name" class="form-username form-control" placeholder="Username..." >
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="txt_password" class="form-username form-control" placeholder="Password..." >

                                    </div>
                                    <input type="submit" class="btn btn-info" style="font-size: xx-large"  value="Login" name="button1" >

                                </div>
                            </div>
                            </form>
                        </div>

                        <div class="social-login">
                            <h3>...or login with:</h3>
                            <div class="social-login-buttons">
                                <a class="btn btn-link-1 btn-link-1-facebook" href="#">
                                    <i class="fa fa-facebook"></i> Facebook
                                </a>
                                <a class="btn btn-link-1 btn-link-1-twitter" href="#">
                                    <i class="fa fa-twitter"></i> Twitter
                                </a>
                                <a class="btn btn-link-1 btn-link-1-google-plus" href="#">
                                    <i class="fa fa-google-plus"></i> Google Plus
                                </a>
                            </div>
                        </div>

                    </div>

                    <div class="col-sm-1 middle-border"></div>
                    <div class="col-sm-1"></div>

                    <div class="col-sm-5">

                        <div class="form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Sign up now</h3>
                                    <p>Fill in the form below to get instant access:</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-pencil"></i>
                                </div>
                            </div>
                            <form id="form3"  action="/loginreg" method="post">
                            <div class="form-bottom">
                                <div class="registration-form">
                                    <div class="form-group">
                                        <input type="text" name="txtFname" class="form-first-name form-control" placeholder="First name..." >
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="txt_Lname" class="form-last-name form-control" placeholder="Last name..." >

                                    </div>

                                    <div class="form-group">
                                        <input type="email" name="txt_Email" class="form-email-name form-control" placeholder="Email..." >
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="txt_Username" class="form-email-name form-control" placeholder="Username......" >

                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="txt_Password" class="form-email-name form-control" placeholder="Password......" >

                                    </div>

                                    <div class="form-group">
                                        <input type="password" name="txt_Password2" class="form-email-name form-control" placeholder="RePassword......" >
                                      </div>
                                    <input type="submit" class="btn btn-info" style="font-size: xx-large" name="button1" value="Sign Up" >

                                    <div class="form-group" style="visibility: hidden">
                                        <div class="alert alert-success"  id="good"    >
                                            <strong>Done</strong> Register Don.....
                                        </div>
                                        <div class="alert alert-danger" id="dangers"  style="visibility: hidden">
                                            <strong>Not Done</strong> Username or Email  Used .... <br />try anther
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </form>
                        </div>

                    </div>
                </div>

            </div>
        </div>

    </div>

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">



            </div>
        </div>
    </footer>

    <!-- Javascript -->
    <script src="assets/js/jquery-1.11.1.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.backstretch.min.js"></script>
    <script src="assets/js/scripts.js"></script>

    <!--[if lt IE 10]>
    <script src="assets/js/placeholder.js"></script>
    <![endif]-->





</body>
</html>
