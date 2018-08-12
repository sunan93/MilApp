package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>SignUp</title>\n");
      out.write("    \n");
      out.write("    <!-- core CSS -->\n");
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
      out.write("<body class=\"sign-up\">\n");
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
      out.write("         </header><!--/header-->\n");
      out.write("\n");
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
      out.write("                <div class=\"collapse navbar-collapse navbar-left\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><h1>Mil-App!</h1><h2>(Connect Across Peers)</h2></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"aboutus.html\">About Us</a></li>\n");
      out.write("                        <li><a href=\"SignUp.jsp\">Sign up</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Log in</a></li>\n");
      out.write("                        <li><a href=\"cntc.html\">Contact</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.container-->\n");
      out.write("        </nav><!--/nav-->\n");
      out.write("        \n");
      out.write("    </header><!--/header-->\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write(" ");

  int flag=-1;
  String flgstr=(String)request.getAttribute("flag");
  try{
    flag=Integer.parseInt(flgstr);}
   catch(Exception e){}
      out.write("   \n");
      out.write("   \n");
      out.write(" ");
if(flgstr==""||flgstr==null){
      out.write("\n");
      out.write("\n");
      out.write(" <form class=\"col-md-5 col-md-offset-3\" action=\"ServletSignUp\" method=\"POST\">\n");
      out.write("     \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"First Name\" name=\"firstname\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Last Name\" name=\"lastname\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Nick\" name=\"username\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Institute Name\" name=\"institutename\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Year Of Passing\" name=\"year\">\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"City\" name=\"city\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Place Of Work\" name=\"placeofwork\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Email\" name=\"emailid\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"password\" class=\"form-control input-lg\" placeholder=\"Password\" name=\"password\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"password\" class=\"form-control input-lg\" placeholder=\"Confirm Password\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <button class=\"btn btn-primary btn-lg btn-block\">Sign In</button>\n");
      out.write("        <span><a href=\"#\">Need help?</a></span>\n");
      out.write("        <span class=\"pull-right\"><a href=\"#\">New Registration</a></span>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write(" \n");
}
   else{
      out.write("\n");
      out.write("   <div class=\"alert alert-success\">\n");
      out.write("        <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times;</a>\n");
      out.write("        <strong>Click to login!</strong> You have signed up successfully\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   ");
}
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
