package org.apache.jsp.pages.Center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.dms.center.util.*;

public final class leftMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	if (!util.check(userId, userTen, sum)) {
		response.sendRedirect("/TrainingGESO/index.jsp");
	} else {
		//IMenu obj = (IMenu)session.getAttribute("obj");
		//int[] mang = obj.getMang(); 
		int mang[] = util.quyen_ungdung(userId);
		System.out.println("mang :" + mang[1]);
		String chuoi = (String) session.getValue("chuoi");
		if (chuoi.equals("")) {
			chuoi = "../css/style1024.css";
		}
		
		

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<LINK id=\"sitetheme\" rel=\"stylesheet\" href=\"");
      out.print(chuoi);
      out.write("\" type=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Georgia, Serif;\r\n");
      out.write("\tfont-size: 1em;\r\n");
      out.write("\tmargin: 1px;\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>jQuery Accordion Example</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* A few IE bug fixes */\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul ul li a {\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul li a {\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* html ul ul li {\r\n");
      out.write("\tmargin-bottom: -1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-left: 0em;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#theMenu {\r\n");
      out.write("\twidth: 0px;\r\n");
      out.write("\theight: 0px;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Some list and link styling */\r\n");
      out.write("ul li {\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tline-height: 20pt;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tborder-left-width: 0px;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tpadding-top: 0;\r\n");
      out.write("\tpadding-right: 0;\r\n");
      out.write("\tpadding-bottom: 0;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\ttext-indent: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li a {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 10pt;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground-color: #80CB9B;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li {\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tbackground-position: left center;\r\n");
      out.write("\tline-height: 18pt;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-top-color: #FFFFFF;\r\n");
      out.write("\tborder-right-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #C5E8CD;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("\tpadding-left: 0;\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li a {\r\n");
      out.write("\tdisplay: marker;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* For the xtra menu */\r\n");
      out.write("ul ul li a.selected {\r\n");
      out.write("\tdisplay: marker;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tbackground-position: left center;\r\n");
      out.write("\tline-height: 20pt;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tborder-top-color: #FFFFFF;\r\n");
      out.write("\tborder-right-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-color: #FFFFFF;\r\n");
      out.write("\tborder-left-color: #FFFFFF;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tborder-bottom-width: thin;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul li a.selected {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* For the sub menu */\r\n");
      out.write("ul ul ul ul li {\r\n");
      out.write("\tborder-left: none;\r\n");
      out.write("\tborder-bottom: none;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 210px;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tmargin-left: 5px;\r\n");
      out.write("\tbackground-color: #F4F4F0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\tbackground-color: #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a:hover {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 3px 8px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul ul ul ul li a.selected {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #369;\r\n");
      out.write("\tbackground-color: #CEF6F5;\r\n");
      out.write("\tpadding: 3px 8px;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\tmargin-top: 0em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/accordion.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tjQuery().ready(function()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tjQuery(\"a\").click(function(e){\r\n");
      out.write("\t\t\tjQuery(\"a\").css(\"color\", \"black\");\r\n");
      out.write("\t\t\tjQuery(this).css(\"color\", \"red\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// applying the settings\r\n");
      out.write("\t\tjQuery('#theMenu').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h3.selected',\r\n");
      out.write("\t\t\theader : 'h3.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tjQuery('#xtraMenu1').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu2').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu3').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu4').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu5').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#xtraMenu6').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu7').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu8').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu9').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery('#xtraMenu10').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h4.selected',\r\n");
      out.write("\t\t\theader : 'h4.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tjQuery('#subMenu').Accordion(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tactive : 'h6.selected',\r\n");
      out.write("\t\t\theader : 'h6.head',\r\n");
      out.write("\t\t\talwaysOpen : false,\r\n");
      out.write("\t\t\tanimated : true,\r\n");
      out.write("\t\t\tshowSpeed : 400,\r\n");
      out.write("\t\t\thideSpeed : 800\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"theMenu\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Dữ liệu nền </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Cơ bản </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[1] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCongTySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Quản lý Học Sinh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Đơn hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCViengThamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bao Cao Vieng Tham</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DoanhSoTheoTinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Doanh Số Theo Tỉnh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCSoLuongSvl_cuong?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo số lượng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyển kho - Thái</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[2] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dvthId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DonViThucHienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phòng ban</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[3] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"cdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChucdanhSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chức danh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"dlnspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kế toán</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[4] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNganHangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ngân hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[5] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChiNhanhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi nhánh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[7] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLoaiTaiKhoanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại tài khoản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[7] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDoiTuongKyQuySvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đối tượng ký quỹ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[8] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TaikhoanketoanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tài khoản kế toán</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[8] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCauhinhchiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm tài khoản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[9] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"clId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLoaiSanPhamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại sản phẩm </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[11] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNganHangCongTySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tài khoản ngân hàng công ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[12] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TrungTamChiPhiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trung tâm chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[13] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khoản mục chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[14] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TrungTamDoanhThuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trung tâm doanh thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[15] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_MucdoanhthuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khoản mục doanh thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

					         if (mang[15] == 1) {
					        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_KhoanmucchietkhauSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khoản mục chiết khấu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

				              if (mang[16] == 1) {
				             
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhanvienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhân viên công ty</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dlthId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DulieutonghopSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dữ liệu tổng hợp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[4] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCoPhieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Danh mục cổ phiếu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"muahangId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Mua hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[17] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLoaiNhaCungCapSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại nhà Cung Cấp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[18] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhomnhacungcapcnSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm nhà Cung Cấp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[19] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nccId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhaCungCapSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhà Cung Cấp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[20] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"mcpId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_mucchiphiSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Mức chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[21] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dmhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_ChinhsachduyetmuahangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chính sách duyệt mua hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[22] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TienTeSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tiền tệ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[23] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TigiaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tỉ giá</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[24] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpNhamaySvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhà máy</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[25] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBomSvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Danh mục vật tư ( BOM )</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[25] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDuyetbomSvl?userId=");
      out.print( userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt BOM</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[26] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCongDoanSanXuatGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công đoạn sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[27] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKichBanSanXuatGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kịch bản sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\" id=\"khoId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kho vận</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[29] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhoTTSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khai báo kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (mang[29] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhuVucKhoSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khai báo khu vực kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[32] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"dvdlspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonvidoluongSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn vị đo lường </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[33] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ttspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ThongtinsanphamgiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản phẩm </a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[34] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhomsanphamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm sản phẩm</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--  xem lai quyen --> ");

									if (mang[33] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"cbspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../CongbosanphamSvl?userId=");
      out.print(userId );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công bố sản phẩm </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[34] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nspId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTonkhoantoanUpdateSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tồn kho an toàn</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kinh doanh </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[35] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonvikinhdoanhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn vị Kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[36] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KenhbanhangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kênh bán hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[37] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../VungmienSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Vùng miền</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[38] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KhuvucSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khu vực</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[39] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhomkhachhangTTSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LoaikhachhangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKhachHangSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[41] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBanggiabanGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Định giá bán</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[42] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpSuagiabanGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt giá bán</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[43] == 1) {
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"nhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhanhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhãn hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[44] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"clId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChungloaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chủng loại</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý chỉ tiêu </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Khai báo </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ChitieuthangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chỉ tiêu tháng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[201] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TieuchithuongTLSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công thức thưởng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[202] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"ddkdId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ChietkhauthangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chiết khấu thương mại</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Báo cáo</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DailySalesSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thực đạt & chỉ tiêu NPP</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCThuongKhachHang?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Thưởng khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[200] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBcThuongCKThuongMai?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thưởng chiết khấu thương mại</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý khuyến mại </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Khai báo </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[38] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhomkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[39] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../nhomkhachhangkmSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[40] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DieukienkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Điều kiện khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[208] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../TrakhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trả khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[209] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../CtkhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chương trình khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[43] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../PhanbokhuyenmaiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phân bổ khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Báo cáo</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[44] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../PromotionReportTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất khuyến mãi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[45] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../AccumulatedPromotion?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Trả khuyến mãi tích lũy </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý cung ứng </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Lập kế hoạch </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[45] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../DuBao_GiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dự báo kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[46] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../YeuCauSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Yêu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcầu cung ứng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[47] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhsanxuatdukienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[48] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghingungsanxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị ngưng sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[51] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXemkehoachUpdateSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kiểm tra kế hoạch</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[49] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhmuahangdukienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị mua nguyên liệu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[50] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghihuymuaSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị hủy mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[52] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCanhbaothieuhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Cảnh báo thiếu hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[53] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCanhbaothieunguyenlieuSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Cảnh báo thiếu nguyên liệu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[54] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKehoachnhanNVLSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kế hoạch nhận NVL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                           if (mang[55] == 1) {
                                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKehoachgiaohangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kế hoạch giao hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Quản lý mua hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonMuaHangSvl_Mi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn mua hàng Mi </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl_Mi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Yêu cầu chuyển kho Mi </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpReportFromStoreProcSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\"> Báo cáo Training </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonMuaHangSvl_Sang?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn mua hàng Sang </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[57] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDonmuahangList_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn mua hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[58] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DuyetmuahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt đơn mua hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[59] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhanhang_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhận hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[99] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKiemdinhchatluong_NhGiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kiểm định chất lượng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[60] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpCongtytrahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn trả hàng NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[61] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuxuatkhoTSCDSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất trả TSCĐ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[186] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuThanhToanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị thanh toán </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[187] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_DuyetthanhtoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt đề nghị thanh toán </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[62] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuychungtuMhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[63] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCDonmuahangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi đơn mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[64] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../Erp_TheoDoiGiaMuaNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi giá mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Quản lý bán hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 82%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamListSvl_kiet05?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm (Kiệt)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamListSvl_kiet06?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm (Kiệt 06)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangListSvl_Kiet02?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Hàng (Kiệt)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl_kiet02?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyển Kho (Kiệt 02)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPham_HangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm Hằng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_HangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng Hằng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamList_TrangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm_Trang</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_TrangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng_Trang</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl_cuong?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng_cuong</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangListSvl_Vy?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn hàng (Vy)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_ThuSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn hàng (Thư)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamSvl_Thu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm (Thư)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonBanHang_TrinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng (Trinh)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPham_TrinhSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản phẩm (Trinh)</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Ban Hang Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../MuaHangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Mua Hang Huy</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl_thai?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng - Thái</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamNhom2ListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bài mẫu nhóm 2</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListThoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Hàng Thọ</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanPhamDuongNguyenListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản Phẩm DuongNguyen</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonHangDuongNguyenListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Hàng DuongNguyen</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../KhachhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khách hàng</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonbanhangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn bán hàng -Hiếu</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonmuahangListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn mua hàng -Hiếu</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../SanphamListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sản phẩm</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonhangListSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn Bán Hàng_Tân</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DonmuahangListSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">TÂN - ĐƠN MUA HÀNG</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">TÂN - CHUYỂN KHO</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../NhacungcapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhà cung cấp</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BanhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn hàng bán</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[69] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DuyetDonBanHangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt đơn hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[188] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DuyetDonBanHangGDSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">GD Duyệt đơn hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

										if (mang[70] == 1) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_dontrahangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn trả hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[71] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpNhanhang_DonTHSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhận hàng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[72] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpPhieuxuatkhoSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[73] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTaiChinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất HĐTC </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[73] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTaiChinhKMSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất HĐKM </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[143] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoadonphelieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất HĐ khác</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(mang[74]==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHoaDonTraveNccSvl?userId=");
      out.print(userId );
      out.write("&userTen=");
      out.print( userTen );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất hóa đơn trả về NCC </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

								if (mang[75] == 1)  {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHdTraHangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hóa đơn hàng trả về</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
if(mang[185]==1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../HuyhoadontaichinhSvl?userId=");
      out.print(userId );
      out.write("&userTen=");
      out.print( userTen );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy hóa đơn tài chính </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[76] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuychungtuBhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[77] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_DonHangBanTrongKy?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đơn hàng trong kỳ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[78] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DailyPrimarySales?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo doanh số(HĐ)</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[184] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BcdoanhthuspmSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Doanh thu (Canfoco)</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[223] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCbanhangTHSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC bán hàng tổng hợp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[227] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCbanhangkhachhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC bán hàng theo khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[225] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCgiaohangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Giao hàng theo HĐ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[79] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_TheoDoiGiaBanKH?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo theo dõi giá</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[81] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"bgmnppId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpLenhsanxuatgiaySvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lệnh sản xuất</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[83] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX&isnhanHang=1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhận hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[85] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpNhapkhoLsxSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhập kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[86] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemdinhchatluongSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kiểm định chất lượng </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[84] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTieuhaonguyenlieugiaySvl\" target=\"content\">Tiêu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thao nguyên liệu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[85] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../PhanBoLoHoiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phân bổ lò hơi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[179] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpHuylenhsanxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhGiaDongLucListSvl\" target=\"content\">Tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgiá động lực</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpGiabaoquanSvl\" target=\"content\">Giá bảo\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tquản/ cấp đông</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

                                       if (mang[88] == 1) {
                                 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhGiaThanhSvl\" target=\"content\">Tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tgiá thành</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[89] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BosanphamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bó sản phẩm</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Báo cáo tiêu hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"head\" > <a href=\"\">Quản lý tồn kho</a> </h4>\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%; \" >\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Chuyen Kho Huy</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../HoSoListSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Thông tin hồ sơ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../HoSoTuVanListSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Thông tin tư vấn</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCTuvanduhocSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Báo cáo 7</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (mang[92] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\" target=\"content\">Phiếu yêu cầu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Chuyển kho_hiếu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> \r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Báo cáo tiêu hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"head\" > <a href=\"\">Quản lý tồn kho</a> </h4>\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%; \" >\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenKhoListSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Chuyen Kho Huy</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhListSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Thong tin hoc sinh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (mang[92] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\" target=\"content\">Phiếu yêu cầu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Chuyển kho_hiếu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 	if (mang[91] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../BCTieuHaoNL?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo tiêu hao NL</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Quản lý tồn kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"overflow: auto; max-height: 300px; max-width: 95%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <a href=\"../../BCDoanhSoTheoTinhSvl?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Báo cáo doanh số theo tỉnh - Thái</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../TuvanthongtinhopdongdakyListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bước 4-tư vấn hợp đồng đã ký</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../TienhanhhopdongdakyListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bước 5-Tiến hành hợp đồng đã ký</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (mang[93] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\" target=\"content\">Chuyển nguyên liệu</a>  \r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\" target=\"content\">Yêu cầu chuyển kho</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");


									
							 {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\" target=\"content\">Chuyển nguyên liệu</a>  \r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"head\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\" target=\"content\">Yêu cầu chuyển kho</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HocSinhListSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thong tin hoc sinh</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ChuyenkhoListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyển kho_hiếu</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../HopdongSvl_tan?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bước 3</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../DinhhuongthitruongListSvl_hieu?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Định hướng thị trường</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất báo cáo</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[93] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=LSX\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyển nguyên liệu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[177] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpYeuCauChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Yêu cầu chuyển kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");


									if (mang[94] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chuyển kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[97] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL&isnhanHang=1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhận hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[98] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpChuyenkhoSXSvl?userId=");
      out.print(userId);
      out.write("&task=chuyenNL&isnhanHang=2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[180] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpHuyChuyenKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[95] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kiểm kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[96] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKiemKhoExportSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">In bảng kê kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									if (mang[96] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpKiemdinhchatluong_khoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Kiểm định chất lượng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[100] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../DoiquycachSvl\" target=\"content\">Đổi quy\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcách</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[101] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDieuChinhTonKhoTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Điều chỉnh tồn kho TT </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[101] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDieuChinhSoLoKhoTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Điều chỉnh số lô </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[102] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCapnhatgianhapkhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Cập nhật giá nhập kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[103] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTinhgiaxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tính giá xuất kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if (mang[104] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpKhoasothangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khóa sổ tháng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Báo cáo</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- báo cáo thư -->\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../BaoCao1_ThưSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thư Báo Cáo 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[105] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTonkhotrungtamSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tồn kho trung tâm</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[106] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXuatnhaptonTTSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất nhập tồn TT</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[234] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpReportFromStoreProcSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tuổi hàng tồn kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[107] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCThekhoSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thẻ kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[109] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCTheodoihangnhapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi hàng nhập</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[226] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHansudungSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Hạn sử dụng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[108] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBcLichSuGdKhoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Lịch sử giao dịch kho </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[109] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangnhapSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hàng nhập kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[110] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangxuatSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hàng xuất kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[111] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHansudungSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hạn sử dụng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[112] == 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpBCHangluanchuyenSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hàng chậm luân chuyển</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 	if (mang[113] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../StockAlarm?userId=");
      out.print(userId);
      out.write("\" target=\"content\">Cảnh\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbáo hàng tồn kho</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if (mang[114] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"tkttId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpXuatnhaptonTTTHSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xuất nhập tồn TT tổng hợp</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý công nợ </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu5\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Công nợ phải thu </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[114] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpThutienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thu tiền </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[228] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpDuyetthanhtoanhoadonSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt Phiếu thu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[115] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpXoakhachhangttSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xóa nợ khách hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[191] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ButrucongnoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bù trừ công nợ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[217] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuythutienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Công nợ phải trả </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[116] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpTamUngSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị tạm ứng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[117] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpCanTruCongNoSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Cấn trừ công nợ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[118] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChiphinhapkhauSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi phí nhận hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[119] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpThuenhapkhauSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Thuế nhập khẩu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                        if (mang[120] == 1) {
                                  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpChiphikhacSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi phí khác</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[121] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpParkHoadonSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hóa đơn NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[230] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../Erp_GanmachiphiSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Gán mã chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[231] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../ErpDenghithanhtoanNCCSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Đề nghị thanh toán NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[123] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpThanhtoanhoadonSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Phiếu chi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[190] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpUynhiemchiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Ủy nhiệm chi</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[124] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpXoaNoNCCSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Xóa nợ NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[218] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpHuyphieuchiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hủy chứng từ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý tài sản </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[125] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpCongDungSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Công dụng tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[126] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_LoaiTaiSanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[127] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_NhomTaiSanSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[128] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_TaiSanCoDinhSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Tài sản </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                   if (mang[129] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpKhauhaotaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Khấu hao tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[130] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpThanhlytaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Thanh lý tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[131] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ThetaisancodinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Thẻ tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../TheodoitaisancodinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../BangketaisanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Bảng kê tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[132] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpBCTaiSanCoDinhTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Tài sản cố định tổng hợp</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- <ul id=\"xtraMenu10\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t                  <h4 class=\"head\" > <a href=\"\">Báo cáo </a> </h4>\r\n");
      out.write("\t\t                  <ul style=\"display: none;\">\r\n");
      out.write("\t\t                  \r\n");
      out.write("\t\t                                                                \r\n");
      out.write("\t\t                  </ul>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("            \t</ul> -->\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý công cụ dụng cụ </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[133] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpCongDungCCDCSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Công dụng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[134] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_LoaiCCDCSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Loại công cụ dụng cụ</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[135] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_NhomCCDCSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhóm công cụ dụng cụ</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

	       if (mang[136] == 1) {
	      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbhId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_CongCuDungCuSvl?userId=");
      out.print(userId);
      out.write(";userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Công cụ dụng cụ </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                if (mang[137] == 1) {
               
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpKhauhaocongcudungcuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Khấu hao </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý kế toán </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[138] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../HopdongvaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Hợp đồng vay vốn</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[139] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../NhantienvaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Giải ngân</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[140] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ThanhtoannovaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Thanh toán nợ vay</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");
                      
                                if (mang[183] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpBCVayTienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo theo dõi vay tiền</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[141] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpGiamgiahangmuaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Giảm giá hàng mua</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[144] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpButToanTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Bút toán tổng hợp</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[145] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../Erp_danhgiatigiaSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Đánh giá tỉ giá</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

                                if (mang[178] == 1) {
                          
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../ErpDieuchuyentienSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Điều chuyển tiền</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[146] == 1) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../ErpKhoasothangSvl?userId=");
      out.print(userId);
      out.write("&task=kskt\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Khóa sổ kế toán</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản lý ngân sách </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu6\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Dữ liệu nền </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                           if (mang[147] == 1) {
                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLNSBanggiabanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bảng giá bán</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                           if (mang[148] == 1) {
                     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpLNSBanggianguyenlieuSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bảng giá nguyên liệu</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Lập ngân sách </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[149] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../KhoitaongansachSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khởi tạo ngân sách </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[150] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../DubaoNam_GiaySvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dự báo kinh doanh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[151] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachCPUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dự toán chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[152] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachTSUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dự toán tài sản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[153] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachCDvaKHTSUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Khấu hao và phân bổ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         if (mang[154] == 1) {
                   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../LapngansachDTKUpdateSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Dự toán doanh thu khác</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Theo dõi ngân sách </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                             if (mang[155] == 1) {
                       
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../DuyetngansachSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Duyệt ngân sách</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

		             if (mang[156] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCTheoDoiNganSachChiPhi?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi chi phí</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

		             if (mang[157] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TheodoitrungtamchiphiSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi TTCP</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                    if (mang[158] == 1) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../TheoDoiNganSachLaiLo?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi lãi lỗ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Báo cáo quản trị </a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul id=\"xtraMenu7\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Công nợ </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

 								 if (mang[159] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCCongNoTongHopNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Công nợ tổng hợp NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[160] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCChiTietCongNoNCC?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">BC Công nợ chi tiết NCC</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[161] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCCongNoTongHopKH?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công nợ tổng hợp KH</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[162] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCChiTietCongNoKH?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Công nợ chi tiết KH</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                            if (mang[163] == 1) {
                                      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCTongHopTuoiNo_MucHanNo?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tuổi nợ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[235] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../ErpBCTheodoitamungNV?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Theo dõi tạm ứng NV</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[233] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../../BctinhhinhsudunghdSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo tình hình sử dụng HĐ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Kế toán - Tài chính </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[164] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCChiTietTKKeToan?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Tổng hợp tài khoản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[165] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BoBaoCaoTongHopSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Bộ báo cáo tài chính</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[166] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BangcandoiphatsinhSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Cân đối phát sinh</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[167] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../NhatkytaikhoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Nhật ký tài khoản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[168] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BangchitiettaikhoanSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Chi tiết tài khoản</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[169] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../SoquytienmatSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sổ quỹ tiền mặt</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[170] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../SotienguinganhangSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Sổ tiền gửi ngân hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[170] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BCChartSvl?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Báo cáo Chart</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Thuế </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<ul style=\"display: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[171] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BcBangKeMuaVao?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hóa đơn mua vào</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if (mang[172] == 1) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"../../BcBangKeBanRa?userId=");
      out.print(userId);
      out.write("&userTen=");
      out.print(userTen);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"content\">Hóa đơn bán ra</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t<li style=\"position: static;\">\r\n");
      out.write("\t\t\t<h3 class=\"head\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"head\">Quản trị hệ thống</a>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<ul style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[173] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../DanhmucquyenSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Cập nhật quyền</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[174] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../CapnhatnhanvienSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Cập nhật nhân viên</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[174] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../UploadPhanQuyenNvSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">UpLoad phân quyền nhân viên</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[175] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../ErpCauHinhInHoaDonSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Cấu hình in hóa đơn</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							if (mang[175] == 1 || userId.equals("system")) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"head\" id=\"kbkId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../../KhoasodonhangSvl?userId=");
      out.print(userId);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"content\">Khóa ngày đơn hàng</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h5> ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</ul> \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

	}

      out.write('\r');
      out.write('\n');
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
