package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actualite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<section id=\"main-content\">\n");
      out.write("      <section class=\"wrapper\">\n");
      out.write("     ");
  int i=0;
       String names[]= {"saad" ,"anass","hamza","youness"};
        for(i=0;i<4;i++)
        {
      out.write("\n");
      out.write("        \t <div class=\"container\">\n");
      out.write("        \t\t<div class=\"col-md-10\">\n");
      out.write("        \t        <div class=\"panel panel-default\">\n");
      out.write("        \t            <div class=\"panel-body\">\n");
      out.write("        \t               <section class=\"post-heading\">\n");
      out.write("        \t                    <div class=\"row\">\n");
      out.write("        \t                        <div class=\"col-md-11\">\n");
      out.write("        \t                            <div class=\"media\">\n");
      out.write("        \t   \n");
      out.write("        \t                              <div class=\"media-body\">\n");
      out.write("        \t                                <a  class=\"anchor-username\"><h4 class=\"media-heading\">");
      out.print(names[i] );
      out.write("</h4></a> \n");
      out.write("        \t                              </div>\n");
      out.write("        \t                            </div>\n");
      out.write("        \t                        </div>\n");
      out.write("        \t                         \n");
      out.write("        \t                    </div>             \n");
      out.write("        \t               </section>\n");
      out.write("        \t               <section class=\"post-body\">\n");
      out.write("        \t                   <p>Il existe une contradiction dans le projet entre la novation, l'inconnu, le risque d'une part, et la nécessité d'une méthode, d'une rigueur, bref d'une conduite d'autre part.\n");
      out.write("\n");
      out.write("        \tLa notion d'objectif est clairement explicitée (Afitep et Iso)\n");
      out.write("\n");
      out.write("        \tLa notion d'ensemble d'activités ou d'actions est retenue mais il faut tout de même distinguer le projet d'un ensemble d'opérations.</p>\n");
      out.write("        \t               </section>\n");
      out.write("        \t      </div>\n");
      out.write("        \t       </div>\n");
      out.write("        \t        </div>\n");
      out.write("        \t         </div>\n");
      out.write("        \t         \n");
      out.write("    ");
    }
      out.write(" \n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"tab-pane\" id=\"add-comment\">\n");
      out.write("       <form action=\"#\" method=\"post\" class=\"form-horizontal\" id=\"commentForm\" role=\"form\"> \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("               \n");
      out.write("                   <div class=\"col-sm-10\">\n");
      out.write("                        <textarea class=\"form-control\" name=\"addComment\" id=\"addComment\" rows=\"5\"></textarea>\n");
      out.write("                   </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("                  <div class=\"col-sm-offset- col-sm-10\">                    \n");
      out.write("                        <button class=\"btn btn-success btn-circle text-uppercase\" type=\"submit\" id=\"submitComment\"><span class=\"glyphicon glyphicon-send\"></span> Post</button>\n");
      out.write("                   </div>\n");
      out.write("           </div>            \n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("  </div>\n");
      out.write("      </section>\n");
      out.write("    </section>\n");
      out.write("        </section>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("  </section>\n");
      out.write("    </body>\n");
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
