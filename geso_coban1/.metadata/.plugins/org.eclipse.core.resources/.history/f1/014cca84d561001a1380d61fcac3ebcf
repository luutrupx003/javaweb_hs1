<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF8"%>
<%@page import="geso.traning.bean.donhang.IDonhangList"%>
<%@page import="geso.traning.bean.donhang.imp.DonhangList"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.text.NumberFormat"%>
<%
	IDonhangList obj = (DonhangList) session.getAttribute("obj");
	String id = (String) session.getAttribute("userId");
	String trangthaitimkiem = (String) session
			.getAttribute("trangthaitimkiem");
	ResultSet KhRs = obj.getKhRs();
	ResultSet DhRs = obj.getDhRs();
	String userId = obj.getUserId();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Best - Project</TITLE>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK rel="stylesheet" type="text/css" media="print"
	href="../css/impression.css">
<LINK rel="stylesheet" href="../css/main.css" type="text/css">
<link type="text/css" rel="stylesheet" href="../css/mybutton.css">
<LINK rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../scripts/jquery.min.1.7.js"></script>
<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script src="../scripts/ui/jquery.ui.core.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.widget.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.datepicker.js"
	type="text/javascript"></script>
<script type="text/javascript" src="../scripts/ajax.js"></script>
<script type="text/javascript" src="../scripts/ajax-dynamic-list.js"></script>
<script type="text/javascript" src="../scripts/cool_DHTML_tootip.js"></script>
<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>
<style type="text/css">
#ajax_listOfOptions {
	position: absolute; /* Never change this one */
	width: auto; /* Width of box */
	height: 200px; /* Height of box */
	overflow: auto; /* Scrolling features */
	border: 1px solid #317082; /* Dark green border */
	background-color: #C5E8CD; /* White background color */
	color: black;
	text-align: left;
	font-size: 1.0em;
	z-index: 100;
}

#ajax_listOfOptions div {
	/* General rule for both .optionDiv and .optionDivSelected */
	margin: 1px;
	padding: 1px;
	cursor: pointer;
	font-size: 1.0em;
}

#ajax_listOfOptions .optionDiv { /* Div for each item in list */
	
}

#ajax_listOfOptions .optionDivSelected { /* Selected item in the list */
	background-color: #317082; /*mau khi di chuyen */
	color: #FFF;
}

#ajax_listOfOptions_iframe {
	background-color: #F00;
	position: absolute;
	z-index: 5;
}

form {
	display: inline;
}

#dhtmltooltip {
	position: absolute;
	left: -300px;
	width: 150px;
	border: 1px solid black;
	padding: 2px;
	background-color: lightyellow;
	visibility: hidden;
	z-index: 100;
	/*Remove below line to remove shadow. Below line should always appear last
within this CSS*/
	filter: progid:DXImageTransform.Microsoft.Shadow(color=gray, direction=135);
}

#dhtmlpointer {
	position: absolute;
	left: -300px;
	z-index: 101;
	visibility: hidden;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {
		$(".days").datepicker({
			changeMonth : true,
			changeYear : true
		});
	});
</script>
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script>
	$(document).ready(function() {
		$("select:not(.notuseselect2)").select2({
			width : 'resolve'
		});
	});
</script>
<script type="text/javascript">
	function replaces() {
		var smartId = document.getElementsByName("sodonhang");
		for (i = 0; i < smartId.length; i++) {
			var tem = smartId.item(0).value;
			if (tem == "") {
				document.getElementById("sodonhang").value = "";
				break;
			}
			if (parseInt(tem.indexOf("-->")) > 0) {
				var tmp = tem.substring(0, parseInt(tem.indexOf("-->")));

				document.getElementById("sodonhang").value = tmp;
				break;
			}
		}
		setTimeout(replaces, 100);
	}

	function newform() {
		document.forms["dhForm"].action.value = "new";
		document.forms["dhForm"].submit();
	}
	function editform() {
		document.forms["dhForm"].action.value = "accounting";
		document.forms["dhForm"].submit();
	}
	function submitform() {
		 var sodonhang=document.getElementById("sodonhang").value;
		 var tungay=document.getElementById("tungay").value;
		 var denngay=document.getElementById("denngay").value;
		if (sodonhang!="" || tungay!=""||denngay!="")
		{
			document.forms["dhForm"].action.value = "timkiemdulieu";
			document.forms["dhForm"].submit();
		
		} else {
			alert("THIẾU THÔNG TIN");

		}
	}
	function clearform() {
		document.forms["dhForm"].action.value = "clear";
		document.forms["dhForm"].submit();
	}
