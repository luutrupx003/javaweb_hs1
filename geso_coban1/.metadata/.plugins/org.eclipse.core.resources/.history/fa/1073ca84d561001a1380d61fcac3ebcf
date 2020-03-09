<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@page import="geso.traning.bean.donhang.IDonhangList"%>
<%@page import="geso.traning.bean.donhang.imp.DonhangList"%>
<%@ page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java Ajax Example</title>
</head>
<body>
  <%
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
  %>
</body>
</html>
