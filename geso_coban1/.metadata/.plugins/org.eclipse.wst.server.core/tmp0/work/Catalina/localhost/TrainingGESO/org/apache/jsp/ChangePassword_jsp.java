package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.dms.center.util.*;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF8");
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
 String msg = (String) session.getAttribute("msg");  
   session.setAttribute("msg", "");

      out.write('\r');
      out.write('\n');
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
	String sum = (String) session.getAttribute("sum");
	Utility util = (Utility) session.getAttribute("util");
	if(!util.check(userId, userTen, sum)){
		response.sendRedirect("/TrainingGESO/index.jsp");
	}else{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"pages/css/main.css\" type=\"text/css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<head>\r\n");
      out.write("<title>Doi mat ma dang nhap</title>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function check(){\r\n");
      out.write("\tvar oldpass = document.passForm.oldpass.value;\r\n");
      out.write("\tvar newpass1 = document.passForm.newpass1.value;\r\n");
      out.write("\tvar newpass2 = document.passForm.newpass2.value;\r\n");
      out.write("\r\n");
      out.write("\tif (oldpass == newpass1){\r\n");
      out.write("\t\talert(\"Vui lòng đổi mật mã mới\");\r\n");
      out.write("\t\tdocument.passForm.newpass1.focus();\t\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif (newpass1 != newpass2){\r\n");
      out.write("\t\t\talert(\"Xác nhận lại mật khẩu\");\r\n");
      out.write("\t\t\tdocument.passForm.newpass2.focus();\t\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.forms['passForm'].submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body OnLoad=\"document.passForm.oldpass.focus();\">\r\n");
      out.write("<form name=\"passForm\" method=\"post\" action=\"/TrainingGESO/LoginSvl\">\r\n");
      out.write("<input type=\"hidden\" name=\"login\" value = \"2\"></input>\r\n");
      out.write("<table width=\"100%\"\theight=\"35%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  \t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<td width=\"14%\" height=\"80\"  align=\"right\" valign=\"middle\" colspan=2><img src=\"pages/images/logoCanfoco.jpg\" width=\"80\" height=\"80\" align=\"right\" /></td>\r\n");
      out.write("    \t<td width=\"32%\"  align=\"left\" valign=\"middle\" class=\"title\" >&nbsp;</td>\r\n");
      out.write("   \t  <td width=\"52%\" align=\"right\" class=\"footer\" style=\"padding-right: 15\">&nbsp; </td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("\t<tr class=\"tblightrow\" height=\"3\">\r\n");
      out.write("\t\t<td  colspan=\"3\" align=\"center\" class=\"plainlabel\">Vì lý do an ninh, vui lòng thay đổi mật mã&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"tblightrow\" height=\"3\">\r\n");
      out.write("\t\t<td  colspan=\"3\" align=\"center\" class=\"blance\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("  \t<tr class=\"tblightrow\" height=\"3\">\r\n");
      out.write("\t  \t");
if (msg != null){ 
      out.write("\r\n");
      out.write("\t  \t\t<td width=\"14%\" colspan=\"3\" align=\"center\" class=\"blanc\">");
      out.print( msg );
      out.write("</td>\r\n");
      out.write("\t  \t");
} else {
      out.write("\r\n");
      out.write("\t\t\t<td  colspan=\"3\" align=\"center\" class=\"blanc\">&nbsp;</td>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr class=\"tblightrow\" height=\"3\">\r\n");
      out.write("\t  \t<td  colspan=\"4\" align=\"center\" class=\"blanc\">&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr class=\"tblightrow\" height=\"1\">\r\n");
      out.write("\t  \t<td  colspan=\"2\" align=\"right\" class=\"blanc\">Mật mã cũ&nbsp;\t\t</td>\r\n");
      out.write("\t  \t<td class=\"blanc\" align=\"left\">\r\n");
      out.write("\t\t<input type=\"password\" name = \"oldpass\" value = \"\" size=\"20\" >\t\t</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr class=\"tblightrow\" height=\"1\">\r\n");
      out.write("\t  \t<td  colspan=\"2\" align=\"right\" class=\"blanc\">Mật mã mới&nbsp;\t\t</td>\r\n");
      out.write("\t  \t<td class=\"blanc\" align=\"left\">\r\n");
      out.write("\t\t<input type=\"password\" name = \"newpass1\" value = \"\" size=\"20\" >\t\t</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("\r\n");
      out.write("  \t<tr class=\"tblightrow\" height=\"1\">\r\n");
      out.write("  \t\t<td  colspan=\"2\" align=\"right\" class=\"blanc\">Nhập lại mật mã mới&nbsp;\t\t</td>\r\n");
      out.write("\t  \t<td class=\"blanc\" align=\"left\">\t\r\n");
      out.write("\t\t<input type=\"password\" name = \"newpass2\" value = \"\" size=\"20\" >\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write(" \t<tr height=\"1\">\r\n");
      out.write("  \t\t<td height=\"5\" class=\"blanc\" colspan=\"2\" align=\"right\">&nbsp;\t\t</td>\r\n");
      out.write("\t  \t<td class=\"blanc\" align=\"left\">\t\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"Luu lai\" onClick= \"check();\">\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