</script>


<script>
	var request;

	function sendInfo() {
		document.getElementById("trangthai").value = "4";
		var varA = document.dhForm.khId.value;
		var idtam = document.dhForm.iduser.value;
		var url = "loadtable.jsp?a=" + varA + "&userId=" + idtam;
		if (window.XMLHttpRequest) {
			request = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			request = new ActiveXObject("Microsoft.XMLHTTP");
		}

		try {
			request.onreadystatechange = getInfo;
			request.open("GET", url, true);
			request.send();
		} catch (e) {
			alert("Unable to connect to server");
		}
	}

	function getInfo() {
		if (request.readyState == 4) {
			var val = request.responseText;
			document.getElementById('idtable').innerHTML = val;
		}
	}
</script>

</HEAD>
<BODY leftmargin="0" bottommargin="0" topmargin="0" rightmargin="0">
	<form name="dhForm" method="post" action="../../DonhangSvl">
		<input type="hidden" name="action" value="1"> <input
			type="hidden" name="iduser" value="<%=id%>"> <input
			type="hidden" id="trangthai" name="trangthai"
			value="<%=trangthaitimkiem%>">
		<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"
			height="100%">
			<TR>
				<TD colspan="4" align='left' valign='top' bgcolor="#FFFFFF">
					<!--begin body
Dossier-->
					<TABLE width="100%" border="0" cellpadding="0">
						<TR>
							<TD align="left" class="tbnavigation">
								<TABLE width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr height="22">
										<TD align="left" colspan="2" class="tbnavigation">
											&nbsp;Xử lý đơn hàng > Đơn hàng bán</TD>
										<TD align="right" colspan="2" class="tbnavigation">User
											ID <%=userId%>&nbsp;
										</TD>
								</TABLE>
							</TD>
						</TR>
						<TR>
							<TD>
								<FIELDSET>
									<LEGEND class="legendtitle">&nbsp;Tiêu chí tìm kiếm</LEGEND>
									<TABLE width="100%" cellpadding="6" cellspacing="0">
										<TR>
											<TD class="plainlabel">Từ ngày</TD>
											<td class="plainlabel"><input type="text" class="days"
												value="<%=obj.getTungay()%>" size="11" id="tungay"
												name="tungay" maxlength="10" readonly /></td>
										</TR>
										<TR>
											<TD class="plainlabel">Đến ngày</TD>
											<td class="plainlabel"><input type="text" class="days"
												value="<%=obj.getDenngay()%>" size="11" id="denngay"
												name="denngay" maxlength="10" readonly /></td>
										</TR>
										<TR>
											<TD class="plainlabel">Số đơn hàng</TD>
											<TD class="plainlabel"><input type="text" id="sodonhang"
												name="sodonhang" size="11"></TD>

										</TR>
										<TR>
											<TD class="plainlabel">Mã / tên khách hàng</TD>
											<TD class="plainlabel"><SELECT name="khId" id="khId"
												onchange="sendInfo()">
													<%
														if (KhRs != null) {
													%>
													<option value="123">Chọn khách hàng</option>
													<option value="">ALL</option>

													<%
														try {
																while (KhRs.next()) {
																	if (obj.getKhachhang().equals(KhRs.getString("PK_SEQ"))) {
													%>
													<option selected="selected"
														value='<%=KhRs.getString("PK_SEQ")%>'><%=KhRs.getString("TEN")%></option>
													<%
														} else {
													%>
													<option value='<%=KhRs.getString("PK_SEQ")%>'><%=KhRs.getString("TEN")%></option>
													<%
														}
																}
															} catch (java.sql.SQLException e) {
															}
														}
													%>
											</SELECT></TD>
										</TR>
										<TR>
											<TD class="plainlabel" colspan="3"><a class="button2"
												href="javascript:submitform()"> <img style="top: -4px;"
													src="../images/Search30.png" alt="">Tìm kiếm
											</a> &nbsp;&nbsp;&nbsp; <a class="button2"
												href="javascript:clearform()"> <img style="top: -4px;"
													src="../images/button.png" alt="">Nhập lại
											</a>&nbsp;&nbsp;&nbsp;&nbsp;</TD>
										</TR>
									</TABLE>
								</FIELDSET>
							</TD>
						</TR>
						<TR>
							<TD width="100%">
								<FIELDSET>
									<LEGEND class="legendtitle">
										&nbsp;Đơn hàng bán &nbsp;&nbsp;&nbsp; <a class="button3"
											onclick="javascript:newform()"> <img style="top: -4px;"
											src="../images/New.png" alt="">Tạo mới
										</a>
										<!--<INPUT name="action" type="submit" value="Tao
