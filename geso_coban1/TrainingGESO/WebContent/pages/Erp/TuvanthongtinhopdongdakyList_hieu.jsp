

<%@page import="geso.erp.beans.Tuvanthongtinhopdongdaky_hieu.imp.TuvanthongtinhopdongdakyList"%>
<%@page import="geso.erp.beans.Tuvanthongtinhopdongdaky_hieu.ITuvanthongtinhopdongdakyList"%>
<%@page import="geso.erp.beans.Dinhhuongthitruong_hieu.IDinhhuongthitruongList_hieu"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.Iterator"%>


<%@ page import="java.sql.ResultSet"%>

<%
	String userId = (String) session.getAttribute("userId");
	String userTen = (String) session.getAttribute("userTen");
%>
<%
	ITuvanthongtinhopdongdakyList obj = (TuvanthongtinhopdongdakyList) session.getAttribute("obj");
%>

<%
	ResultSet dataList = (ResultSet) obj.getDataList();
%>
<%
	ResultSet dataListck = (ResultSet) obj.getRsck();
	
%>


<%
	obj.setNextSplittings();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SalesUp - Project</title>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK rel="stylesheet" type="text/css" media="print"
	href="../css/impression.css">
<LINK rel="stylesheet" href="../css/main.css" type="text/css">
<LINK rel="stylesheet" href="../css/datepicker.css" type="text/css">

<script language="javascript" src="../scripts/datepicker.js"></script>
<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../scripts/Timepicker/jquery.min.js"></script>
<script type="text/javascript"
	src="../scripts/Timepicker/jquery-ui.min.js"></script>
<script type="text/javascript" src="../scripts/phanTrang.js"></script>


<script type="text/javascript" src="../scripts/jquery.min.js"></script>
<script type="text/javascript" src="../scripts/speechbubbles.js"></script>
<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>


<script type="text/javascript" src="../scripts/jquery.js"></script>

<script type="text/javascript" src="../scripts/jquery.min.1.7.js"></script>
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

