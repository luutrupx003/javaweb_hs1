<%@page import="geso.erp.beans.donbanhang_kiet02.ISanPham"%>
<%@page import="geso.erp.beans.donbanhang_kiet02.IDonHang"%>
<%@page import="java.util.Iterator"%>

<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.Hashtable"%>
<%@ page import="java.util.List"%>
<% 
	IDonHang iDonHang = (IDonHang) session.getAttribute("donHangMoi");
	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
  	ResultSet resultSetKH = iDonHang.getResultSetKH();
  	
  	//Lay thuoc tinh danh sach san pham tu don hang
  	List<ISanPham> danhSachSanPham = iDonHang.getDanhSachSanPham();
  	
  	Utility util = new Utility();

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>SalesUp - Project</TITLE>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK rel="stylesheet" type="text/css" media="print" href="../css/impression.css">
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

#ajax_listOfOptions div {re
	/* General rule for both .optionDiv and .optionDivSelected */ margin:1px;
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
	/*Remove below line to remove shadow. Below line should always appear last within this CSS*/
	filter: progid : DXImageTransform.Microsoft.Shadow ( color = gray,
		direction = 135 );
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
	jQuery(function($){ 
		 $('.addspeech').speechbubble();});
</script>

<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script src="../scripts/ui/jquery.ui.core.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.widget.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.datepicker.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {		
		$( ".days" ).datepicker({			    
				changeMonth: true,
				changeYear: true				
		});            
	});	
</script>


<script type="text/javascript" src="../scripts/ajax.js"></script>
<script type="text/javascript" src="../scripts/Erp-SanPhamList_kiet.js"></script>

<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/cool_DHTML_tootip.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script>
     $(document).ready(function() { $("select").select2();  });
     
</script>

