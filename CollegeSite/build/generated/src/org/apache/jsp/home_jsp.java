package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Home </title>\n");
      out.write("\t\n");
      out.write("\t<!-- core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("   \n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body class=\"homepage\">\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-xs-4\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-xs-8\">\n");
      out.write("                       <div class=\"social\">\n");
      out.write("                            <ul class=\"social-share\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li> \n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-skype\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"search\">\n");
      out.write("                                <form role=\"form\">\n");
      out.write("                                    <input type=\"text\" class=\"search-form\" autocomplete=\"off\" placeholder=\"Search\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </form>\n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </div><!--/.top-bar-->\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\" role=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-left\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\"><h1>Mil-App!</h1><h4>( Connect Across Peers)</h4></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"aboutus.html\">About Us</a></li>\n");
      out.write("                        <li><a href=\"SignUp.jsp\">Sign up</a></li>\n");
      out.write("                        ");
 int userid=-1;
                           try{
                               userid=(Integer)session.getAttribute("userid");
                           }
                           catch(NullPointerException e)
                            {
                               userid=-1;
                            }
                           if(userid==-1){
                         
      out.write("\n");
      out.write("                        <li><a href=\"login.jsp\">Log in</a></li>\n");
      out.write("                         ");

                           }
                          else{
      out.write("\n");
      out.write("                        <li><a href=\"Servletlogout\">Log out</a></li>");
}
      out.write("\n");
      out.write("                        <li><a href=\"cntc.html\">Contact</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </nav><!--/nav-->\n");
      out.write("\t\t\n");
      out.write("    </header><!--/header-->\n");
      out.write("\n");
      out.write("     <section id=\"main-slider\" class=\"no-margin\">\n");
      out.write("        <div class=\"carousel slide\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("               \n");
      out.write("            </ol>\n");
      out.write("            \n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                <div class=\"item active\" style=\"background-image: url(images/milapp.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                       \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/connect.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    <h1 class=\"animation animated-item-1\">Keep in touch with Alumnus,seniors,juniors , official clubs of your college:<br> <h2><br>(Interact as a member of a group/club</br> rather than an individual.)</h2></h1>\n");
      out.write("                                    \n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/experience.jpg)\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("                                    <h1 class=\"animation animated-item-1\">Post Queries <br> share experiences: <h2><br> Just held a very successful event in your college? Share it with other clubs and fellow college mates.<br> Share an interview experience with your juniors just post it in your group!</h1>\n");
      out.write("                                    \n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("            </div><!--/.carousel-inner-->\n");
      out.write("        </div><!--/.carousel-->\n");
      out.write("        <a class=\"prev hidden-xs\" href=\"#main-slider\" data-slide=\"prev\">\n");
      out.write("            <i class=\"fa fa-chevron-left\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"next hidden-xs\" href=\"#main-slider\" data-slide=\"next\">\n");
      out.write("            <i class=\"fa fa-chevron-right\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <section class=\"pricing-page\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"center\">  \n");
      out.write("                <h2>FAQs</h2>\n");
      out.write("                <p class=\"lead\">Frequently Asked Questions </p>\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"pricing-area text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 plan price-one wow fadeInDown\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"heading-one\">\n");
      out.write("                                <h1>Why Mil-App?</h1>\n");
      out.write("                                <span></span>\n");
      out.write("                            </li>\n");
      out.write("                            <li>Interact as a member of a group rather than an individual.</li>\n");
      out.write("\n");
      out.write("                            <li>Talk to alumis by just posting in their group.</li>\n");
      out.write("                            <li>Get information about conducting fests from other clubs!</li>\n");
      out.write("                            <li>Reach a larger audience for your fest/events. Easy invitations.</li>\n");
      out.write("                            <li>Easy access to notes,question papers from your seniors!</li>\n");
      out.write("                            <li>Keep informed about the famous activities of your college!</li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 plan price-three wow fadeInDown\">\n");
      out.write("                       \n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"heading-three\">\n");
      out.write("                                <h1>Group to group Interaction:</h1>\n");
      out.write("                                <span></span>\n");
      out.write("                            </li>\n");
      out.write("                            <li>Do not know someone personally no problem just post in the group and get help.</li>\n");
      out.write("                            <li>Hesitant juniors interact with the seniors.</li>\n");
      out.write("                            <li>Need help from alumnus, interact with the whole lot of that passing year rather than contacting a single person.</li>\n");
      out.write("                            <li>Inter and Intra Club interaction.</li>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 plan price-two wow fadeInDown\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"heading-two\">\n");
      out.write("                                <h1>How do I start?</h1>\n");
      out.write("                                <span></span>\n");
      out.write("                            </li>\n");
      out.write("                            <li>1. Sign up and you will be allocated in the groups/clubs you belong according to your details</li>\n");
      out.write("                            <li>2. Keep track of the events of your college from the COLLEGE BOARD</li>\n");
      out.write("                            <li>3. (a)Share your experiences in the clubs you belong to.</li>\n");
      out.write("                            <li>   (b)Answer questions posted by others! </li>\n");
      out.write("                            <li>4. Post Questions in the board of the other clubs.</li>\n");
      out.write("                            <li class=\"plan-action\">\n");
      out.write("                                <a href=\"SignUp.jsp\" class=\"btn btn-primary\">Sign up</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("            </div><!--/pricing-area-->\n");
      out.write("        </div><!--/container-->\n");
      out.write("    </section><!--/pricing-page-->\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    </header><!--/header-->\n");
      out.write("    <section id=\"content\" class=\"shortcode-item\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-7\">\n");
      out.write("                    <h2>Upcoming events in NIT Durgapur</h2> \n");
      out.write("                    <div class=\"tab-wrap\">\n");
      out.write("                        <div class=\"media\">\n");
      out.write("                            <div class=\"parrent pull-left\">\n");
      out.write("                                <ul class=\"nav nav-tabs nav-stacked\">\n");
      out.write("                                    <li class=\"\"><a href=\"#tab1\" data-toggle=\"tab\" class=\"analistic-01\">Viraasat</a></li>\n");
      out.write("                                    <li class=\"active\"><a href=\"#tab2\" data-toggle=\"tab\" class=\"analistic-02\">Recstacy</a></li>\n");
      out.write("                                    <li class=\"\"><a href=\"#tab3\" data-toggle=\"tab\" class=\"tehnical\">GSOC barcamp</a></li>\n");
      out.write("                                    <li class=\"\"><a href=\"#tab4\" data-toggle=\"tab\" class=\"tehnical\">Hack.me Sprints</a></li>\n");
      out.write("                                   \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"parrent media-body\">\n");
      out.write("                                <div class=\"tab-content\">\n");
      out.write("                                    <div class=\"tab-pane\" id=\"tab1\">\n");
      out.write("                                        <div class=\"media\">\n");
      out.write("                                           <div class=\"pull-left\">\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"media-body\">\n");
      out.write("                                                 <h4>SPICMACAY</h4>\n");
      out.write("                                                 <p>Very Proud to be announcing that in the 2nd weekend of March, NIT Durgapur will play host to the first ever NITD SPICMACAY Viraasat.\n");
      out.write("This 3 day event, to be held in SAC from 13th - 15th March ,will foster budding talent and see them interact, and perform with classical artists of international repute.\n");
      out.write("We are also happy to welcome amongst us (Padma Bhushan) Ustad Abdul Rashid Khan and Pandit Kushal Das who have been gracious enough to join us on this occasion.\n");
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                     <div class=\"tab-pane active in\" id=\"tab2\">\n");
      out.write("                                        <div class=\"media\">\n");
      out.write("                                           <div class=\"pull-left\">\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"media-body\">\n");
      out.write("                                                 <h4>Recstacy 2k15</h4>\n");
      out.write("                                                 <p> The dates to be announced soon the four days of complete entertainment :)\n");
      out.write("                                                 </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                     </div>\n");
      out.write("\n");
      out.write("                                     <div class=\"tab-pane\" id=\"tab3\">\n");
      out.write("                                        <p>planned to focus on the main topics, which would guide an aspirant to apply successfully for the program. \n");
      out.write("On 10th, we started off with the Introduction to the Program, where our previous GSoCers Rupanjana Mitra and Aniket Anvit enlightened the attendees about the the program is, and what the students stand to gain if they choose to apply for it.</p>\n");
      out.write("                                     </div>\n");
      out.write("                                     \n");
      out.write("                                     <div class=\"tab-pane\" id=\"tab4\">\n");
      out.write("                                        <p>Welcome to the group pertaining to all the details regarding the sessions that we would be conducted by GNU/Linux Users' Group, NIT Durgapur.\n");
      out.write("Attend the hackathons, where we tear down softwares and look under the hood! All the while improving our skills\n");
      out.write("                                     </div>\n");
      out.write("\n");
      out.write("                                     <div class=\"tab-pane\" id=\"tab5\">\n");
      out.write("                                        <p>Lplanned to focus on the main topics, which would guide an aspirant to apply successfully for the program. \n");
      out.write("On 10th, we started off with the Introduction to the Program, where our previous GSoCers Rupanjana Mitra and Aniket Anvit enlightened the attendees about the the program is, and what the students stand to gain if they choose to apply for it.</p>\n");
      out.write("                                     </div>\n");
      out.write("                                </div> <!--/.tab-content-->  \n");
      out.write("                            </div> <!--/.media-body--> \n");
      out.write("                        </div> <!--/.media-->     \n");
      out.write("                    </div><!--/.tab-wrap-->               \n");
      out.write("                </div><!--/.col-sm-6-->\n");
      out.write("    \n");
      out.write("    </header><!--/header-->\n");
      out.write("    <section id=\"portfolio\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("               \n");
      out.write("                <ul class=\"portfolio-filter text-center\">\n");
      out.write("                <li><a class=\"btn btn-default active\" href=\"#\" data-filter=\"*\">Clubs/Groups</a></li>\n");
      out.write("                 <a class=\"btn btn-default active\" href=\"#\" data-filter=\"*\">See more</a>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </ul><!--/#portfolio-filter-->\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"portfolio-items\">\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <div class=\"portfolio-item joomla bootstrap col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"recent-work-wrap\">\n");
      out.write("                            <img class=\"img-responsive\" src=\"images/portfolio/recent/item2.png\" alt=\"\">\n");
      out.write("                            <div class=\"overlay\">\n");
      out.write("                                <div class=\"recent-work-inner\">\n");
      out.write("                                    <h3><a href=\"#\">GLUG</a></h3>\n");
      out.write("                                    \n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                        </div>          \n");
      out.write("                    </div><!--/.portfolio-item-->\n");
      out.write("\n");
      out.write("                    <div class=\"portfolio-item bootstrap wordpress col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"recent-work-wrap\">\n");
      out.write("                            <img class=\"img-responsive\" src=\"images/mntc.png\" alt=\"\">\n");
      out.write("                            <div class=\"overlay\">\n");
      out.write("                                <div class=\"recent-work-inner\">\n");
      out.write("                                    <h3><a href=\"#\">MNTC</a></h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>        \n");
      out.write("                    </div><!--/.portfolio-item-->\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </section><!--/#portfolio-item-->\n");
      out.write("             <section id=\"feature\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"center wow fadeInDown\">\n");
      out.write("                <h2>Features</h2>\n");
      out.write("                <p class=\"lead\">What can you do here :) </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"features\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-bullhorn\"></i>\n");
      out.write("                            <h2>Publicize your fests and events</h2>\n");
      out.write("                            <h3>Forum to show off your activities of your club</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-comments\"></i>\n");
      out.write("                            <h2>Post a question</h2>\n");
      out.write("                            <h3>Ask questions or post grievances</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\n");
      out.write("                        <div class=\"feature-wrap\">\n");
      out.write("                            <i class=\"fa fa-cogs\"></i>\n");
      out.write("                            <h2>Be a part of a group of your college</h2>\n");
      out.write("                            <h3>Discuss your group issues here!</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/.col-md-4-->\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div><!--/.services-->\n");
      out.write("            </div><!--/.row-->    \n");
      out.write("        </div><!--/.container-->\n");
      out.write("    </section><!--/#feature-->\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <footer id=\"footer\" class=\"midnight-blue\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul class=\"pull-right\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Faq</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer><!--/#footer-->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
