package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    </body>\n");
      out.write("    <br><br><br>\n");
      out.write("    <footer class=\"container\" style=\"text-align: center; background-color: #ddd; bottom: 0; \" >\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 \">\n");
      out.write("                <a href=\"http://shreenarayanijew.com/Home.jsp\"><img src=\"images/Nav-Logo4.png\" id=\"blogo\" ></a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-2 col-md-3 leftAlign\" style=\"padding-left: 5%; font-size: 15px\">\n");
      out.write("                <h5>ABOUT US</h5><br>\n");
      out.write("                <span><a href=\"http://shreenarayanijew.com/aboutUs.jsp\" onclick=\"scTo()\">About</a></span><br>\n");
      out.write("                <span><a href=\"http://shreenarayanijew.com/Contact%20us.jsp\">Contact us</a></span><br>\n");
      out.write("                <span><a href=\"http://shreenarayanijew.com/Developers.jsp\">Developers</a></span>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-2 col-md-3 leftAlign\" style=\"padding-left: 5%; font-size: 15px\" >\n");
      out.write("                <h5>MENU</h5><br>\n");
      out.write("                    <span><a href=\"http://shreenarayanijew.com/Home.jsp\">Home</a></span><br>\n");
      out.write("                    <form method=\"post\" action=\"allProducts\" style=\"margin-bottom: 0px\"><span><input type=\"submit\" value=\"All Products\" name=\"btn\" style=\"background-color:#ddd; border: 0px;color: #555; font-size: 17px; padding: 0px; outline: none\"></span></form>\n");
      out.write("                    <span><a href=\"http://shreenarayanijew.com/Contact%20us.jsp\">Enquire Now</a></span><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 leftAlign\" style=\"padding-left: 5%;font-size: 15px\">\n");
      out.write("                <h5>Contact Us:</h5><br>\n");
      out.write("                <svg class=\"bi bi-house-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M8 3.293l6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6zm5-.793V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z\"/>\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z\"/>\n");
      out.write("                </svg>\n");
      out.write("                : 107-1166, Kucha Mahajani, Chandni Chowk, Delhi-110006\n");
      out.write("                <br>\n");
      out.write("                <svg class=\"bi bi-envelope-fill\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555zM0 4.697v7.104l5.803-3.558L0 4.697zM6.761 8.83l-6.57 4.027A2 2 0 0 0 2 14h12a2 2 0 0 0 1.808-1.144l-6.57-4.027L8 9.586l-1.239-.757zm3.436-.586L16 11.801V4.697l-5.803 3.546z\"/>\n");
      out.write("                </svg>    \n");
      out.write("                : narayanijew@gmail.com\n");
      out.write("                <br>\n");
      out.write("                <svg class=\"bi bi-phone\" width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M11 1H5a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z\"/>\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z\"/>\n");
      out.write("                </svg>\n");
      out.write("                : +91-9312601741, 9818916742, 8860262989, 011-41811320    \n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("            <br>\n");
      out.write("            <div>Copyright&copy; 2020</div>\n");
      out.write("            <br>\n");
      out.write("\t\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
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
