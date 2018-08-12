<%-- 
    Document   : writeBlog
    Created on : 7 Mar, 2015, 4:40:14 PM
    Author     : User
--%>

<%@page import="CollegePack.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>GLUG </title>
    
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
                    <a class="navbar-brand" href="index.html"><h1>College-connect</h1></a>
                </div>
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">

                        <li class="active"><a href="home.html">Home</a></li>
                        <li><a href="about-us.html">About Us</a></li>
                        <li><a href="sign-up.html">Sign up</a></li>
                        <li><a href="logout.html">Log out</a></li>
                        <li><a href="contact-us.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
</header><!--/header-->

<% int userid=-1;
           try{
                 userid=(Integer)session.getAttribute("userid");
              }
           catch(NullPointerException e)
           {
                userid=-1;
           }
           User user=null;
           if(userid!=-1){
               user=User.getUserByUserId(userid);
               
           }
            int clubid=-1;
            String idstr=(String)request.getParameter("id");
            try{
                   clubid=Integer.parseInt(idstr);}
            catch(Exception e){ clubid=-1;}
            int flag=-1;
            
            String flgstr=(String)request.getParameter("flag");
            try{
               flag=Integer.parseInt(flgstr);}
            catch(Exception e){
                flag=-1;
            }
            
      
     %>
     
     <%if(flag==-1){
     %>
<br><br>
<div style="width:600px;margin-left:auto;margin-right:auto;" >
<form class="form-horizontal" style="margin:0 auto;" action="SubmitBlogServlet?id=<%=clubid%>" method="POST">
    <div class="form-group" style="width:600px;">
        <label for="inputEmail" style="font-size:120%;" class="control-label col-xs-2">Title</label>
        <div class="col-xs-10">
            <input type="text" class="form-control" id="inputEmail" placeholder="Title Of The Blog" name="title">
        </div>
    </div>
    <div class="form-group" style="width:600px;">
       <label for="inputPassword" style="font-size:120%;" class="control-label col-xs-2">Description</label>
        <div class="col-xs-10">
       <textarea class="form-control" rows="10" style="resize:none;" placeholder="Elaborate your Blog. Add as much detail as possible" name="desc"></textarea>
   </div>
    </div>
    
    
    <div class="form-group">
        <div class="col-xs-offset-2 col-xs-10">
            <button type="submit" class="btn btn-primary">Submit Blog</button>
        </div>
    </div>
</form>
</div>
    <%}else if(flag==1){%>
    <div class="alert alert-success">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Your Blog has been submitted</strong>
    </div><br><br><br><br><br><br><br><br><br><br>
    <%}%>
 <br><br><br><br><br><br><br>
 <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                
                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="#">Contact Us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
</body>
</html>

