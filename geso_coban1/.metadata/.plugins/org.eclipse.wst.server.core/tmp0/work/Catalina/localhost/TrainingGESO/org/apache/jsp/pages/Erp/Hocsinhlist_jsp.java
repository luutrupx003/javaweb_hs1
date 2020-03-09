package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import geso.training.bean.hocsinh.IhocSinhList;

public final class Hocsinhlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//Lấy giá trị session
	IhocSinhList obj = (IhocSinhList) session.getAttribute("obj");
	//Lấy thông tin người dùng
	String userId = (String) session.getAttribute("userId");
	String userName = (String) session.getAttribute("userTen");
	//Lấy danh sách lớp
	ResultSet Rslop = obj.getRsLop();
	//danhsachhocsinh
	ResultSet RsHosSinhList = obj.getRsHocSinhList();
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>SalesUp - Project</title>\r\n");
      out.write("<META http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\r\n");
      out.write("<link href=\"../css/select2.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../scripts/select2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction submitform() \r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].action.value = \"timkiem\";\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction newform()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].action.value = \"taomoi\";\r\n");
      out.write("\t\tdocument.forms[\"hocsinhlist\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"hocsinhlist\" method=\"post\" action=\"../../HocSinhSvl\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"1\">\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%; padding-left: 2px\">\r\n");
      out.write("\t\t\t<div align=\"left\" id=\"header\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 100%; padding: 5px; float: left\"\r\n");
      out.write("\t\t\t\t\tclass=\"tbnavigation\">Quản lí học sinh</div>\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding: 5px\" class=\"tbnavigation\">\r\n");
      out.write("\t\t\t\t\tChào mừng bạn\r\n");
      out.write("\t\t\t\t\t");
      out.print(userName);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"cotent\" style=\"width: 100%; float: none\">\r\n");
      out.write("\t\t\t\t<div align=\"left\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; clear: left; font-size: 0.7em\">\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<LEGEND class=\"legendtitle\">Tiêu chí tìm kiếm &nbsp;</LEGEND>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" cellpadding=\"6\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\">Tên lớp</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=\"plainlabel\"><select name=\"lop\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 200px\" onchange=\"submitform()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">Chọn lớp</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											//Hiện danh sách lớp
											if (Rslop != null) {
												while (Rslop.next()) {
													if (obj.getMaLop().equals(Rslop.getString("PK_SEQ"))) {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(Rslop.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(Rslop.getString("TENLOP"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											} else {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(Rslop.getString("PK_SEQ"));
      out.write('"');
      out.write('>');
      out.print(Rslop.getString("TENLOP"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
												}
											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> <input type=\"text\" value=\"\" name=\"tenhocsinh\" id=\"tenhocsinh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"button3\" onclick=\"javascript:newform()\"> <img alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"../images/New.png\" style=\"top: -4px;\"> Tạo mới\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<TABLE width=\"100%\" border=\"1\" cellspacing=\"1\" cellpadding=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<TR class=\"tbheader\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"20%\">Mã HS</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"50%\">Tên HS</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"15%\">Tên Lớp</TH>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TH align=\"center\" width=\"8%\">Tác Vụ</TH>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (RsHosSinhList != null) {
									while (RsHosSinhList.next()) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<TR style=\"font-size: 14px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHosSinhList.getString("MAHS"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHosSinhList.getString("TENHS"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(RsHosSinhList.getString("TENLOP"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../HocSinhUpdateSvl?userId=");
      out.print(userId);
      out.write("&update=");
      out.print( RsHosSinhList.getString("MAHS") );
      out.write("\"><IMG\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/Next20.png\" alt=\"sua\" title=\"Chỉnh sửa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tborder=0></A> <A\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"../../HocSinhSvl?userId=");
      out.print(userId);
      out.write("&xoa=");
      out.print( RsHosSinhList.getString("MAHS"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/Delete20.png\" alt=\"sua\" title=\"Xóa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth=\"20\" height=\"20\" border=0 />\r\n");
      out.write("\t\t\t\t\t\t\t\t</A>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

	if (Rslop != null) {
		Rslop.close();
	}
	obj.DBClose();

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
