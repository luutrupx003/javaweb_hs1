<%@page import="geso.erp.beans.muahang_hieu.IThongtinmuahang"%>
<%@page import="geso.erp.beans.donbanhang_hieu.Isanpham"%>
<%@page import="geso.erp.beans.donbanhang_hieu.IThongtindonbanhang"%>
<%@page import="geso.erp.beans.donbanhang_hieu.IDonbanhang"%>
<%@page import="geso.erp.beans.sanpham_tan.IThongtinsanpham"%>
<%@page import="geso.erp.beans.nhacungcap.INhacungcap"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.Hashtable"%>
<%@ page import="java.util.List"%>
<%
	IThongtinmuahang obj = (IThongtinmuahang) session.getAttribute("obj");
	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
	String action1=(String)session.getAttribute("action");
	Utility util = (Utility) session.getAttribute("util");
	List<Isanpham> listsp =obj.getListSp();
	ResultSet dataListncc=obj.getRskh();
	NumberFormat formatter = new DecimalFormat("#,###,###.###");
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>SalesUp - Project</TITLE>
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
	filter: progid :DXImageTransform.Microsoft.Shadow (
		         
		  color = gray, direction = 135 );
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
<script src="../scripts/ui/jquery.ui.datepicker.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {		
		$( ".days" ).datepicker({			    
				changeMonth: true,
				changeYear: true				
		});            
	});	
</script>

<script type="text/javascript" src="../scripts/ajax.js"></script>
<script type="text/javascript" src="../scripts/erp-spList.js"></script>

<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/cool_DHTML_tootip.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script>
     $(document).ready(function() { $("select").select2();  });
     
</script>

