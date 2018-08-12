<%-- 
    Document   : home
    Created on : 4 Mar, 2015, 6:01:27 PM
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
    <title>Home </title>
	
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

<body class="homepage">

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
                    <a class="navbar-brand" href="home.jsp"><h1>Mil-App!</h1><h4>( Connect Across Peers)</h4></a>
                </div>
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">

                        <li class="active"><a href="home.jsp">Home</a></li>
                        <li><a href="aboutus.html">About Us</a></li>
                        <li><a href="SignUp.jsp">Sign up</a></li>
                        <% int userid=-1;
                           try{
                               userid=(Integer)session.getAttribute("userid");
                           }
                           catch(NullPointerException e)
                            {
                               userid=-1;
                            }
                           if(userid==-1){
                         %>
                        <li><a href="login.jsp">Log in</a></li>
                         <%
                           }
                          else{%>
                        <li><a href="Servletlogout">Log out</a></li><%}%>
                        <li><a href="cntc.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->

     <section id="main-slider" class="no-margin">
        <div class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#main-slider" data-slide-to="0" class="active"></li>
                <li data-target="#main-slider" data-slide-to="1"></li>
                <li data-target="#main-slider" data-slide-to="2"></li>
                
                 
               
            </ol>
            
            <div class="carousel-inner">

                <div class="item active" style="background-image: url(images/milapp.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    
                                    
                                       
                                    
                                    
                                </div>
                            </div>

                            

                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/connect.jpg)">
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1">Keep in touch with Alumnus,seniors,juniors , official clubs of your college:<br> <h2><br>(Interact as a member of a group/club</br> rather than an individual.)</h2></h1>
                                    
                                    <a class="btn-slide animation animated-item-3" href="#">Read More</a>
                                </div>
                            </div>

                            

                        </div>
                    </div>
                </div><!--/.item-->

                <div class="item" style="background-image: url(images/experience.jpg)" >
                    <div class="container">
                        <div class="row slide-margin">
                            <div class="col-sm-6">
                                <div class="carousel-content">
                                    <h1 class="animation animated-item-1">Post Queries <br> share experiences: <h2><br> Just held a very successful event in your college? Share it with other clubs and fellow college mates.<br> Share an interview experience with your juniors just post it in your group!</h1>
                                    
                                    <a class="btn-slide animation animated-item-3" href="#">Read More</a>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div><!--/.item-->
            </div><!--/.carousel-inner-->
        </div><!--/.carousel-->
        <a class="prev hidden-xs" href="#main-slider" data-slide="prev">
            <i class="fa fa-chevron-left"></i>
        </a>
        <a class="next hidden-xs" href="#main-slider" data-slide="next">
            <i class="fa fa-chevron-right"></i>
        </a>

    </section>
    

    
    <section class="pricing-page">
        <div class="container">
            <div class="center">  
                <h2>FAQs</h2>
                <p class="lead">Frequently Asked Questions </p>
            </div>  
            <div class="pricing-area text-center">
                <div class="row">
                    <div class="col-sm-4 plan price-one wow fadeInDown">
                        <ul>
                            <li class="heading-one">
                                <h1>Why Mil-App?</h1>
                                <span></span>
                            </li>
                            <li>Interact as a member of a group rather than an individual.</li>

                            <li>Talk to alumis by just posting in their group.</li>
                            <li>Get information about conducting fests from other clubs!</li>
                            <li>Reach a larger audience for your fest/events. Easy invitations.</li>
                            <li>Easy access to notes,question papers from your seniors!</li>
                            <li>Keep informed about the famous activities of your college!</li>
                            
                        </ul>
                    </div>
                    <div class="col-sm-4 plan price-three wow fadeInDown">
                       
                        <ul>
                            <li class="heading-three">
                                <h1>Group to group Interaction:</h1>
                                <span></span>
                            </li>
                            <li>Do not know someone personally no problem just post in the group and get help.</li>
                            <li>Hesitant juniors interact with the seniors.</li>
                            <li>Need help from alumnus, interact with the whole lot of that passing year rather than contacting a single person.</li>
                            <li>Inter and Intra Club interaction.</li>
                           
                            
                        </ul>
                    </div>

                    <div class="col-sm-4 plan price-two wow fadeInDown">
                        <ul>
                            <li class="heading-two">
                                <h1>How do I start?</h1>
                                <span></span>
                            </li>
                            <li>1. Sign up and you will be allocated in the groups/clubs you belong according to your details</li>
                            <li>2. Keep track of the events of your college from the COLLEGE BOARD</li>
                            <li>3. (a)Share your experiences in the clubs you belong to.</li>
                            <li>   (b)Answer questions posted by others! </li>
                            <li>4. Post Questions in the board of the other clubs.</li>
                            <li class="plan-action">
                                <a href="SignUp.jsp" class="btn btn-primary">Sign up</a>
                            </li>
                        </ul>
                    </div>

                    

                   

            </div><!--/pricing-area-->
        </div><!--/container-->
    </section><!--/pricing-page-->
    
   
    
    </header><!--/header-->
    <section id="content" class="shortcode-item">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-7">
                    <h2>Upcoming events in NIT Durgapur</h2> 
                    <div class="tab-wrap">
                        <div class="media">
                            <div class="parrent pull-left">
                                <ul class="nav nav-tabs nav-stacked">
                                    <li class=""><a href="#tab1" data-toggle="tab" class="analistic-01">Viraasat</a></li>
                                    <li class="active"><a href="#tab2" data-toggle="tab" class="analistic-02">Recstacy</a></li>
                                    <li class=""><a href="#tab3" data-toggle="tab" class="tehnical">GSOC barcamp</a></li>
                                    <li class=""><a href="#tab4" data-toggle="tab" class="tehnical">Hack.me Sprints</a></li>
                                   
                                </ul>
                            </div>

                            <div class="parrent media-body">
                                <div class="tab-content">
                                    <div class="tab-pane" id="tab1">
                                        <div class="media">
                                           <div class="pull-left">
                                                
                                            </div>
                                            <div class="media-body">
                                                 <h4>SPICMACAY</h4>
                                                 <p>Very Proud to be announcing that in the 2nd weekend of March, NIT Durgapur will play host to the first ever NITD SPICMACAY Viraasat.
