<%-- 
    Document   : profile
    Created on : 6 Mar, 2015, 2:22:47 PM
    Author     : User
--%>

<%@page import="CollegePack.Club"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="CollegePack.User"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Profile </title>
    
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

                        <li class="active"><a href="home.jsp">Home</a></li>
                        <li><a href="aboutus.html">About Us</a></li>
                        <li><a href="SignUp.jsp">Sign up</a></li>
                        <li><a href="Servletlogout">Log out</a></li>
                        <li><a href="cntc.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
        
    </header><!--/header-->
<hr class="">
<div class="container target">
    <div class="row">
        <div class="col-sm-10">
             <h1 class="">Starfox221</h1>
         
          
         <br>
        </div>

    </div>
  <br>
     <div class="row">
        <div class="col-sm-3">
            <!--left col-->
            <ul class="list-group">
                <li class="list-group-item text-muted" contenteditable="false">Profile</li>
                <% if(userid!=-1){%>
                <li class="list-group-item text-right"><span class="pull-left"><strong class="">Name :</strong></span><%= user.getStrFirstName()%></li>
               <li class="list-group-item text-right"><span class="pull-left"><strong class="">Year of passing: </strong></span> <%=user.getStrYear()%>
               <%}%>
                      </li>
            </ul>
        </div>

<section id="about-us">
        <div class="container">
			<div class="center wow fadeInDown">
				<h2>Events in my College</h2>
				<p class="lead">You can see the upcoming famous events of your own college.Participate Share and Learn :)</p>
			</div>
			
			<!-- about us slider -->
			<div id="about-slider">
				<div id="carousel-slider" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
				  	<ol class="carousel-indicators visible-xs">
					    <li data-target="#carousel-slider" data-slide-to="0" class="active"></li>
					    <li data-target="#carousel-slider" data-slide-to="1"></li>
					    <li data-target="#carousel-slider" data-slide-to="2"></li>
				  	</ol>

					<div class="carousel-inner">
						<div class="item active">
                                                       <p class="lead"><h3>The most awaited Recstacy will be here soon!<br> Wear your dancing shoes and be ready to have some fun.</h3></p>
							<img src="images/recs.jpg" class="img-responsive" margin-left="100" alt="" > 
                                                        

					   </div>
					   
					   <div class="item">
							 <p class="lead"><h3>Hangout with the ICSE results hacker himself.Debarghya Das the genius now in facebook!</h3></p>
                                                     <img src="images/d.jpg" class="img-responsive" alt=""> 
					   </div> 
                                         <div class="item">
                                                        <p class="lead"><h3>Behold flipkart's CTO is here.</h3></p>
							<img src="images/amod.jpg" class="img-responsive" alt=""> 
					   </div> 

					</div>
					
					<a class="left carousel-control hidden-xs" href="#carousel-slider" data-slide="prev">
						<i class="fa fa-angle-left"></i> 
					</a>
					
					<a class=" right carousel-control hidden-xs"href="#carousel-slider" data-slide="next">
						<i class="fa fa-angle-right"></i> 
					</a>
				</div> <!--/#carousel-slider-->
			</div><!--/#about-slider-->
			
			
			<!-- Our Skill -->
			<div class="skill-wrap clearfix">
			
				 <div class="center wow fadeInDown">
                    <h2>I am a member of</h2>
                    <p> (click on the name to <br>1.get updates <br> 2.post questions <br> 3. answer of the club)</p>
                    
                </div>
                       <%  ArrayList<Club> list=null;
                           ArrayList<Integer> list2=null;
                           if(userid!=-1){
                               list=Club.getClubByUserId(user.getiUserId());
                               list2=Club.getAllNotInClubsByUserId(user.getiUserId());
                       }
                       if(list!=null){
                       %>
                       <div class="row">
                       <%
                             for(int i=0;i<list.size();i++)
                              {
                                 
                               System.out.println("here "+list.get(i).getStrClubName());
                       %>
                       
				 <%String clubname=list.get(i).getStrClubName();
                                   clubname=clubname.replaceAll("\\s+","");
                                   String ref=clubname+".jsp?id="+list.get(i).getiClubId();
                                   System.out.println("profile page "+ref);%>
				
		
					<div class="col-sm-3">
						<div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
							<div class="joomla-skill">                                   
								<p><em></em></p>
								<a href=<%=ref%>><%=list.get(i).getStrClubName()%></a>
							</div>
						</div>
					</div>
			<%}%>	
                       </div>
                       <%}%>
	     <ul class="list-group">
                <li class="list-group-item text-muted">Activity <i class="fa fa-dashboard fa-1x"></i>

                
                
                    <li class="list-group-item text-right"><span class="pull-left"><strong class="">Posts</strong></span> 37</li>
                        <li class="list-group-item text-right"><span class="pull-left"><strong class="">Answers</strong></span> 78</li>
            </ul>
            </div><!--/.our-skill-->
            <div class="skill-wrap clearfix">
			
				 <div class="center wow fadeInDown">
                    <h2>Other known clubs</h2>
                     <p> (click on the name to <br>1.get updates <br> 2.post your queries and grievances)</p>
                    
                </div>
                     <%
                      if(list2!=null){
                       %>
				<div class="row">
                                 <%
                             for(int i=0;i<list2.size();i++)
                              {
                                 
                                Club club=Club.getClubByClubId(list2.get(i));
                                 
                               System.out.println("here "+club.getStrClubName());
                                  %>
		                 
                               <%String ref=club.getStrClubName()+".jsp?id="+club.getiClubId();
                                 System.out.println(ref);%>
                                   
					<div class="col-sm-3">
						<div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
							<div class="joomla-skill">                                   
								<p><em></em></p>
								 <a href=<%=ref%>><%=club.getStrClubName()%></a>
							</div>
						</div>
					</div>
			     <%}%>	
					
				</div>
                          <%}%>
	
            </div><!--/.our-skill-->
       </section>
			

            
               
                
                
    
            </div><!--/.our-skill-->
          
          
           
        
               
        
                
               
            


            
            
              
    </div>
           
