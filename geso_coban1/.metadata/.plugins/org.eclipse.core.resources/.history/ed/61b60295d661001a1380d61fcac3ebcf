<%@page import="java.sql.ResultSet"%>
<%@page import="geso.training.bean.hocsinh.IhocSinhList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//Lấy giá trị session
	IhocSinhList obj = (IhocSinhList) session.getAttribute("obj");
	//Lấy thông tin người dùng
	String userId = (String) session.getAttribute("userId");
	String userName = (String) session.getAttribute("userTen");
	//Lấy danh sách lớp
	ResultSet Rslop = obj.getRsLop();
	//danhsachhocsinh
	ResultSet RsHosSinhList = obj.getRsHocSinhList();
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SalesUp - Project</title>
<META http-equiv="Content-Style-Type" content="text/css">
<link rel="stylesheet" href="../css/main.css" type="text/css">
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script type="text/javascript">
	function submitform() 
	{
		document.forms["hocsinhlist"].action.value = "timkiem";
		document.forms["hocsinhlist"].submit();
	}
	function newform()
	{
		document.forms["hocsinhlist"].action.value = "taomoi";
		document.forms["hocsinhlist"].submit();
	}
</script>

</head>
<body>

	<form name="hocsinhlist" method="post" action="../../HocSinhSvl">
		<input type="hidden" name="action" value="1">
		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 100%; padding: 5px; float: left"
					class="tbnavigation">Quản lí học sinh</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Chào mừng bạn
					<%=userName%>
				</div>
			</div>
			<div id="cotent" style="width: 100%; float: none">
				<div align="left"
					style="width: 100%; float: none; clear: left; font-size: 0.7em">
					<fieldset>
						<LEGEND class="legendtitle">Tiêu chí tìm kiếm &nbsp;</LEGEND>

						<TABLE width="100%" cellpadding="6" cellspacing="0">
							<tr>
								<TD class="plainlabel">Tên lớp</TD>
								<TD class="plainlabel"><select name="lop"
									style="width: 200px" onchange="submitform()">
										<option value="">Chọn lớp</option>
										<%
											//Hiện danh sách lớp
											if (Rslop != null) {
												while (Rslop.next()) {
													if (obj.getMaLop().equals(Rslop.getString("PK_SEQ"))) {
										%>
										<option selected="selected"
											value="<%=Rslop.getString("PK_SEQ")%>"><%=Rslop.getString("TENLOP")%>
										</option>
										<%
											} else {
										%>
										<option value="<%=Rslop.getString("PK_SEQ")%>"><%=Rslop.getString("TENLOP")%>
										</option>
										<%
											}
												}
											}
										%>
								</select> <input type="text" value="" name="tenhocsinh" id="tenhocsinh">
								</TD>
							</tr>
						</TABLE>
						<a class="button3" onclick="javascript:newform()"> <img alt=""
							src="../images/New.png" style="top: -4px;"> Tạo mới
						</a>

					</fieldset>
					<fieldset>
						<TABLE width="100%" border="1" cellspacing="1" cellpadding="4">
							<TR class="tbheader">
								<TH align="center" width="20%">Mã HS</TH>
								<TH align="center" width="50%">Tên HS</TH>
								<TH align="center" width="15%">Tên Lớp</TH>
								<TH align="center" width="8%">Tác Vụ</TH>
							</TR>

							<%
								if (RsHosSinhList != null) {
									while (RsHosSinhList.next()) {
							%>
							<TR style="font-size: 14px">
								<td><%=RsHosSinhList.getString("MAHS")%></td>
								<td><%=RsHosSinhList.getString("TENHS")%></td>
								<td><%=RsHosSinhList.getString("TENLOP")%></td>
								<td><A
									href="../../HocSinhUpdateSvl?userId=<%=userId%>&update=<%= RsHosSinhList.getString("MAHS") %>"><IMG
										src="../images/Next20.png" alt="sua" title="Chỉnh sửa"
										border=0></A> <A
									href="../../HocSinhSvl?userId=<%=userId%>&xoa=<%= RsHosSinhList.getString("MAHS")%>">
										<img src="../images/Delete20.png" alt="sua" title="Xóa"
										width="20" height="20" border=0 />
								</A>&nbsp;</td>
							</TR>

							<%
								}
								}
							%>
						</TABLE>
					</fieldset>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
<%
	if (Rslop != null) {
		Rslop.close();
	}
	obj.DBClose();
%>