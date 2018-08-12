<%-- 
    Document   : womenintech
    Created on : 8 Mar, 2015, 8:13:03 AM
    Author     : User
--%>

<%@page import="CollegePack.Blog"%>
<%@page import="CollegePack.Query"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CollegePack.Club"%>
<%@page import="CollegePack.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Women in Tech </title>
    
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
            String flgstr=(String)request.getParameter("id");
            try{
                   clubid=Integer.parseInt(flgstr);}
            catch(Exception e){ clubid=-1;}
            boolean check=false;
            if(clubid!=-1 && userid!=-1)
            {
                check=Club.checkUserforClub(userid, clubid);
            }
            ArrayList<Query> qlist=null;
            if(clubid!=-1)
             {
                    qlist=Query.getAllQueriesByClubId(clubid);
             }
            ArrayList<Blog> blist=null;
            if(clubid!=-1){
                blist=Blog.getAllBlogsByClubId(clubid);
            }
             
            
            System.out.println(check);
        %>   

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
                    <a class="navbar-brand" href="index.html"><h1>Mil-app!</h1><h4>( Connect Across Peers)</h4></a>
                </div>
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">

                        <li class="active"><a href="home.html">Home</a></li>
                        <li><a href="aboutus.html">About Us</a></li>
                        <li><a href="SignUp.jsp">Sign up</a></li>
                        <li><a href="Servletlogout">Log out</a></li>
                        <li><a href="cntc.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
</header><!--/header-->

    <section id="blog" class="container">
        <div class="center">
            <h2>Women in tech (NIT Durgapur)</h2>
            <p class="lead"></p>
        </div>

        <div class="blog">
            <div class="row">
                 <div class="col-md-8">
                  
                    <div class="blog-item">
                        <div class="row">
                            <div class="col-xs-12 col-sm-2 text-center">
                                <div class="entry-meta">
                                    <span id="publish_date">03 MAR</span>
                                    <span><i class="fa fa-user"></i> <a href="#">Avinav Prakash(Quizinc)</a></span>
                                    <span><i class="fa fa-comment"></i> <a href="glug.html#comments">2 Comments</a></span>
                                    <span><i class="fa fa-heart"></i><a href="#">20 Likes</a></span>
                                </div>
                            </div>
                                
                            <div class="col-xs-12 col-sm-10 blog-content">
                               >
                                <h2><a href="glug.html">Invitation for hosting a session for our club Quizinc</a></h2>
                                <h3> We have to build a website for our fest Quizitch Cup ,we would like to invite some of your members to give a session to our club juniors.
</h3>
                                <a class="btn btn-primary readmore" href="glug.html">Read More <i class="fa fa-angle-right"></i></a>
                            </div>
                        </div>    
                    </div><!--/.blog-item-->
                    <%
                                   if(qlist!=null){
                            %>
                             <%
                                    for(int i=0;i<qlist.size();i++){
                                        User user2=User.getUserByUserId(qlist.get(i).getiUserId());
                              %>
                        
                    <div class="blog-item">
                        <div class="row">
                             <div class="col-sm-2 text-center">
                                <div class="entry-meta"> 
                                    <span id="publish_date">01 MAR</span>
                                    <span><i class="fa fa-user"></i> <a href="#"><%=user2.getStrUserName()%></a></span>
                                    <span><i class="fa fa-comment"></i> <a href="glug.html#comments"> 15 Comments</a></span>
                                    <span><i class="fa fa-heart"></i><a href="#">60 Likes</a></span>
                                </div>
                            </div>
                            <div class="col-sm-10 blog-content">
                                
                                <h2><a href="glug.html"><%=blist.get(i).getStrBlogTitle()%></a></h2>
                                <h3><%=blist.get(i).getStrBlogDesc()%> </h3>
                                <a class="btn btn-primary readmore" href="glug.html">Read More <i class="fa fa-angle-right"></i></a>
                            </div>
                      
                        </div> 
                    </div>   
                        <%}}%>
                   
                        

                    <ul class="pagination pagination-lg">
                        <li><a href="#"><i class="fa fa-long-arrow-left"></i>Previous Page</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">Next Page<i class="fa fa-long-arrow-right"></i></a></li>
                    </ul><!--/.pagination-->
                </div><!--/.col-md-8-->

                <aside class="col-md-4">
                    <div class="widget search">
                        <form role="form">
                                <input type="text" class="form-control search_box" autocomplete="off" placeholder="Search Here">
                        </form>
                    </div><!--/.search-->
    				
    				<div class="widget categories">
                        <h3>Recent Comments</h3>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="single_comments">
                                    <img src="images/blog/avatar3.png" alt=""  />
                                    <p>Mailing the speaker on the email id given on the website. </p>
                                    <div class="entry-meta small muted">
                                        <span>By <a href="#">Harshit</a></span <span>On <a href="#">Creative</a></span>
                                    </div>
                                </div>
                                <div class="single_comments">
                                    <img src="images/blog/avatar3.png" alt=""  />
                                    <p>You may contact the President of the club for this. </p>
                                    <div class="entry-meta small muted">
                                        <span>By <a href="#">Shreya</a></span <span>On <a href="#">Creative</a></span>
                                    </div>
                                </div>
                                <div class="single_comments">
                                    <img src="images/blog/avatar3.png" alt=""  />
                                    <p>We are planning to get the projector bought from the money from our Alumnis contacted through Colleg-connect </p>
                                    <div class="entry-meta small muted">
                                        <span>By <a href="#">Hima</a></span <span>On <a href="#">Creative</a></span>
                                    </div>
                                </div>
                                
                            </div>
                        </div>                     
                    </div><!--/.recent comments-->
                     

                    <div class="widget categories">
                        <h3>Categories</h3>
                        <div class="row">
                            <div class="col-sm-6">
                                <ul class="blog_category">
                                    <li><a href="#">Speakers <span class="badge">04</span></a></li>
                                    <li><a href="#">Codecracker <span class="badge">10</span></a></li>
                                    <li><a href="#">GSOC <span class="badge">06</span></a></li>
                                    <li><a href="#">Auditions <span class="badge">25</span></a></li>
                                </ul>
                            </div>
                        </div>                     
                    </div><!--/.categories-->
    				
    				<div class="widget archieve">
                        <h3>Archieve</h3>
                        <div class="row">
                            <div class="col-sm-12">
                                <ul class="blog_archieve">
                                    <li><a href="#"><i class="fa fa-angle-double-right"></i> December 2013 <span class="pull-right">(97)</span></a></li>
                                    <li><a href="#"><i class="fa fa-angle-double-right"></i> November 2013 <span class="pull-right">(32)</a></li>
                                    <li><a href="#"><i class="fa fa-angle-double-right"></i> October 2013 <span class="pull-right">(19)</a></li>
                                    <li><a href="#"><i class="fa fa-angle-double-right"></i> September 2013 <span class="pull-right">(08)</a></li>
                                </ul>
                            </div>
                        </div>                     
                    </div><!--/.archieve-->
    				
                 <br><br>
     <a class="btn btn-primary readmore" href="askQues.jsp?id=<%=clubid%>">Ask a question </a>
     <a class="btn btn-primary readmore" href="writeBlog.jsp?id=<%=clubid%>" >Write Blog </a>    
    				
    			</aside>  
            </div><!--/.row-->
        </div>
    </section><!--/#blog-->

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