</div></div>


            <div id="push"></div>
        </div>
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
        <script src="/plugins/bootstrap-select.min.js"></script>
        <script src="/codemirror/jquery.codemirror.js"></script>
        <script src="/beautifier.js"></script>
        <script>
          (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
          (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
          m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
          })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
          ga('create', 'UA-40413119-1', 'bootply.com');
          ga('send', 'pageview');
        </script>
        <script>
        jQuery.fn.shake = function(intShakes, intDistance, intDuration, foreColor) {
            this.each(function() {
                if (foreColor && foreColor!="null") {
                    $(this).css("color",foreColor); 
                }
                $(this).css("position","relative"); 
                for (var x=1; x<=intShakes; x++) {
                $(this).animate({left:(intDistance*-1)}, (((intDuration/intShakes)/4)))
                .animate({left:intDistance}, ((intDuration/intShakes)/2))
                .animate({left:0}, (((intDuration/intShakes)/4)));
                $(this).css("color",""); 
            }
          });
        return this;
        };
        </script>
        <script>
        $(document).ready(function() {
        
            $('.tw-btn').fadeIn(3000);
            $('.alert').delay(5000).fadeOut(1500);
            
            $('#btnLogin').click(function(){
                $(this).text("...");
                $.ajax({
                    url: "/loginajax",
                    type: "post",
                    data: $('#formLogin').serialize(),
                    success: function (data) {
                        //console.log('data:'+data);
                        if (data.status==1&&data.user) { //logged in
                            $('#menuLogin').hide();
                            $('#lblUsername').text(data.user.username);
                            $('#menuUser').show();
                            /*
                            $('#completeLoginModal').modal('show');
                            $('#btnYes').click(function() {
                                window.location.href="/";
                            });
                            */
                        }
                        else {
                            $('#btnLogin').text("Login");
                            prependAlert("#spacer",data.error);
                            $('#btnLogin').shake(4,6,700,'#CC2222');
                            $('#username').focus();
                        }
                    },
                    error: function (e) {
                        $('#btnLogin').text("Login");
                        console.log('error:'+JSON.stringify(e));
                    }
                });
            });
            $('#btnRegister').click(function(){
                $(this).text("Wait..");
                $.ajax({
                    url: "/signup?format=json",
                    type: "post",
                    data: $('#formRegister').serialize(),
                    success: function (data) {
                        console.log('data:'+JSON.stringify(data));
                        if (data.status==1) {
                            $('#btnRegister').attr("disabled","disabled");
                            $('#formRegister').text('Thanks. You can now login using the Login form.');
                        }
                        else {
                            prependAlert("#spacer",data.error);
                            $('#btnRegister').shake(4,6,700,'#CC2222');
                            $('#btnRegister').text("Sign Up");
                            $('#inputEmail').focus();
                        }
                    },
                    error: function (e) {
                        $('#btnRegister').text("Sign Up");
                        console.log('error:'+e);
                    }
                });
            });
            
            $('.loginFirst').click(function(){
                $('#navLogin').trigger('click');
                return false;
            });
            
            $('#btnForgotPassword').on('click',function(){
                $.ajax({
                    url: "/resetPassword",
                    type: "post",
                    data: $('#formForgotPassword').serializeObject(),
                    success: function (data) {
                        if (data.status==1){
                            prependAlert("#spacer",data.msg);
                            return true;
                        }
                        else {
                            prependAlert("#spacer","Your password could not be reset.");
                            return false;
                        }
                    },
                    error: function (e) {
                        console.log('error:'+e);
                    }
                });
            });
            
            $('#btnContact').click(function(){
                
                $.ajax({
                    url: "/contact",
                    type: "post",
                    data: $('#formContact').serializeObject(),
                    success: function (data) {
                        if (data.status==1){
                            prependAlert("#spacer","Thanks. We got your message and will get back to you shortly.");
                             $('#contactModal').modal('hide');
                            return true;
                        }
                        else {
                            prependAlert("#spacer",data.error);
                            return false;
                        }
                    },
                    error: function (e) {
                        console.log('error:'+e);
                    }
                });
                return false;
            });
            
            /*
            $('.nav .dropdown-menu input').on('click touchstart',function(e) {
                e.stopPropagation();
            });
            */
            
            
            
            
            
        });
        $.fn.serializeObject = function()
        {
            var o = {};
            var a = this.serializeArray();
            $.each(a, function() {
                if (o[this.name] !== undefined) {
                    if (!o[this.name].push) {
                        o[this.name] = [o[this.name]];
                    }
                    o[this.name].push(this.value || '');
                } else {
                    o[this.name] = this.value || '';
                }
            });
            return o;
        };
        var prependAlert = function(appendSelector,msg){
            $(appendSelector).after('<div class="alert alert-info alert-block affix" id="msgBox" style="z-index:1300;margin:14px!important;">'+msg+'</div>');
            $('.alert').delay(3500).fadeOut(1000);
        }
        </script>
        <!-- Quantcast Tag -->
        <script type="text/javascript">
        var _qevents = _qevents || [];
        
        (function() {
        var elem = document.createElement('script');
        elem.src = (document.location.protocol == "https:" ? "https://secure" : "http://edge") + ".quantserve.com/quant.js";
        elem.async = true;
        elem.type = "text/javascript";
        var scpt = document.getElementsByTagName('script')[0];
        scpt.parentNode.insertBefore(elem, scpt);
        })();
        
        _qevents.push({
        qacct:"p-0cXb7ATGU9nz5"
        });
        </script>
        <noscript>
        &amp;amp;amp;amp;amp;amp;amp;lt;div style="display:none;"&amp;amp;amp;amp;amp;amp;amp;gt;
        &amp;amp;amp;amp;amp;amp;amp;lt;img src="//pixel.quantserve.com/pixel/p-0cXb7ATGU9nz5.gif" border="0" height="1" width="1" alt="Quantcast"/&amp;amp;amp;amp;amp;amp;amp;gt;
        &amp;amp;amp;amp;amp;amp;amp;lt;/div&amp;amp;amp;amp;amp;amp;amp;gt;
        </noscript>
        <!-- End Quantcast tag -->
        <div id="completeLoginModal" class="modal hide">
            <div class="modal-header">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
                 <h3>Do you want to proceed?</h3>
            </div>
            <div class="modal-body">
                <p>This page must be refreshed to complete your login.</p>
                <p>You will lose any unsaved work once the page is refreshed.</p>
                <br><br>
                <p>Click "No" to cancel the login process.</p>
                <p>Click "Yes" to continue...</p>
            </div>
            <div class="modal-footer">
              <a href="#" id="btnYes" class="btn danger">Yes, complete login</a>
              <a href="#" data-dismiss="modal" aria-hidden="true" class="btn secondary">No</a>
            </div>
        </div>
        <div id="forgotPasswordModal" class="modal hide">
            <div class="modal-header">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
                 <h3>Password Lookup</h3>
            </div>
            <div class="modal-body">
                  <form class="form form-horizontal" id="formForgotPassword">    
                  <div class="control-group">
                      <label class="control-label" for="inputEmail">Email</label>
                      <div class="controls">
                          <input name="_csrf" id="token" type="hidden" value="CkMEALL0JBMf5KSrOvu9izzMXCXtFQ/Hs6QUY=">
                          <input type="email" name="email" id="inputEmail" placeholder="you@youremail.com" required="">
                          <span class="help-block"><small>Enter the email address you used to sign-up.</small></span>
                      </div>
                  </div>
                  </form>
            </div>
            <div class="modal-footer pull-center">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="btn">Cancel</a> 	
            	<a href="#" data-dismiss="modal" id="btnForgotPassword" class="btn btn-success">Reset Password</a>
            </div>
            
        </div>
        <div id="upgradeModal" class="modal hide">
            <div class="modal-header">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
                 <h4>Would you like to upgrade?</h4>
            </div>
            <div class="modal-body">
                  <p class="text-center"><strong></strong></p>
                  <h1 class="text-center">$4<small>/mo</small></h1>
                  <p class="text-center"><small>Unlimited plys. Unlimited downloads. No Ads.</small></p>
                  <p class="text-center"><img src="/assets/i_visa.png" width="50" alt="visa"> <img src="/assets/i_mc.png" width="50" alt="mastercard"> <img src="/assets/i_amex.png" width="50" alt="amex"> <img src="/assets/i_discover.png" width="50" alt="discover"> <img src="/assets/i_paypal.png" width="50" alt="paypal"></p>
            </div>
            <div class="modal-footer pull-center">
            	<a href="/upgrade" class="btn btn-block btn-huge btn-success"><strong>Upgrade Now</strong></a>
            	<a href="#" data-dismiss="modal" class="btn btn-block btn-huge">No Thanks, Maybe Later</a>
            </div>
        </div>
        <div id="contactModal" class="modal hide">
            <div class="modal-header">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="close">×</a>
                <h3>Contact Us</h3>
                <p>suggestions, questions or feedback</p>
            </div>
            <div class="modal-body">
                  <form class="form form-horizontal" id="formContact">
                      <input name="_csrf" id="token" type="hidden" value="CkMEALL0JBMf5KSrOvu9izzMXCXtFQ/Hs6QUY=">
                      <div class="control-group">
                          <label class="control-label" for="inputSender">Name</label>
                          <div class="controls">
                              <input type="text" name="sender" id="inputSender" class="input-large" placeholder="Your name">
                          </div>
                      </div>
                      <div class="control-group">
                          <label class="control-label" for="inputMessage">Message</label>
                          <div class="controls">
                              <textarea name="notes" rows="5" id="inputMessage" class="input-large" placeholder="Type your message here"></textarea>
                          </div>
                      </div>
                      <div class="control-group">
                          <label class="control-label" for="inputEmail">Email</label>
                          <div class="controls">
                              <input type="text" name="email" id="inputEmail" class="input-large" placeholder="you@youremail.com (for reply)" required="">
                          </div>
                      </div>
                  </form>
            </div>
            <div class="modal-footer pull-center">
                <a href="#" data-dismiss="modal" aria-hidden="true" class="btn">Cancel</a>     
                <a href="#" data-dismiss="modal" aria-hidden="true" id="btnContact" role="button" class="btn btn-success">Send</a>
            </div>
        </div>
        
        
        
	
	<script src="/plugins/bootstrap-pager.js"></script>
</div>
