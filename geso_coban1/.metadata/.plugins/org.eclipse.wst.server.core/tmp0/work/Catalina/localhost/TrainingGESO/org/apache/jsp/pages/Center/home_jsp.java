package org.apache.jsp.pages.Center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.dms.center.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
	 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<title>SalesUp - Project</title>\r\n");
      out.write("\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<script src=\"../js/md5.js\" type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../js/scripts.js\" type=\"text/javascript\"\r\n");
      out.write("\tlanguage=\"javascript\">\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"print\" href=\"print.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family:\"Times New Roman\",Georgia,Serif;\r\n");
      out.write("\tfont-size:10pt;\r\n");
      out.write("\tmargin:2px;\r\n");
      out.write("\tbackground-color:#FFFFFF;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY leftmargin=\"0\" bottommargin=\"0\" topmargin=\"0\" rightmargin=\"0\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\">\r\n");
      out.write(" \t<TR height=\"22\">\r\n");
      out.write("   \t\t<TD height=\"15\" align=\"left\" class=\"tbnavigation\">\r\n");
      out.write("      \r\n");
      out.write("\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t<TR>\r\n");
      out.write("\r\n");
      out.write("\t\t<TD align='left' valign='top' bgcolor=\"#FFFFFF\" colspan=\"2\">\r\n");
      out.write("\t\t<TABLE width='100%' height=\"50%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD colspan = \"2\"> &nbsp; </TD>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD valign='middle' align='center' >\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h1>&nbsp;</h1>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</TR>\r\n");
      out.write("</table>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write(" ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