This 3 day event, to be held in SAC from 13th - 15th March ,will foster budding talent and see them interact, and perform with classical artists of international repute.
We are also happy to welcome amongst us (Padma Bhushan) Ustad Abdul Rashid Khan and Pandit Kushal Das who have been gracious enough to join us on this occasion.
</p>
                                            </div>
                                        </div>
                                    </div>

                                     <div class="tab-pane active in" id="tab2">
                                        <div class="media">
                                           <div class="pull-left">
                                                
                                            </div>
                                            <div class="media-body">
                                                 <h4>Recstacy 2k15</h4>
                                                 <p> The dates to be announced soon the four days of complete entertainment :)
                                                 </p>
                                            </div>
                                        </div>
                                     </div>

                                     <div class="tab-pane" id="tab3">
                                        <p>planned to focus on the main topics, which would guide an aspirant to apply successfully for the program. 
On 10th, we started off with the Introduction to the Program, where our previous GSoCers Rupanjana Mitra and Aniket Anvit enlightened the attendees about the the program is, and what the students stand to gain if they choose to apply for it.</p>
                                     </div>
                                     
                                     <div class="tab-pane" id="tab4">
                                        <p>Welcome to the group pertaining to all the details regarding the sessions that we would be conducted by GNU/Linux Users' Group, NIT Durgapur.
Attend the hackathons, where we tear down softwares and look under the hood! All the while improving our skills
                                     </div>

                                     <div class="tab-pane" id="tab5">
                                        <p>Lplanned to focus on the main topics, which would guide an aspirant to apply successfully for the program. 
On 10th, we started off with the Introduction to the Program, where our previous GSoCers Rupanjana Mitra and Aniket Anvit enlightened the attendees about the the program is, and what the students stand to gain if they choose to apply for it.</p>
                                     </div>
                                </div> <!--/.tab-content-->  
                            </div> <!--/.media-body--> 
                        </div> <!--/.media-->     
                    </div><!--/.tab-wrap-->               
                </div><!--/.col-sm-6-->
    
    </header><!--/header-->
    <section id="portfolio">
        <div class="container">
           
               
                <ul class="portfolio-filter text-center">
                <li><a class="btn btn-default active" href="#" data-filter="*">Clubs/Groups</a></li>
                 <a class="btn btn-default active" href="#" data-filter="*">See more</a>
               
                
            </ul><!--/#portfolio-filter-->

            <div class="row">
                <div class="portfolio-items">
                    

                    <div class="portfolio-item joomla bootstrap col-xs-12 col-sm-4 col-md-3">
                        <div class="recent-work-wrap">
                            <img class="img-responsive" src="images/portfolio/recent/item2.png" alt="">
                            <div class="overlay">
                                <div class="recent-work-inner">
                                    <h3><a href="#">GLUG</a></h3>
                                    
                                </div> 
                            </div>
                        </div>          
                    </div><!--/.portfolio-item-->

                    <div class="portfolio-item bootstrap wordpress col-xs-12 col-sm-4 col-md-3">
                        <div class="recent-work-wrap">
                            <img class="img-responsive" src="images/mntc.png" alt="">
                            <div class="overlay">
                                <div class="recent-work-inner">
                                    <h3><a href="#">MNTC</a></h3>


                                    
                                </div> 

                            </div>
                        </div>        
                    </div><!--/.portfolio-item-->
                    


                </div>
            </div>
           
        </div>
    </section><!--/#portfolio-item-->
             <section id="feature" >
        <div class="container">
           <div class="center wow fadeInDown">
                <h2>Features</h2>
                <p class="lead">What can you do here :) </p>
            </div>

            <div class="row">
                <div class="features">
                    <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                        <div class="feature-wrap">
                            <i class="fa fa-bullhorn"></i>
                            <h2>Publicize your fests and events</h2>
                            <h3>Forum to show off your activities of your club</h3>
                        </div>
                    </div><!--/.col-md-4-->

                    <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                        <div class="feature-wrap">
                            <i class="fa fa-comments"></i>
                            <h2>Post a question</h2>
                            <h3>Ask questions or post grievances</h3>
                        </div>
                    </div><!--/.col-md-4-->

                    
                    

                    <div class="col-md-4 col-sm-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                        <div class="feature-wrap">
                            <i class="fa fa-cogs"></i>
                            <h2>Be a part of a group of your college</h2>
                            <h3>Discuss your group issues here!</h3>
                        </div>
                    </div><!--/.col-md-4-->

                    
                </div><!--/.services-->
            </div><!--/.row-->    
        </div><!--/.container-->
    </section><!--/#feature-->

   

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