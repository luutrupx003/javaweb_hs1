package org.apache.jsp.pages.Erp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import geso.traning.bean.donhang.IDonhangList;
import geso.traning.bean.donhang.imp.DonhangList;
import java.sql.ResultSet;

public final class loadtable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Java Ajax Example</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");

    String a = request.getParameter("a");
  	String userId = request.getParameter("userId");
  	IDonhangList obj = new DonhangList();
  	if(a!="")
 	obj.init(a);
  	else{
  	 	obj.init();
  		
  	}
 	ResultSet DhRs = obj.getDhRs();
 	String 	s="	<TABLE id ='idtable' width='100%' border='0' cellspacing='1px' cellpadding='4px'> <TR class='tbheader'> ";
			s+=" <th width='6%' align='center'>Mã DH</th>";
			s+="	<th width='10%' align='center'>Khách hàng</th>";
			s+="	<th width='10%' align='center'>Tổng Tiền</th>";
			s+="	<th width='9%' align='center'>Trạng thái</th>";
			s+="	<th width='10%' align='center'>Ngày đơn hàng</th>";
			s+="	<th width='8%' align='center'>Ngày tạo</th> ";
			s+="	<th width='10%' align='center'>Người tạo</th>";
			s+="	<th width='8%' align='center'>Ngày sửa</th>";
			s+="	<th width='15%' align='center'>Người sửa</th>";
			s+=" 	<th width='10%' align='center'>Tác vụ</th>";
			s+="</TR>";
				if (DhRs != null) {
					while (DhRs.next()) {
			s+=" <TR>";
			s+="	<td>"+DhRs.getString("PK_SEQ")+"</td>";
			s+="	<td><center>"+DhRs.getString("Ten")+"</center></td>";
			s+="	<td>"+DhRs.getString("TONGGIATRI")+"</td>";
					String trangthai = "";
							if (DhRs.getString("TRANGTHAI").equals("0"))
								trangthai = "Chưa chốt";
							else if (DhRs.getString("TRANGTHAI").equals("1"))
								trangthai = "Đã chốt";
							else
								trangthai = "Da huy";
			s+="<td>"+trangthai+"</td>";
			s+="	<td><center>"+DhRs.getString("NGAYNHAP")+"</center></td>";
			s+="	<td><center>"+DhRs.getString("NGAYTAO")+"</center></td>";
			s+="	<td><center>"+DhRs.getString("NGUOITAO")+"</center></td>";
			s+="	<td><center>"+DhRs.getString("NGAYSUA")+"</center></td>";
			s+="	<td><center>"+DhRs.getString("NGUOISUA")+"</center></td>";
			s+="	<td><center>";
			s+=" <A href=\"../../DonhangUpdateSvl?userId="+userId+"&update="+DhRs.getString("PK_SEQ")+"\"> ";
			s+=" <IMG src=\"../images/Next20.png\" alt=\"sua\" title=\"Chỉnh sửa\" border=0> </A> ";
			
			s+="<A	href=\"../../DonhangSvl?userId="+userId+"&accounting="+DhRs.getString("PK_SEQ")+"\">";
			s+=" <IMG src=\"../images/Active.png\" alt=\"accounting\"title=\"accounting\" width=\"20\" height=\"20\" border=0 > </A>";
			s+=" <A href=\"../../DonhangUpdateSvl?userId="+userId+"&coppy="+DhRs.getString("PK_SEQ")+"\"> ";
			s+=" <IMG src=\"../images/Next20.png\" alt=\"coppy\" title=\"coppy\" border=0> </A> ";
			
			s+="</center></td>";
			s+="</TR> ";
				}
				}
 			s+=" </TABLE>";
      out.print((s ));
  
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
