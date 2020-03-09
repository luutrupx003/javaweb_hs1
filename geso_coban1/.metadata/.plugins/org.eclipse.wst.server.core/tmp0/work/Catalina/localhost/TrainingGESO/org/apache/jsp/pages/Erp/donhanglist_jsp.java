package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.traning.bean.donhang.IDonhangList;
import geso.traning.bean.donhang.imp.DonhangList;
import geso.dms.center.util.Utility;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class donhanglist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	IDonhangList obj = (DonhangList) session.getAttribute("obj");
	String id = (String) session.getAttribute("userId");
	String trangthaitimkiem = (String) session
			.getAttribute("trangthaitimkiem");
	ResultSet KhRs = obj.getKhRs();
	ResultSet DhRs = obj.getDhRs();
	String userId = obj.getUserId();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Best - Project</TITLE>\r\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" media=\"print\"\r\n");
      out.write("\thref=\"../css/impression.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/mybutton.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.min.1.7.js\"></script>\r\n");
      out.write("<link href=\"../css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.widget.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../scripts/ui/jquery.ui.datepicker.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/ajax-dynamic-list.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/cool_DHTML_tootip.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/dropdowncontent.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/jquery.autocomplete.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#ajax_listOfOptions {\r\n");
      out.write("\tposition: absolute; /* Never change this one */\r\n");
      out.write("\twidth: auto; /* Width of box */\r\n");
      out.write("\theight: 200px; /* Height of box */\r\n");
      out.write("\toverflow: auto; /* Scrolling features */\r\n");
      out.write("\tborder: 1px solid #317082; /* Dark green border */\r\n");
      out.write("\tbackground-color: #C5E8CD; /* White background color */\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-size: 1.0em;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions div {\r\n");
      out.write("\t/* General rule for both .optionDiv and .optionDivSelected */\r\n");
      out.write("\tmargin: 1px;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-size: 1.0em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions .optionDiv { /* Div for each item in list */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions .optionDivSelected { /* Selected item in the list */\r\n");
      out.write("\tbackground-color: #317082; /*mau khi di chuyen */\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ajax_listOfOptions_iframe {\r\n");
      out.write("\tbackground-color: #F00;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dhtmltooltip {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: -300px;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\tbackground-color: lightyellow;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("\t/*Remove below line to remove shadow. Below line should always appear last\r\n");
      out.write("within this CSS*/\r\n");
      out.write("\tfilter: progid:DXImageTransform.Microsoft.Shadow(color=gray, direction=135);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dhtmlpointer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: -300px;\r\n");
      out.write("\tz-index: 101;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\".days\").datepicker({\r\n");
      out.write("\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\tchangeYear : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"select:not(.notuseselect2)\").select2({\r\n");
      out.write("\t\t\twidth : 'resolve'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction replaces() {\r\n");
      out.write("\t\tvar smartId = document.getElementsByName(\"sodonhang\");\r\n");
      out.write("\t\tfor (i = 0; i < smartId.length; i++) {\r\n");
      out.write("\t\t\tvar tem = smartId.item(0).value;\r\n");
      out.write("\t\t\tif (tem == \"\") {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"sodonhang\").value = \"\";\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (parseInt(tem.indexOf(\"-->\")) > 0) {\r\n");
      out.write("\t\t\t\tvar tmp = tem.substring(0, parseInt(tem.indexOf(\"-->\")));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"sodonhang\").value = tmp;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tsetTimeout(replaces, 100);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction newform() {\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].action.value = \"new\";\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction editform() {\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].action.value = \"accounting\";\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction submitform() {\r\n");
      out.write("\t\t var sodonhang=document.getElementById(\"sodonhang\").value;\r\n");
      out.write("\t\t var tungay=document.getElementById(\"tungay\").value;\r\n");
      out.write("\t\t var denngay=document.getElementById(\"denngay\").value;\r\n");
      out.write("\t\tif (sodonhang!=\"\" || tungay!=\"\"||denngay!=\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.forms[\"dhForm\"].action.value = \"timkiemdulieu\";\r\n");
      out.write("\t\t\tdocument.forms[\"dhForm\"].submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\talert(\"THIẾU THÔNG TIN\");\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clearform() {\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].action.value = \"clear\";\r\n");
      out.write("\t\tdocument.forms[\"dhForm\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar request;\r\n");
      out.write("\r\n");
      out.write("\tfunction sendInfo() {\r\n");
      out.write("\t\tdocument.getElementById(\"trangthai\").value = \"4\";\r\n");
      out.write("\t\tvar varA = document.dhForm.khId.value;\r\n");
      out.write("\t\tvar idtam = document.dhForm.iduser.value;\r\n");
      out.write("\t\tvar url = \"loadtable.jsp?a=\" + varA + \"&userId=\" + idtam;\r\n");
      out.write("\t\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t\trequest = new XMLHttpRequest();\r\n");
      out.write("\t\t} else if (window.ActiveXObject) {\r\n");
      out.write("\t\t\trequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\ttry {\r\n");
      out.write("\t\t\trequest.onreadystatechange = getInfo;\r\n");
      out.write("\t\t\trequest.open(\"GET\", url, true);\r\n");
      out.write("\t\t\trequest.send();\r\n");
      out.write("\t\t} catch (e) {\r\n");
      out.write("\t\t\talert(\"Unable to connect to server\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction getInfo() {\r\n");
      out.write("\t\tif (request.readyState == 4) {\r\n");
      out.write("\t\t\tvar val = request.responseText;\r\n");
      out.write("\t\t\tdocument.getElementById('idtable').innerHTML = val;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY leftmargin=\"0\" bottommargin=\"0\" topmargin=\"0\" rightmargin=\"0\">\r\n");
      out.write("\t<form name=\"dhForm\" method=\"post\" action=\"../../DonhangSvl\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"1\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" name=\"iduser\" value=\"");
      out.print(id);
      out.write("\"> <input\r\n");
      out.write("\t\t\ttype=\"hidden\" id=\"trangthai\" name=\"trangthai\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.print(trangthaitimkiem);
      out.write("\">\r\n");
      out.write("\t\t<TABLE width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\theight=\"100%\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD colspan=\"4\" align='left' valign='top' bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t<!--begin body\r\n");
      out.write("Dossier-->\r\n");
      out.write("\t\t\t\t\t<TABLE width=\"100%\" border=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD align=\"left\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<TABLE width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"22\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD align=\"left\" colspan=\"2\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;Xử lý đơn hàng > Đơn hàng bán</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD align=\"right\" colspan=\"2\" class=\"tbnavigation\">User\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tID ");
      out.print(userId);
      out.write("&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<LEGEND class=\"legendtitle\">&nbsp;Tiêu chí tìm kiếm</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Từ ngày</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"plainlabel\"><input type=\"text\" class=\"days\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getTungay());
      out.write("\" size=\"11\" id=\"tungay\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"tungay\" maxlength=\"10\" readonly /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Đến ngày</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"plainlabel\"><input type=\"text\" class=\"days\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(obj.getDenngay());
      out.write("\" size=\"11\" id=\"denngay\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"denngay\" maxlength=\"10\" readonly /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Số đơn hàng</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><input type=\"text\" id=\"sodonhang\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"sodonhang\" size=\"11\"></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Mã / tên khách hàng</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><SELECT name=\"khId\" id=\"khId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonchange=\"sendInfo()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														if (KhRs != null) {
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"123\">Chọn khách hàng</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">ALL</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														try {
																while (KhRs.next()) {
																	if (obj.getKhachhang().equals(KhRs.getString("PK_SEQ"))) {
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue='");
      out.print(KhRs.getString("PK_SEQ"));
      out.write('\'');
      out.write('>');
      out.print(KhRs.getString("TEN"));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														} else {
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value='");
      out.print(KhRs.getString("PK_SEQ"));
      out.write('\'');
      out.write('>');
      out.print(KhRs.getString("TEN"));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														}
																}
															} catch (java.sql.SQLException e) {
															}
														}
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</SELECT></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD class=\"plainlabel\" colspan=\"3\"><a class=\"button2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:submitform()\"> <img style=\"top: -4px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/Search30.png\" alt=\"\">Tìm kiếm\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a> &nbsp;&nbsp;&nbsp; <a class=\"button2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:clearform()\"> <img style=\"top: -4px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/button.png\" alt=\"\">Nhập lại\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>&nbsp;&nbsp;&nbsp;&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t</FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<LEGEND class=\"legendtitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;Đơn hàng bán &nbsp;&nbsp;&nbsp; <a class=\"button3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript:newform()\"> <img style=\"top: -4px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/New.png\" alt=\"\">Tạo mới\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<INPUT name=\"action\" type=\"submit\" value=\"Tao\r\n");
      out.write("moi\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</LEGEND>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TABLE class=\"\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TD width=\"98%\"><span id=\"idtable\"> </span> ");

 	if (trangthaitimkiem.equals("0")) {
 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TABLE id='idtable' width=\"100%\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"1px\" cellpadding=\"4px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"6%\" align=\"center\">Mã DH</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Khách hàng</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Tổng Tiền</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"9%\" align=\"center\">Trạng thái</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Ngày đơn hàng</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"8%\" align=\"center\">Ngày tạo</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Người tạo</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"8%\" align=\"center\">Ngày sửa</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"15%\" align=\"center\">Người sửa</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\" align=\"center\">Tác vụ</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														if (DhRs != null) {
																while (DhRs.next()) {
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<Tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(DhRs.getString("PK_SEQ"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(DhRs.getString("Ten"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(DhRs.getString("TONGGIATRI"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

															String trangthai = "";
																		if (DhRs.getString("TRANGTHAI").equals("0"))
																			trangthai = "Chưa chốt";
																		else if (DhRs.getString("TRANGTHAI").equals("1"))
																			trangthai = "Đã chốt";
																		else
																			trangthai = "Da huy";
														
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(trangthai);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>");
      out.print(DhRs.getString("NGAYNHAP"));
      out.write("</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>");
      out.print(DhRs.getString("NGAYTAO"));
      out.write("</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>");
      out.print(DhRs.getString("NGUOITAO"));
      out.write("</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>");
      out.print(DhRs.getString("NGAYSUA"));
      out.write("</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>");
      out.print(DhRs.getString("NGUOISUA"));
      out.write("</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<A\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../DonhangUpdateSvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print(DhRs.getString("PK_SEQ"));
      out.write("\"><IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"../images/Next20.png\" alt=\"sua\" title=\"Chỉnh sửa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=0></A> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<A\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../DonhangSvl?userId=");
      out.print(userId);
      out.write("&accounting=");
      out.print(DhRs.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Active.png\" alt=\"accounting\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"accounting\" width=\"20\" height=\"20\" border=0 />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<A\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"../../DonhangUpdateSvl?userId=");
      out.print(userId);
      out.write("&coppy=");
      out.print(DhRs.getString("PK_SEQ"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Next20.png\" alt=\"coppy\" title=\"Coppy\" width=\"20\" height=\"20\" border=0 />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</A>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</center></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</Tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

														}
															}
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TABLE> ");

 	}
 
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t</FIELDSET>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(function() {\r\n");
      out.write("\t\t\t\t$(\"#sodonhang\").autocomplete(\"../scripts/ajaxmahoadon.jsp\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treplaces();\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</form>\r\n");
      out.write("</BODY>\r\n");
      out.write("\r\n");

	if (DhRs != null)
		DhRs.close();

	if (KhRs != null)
		KhRs.close();
	session.setAttribute("obj", null);
	obj.DBclose();

      out.write("\r\n");
      out.write("\r\n");
      out.write("</HTML>");
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