<script language="javascript" type="text/javascript">

  
	 function saveform()
	 {	
	     document.forms['dmhForm'].submit();
	 }

	 function checkSanPham()
	 {
		 var masp = document.getElementsByName("masp");
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
	 
	 
	 
	 
	 function savenhacungcap()
	 { 		
		 document.forms['dmhForm'].action.value='savenhacungcap';
		 document.forms['dmhForm'].IsCapNhat.value='0';
	     document.forms["dmhForm"].submit();
	 }
	 
	 
	 
	 
	 function Chinhsua()
	 { 		
		 document.forms['dmhForm'].action.value='chinhsua';
		 document.forms['dmhForm'].IsCapNhat.value='0';
		 var  id_dh= document.forms['dmhForm'].id_dh.value;
		 if(id_dh==""){
			 alert('Không xác định số chứng từ sửa,vui lòng kiểm tra lại');
			 return;
		 }
		 
	     document.forms["dmhForm"].submit();
	 }
	 
 
	 
	 
 
	 function goBack()
	 {
	  	window.history.back();
	 }
	 function replaces()
		{
			 
			// lay mot mang
			var idsp = document.getElementsByName("idsp");
			var masp = document.getElementsByName("masp");
			var tensp = document.getElementsByName("tensp");
			var donvitinh = document.getElementsByName("dvt");
			var soluong = document.getElementsByName("soluong");
			var dongia = document.getElementsByName("dongia"); 
			var thanhtien = document.getElementsByName("thanhtien");	 
			var sodong =  masp.length;
			console.log(sodong);
			
			var i;
			for(i = 0; i < sodong; i++)
			{
				if(  masp.item(i).value != ""    )
				{ 
					 
					var sp = masp.item(i).value;
					var pos = parseInt(sp.indexOf(" -- "));
					var slg = soluong.item(i).value.replace(/,/g,""); 
					
					if(pos > 0)
					{
						console.log(pos);
						
						masp.item(i).value = sp.substring(0, pos);
						
						// substr ham nay truyen vao vi tri bat dau lay cua chuoi toi het chuoi
						//vd  ( VT10 -- VIETTEL10 [] [20,000] [0] [100010] )   lay tu vi tri 7: VIETTEL10 [] [20,000] [0] [100010]
						sp = sp.substr(parseInt(sp.indexOf(" -- ")) + 3);
						tensp.item(i).value = sp.substring(0, parseInt(sp.indexOf(" [")));
						
						sp = sp.substr(parseInt(sp.indexOf(" [")) + 2);
						donvitinh.item(i).value = sp.substring(0, parseInt(sp.indexOf("] [")));
						
						sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
						
						dongia.item(i).value = sp.substring(0, parseInt(sp.indexOf("] [")));

						sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
						 
						sp = sp.substr(parseInt(sp.indexOf("] [")) + 3);
						
						idsp.item(i).value = sp.substring(0, parseInt(sp.indexOf("]")));
						
						soluong.item(i).focus();
						
					}
					
					if(soluong.item(i).value != "")
					{
						
						if(dongia.item(i).value != "")
						{
							var dgia = dongia.item(i).value.replace(/,/g,""); 
							 
							var tt = parseFloat(slg) *  parseFloat(dgia)  ;
							
							thanhtien.item(i).value =  tt ;
							
							 
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
			 
			var soluong = document.getElementsByName("soluong");
			var dongia = document.getElementsByName("dongia");
			var chietkhau = document.getElementsByName("chietkhau");
			var thanhtien = document.getElementsByName("thanhtien");	
			
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
			  
				
				document.getElementById("tongtien").value = DinhDangTien(Math.round(tongtien));
			 	
			
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
	 
 
</script>
</head>
<BODY leftmargin="0" bottommargin="0" topmargin="0" rightmargin="0">
	<form name="dmhForm" method="post" action="../../DonmuahangNewSvl">
		<input type="hidden" name="userId" value='<%=userId%>'> <input
			type="hidden" name="action" value="<%=action1%>" /> <input
			type="hidden" name="id" value='<%=obj.getId()%>'>
		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 60%; padding: 5px; float: left"
					class="tbnavigation">Thông tin hóa đơn mua hàng</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Chào mừng bạn
					<%=userTen%>
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
								href="../../DonmuahangListSvl?userId=<%=userId%>"> <IMG
									src="../images/Back_undo.png" title="Undo" alt="Undo"
									border="1px" style="border-style: outset"> </A> </span></TD>


					</TR>
				</TABLE>


			</div>
			<div align="left" style="width: 100%; float: none; clear: left">
				<fieldset>
					<legend class="legendtitle"> Thông báo</legend>
					<textarea name="dataerror" id="Msg" rows="1" readonly="readonly"
						style="width: 100%"><%=obj.getmsg()%></textarea>
				</fieldset>
			</div>
			<div align="left" style="width: 100%; float: none; clear: left">
				<fieldset>
					<legend class="legendtitle"> Thêm hóa đơn mua hàng </legend>
					<div style="float: none; width: 100%" align="left">
						<TABLE width="100%" cellpadding="4" cellspacing="0">

							<TR>
								<TD class="plainlabel">Tổng tiền</TD>
								<TD class="plainlabel"><input type="text"
									name="tongtien" id="tongtien" value="<%=obj.getTongtien()%>"
									style="text-align: right; font-size: 14px; font-weight: bold;"
									readonly="readonly"></TD>

							</TR>
							<TR>
								<TD class="plainlabel">Ngày</TD>
								<TD class="plainlabel"><input type="text" class="days"
									name="ngay" value="<%=obj.getNgaychungtu()%>"></TD>

							</TR>

							<tr>
								<TD class="plainlabel">Tên Nhà Cung Cấp</TD>
								<TD class="plainlabel"><select name="nhacungcap"
									style="width: 200px">
										<option></option>
										<%
											if (dataListncc != null) {
												while (dataListncc.next()) {
													if (dataListncc.getString("pk_seq").equals(obj.getNhacungcap())) {
										%>
										<option value="<%=dataListncc.getString("pk_seq")%>"
											selected="selected"><%=dataListncc.getString("TEN")%>
										</option>
										<%
											} else {
										%>
										<option value="<%=dataListncc.getString("pk_seq")%>"><%=dataListncc.getString("TEN")%>
										</option>
										<%
											}
												}
										%>
										<%
											}
										%>

								</select>
								<a href="" id="noidungGhiChu" rel="ndGhiChu">
	           	 							&nbsp; <img alt="Thêm khách hàng" src="../images/vitriluu.png">Thêm nhà cung cấp</a>
                          			<DIV id="ndGhiChu" style="position:absolute; visibility: hidden; border: 9px solid #80CB9B;
				                             background-color: white; width: 500px; min-height:150px; overflow:auto; padding: 4px;">
				                    	<table width="100%" align="center">
				                        <tr>
				                            <th colspan="2" width="500px" style="font-size: 14px;font-weight: bold;">THÊM NHÀ CUNG CẤP</th>
				                            
				                        </tr>
		                            	
		                            	 <tr>
				                            <td width="20%"> Mã nhà cung cấp </td>
				                            <td width="80%"> <input style="width:100%"  name="mancc" type="text" value="<%=obj.getMa()%>" >  </td>
				                        </tr>
				                        
				                        <tr>
				                            <td width="300px"> Tên ncc  </td>
				                            <td width="300px"> <input style="width:100%"  name="tenncc" type="text" value="<%=obj.getTennhacungcap() %>" >  </td>
				                        </tr>
				                        
				                        <tr>
				                            <td width="300px"> Điện thoại ncc </td>
				                            <td width="300px"> <input style="width:100%" type="text" name="dienthoaincc" value="<%=obj.getDienthoainhacungcap()%>">  </td>
				                        </tr>
				                        
				                        <tr>
				                            <td width="300px"> Địa chỉ ncc  </td>
				                            <td width="300px"> <input style="width:100%" type="text" name="diachincc" value="<%=obj.getDiachinhacungcap()%>">  </td>
				                        </tr>
				                        
				                        <tr>
				                         	<td>
				                         	
				                         	</td>   
				                            <td width="300px">
				                            	<A href="javascript:savenhacungcap()"> <IMG src="../images/1455966997_save.png" title="Save" alt="Save" border="1px" style="border-style: outset"> Lưu nhà cung cấp</A>
				                            	
				                            	<a href="javascript:dropdowncontent.hidediv('ndGhiChu')"  > <IMG src="../images/exit_1.png" title="Close" alt="Close" border="1px" style="border-style: outset"> Đóng tab </a>
				                            	  
				                             </td>
				                        </tr> 
		                            	
				                    	</table>
					                     
				            		</DIV>   
								</TD>
							
								   

							</tr>



						</TABLE>

						<div align="left" style="width: 100%; float: none; clear: none;">
							<TABLE class="tabledetail" width="100%" border="0"
								cellpadding="2" cellspacing="2" style="font-size: 14px;">
								<TR class="tbheader">
									<TH align="center" width="2%">STT</TH>

									<TH align="center" width="10%">Mã hàng mua</TH>
									<TH align="center" width="15%">Tên hàng mua</TH>

									<TH align="center" width="5%">ĐVT</TH>
									<TH align="center" width="5%">Số lượng</TH>
									<TH align="center" width="10%">Đơn giá</TH>

									<TH align="center" width="10%">Thành tiền</TH>

								</TR>

								<% 
							
							int i=0 ;
							for(  i=0;i<listsp.size();i++) {
								Isanpham sp=listsp.get(i);
								
								%>
								<TR>
									<Td align="center"><%=i%></Td>

									<Td align="center" width="10%"><input type="hidden"
										name="idsp" value="<%=sp.getId()%>"> <input
										type="text" name="masp" value="<%=sp.getMasanpham()%>"
										onkeyup="ajax_showOptions(this,'donmuahang',event)"
										AUTOCOMPLETE="off"></Td>
									<Td align="center" width="15%"><input type="text"
										name="tensp" value="<%=sp.getTensanpham()%>"></Td>

									<Td align="center" width="5%"><input type="text"
										name="dvt" value="<%=sp.getDonvitinh()%>">
									</Td>
									<Td align="center" width="5%"><input type="text"
										name="soluong" value="<%=sp.getSoluong()%>">
									</Td>
									<Td align="center" width="10%"><input type="text"
										name="dongia" value="<%=sp.getDongia()%>">
									</Td>

									<Td align="center" width="10%"><input type="text"
										name="thanhtien" value="<%=sp.getThanhtien()%>">
									</Td>

								</TR>

								<%
								}
								%>


								<!-- trường hợp list không có danh sách thì khởi tạo 1 list trống -->
								<%
							 
							 for(  i=listsp.size();i<listsp.size()+20 ;i++) {
								 
								
								%>
								<TR>
									<Td align="center" width="30px"><%=i %></Td>

									<Td align="center" width="10%"><input type="hidden"
										name="idsp" value=""> <input type="text" name="masp"
										value="" onkeyup="ajax_showOptions(this,'donmuahang',event)"
										AUTOCOMPLETE="off"></Td>
									<Td align="center" width="15%"><input type="text"
										name="tensp" value=""></Td>

									<Td align="center" width="5%"><input type="text"
										name="dvt" value="">
									</Td>
									<Td align="center" width="5%"><input type="text"
										name="soluong" value="">
									</Td>
									<Td align="center" width="10%"><input type="text"
										name="dongia" value="">
									</Td>

									<Td align="center" width="10%"><input type="text"
										name="thanhtien" value="">
									</Td>

								</TR>

								<%
								}
								%>

							</TABLE>
						</div>
						<hr>
					</div>

				</fieldset>
			</div>
		</div>


		<%
			obj.DBclose();
		%>
		<script type="text/javascript">
			replaces();
			dropdowncontent.init("noidungGhiChu", "right-botom", 500, "click");
		</script>
	</form>
</BODY>
</html>