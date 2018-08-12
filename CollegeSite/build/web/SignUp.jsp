<%-- 
    Document   : SignUp
    Created on : 1 Mar, 2015, 6:27:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>SignUp</title>
    
    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
   
</head><!--/head-->

<body class="sign-up">

    <header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container-->
        </div><!--/.top-bar-->

         </header><!--/header-->


        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    
                </div>
                <div class="collapse navbar-collapse navbar-left">
                    <a class="navbar-brand" href="index.html"><h1>Mil-App!</h1><h2>(Connect Across Peers)</h2></a>
                </div>
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">

                        <li class="active"><a href="home.jsp">Home</a></li>
                        <li><a href="aboutus.html">About Us</a></li>
                        <li><a href="SignUp.jsp">Sign up</a></li>
                        <li><a href="login.jsp">Log in</a></li>
                        <li><a href="cntc.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
        
    </header><!--/header-->

    <br><br>
 <%
  int flag=-1;
  String flgstr=(String)request.getAttribute("flag");
  try{
    flag=Integer.parseInt(flgstr);}
   catch(Exception e){}%>   
   
 <%if(flgstr==""||flgstr==null){%>

 <form class="col-md-5 col-md-offset-3" action="ServletSignUp" method="POST">
     
    <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="First Name" name="firstname">
    </div>
     <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Last Name" name="lastname">
    </div>
     <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Nick" name="username">
    </div>
     <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Institute Name" name="institutename">
    </div>
     <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Year Of Passing" name="year">
    </div>
     
     <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="City" name="city">
    </div>
    <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Place Of Work" name="placeofwork">
    </div>
    <div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="Email" name="emailid">
    </div>
    <div class="form-group">
        <input type="password" class="form-control input-lg" placeholder="Password" name="password">
    </div>
    <div class="form-group">
        <input type="password" class="form-control input-lg" placeholder="Confirm Password">
    </div>
    <div class="form-group">
        <button class="btn btn-primary btn-lg btn-block">Sign In</button>
        <span><a href="#">Need help?</a></span>
        <span class="pull-right"><a href="#">New Registration</a></span>
    </div>
</form>
 
<%}
   else{%>
   <div class="alert alert-success">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Click to login!</strong> You have signed up successfully
   </div>
   
   <%}%>