<script language="javascript" type="text/javascript">


	function replaces()
	{
		//Lay ra mot mang giong nhu getParameterValue
		var idsp = document.getElementsByName("PK_SEQ");
		var masp = document.getElementsByName("maSanPham");
		var tensp = document.getElementsByName("tenSanPham");
		var donvitinh = document.getElementsByName("donViTinh");
		var soluong = document.getElementsByName("soLuong");
		var dongia = document.getElementsByName("giaBan");
		/* var chietkhau = document.getElementsByName("chietkhau"); */
		var thanhtien = document.getElementsByName("thanhTien");
		 
		var sodong =  masp.length;
		console.log(sodong);
		console.log(donvitinh);
		var i;
		for(i = 0; i < sodong; i++)
		{
			if(  masp.item(i).value != ""    )
			{ 
				console.log(masp);
				var sp = masp.item(i).value;
				var pos = parseInt(sp.indexOf(" -- "));
				var slg = soluong.item(i).value.replace(/,/g,""); 
				
				if(pos > 0)
				{
					masp.item(i).value = sp.substring(0, pos);
					sp = sp.substr(parseInt(sp.indexOf(" -- ")) + 3);
					tensp.item(i).value = sp.substring(0, parseInt(sp.indexOf(" [")));
					
					sp = sp.substr(parseInt(sp.indexOf(" [")) + 2);
					donvitinh.item(i).value = sp.substring(0, parseInt(sp.indexOf("] [")));
					
					sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
					dongia.item(i).value = sp.substring(0, parseInt(sp.indexOf("] [")));
	
					sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
					
					/* chietkhau.item(i).value = sp.substring(0, parseInt(sp.indexOf("] ["))); */
	
					sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
					
					idsp.item(i).value = sp.substring(0, parseInt(sp.indexOf("]")));
					
					soluong.item(i).focus();
					
				}
				
				if(soluong.item(i).value != "")
				{
					
					if(dongia.item(i).value != "")
					{
						var dgia = dongia.item(i).value.replace(/,/g,""); 
						  
						/* var ck=chietkhau.item(i).value.replace(/,/g,""); */
						 
						var tt = parseFloat(slg) *  parseFloat(dgia);
						
						thanhtien.item(i).value =  DinhDangDonGia( Math.round( tt * 1000 ) / 1000 );
						
						 
					}
				}
				 
			}
			else 
			{
			 		
						idsp.item(i).value = "";
						tensp.item(i).value = "";
						donvitinh.item(i).value = "";
				 
						soluong.item(i).value = "";
						dongia.item(i).value = "";
						thanhtien.item(i).value = "";
						 
				 
			}
		}
	  
		TinhTien();
		setTimeout(replaces, 500);
	}
	
	function TinhTien()
	{
		 
		var soluong = document.getElementsByName("soLuong");
		var dongia = document.getElementsByName("giaBan");
		/* var chietkhau = document.getElementsByName("chietkhau"); */
		var thanhtien = document.getElementsByName("thanhTien");	
		
		var tongtien = 0;
		
		 
		 
			 
				for(var i = 0; i < thanhtien.length; i++)
				{
					//alert('TT: ' + thanhtien.item(i).value);
					if( thanhtien.item(i).value != "" )
					{
						var thanh_tien = thanhtien.item(i).value.replace(/,/g,"");
						 
							tongtien = parseFloat(tongtien) +  parseFloat(thanh_tien); 
						
					}
				}
		  
			
			 document.getElementById("tongTien").value = DinhDangTien(Math.round(tongtien));  
		 
		
	}
	
	function DinhDangTien(num) 
	 {
	    num = num.toString().replace(/\$|\,/g,'');
	    if(isNaN(num))
	    num = "0";
	    sign = (num == (num = Math.abs(num)));
	    num = Math.floor(num*100);
	    num = Math.floor(num/100).toString();
	    for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)
	    num = num.substring(0,num.length-(4*i+3))+','+
	    num.substring(num.length-(4*i+3));
	    return (((sign)?'':'-') + num);
	}
	
	function FormatNumber(e)
	{
		e.value = DinhDangDonGia(e.value);
	}
	
	function roundNumber(num, dec) 
	{
		var result = Math.round(num*Math.pow(10,dec))/Math.pow(10,dec);
		return result;
	}
	
	function DinhDangDonGia(num) 
	{
		num = num.toString().replace(/\$|\,/g,'');
		 
		var sole = '';
		if(num.indexOf(".") >= 0)
		{
			sole = num.substring(num.indexOf('.'));
		}
		
		if(isNaN(num))
		num = "0";
		sign = (num == (num = Math.abs(num)));
		num = Math.floor(num*100);
		num = Math.floor(num/100).toString();
		for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)
		num = num.substring(0,num.length-(4*i+3)) + ',' + num.substring(num.length-(4*i+3));

		var kq;
		if(sole.length >= 0)
		{
			kq = (((sign)?'':'-') + num) + sole;
		}
		else
			kq = (((sign)?'':'-') + num);
		
		//alert(kq);
		return kq;
	}

	 function saveform()
	 {	
	 	 document.forms['dmhForm'].action.value='save';
	     document.forms['dmhForm'].submit();
	 }

	 function checkSanPham()
	 {
		 var masp = document.getElementsByName("maSanPham");
		 for(var hh = 0; hh < masp.length; hh++)
		 {
			if(masp.item(hh).value != "")
			{
				return true;
			}
		 }
		 return false;
	 }
	 
	 function submitform()
	 { 		
		 document.forms['dmhForm'].action.value='submit';
	     document.forms["dmhForm"].submit();
	 }
	 
	 function themmoi()
	 { 		
		 document.forms['dmhForm'].action.value='themmoi';
		 document.forms['dmhForm'].IsCapNhat.value='1';
	     document.forms["dmhForm"].submit();
	 }
	 
	 function quaylaiInit()
	 { 		
		 document.forms['dmhForm'].action.value='quaylaiInit';
		 document.forms['dmhForm'].IsCapNhat.value='0';
	     document.forms["dmhForm"].submit();
	 }
	 
	 function savekhachhang()
	 { 		
		 document.forms['dmhForm'].action.value='savekhachhang';
		 document.forms['dmhForm'].IsCapNhat.value='0';
	     document.forms["dmhForm"].submit();
	 }
	  
	 function Chinhsua()
	 { 		
		 document.forms['dmhForm'].action.value='chinhsua';
		 document.forms['dmhForm'].IsCapNhat.value='0';
		 var  id_dh= document.forms['dmhForm'].id_dh.value;
		 if(id_dh==""){
			 alert('Không xác định số chứng từ sửa, vui lòng kiểm tra lại');
			 return;
		 }
		 
	     document.forms["dmhForm"].submit();
	 }

	 function goBack()
	 {
	  	window.history.back();
	 }