<script type="text/javascript" src="..scripts/jquery-1.js"></script>
<link type="text/css" rel="stylesheet" href="../css/mybutton.css">
<script type="text/javascript">
        $(document).ready(function(){
            $(".button").hover(function(){
                $(".button img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
		$(document).ready(function(){
            $(".button2").hover(function(){
                $(".button2 img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
		$(document).ready(function(){
            $(".button3").hover(function(){
                $(".button3 img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
    </script>
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script>
	     $(document).ready(function() { $("select").select2();  });	     
	</script>

<SCRIPT language="javascript" type="text/javascript">
	 function confirmLogout()
	 {
	    if(confirm("Bạn có muốn đăng xuất?"))
	    {
			top.location.href = "home.jsp";
	    }
	    return
	 }
	 function submitform()
	 {  
		 //javascrip:
		document.forms["erpDmhForm"].action.value = "timkiem";
	    document.forms["erpDmhForm"].submit();
	 }
	 function taomoi()
	 {   
		 
		document.forms["erpDmhForm"].action.value = "taomoi";
	    document.forms["erpDmhForm"].submit();
	 }
	 function print_pdf()
	 {   
		document.forms["erpDmhForm"].action.value = "print";
	    document.forms["erpDmhForm"].submit();
	 }
	 function print_excel()
	 {   
		document.forms["erpDmhForm"].action.value = "printexcel";
	    document.forms["erpDmhForm"].submit();
	 }
	 
	 
	 
	 function clearform()
	 {   
		 
		document.forms["erpDmhForm"].action.value = "timkiem";
	    document.forms["erpDmhForm"].trangthai.value = "";
	    document.forms["erpDmhForm"].sohopdong.value = "";
	    document.forms["erpDmhForm"].submit();
	 } 
	 function thongbao()
	 {
		 var tt = document.forms["erpDmhForm"].msg.value;
	 	 if(tt.length>0)
	     	alert("THONG BAO LOI"+document.forms["erpDmhForm"].msg.value);
	 }
	 

	 function processing(id,chuoi)
	 {
	 
 	    document.getElementById(id).innerHTML = "<a href='#'><img src='../images/waiting.gif' width = '20' height = '20' title='cho thuc hien..' border='0' longdesc='cho thuc hien..' style='border-style:outset'> Proc...</a>"; 		  
 	 	document.getElementById(id).href=chuoi;
 	 }
	 
	 function processing_hoantat(id,id_lydo)
	 {
		var lydo=document.getElementById(id_lydo).value;
		document.forms["erpDmhForm"].action.value="hoantatphieu";
		
		document.forms["erpDmhForm"].lydohoantat_.value =lydo;
		document.forms["erpDmhForm"].idhoantat_.value =id;
	    document.forms["erpDmhForm"].submit();
 	 }
	 
	</SCRIPT>
</head>
<body>
	<form name="erpDmhForm" method="post" action="../../TuvanthongtinhopdongdakyListSvl_hieu">
		<input type="hidden" name="userId" value="<%=userId%>"> <input
			type="hidden" name="action" value="muonlamgithidanhvaoday"> <input
			type="hidden" name="crrApprSplitting"
			value="<%=obj.getCrrApprSplitting()%>"> <input type="hidden"
			name="nxtApprSplitting" value="<%=obj.getNxtApprSplitting()%>">
		<input type="hidden" name="msg" value='<%=obj.getmsg()%>'>

		<script language="javascript" type="text/javascript">
    thongbao();
</script>

		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 70%; padding: 5px; float: left"
					class="tbnavigation">Trang Tiến Hành Hợp Đồng</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Chào mừng Bạn
					<%=userTen%>
					&nbsp;
				</div>
			</div>
			<div align="left" id="button"
				style="border: 1; width: 100%; height: 32px; padding: 1px; float: none"
				class="tbdarkrow">

				<TABLE border="0" cellpadding="0" cellspacing="0">
					<TR class="tbdarkrow">

						<TD width="40px" align="left"><span id="btnthem"> <A
								href="javascript:taomoi()"> <IMG src="../images/add32.png"
									title="Tạo mới" alt="Tạo mới" border="1px"
									style="border-style: outset; width: 25px; height: 25px">
							</A> </span></TD>

						<TD width="30px" align="left"><span id="btnUndo"> <A
								href="javascript:clearform()"> <IMG
									src="../images/convert.gif" title="Nhập lại" alt="Nhập lại"
									border="1px"
									style="border-style: outset; width: 25px; height: 25px">
							</A> </span></TD>
						
						


					</TR>
				</TABLE>


			</div>
			<div></div>
			<div id="cotent" style="width: 100%; float: none">


				<div align="left"
					style="width: 100%; float: none; clear: left; font-size: 0.7em">
					<fieldset>
						<legend>
							<span class="legendtitle"> Trang tiến hành hợp đồng</span>&nbsp;&nbsp;

						</legend>

						<LEGEND class="legendtitle">Tiêu chí tìm kiếm &nbsp;</LEGEND>
						<TABLE width="100%" cellpadding="6" cellspacing="0">
							<tr>
								<TD class="plainlabel">Mã</TD>
								<TD class="plainlabel"><input type="text" name="ma"
									style="width: 200px" onchange="submitform()"
									value="<%=obj.getId()%>"></TD>
							</tr>
						<tr>
								<TD class="plainlabel">Số hợp đồng</TD>
								<TD class="plainlabel"><select name="sohopdong"
									onchange="submitform()" style="width: 200px">
										<option></option>
										<%
											if (dataListck != null) {
												while (dataListck.next()) {
													if (dataListck.getString("pk_seq").equals(
															obj.getSohopdong())) {
										%>
										<option value="<%=dataListck.getString("pk_seq")%>"
											selected="selected"><%=dataListck.getString("sohopdong")%>
										</option>
										<%
											} else {
										%>
										<option value="<%=dataListck.getString("pk_seq")%>"><%=dataListck.getString("sohopdong")%>
										</option>
										<%
											}
												}
										%>
										<%
											}
										%>

								</select></TD>

							</tr>
							<tr>
								<TD class="plainlabel">Trạng thái</TD>
								<td class="plainlabel">
									<%
										String mang4[] = new String[]{"0", "1", "2"};
										String mangten4[] = new String[]{"Chưa chốt", "Đã chốt", "Đã xóa"};
									%> <select name="trangthai" onchange="submitform()"
									style="width: 200px">
										<option value=""></option>
										<%
											for (int j = 0; j < mang4.length; j++) {
												if (obj.getTrangthai().trim().equals(mang4[j])) {
										%>
										<option selected="selected" value="<%=mang4[j]%>">
											<%=mangten4[j]%>
										</option>
										<%
											} else {
										%>
										<option value="<%=mang4[j]%>">
											<%=mangten4[j]%>
										</option>
										<%
											}
											}
										%>
								</select></td>
							</TR>

						</TABLE>

						<TABLE width="100%" border="1" cellspacing="1" cellpadding="4">
							<TR class="tbheader">
								<!-- <TH align="center" width="4%">Số đề nghị chuyển kho</TH> -->
								<TH align="center" width="5%">Mã</TH>
								<TH align="center" width="5%">Số hợp đồng</TH>
								<TH align="center" width="5%">Chuẩn bị</TH>
								<TH align="center" width="27%">Ngày phỏng vấn</TH>
								<TH align="center" width="5">Giờ phỏng vấn</TH>
								<TH align="center" width="5%">Ngày nhập học dự kiến</TH>
								<TH align="center" width="20%">Ngày tạo</TH>
								<TH align="center" width="5%">Người tạo</TH>
								<TH align="center" width="5%">Trạng thái</TH>
								<TH align="center" width="13%">Tác vụ</TH>
							</TR>
							<%
								int m = 0;

								if (dataList!= null) {

									while (dataList.next()) {
										String style = "";

										if ((m % 2) == 0) {
							%>
							<TR class='tbdarkrow'>
								<%
									} else {
								%>
							
							<TR class='tblightrow'>
								<%
									}
								%>

								<TD align="center"><%=dataList.getString("ma")%></TD>
								<TD align="center"><%=dataList.getString("sohopdong")%></TD>
								<TD align="center"><%=dataList.getString("chuanbi")%></TD>
								<TD align="center"><%=dataList.getString("ngayphongvan")%></TD>
								<TD align="center"><%=dataList.getString("giophongvan")%></TD>
								<TD align="center"><%=dataList.getString("ngaynhaphocdukien")%></TD>
								<TD align="center"><%=dataList.getString("ngaytao")%></TD>
								<TD align="center"><%=dataList.getString("nguoitao")%></TD>
								
								 <%String tt = dataList.getString("TRANGTHAI");
				                   		 if(tt.equals("1")){ %>	
				                    <TD align="center" style="color: blue">
				                    <%} else if(tt.equals("2")){ %>
				                    <TD align="center" style="color: red">
				                    	<%}else{%>
				                    		<TD align="center">
				                    	<%}
				                    		 String Trangthai="";
					                    		if(tt.equals("0"))
					                    		{
					                    			Trangthai = "Chưa chốt";
					                    		 	 
					                    		}
					                    		else  if(tt.equals("1"))
					                    				Trangthai = "Đã chốt";
					                    		else   if(tt.equals("2")){
		                    						Trangthai = "Đã xóa";
		                    				}
				                    		 
				                    	%>
				                    	<%= Trangthai %>
				                    </TD>	
								
								<TD align="center"><A
									href="../../TuvanthongtinhopdongdakyUpdateSvl_hieu?userId=<%=userId%>&display=<%=dataList.getString("ma")%>">
										<IMG src="../images/Display20.png" alt="Hiển thị"
										title="Hiển thị" border=0> </A>&nbsp; <%
 								if (tt.equals("0")) {
 									%> <A
									href="../../TuvanthongtinhopdongdakyListSvl_hieu?userId=<%=userId%>&delete=<%=dataList.getString("ma")%>">
										<img src="../images/DeleteRed_32.png" width="20" height="20"
										border=0 name=delete alt="Xóa" title="Xóa"> </A>&nbsp; <A
									href="../../TuvanthongtinhopdongdakyUpdateSvl_hieu?userId=<%=userId%>&update=<%=dataList.getString("ma")%>">
										<img src="../images/edit32.png" width="20" height="20"
										alt="Cap nhat" title="Cập nhật" border=0> </A>&nbsp; <A
									href="../../TuvanthongtinhopdongdakyListSvl_hieu?userId=<%=userId%>&chot=<%=dataList.getString("ma")%>">
										<img src="../images/Chot.png" alt="Chốt" width="20"
										height="20" title="Chốt" border="0" name=chot alt="Chốt"
										title="Chôt"> </A>&nbsp; <%
 	}
 %>
								</TD>
							</TR>
							<%
								m++;
									}
									dataList.close();
								}
							%>

							<tr class="tbfooter">
								<TD align="center" valign="middle" colspan="13" class="tbfooter">
									<%
										if (obj.getNxtApprSplitting() > 1) {
									%> <img alt="Trang Dau" src="../images/first.gif"
									style="cursor: pointer;"
									onclick="View('erpDmhForm', 1, 'view')"> &nbsp; <%
 	} else {
 %> <img alt="Trang Dau" src="../images/first.gif"> &nbsp; <%
 	}
 %> <%
 	if (obj.getNxtApprSplitting() > 1) {
 %> <img alt="Trang Truoc" src="../images/prev.gif"
									style="cursor: pointer;" onclick="Prev('erpDmhForm', 'prev')">
									&nbsp; <%
 	} else {
 %> <img alt="Trang Truoc" src="../images/prev_d.gif"> &nbsp; <%
 	}
 %> <%
 	int[] listPage = obj.getNextSplittings();
 	if (listPage != null) {
 		for (int i = 0; i < listPage.length; i++) {
 %> <%
 	if (listPage[i] == obj.getNxtApprSplitting()) {
 %> <a style="color: white;"><%=listPage[i]%>/ <%=obj.getTheLastSplitting()%></a>
									<%
										} else {
									%> <a
									href="javascript:View('erpDmhForm', <%=listPage[i]%>, 'view')"><%=listPage[i]%></a>
									<%
										}
									%> <input type="hidden" name="list" value="<%=listPage[i]%>" />
									&nbsp; <%
 	}
 	}
 %> <%
 	if (obj.getNxtApprSplitting() < obj.getTheLastSplitting()) {
 %> &nbsp; <img alt="Trang Tiep" src="../images/next.gif"
									style="cursor: pointer;" onclick="Next('erpDmhForm', 'next')">
									&nbsp; <%
 	} else {
 %> &nbsp; <img alt="Trang Tiep" src="../images/next_d.gif">
									&nbsp; <%
 	}
 %> <%
 	if (obj.getNxtApprSplitting() == obj.getTheLastSplitting()) {
 %> <img alt="Trang Cuoi" src="../images/last.gif"> &nbsp; <%
 	} else {
 %> <img alt="Trang Cuoi" src="../images/last.gif"
									style="cursor: pointer;"
									onclick="View('erpDmhForm', -1, 'view')"> &nbsp; <%
 	}
 %>
								</TD>
							</tr>
						</TABLE>

					</fieldset>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
<%
	obj.DBclose();
%>