moi"> -->
									</LEGEND>
									<TABLE class="" width="100%">
										<TR>
											<TD width="98%"><span id="idtable"> </span> <%
 	if (trangthaitimkiem.equals("0")) {
 %>
												<TABLE id='idtable' width="100%" border="0"
													cellspacing="1px" cellpadding="4px">
													<TR class="tbheader">
														<th width="6%" align="center">Mã DH</th>
														<th width="10%" align="center">Khách hàng</th>
														<th width="10%" align="center">Tổng Tiền</th>
														<th width="9%" align="center">Trạng thái</th>
														<th width="10%" align="center">Ngày đơn hàng</th>
														<th width="8%" align="center">Ngày tạo</th>
														<th width="10%" align="center">Người tạo</th>
														<th width="8%" align="center">Ngày sửa</th>
														<th width="15%" align="center">Người sửa</th>
														<th width="10%" align="center">Tác vụ</th>
													</TR>
													<%
														if (DhRs != null) {
																while (DhRs.next()) {
													%>
													<Tr>
														<td><%=DhRs.getString("PK_SEQ")%></td>
														<td><%=DhRs.getString("Ten")%></td>
														<td><%=DhRs.getString("TONGGIATRI")%></td>
														<%
															String trangthai = "";
																		if (DhRs.getString("TRANGTHAI").equals("0"))
																			trangthai = "Chưa chốt";
																		else if (DhRs.getString("TRANGTHAI").equals("1"))
																			trangthai = "Đã chốt";
																		else
																			trangthai = "Da huy";
														%>
														<td><%=trangthai%></td>
														<td><center><%=DhRs.getString("NGAYNHAP")%></center></td>
														<td><center><%=DhRs.getString("NGAYTAO")%></center></td>
														<td><center><%=DhRs.getString("NGUOITAO")%></center></td>
														<td><center><%=DhRs.getString("NGAYSUA")%></center></td>
														<td><center><%=DhRs.getString("NGUOISUA")%></center></td>
														<td><center>
																<A
																	href="../../DonhangUpdateSvl?userId=<%=userId%>&update=<%=DhRs.getString("PK_SEQ")%>"><IMG
																	src="../images/Next20.png" alt="sua" title="Chỉnh sửa"
																	border=0></A> 
																<A
																	href="../../DonhangSvl?userId=<%=userId%>&accounting=<%=DhRs.getString("PK_SEQ")%>">
																	<img src="../images/Active.png" alt="accounting"
																	title="accounting" width="20" height="20" border=0 />
																</A>
																<A
																	href="../../DonhangUpdateSvl?userId=<%=userId%>&coppy=<%=DhRs.getString("PK_SEQ")%>">
																	<img src="../images/Next20.png" alt="coppy" title="Coppy" width="20" height="20" border=0 />
																</A>
															</center></td>
													</Tr>
													<%
														}
															}
													%>
												</TABLE> <%
 	}
 %></TD>
										</TR>
									</TABLE>
								</FIELDSET>
							</TD>
						</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TABLE>
		<script type="text/javascript">
			jQuery(function() {
				$("#sodonhang").autocomplete("../scripts/ajaxmahoadon.jsp");
			});
			replaces();
		</script>
	</form>
</BODY>

<%
	if (DhRs != null)
		DhRs.close();

	if (KhRs != null)
		KhRs.close();
	session.setAttribute("obj", null);
	obj.DBclose();
%>

</HTML>