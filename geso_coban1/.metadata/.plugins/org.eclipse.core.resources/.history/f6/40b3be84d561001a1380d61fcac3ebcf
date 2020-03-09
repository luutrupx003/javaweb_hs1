
<%@page import="geso.traning.bean.donhang.IDonhangList"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@page import="geso.training.SP.ISanPham"%>
<%@page import="geso.traning.bean.donhang.IDonHang"%>
<%@page import=" java.util.List"%>


<%
	String userId = (String) session.getAttribute("userId");
	String test = (String) session.getAttribute("uName");
	IDonHang obj=(IDonHang) session.getAttribute("obj");
	List <ISanPham> listsp = obj.getListSP();
  	//Lay thuoc tinh danh sach san pham tu don hang
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<style type="text/css">
#mainContainer {
	width: 660px;
	margin: 0 auto;
	text-align: left;
	height: 100%;
	border-left: 3px double #000;
	border-right: 3px double #000;
}

#formContent {
	padding: 5px;
}
/* END CSS ONLY NEEDED IN DEMO */
/* Big box with list of options */
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
}
</style>
<link rel="stylesheet" type="text/css" href="../css/speechbubbles.css" />
<script type="text/javascript" src="../scripts/jquery.min.js"></script>
<script type="text/javascript" src="../scripts/speechbubbles.js"></script>
<script type="text/javascript">
	jQuery(function($) {
		$('.addspeech').speechbubble();
	})
</script>
<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script src="../scripts/ui/jquery.ui.core.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.widget.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.datepicker.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".days").datepicker({
			changeMonth : true,
			changeYear : true
		});
	});
</script>
<script type="text/javascript" src="../scripts/ajax.js"></script>
<script type="text/javascript" src="../scripts/ajax-dynamic-list.js"></script>
<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/cool_DHTML_tootip.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>
<script language="javascript" type="text/javascript">
	function TinhTien() {
		var thanhtien = document.getElementsByName("thanhtien1");
		var tongtien = 0;
		for (var i = 0; i < thanhtien.length; i++) {
			var thanh_tien = thanhtien.item(i).value;
			while (thanh_tien.match(",")) {
				thanh_tien = thanh_tien.replace(",", "");
			}
			if (thanh_tien != "") {
				tongtien = parseFloat(tongtien) + parseFloat(thanh_tien);
			}
		}
		var tienchuaVAT = tongtien;
		document.getElementById("SoTienChuaVAT").value = DinhDangTien(tienchuaVAT);
		var vat = document.getElementById("VAT").value;
		if (vat == "")
			vat = "0";
		var tongtiencoVAT = (parseFloat(vat)) / 100 * tienchuaVAT + tienchuaVAT;
		;
		document.getElementById("SoTienCoVAT").value = DinhDangTien(Math
				.round(tongtiencoVAT));
	}
	function roundNumber(num, dec) {
		var result = Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec);
		return result;
	}
	function DinhDangTien(num) {
		num = num.toString().replace(/\$|\,/g, '');
		if (isNaN(num))
			num = "0";
		sign = (num == (num = Math.abs(num)));
		num = Math.floor(num * 100 + 0.50000000001);
		num = Math.floor(num / 100).toString();
		for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++)
			num = num.substring(0, num.length - (4 * i + 3)) + ','
					+ num.substring(num.length - (4 * i + 3));
		return (((sign) ? '' : '-') + num);
	}
	function replaces() {
		var khTen = document.getElementsByName("khTen");
		var smartId = document.getElementsByName("smartId");
		for (i = 0; i < smartId.length; i++) {
			var tem = smartId.item(0).value;
			if (tem == "") {
				khTen.item(0).value = "";
				document.getElementById("khId").value = "";
				break;
			}
			if (parseInt(tem.indexOf("-->")) > 0) {
				var tmp = tem.substring(0, parseInt(tem.indexOf("-->[")));
				document.getElementById("khId").value = tmp.substring(parseInt(
						tem.indexOf("-") + 1, tmp.length));
				smartId.item(0).value = tmp.substring(0, parseInt(tem
						.indexOf("-")));
				khTen.item(0).value = tem.substring(parseInt(tem
						.indexOf("-->[")) + 4, parseInt(tem.indexOf("]")));
				break;
			}
		}
		var masp = document.getElementsByName("masp");
		var tensp = document.getElementsByName("tensp1");
		var donvitinh = document.getElementsByName("donvitinh1");
		var dongia = document.getElementsByName("dongia1");
		var soluong = document.getElementsByName("soluong");
		var thanhtien = document.getElementsByName("thanhtien1");
		var i;
		for (i = 0; i < masp.length; i++) {
			if (masp.item(i).value != "") {
				var sp = masp.item(i).value;
				var pos = parseInt(sp.indexOf(" - "));
				if (pos > 0) {
					masp.item(i).value = sp.substring(0, pos);
					sp = sp.substr(parseInt(sp.indexOf(" - ")) + 3);
					tensp.item(i).value = sp.substring(0, parseInt(sp
							.indexOf(" [")));
					sp = sp.substr(parseInt(sp.indexOf(" [")) + 2);
					donvitinh.item(i).value = sp.substring(0, parseInt(sp
							.indexOf("] [")));
					sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
					dongia.item(i).value = sp.substring(0, parseInt(sp
							.indexOf("]")));
				}
				var so_luong = soluong.item(i).value;
				while (so_luong.match(",")) {
					so_luong = so_luong.replace(",", "");
				}
				if (parseInt(so_luong) > 0) {
					var don_gia = dongia.item(i).value;
					while (don_gia.match(",")) {
						don_gia = don_gia.replace(",", "");
					}
					var tt = parseInt(so_luong) * (parseFloat(don_gia));
					thanhtien.item(i).value = DinhDangTien(roundNumber(tt, 2));
					TinhTien();
				} else {
					thanhtien.item(i).value = "";
				}
			}
		}
		setTimeout(replaces, 100);
	}
	function saveform() {
		document.forms['dhForm'].action.value = 'luumoi';
		document.forms['dhForm'].submit();
	}
	function editform() {
		document.forms['dhForm'].action.value = 'edit';
		document.forms['dhForm'].submit();
	}
	function backform() {
		document.forms['dhForm'].action.value = 'back';
		document.forms['dhForm'].submit();
	}
	backform()