</script>
</head>
<BODY leftmargin="0" bottommargin="0" topmargin="0" rightmargin="0">
	<form name="dmhForm" method="post" action="../../DonHangNewSvl_kiet02">
		<input type="hidden" name="userId" value='<%= userId %>'> <input
			type="hidden" name="action" value="1" /> <input type="hidden"
			name="maDonHang" value='<%= iDonHang.getMaDonHang() %>'>
		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 60%; padding: 5px; float: left"
					class="tbnavigation">Thong tin san pham</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Chào mừng bạn
					<%= userTen %>
				</div>
			</div>
			<div align="left" id="button"
				style="border: 1; width: 100%; height: 32px; padding: 1px; float: none"
				class="tbdarkrow">

				<TABLE border="0" cellpadding="0" cellspacing="0">
					<TR class="tbdarkrow">
						<TD width="30px" align="left"><A href="javascript:saveform()">
								<IMG src="../images/1455966997_save.png" title="Save" alt="Save"
								border="1px" style="border-style: outset"> </A></TD>
						<TD width="30px" align="left"><span id="btnUndo"> <A
								href="../../DonHangListSvl_Kiet02?userId=<%=userId%>"> <IMG
									src="../images/Back_undo.png" title="Undo" alt="Undo"
									border="1px" style="border-style: outset"> </A> </span></TD>
					</TR>
				</TABLE>

			</div>
			<div align="left" style="width: 100%; float: none; clear: left">
				<fieldset>
					<legend class="legendtitle"> Thông báo</legend>
					<textarea name="dataerror" id="Msg" rows="1" readonly="readonly"
						style="height: 50px; width: 100%"><%= iDonHang.getMsg() %></textarea>
				</fieldset>
			</div>
			<div align="left" style="width: 100%; float: none; clear: left">
				<fieldset>
					<legend class="legendtitle"> Thêm Đơn Hàng </legend>
					<div style="float: none; width: 100%" align="left">
						<TABLE width="100%" cellpadding="4" cellspacing="0">
							<TR>
								<TD class="plainlabel">Khách hàng</TD>
								<TD class="plainlabel"><select name="maKhachHang"
									style="width: 200px">
										<option value=""></option>
										<% 
										if (resultSetKH != null) {
											while (resultSetKH.next()) {
												if ( resultSetKH.getString("MAKHACHHANG").equals(iDonHang.getMaKhachHang()) ) {
									%>
										<option value="<%= resultSetKH.getString("MAKHACHHANG") %>"
											selected="selected">
											<%=resultSetKH.getString("TENKHACHHANG") %>
										</option>
										<%
												} else {
											%>
										<option value="<%= resultSetKH.getString("MAKHACHHANG") %>">
											<%=resultSetKH.getString("TENKHACHHANG") %>
										</option>
										<% 
												}
											}
										}
									%>
								
								</TD>

							</TR>

							<TR>
								<TD class="plainlabel">Ngày chứng từ</TD>
								<TD class="plainlabel"><input type="text"
									name="ngayChungTu" class="days"
									value="<%= iDonHang.getNgayChungTu() %>">
								</TD>
							</TR>

							<TR>
								<TD class="plainlabel">Tổng tiền</TD>
								
								<TD class="plainlabel"><input type="text" name="tongTien"
									id = "tongTien" readonly="readonly"
									style="text-align: right;font-size: 14px;font-weight: bold
									value="<%= iDonHang.getTongTien() %>"></TD>
								<% System.out.println(iDonHang.getTongTien()); %>
							</TR>

						</TABLE>
						<hr>
					</div>

					<!-- Chi tiết đơn hàng  -->

					<div align="left" style="width: 100%; float: none; clear: none;">
						<TABLE class="tabledetail" width="100%" border="0" cellpadding="5"
							 style="font-size: 15px;">
							<!-- Tiêu đề -->
							<TR class="tbheader">
								<TH align="left" width="2%">STT</TH>

								<TH align="left" width="8%">Mã sản phẩm</TH>
								<TH align="left" width="15%">Sản phẩm</TH>
								<TH align="left" width="13%">Đơn vị tính</TH>
								<TH align="left" width="3%">Số lượng</TH>
								<TH align="left" width="10%">Đơn giá</TH>
								<TH align="left" width="7%">Thành tiền</TH>

							</TR>

							<!-- Lưới sản phẩm -->
								<!-- In sản phẩm -->

							<% 
						/* int count = 0; 
						if(spList.size() > 0) { */
							int countSanPhanRow = 0;
							if (danhSachSanPham.size() > 0) {
								Iterator<ISanPham> iteratorSanPham = danhSachSanPham.iterator();
								while (iteratorSanPham.hasNext()) {
									ISanPham elementSanPham = iteratorSanPham.next();
									countSanPhanRow++;
							/* for(int countSanPhamRow = 0; countSanPhamRow < 20; countSanPhamRow++) { */ 
										/* ISanpham sp = spList.get(i); */
						%>
							<TR>
								<TD align="center" width="2%"><input type="text"
									value="<%=countSanPhanRow%>" style="text-align: center;"
									readonly="readonly"> <input type="hidden" value="<%= elementSanPham.getPk_seq() %>"
									name="PK_SEQ" style="width: 100%" readonly="readonly">

								</TD>
								
								<TD align="left" width="8%"><input type="text"
									name="maSanPham"
									value="<%= elementSanPham.getMaSanPham() %>"
									style="text-align: center;"></TD>
									
								<TD align="left" width="10%"><input type="text"
									name="tenSanPham" readonly="readonly"
									value="<%= elementSanPham.getTenSanPham() %>"
									style="text-align: center;"></TD>
									
								<TD align="left" width="6%"><input type="text"
									name="donViTinh" readonly="readonly"
									value="<%= elementSanPham.getmaDonViTinh() %>"
									style="text-align: center;"></TD>
									
								<TD align="right" width="3%"><input type="number"
									name="soLuong"
									value="<%= elementSanPham.getSoLuong() %>"
									style="text-align: center;"></TD>
									
								<TD align="right" width="8%"><input type="text"
									name="giaBan" readonly="readonly"
									value="<%= elementSanPham.getGiaBan() %>"
									style="text-align: center;"></TD>

								<TD align="right" width="8%"><input type="text" 
									name="thanhTien" readonly="readonly"
									value="<%= elementSanPham.getGiaBan() * elementSanPham.getSoLuong() %>"
									style="text-align: center;"></TD>
							</TR>

							<% 	
								/* } */
							} }%>


							<% for(int i = countSanPhanRow; i < danhSachSanPham.size()+20; i++) { %>
							<tr>
								<TD align="center" width="2%"><input type="text"
									value="<%= i + 1 %>" style="text-align: center;"
									readonly="readonly"> <input type="hidden" value=""
									name="PK_SEQ" style="width: 100%" readonly="readonly">
								</TD>
								<TD align="left" width="8%"><input type="text"
									name="maSanPham" style="width: 100%" value=""
									onkeyup="ajax_showOptions(this,'donHangMoi',event)"
									AUTOCOMPLETE="off">
								</TD>
								<TD align="left" width="10%"><input type="text" 
									value="" readonly="readonly"
									name="tenSanPham" style="width: 100%">
									
								</TD>
								<TD align="center" width="6%"><input type="text" 
									value="" readonly="readonly"
									name="donViTinh" style="width: 100%">
									
								</TD>
								<TD align="right" width="7%"><input type="number" value=""
									name="soLuong" style="width: 100%; text-align: right;"
									onkeyup="FormatNumber(this)">
								</TD>
								<TD align="right" width="8%"><input type="text" value=""
									name="giaBan" style="width: 100%; text-align: right;"
									readonly="readonly"
									onkeyup="FormatNumber(this)">
								</TD>

								<TD align="right" width="8%"><input type="text" value=""
									name="thanhTien" style="width: 100%; text-align: right;"
									readonly="readonly"></TD>
							</tr>
							<% } %>



							<tr class="tbfooter">
								<td colspan="12">&nbsp;</td>
							</tr>
						</TABLE>
					</div>

				</fieldset>
			</div>
		</div>



		<%
		iDonHang.DBclose();
	%>
	<!-- Goi ham java script trong chuong trinh -->
		<script type="text/javascript">
				replaces();
		</script>
	</form>
</BODY>
</html>