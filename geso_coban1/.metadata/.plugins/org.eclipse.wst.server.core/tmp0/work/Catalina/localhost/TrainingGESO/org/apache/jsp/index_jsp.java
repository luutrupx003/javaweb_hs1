package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.awt.Dimension;
import java.awt.Toolkit;
import geso.erp.db.sql.dbutils;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String msg = (String) session.getAttribute("msg");  
   session.setAttribute("msg", "");
   Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWidth = screenSize.width; 
	int screenHeight = screenSize.height;
	 System.out.println(screenWidth);
   if(screenWidth>=1280)
   {
   	 session.putValue("chuoi","../css/style1280.css");
    }
   else if(screenWidth>=1024)
   {
   	 session.putValue("chuoi","../css/style1024.css");
   }
   else if(screenWidth>=800)
   {
   	 session.putValue("chuoi","../css/style800.css");
   }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Đăng nhập</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"pages/images/salesup.jpg\">\r\n");
      out.write("\t<LINK rel=\"stylesheet\" href=\"pages/css/style_v2_optimized.css\" type=\"text/css\">\r\n");
      out.write("\t<!-- <LINK rel=\"stylesheet\" href=\"pages/css/main.css\" type=\"text/css\">  -->\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.blanc \r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t  color : #999999;\r\n");
      out.write("\t\t  font-family:\"Times New Roman\",Georgia,Serif;\r\n");
      out.write("\t\t  letter-spacing : 0pt;\r\n");
      out.write("\t\t  text-decoration: none ; \r\n");
      out.write("\t\t  font-weight : 200;\r\n");
      out.write("\t\t  font-size: 1.0em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"loginForm\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"login\" value = \"1\"></input>\r\n");
      out.write("<table width=\"350px\" align=\"left\" style=\"margin-left: 40px\" cellpadding=\"0px\" cellspacing=\"0px\">\r\n");
      out.write("    \t<tr height=\"25px\">\r\n");
      out.write("        \t<td style=\"background-image:url(pages/images/borderTopLeft.png); width:25px\"></td>\r\n");
      out.write("            <td style=\"background-image:url(pages/images/borderTopCenter.png)\"></td>\r\n");
      out.write("            <td style=\"background-image:url(pages/images/borderTopRight.png); width:25px\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td style=\"background-image:url(pages/images/borderMiddleLeft.png); width:25px; background-repeat:repeat-y; background-position:left\"></td>\r\n");
      out.write("    <td style=\"background-image:url(pages/images/point_make_area_transparent.png)\">\r\n");
      out.write("    \r\n");
      out.write("    <div style=\"width: 100%; margin-top: -5\" align=\"center\">\r\n");
      out.write("    \t \r\n");
      out.write("    </div>\r\n");
      out.write("    <table cellpadding=\"1px\" cellspacing=\"4px\">\r\n");
      out.write("    \t \r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td class=\"blanc\"><span>Tên đăng nhập</span></td>\r\n");
      out.write("    \t\t<td>&nbsp;</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\">\r\n");
      out.write("    \t\t\t<div class=\"input-field-login icon username-container\">\r\n");
      out.write("\t\t            <input name=\"username\" id=\"username\" autofocus=\"autofocus\" placeholder=\"Vui lòng nhập tên đăng nhập.\"     \r\n");
      out.write("\t\t                    class=\"std_textbox\" tabindex=\"1\" required=\"\" type=\"text\" AUTOCOMPLETE=\"off\" value=\"admin\">\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td class=\"blanc\"><span>Mật khẩu</span></td>\r\n");
      out.write("    \t\t<td>&nbsp;</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\">\r\n");
      out.write("    \t\t\t<div class=\"input-field-login icon password-container\">\r\n");
      out.write("\t\t            <input name=\"password\" id=\"password\" placeholder=\"Vui lòng nhập mật khẩu.\" class=\"std_textbox\" tabindex=\"2\" required=\"\" type=\"password\" AUTOCOMPLETE=\"off\" value=\"admin1\" >\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td class=\"blanc\"><span>Mã bảo vệ</span></td>\r\n");
      out.write("    \t\t<td>&nbsp;</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\">\r\n");
      out.write("    \t\t\t<div class=\"input-field-login icon username-container\">\r\n");
      out.write("\t\t            <input name=\"captchas\" id=\"captchas\" autofocus=\"autofocus\" placeholder=\"Vui lòng nhập mã xác nhận.\" \r\n");
      out.write("\t\t                    class=\"std_textbox\" tabindex=\"3\" required=\"\" type=\"text\" AUTOCOMPLETE=\"off\" value=\"Geso123\" >\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\" align=\"center\"><img src=\"/TrainingGESO/CaptchaSvl\"></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td colspan=\"2\"><input type=\"submit\" value=\" Đăng nhập \"></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("\t  \t");
if (msg != null){ if(msg != ""){ 
      out.write("\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("    \t\t\t<td colspan=\"2\"><font color=\"red\">");
      out.print( msg );
      out.write("</font></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("\t  \t");
}} 
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td style=\"background-image:url(pages/images/borderMiddleRight.png); width:25px; background-repeat:repeat-y; background-position:right\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"25px\">\r\n");
      out.write("\t<td style=\"background-image:url(pages/images/borderBottomLeft.png); width:25px\"></td>\r\n");
      out.write("    <td style=\"background-image:url(pages/images/borderBottomCenter.png)\"></td>\r\n");
      out.write("    <td style=\"background-image:url(pages/images/borderBottomRight.png); width:25px\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");

	String captcha = (String) session.getAttribute("captcha");
	String username = (String) request.getParameter("username");
	String password = (String) request.getParameter("password");
	String cap = (String) request.getParameter("captchas");
	
	//System.out.println("Cap la: " + cap + "\n");
	System.out.println("Captcha la: " + captcha + "\n");
	//System.out.println("Pass ban nhap la: " + password);
	
	if(session.getAttribute("solandn") != null)
	{
		//System.out.println("So lan dang nhap o tren: " + session.getAttribute("solandn").toString() + "\n");
		if(Integer.parseInt(session.getAttribute("solandn").toString()) >= 20)
		{
			out.print("<script>alert('Bạn đã dăng nhập vượt quá số lần qui định')</script>");
			return;
		}
	}
		
	if (cap != null && username != null && password != null)
	{
		if (captcha.toUpperCase().equals(cap.toUpperCase()))
		{
			out.print("<script>document.forms['loginForm'].username.value='" + username + "'; document.forms['loginForm'].password.value='" + password + "';   document.forms['loginForm'].action = '/TrainingGESO/LoginSvl'; document.forms['loginForm'].submit(); </script>");
		} 
		else
		{
			if(session.getAttribute("solandn") == null)
				session.setAttribute("solandn", 0);
			else
			{
				session.setAttribute("solandn", Integer.parseInt(session.getAttribute("solandn").toString()) + 1);
				//System.out.println("So lan dang nhap: " + session.getAttribute("solandn").toString() + "\n");
			}
			out.print("<script>alert('Mã bảo vệ không đúng, vui lòng nhập lại')</script>");
		}
	}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
