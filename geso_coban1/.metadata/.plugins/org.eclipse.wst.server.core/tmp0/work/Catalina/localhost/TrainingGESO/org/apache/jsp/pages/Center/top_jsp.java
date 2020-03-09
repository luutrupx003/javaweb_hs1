package org.apache.jsp.pages.Center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.dms.center.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String sum = (String) session.getAttribute("sum");
	Utility util = (Utility) session.getAttribute("util");
	if(!util.check(userId, userTen, sum)){
		response.sendRedirect("/Canfoco/index.jsp");
	}else{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>&nbsp;</TITLE>\r\n");
      out.write("\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<script src=\"../scripts/jquery-1.8.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write(" function submitform()\r\n");
      out.write("{\r\n");
      out.write("    document.forms[\"logoutForm\"].submit();\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var flag = true;\r\n");
      out.write("function abc()\r\n");
      out.write("{\r\n");
      out.write("\tflag = false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function Khoaso()\r\n");
      out.write("{\r\n");
      out.write("\tvar flag = document.getElementById('khoaso');\r\n");
      out.write("\tflag.src = flag.src;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function confirmMe()\r\n");
      out.write("{\r\n");
      out.write("if(flag)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t$(window).bind('unload', function(){\t\r\n");
      out.write("\t\t   $.ajax({\r\n");
      out.write("\t\t    cache: false,\r\n");
      out.write("\t\t    async: false,\r\n");
      out.write("\t\t    dataType: \"script\",\r\n");
      out.write("\t\t        url: \"../../ThongbaoAjax\"\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY leftmargin=\"0\" bottommargin=\"0\" topmargin=\"0\" rightmargin=\"0\"  onbeforeunload=\"confirmMe()\">\r\n");
      out.write("\r\n");
      out.write("<TABLE width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\">\r\n");
      out.write("\r\n");
      out.write("\t<TR bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t<TD width=\"13%\"  align=\"right\" valign=\"middle\" >\r\n");
      out.write("\t\t\t<img src=\"../images/Canfoco.jpg\" align=\"right\" height = \"40\" width = \"60\">\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t\t<TD align=\"right\" valign=\"middle\" class=\"blanc\" >\r\n");
      out.write("\t\t<table align=\"right\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp;\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t<A href=\"../../LogoutSvl\" target=\"_parent\" style=\"font-weight: bold;\" >Đăng xuất &nbsp;&nbsp;</A>\r\n");
      out.write("\t\t\t\t\t<A href=\"../../LoginSvl\" onclick = \"abc();\" target=\"_parent\" style=\"font-weight: bold;\">Đổi mật khẩu &nbsp;&nbsp;</A>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\"><span style=\"text-align: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<!-- <iframe  style=\"width: 300px ;height: 20px\" id = \"khoaso\" src = \"counter.jsp\" frameborder=\"0\" scrolling=\"no\"> </iframe> -->\r\n");
      out.write("\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
}
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