</script>
</HEAD>
<BODY leftmargin="0" bottommargin="0" topmargin="0" rightmargin="0">
	<form name="dhForm" method="post" action="../../DonhangUpdateSvl">
		<input type="hidden" id="khId" name="khId" value=''> <input
			type="hidden" name="action" value="1" />
			 <input type="hidden" name="userId" value='<%=userId%>'>
		<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"
			height="100%">
			<TR>
				<TD colspan="4" align='left' valign='top' bgcolor="#FFFFFF">
					<TABLE border=0 width="100%" cellpadding="2" cellspacing="0">
						<TBODY>
							<TR height="22">
								<TD align="left">
									<TABLE width="100%" cellpadding="0" cellspacing="0">
										<TR>
											<TD align="left">
												<TABLE width="100%" border="0" cellpadding="0"
													cellspacing="0">
													<TR height="22">
														<TD align="left" class="tbnavigation">&nbsp;Xử lý don
															hàng > Đơn hàng bán > Tạo mới</TD>
														<TD align="right" class="tbnavigation">Chào mung nhà
															phân phoi</TD>
													</TR>
												</TABLE>
											</TD>
										</TR>
									</TABLE>
									<TABLE width="100%" border="0" cellpadding="1" cellspacing="0">
										<TR>
											<TD>
												<TABLE width="100%" border="0" cellpadding="0"
													cellspacing="0">
													<TR class="tbdarkrow">
														<TD align="left">
															<A href="javascript:backform()"><img
																src="../images/Back30.png" alt="Quay ve" title="Quay ve"
																border="1" longdesc="Quay ve"
																style="border-style: outset">
																</A> 
																<%if(obj.getId().equals("")==true || obj.getTestthu()=="coppy") {%>
															<A
															href="javascript:saveform()"><img
																src="../images/Save30.png" alt="Luu lai" title="Luu lai"
																border="1" longdesc="Luu lai"
																style="border-style: outset">
																</A>
															
																<%} else{ %>
															 	<A href="javascript:editform()"><img
																src="../images/Edit.png" alt="chinh sua" title="chinh sua"
																border="1" longdesc="chinh sua"
																style="border-style: outset">
																</A>
																<% }%>
														</TD>
													</TR>
												</TABLE>
											</TD>
										</TR>
									</TABLE>
									<TABLE border="0" width="100%" cellpadding="0" cellspacing="0">
										<tr>
											<TD align="left" colspan="4" class="legendtitle">
												<FIELDSET>
													<LEGEND class="legendtitle">Báo lỗi nhập liệu </LEGEND>
													<textarea name="dataerror"
														style="width: 100%; color: #F00; font-weight: bold"
														style="width:100%" readonly="readonly" rows="1"></textarea>
												</FIELDSET>
											</TD>
										</tr>
										<TR>
											<TD align="left">
												<FIELDSET>
													<LEGEND class="legendtitle">&nbsp;Ðon hàng bán </LEGEND>
													<TABLE cellpadding="3" cellspacing="0" width="100%"
														border=0>
														<TR>
															<TD width="170px" class="plainlabel">Ngày giao dịch
															</TD>
															<%if(obj.getNgayTao()!="") %>
															<TD class="plainlabel"><input type="text"
																class="days" size="11" id="tungay" name="tungay"
																value="<%=obj.getNgayTao()%>" maxlength="10" readonly /></TD>
																
															<TD class="plainlabel"></TD>
														
															<TD colspan="3" class="plainlabel"></TD> 
														</TR>
														<TR>
														
															<TD class="plainlabel">Mã khách hàng</TD>
															<%if(obj.getId()!="") %>
															<TD class="plainlabel" width="250px"><input
																type="text" id="smartId" name="smartId" value="<%=obj.getMaKH()%>" />
															<TD class="plainlabel" width="190px">Tên khách hàng
																- Ðịa chỉ</TD>
																<%if(obj.getTenKH()!="")%>
															<TD class="plainlabel" colspan="5"><input
																type="text" id="khTen" name="khTen" style="width: 100%"
																value="<%=obj.getTenKH()%>" readonly /></TD>
														</TR>
														<TR class="tblightrow">
															<TD class="plainlabel">VAT (%)</TD>
															<%if(obj.getVAT()!="") %>
															<TD class="plainlabel"><input name="VAT" id="VAT"
																type="text" value="<%=obj.getVAT()%>"
																onkeypress="return keypress(event);"> %</TD>
															<TD class="plainlabel">Tổng số tiền</TD>
															<TD class="plainlabel" colspan="3"><input
																name="SoTienChuaVAT" id="SoTienChuaVAT" type="text"
																readonly value=""> VND</TD>
														</TR>
														<TR class="tblightrow">
															<TD class="plainlabel">Tổng số tiền (sau VAT)</TD>
															<TD class="plainlabel"><input name="SoTienCoVAT" value='0'
																id="SoTienCoVAT" type="text" value="" readonly>
																VND</TD>
															<TD class="plainlabel"></TD>
															<TD colspan="3" class="plainlabel"></TD>
														</TR>
													</TABLE>
												</FIELDSET>
											</TD>
										</TR>
										<TR>
											<TD>

												<TABLE width="100%" border="0" cellpadding="0"
													cellspacing="1">
													<tbody id="san_pham">
														<TR class="tbheader">
															<TH width="10%" height="20">Mã sản phẩm</TH>
															<TH width="30%">Tên sản phẩm</TH>
															<TH width="10%">Số lượng</TH>
															<TH width="10%">DVT</TH>
															<TH width="10%">Đơn giá</TH>
															<TH width="30%">Thành tiền</TH>
														</TR>
														<%
															if (listsp.size() > 0) {
															for (int j = 0; j < listsp.size(); j++) {
															ISanPham sp = listsp.get(j);
														%>
														<TR class='tblightrow'>
															<TD align="center"><input name="masp" type="text"
																value="<%=sp.getMasanpham()%>"
																onkeyup="ajax_showOptions(this,'abc',event)"
																style="width: 100%" AUTOCOMPLETE="off"></TD>
															<TD align="left"><input name="tensp1" type="text"
																value="<%=sp.getTensanpham()%>"
																style="width: 100%; color: black;"></TD>
															<TD align="center"><input name="soluong" type="text"
																value="<%=sp.getSoluong()%>"
																style="width: 100%; textalign: right"></TD>
															<TD align="center"><input name="donvitinh1"
																type="text" value="<%=sp.getDonvitinh()%>"
																style="width: 100%; text-align: center; color: black;">
															</TD>
															<TD align="center"><input type="text" name="dongia1"
																value="<%=sp.getDongia()%>"
																style="width: 100%; text-align: right; color: black;">
															</TD>
															
															<TD align="center"><input name="thanhtien1"
																type="text" value="<%=sp.getThanhtien()%>"
																style="width: 100%; text-align: right; color: black;">
															</TD>
														</TR>
														<%
															}
															}
															int i = 0;
															while (i <= 50) {
														%>
														<TR class='tblightrow'>
															<TD align="center"><input name="masp" type="text"
																value="" onkeyup="ajax_showOptions(this,'abc',event)"
																style="width: 100%" AUTOCOMPLETE="off"></TD>
															<TD align="left"><input name="tensp1" type="text"
																value="" style="width: 100%; color: black;"></TD>
															<TD align="center"><input name="soluong" type="text"
																value="" style="width: 100%; text-align: right"></TD>
															<TD align="center"><input name="donvitinh1"
																type="text"
																style="width: 100%; text-align: center; color: black;">
															</TD>
															<TD align="center"><input type="text" name="dongia1"
																style="width: 100%; text-align: right; color: black;">
															</TD>
															<TD align="center"><input name="thanhtien1"
																type="text"
																style="width: 100%; text-align: right; color: black;">
															</TD>
														</TR>
														<%
															i++;}
														%>
													</tbody>
												</TABLE>
											</td>
										</tr>
									</TABLE>
								</TD>
							</TR>
							</TBODY>
							</TABLE>
							
					</TABLE> 
					<script type='text/javascript'>
						replaces();
						jQuery(function() {
							$("#smartId").autocomplete("KhachhanglistAjax.jsp");
						});
						jQuery(function() {
							$("#tam").autocomplete("../scripts/tamsp.jsp");
						});
						
					</script>
	</form>
</BODY>
</HTML>
