<%@page import="geso.erp.beans.donmuahang_tan.*"%>
<%@page import="geso.erp.beans.nhacungcap.INhacungcapList"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page  import = "java.util.Iterator" %>
<%@ page  import = "java.util.List" %>
<%@ page  import = "java.util.ArrayList" %>
<%@ page  import = "geso.erp.beans.donmuahang_tan.*" %>
<%@ page  import = "java.sql.ResultSet" %>
<%@ page  import = "java.text.DecimalFormat" %>
<%@ page  import = "java.text.NumberFormat" %>
<%
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
 
	  %>
<% IDonmuahangList_tan obj = (IDonmuahangList_tan)session.getAttribute("obj"); %>

<%
	ResultSet dataList = (ResultSet)obj.getDataList();
	ResultSet listKH = (ResultSet) obj.getListNCC();
%>
<% obj.setNextSplittings(); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SalesUp - Project</title>
	<META http-equiv="Content-Type" content="text/html; charset=utf-8">
	<META http-equiv="Content-Style-Type" content="text/css">
    <LINK rel="stylesheet" type="text/css" media="print" href="../css/impression.css">
    <LINK rel="stylesheet" href="../css/main.css" type="text/css">
    <LINK rel="stylesheet" href="../css/datepicker.css" type="text/css">
    
    <script language="javascript" src="../scripts/datepicker.js"></script>
   	<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css"/>
  	<script type="text/javascript" src="../scripts/Timepicker/jquery.min.js"></script>
  	<script type="text/javascript" src="../scripts/Timepicker/jquery-ui.min.js"></script>
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
	 
	 
	 
	 function clearform()
	 {   
		 View('erpDmhForm', 1, 'refresh');
	   
	    document.forms["erpDmhForm"].trangthai.value = "";
	    document.forms["erpDmhForm"].ma.value = "";

	    document.forms["erpDmhForm"].submit();
	 } 
	 function thongbao()
	 {
		 var tt = document.forms["erpDmhForm"].msg.value;
	 	 if(tt.length>0)
	     	alert(document.forms["erpDmhForm"].msg.value);
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
<form name="erpDmhForm" method="post" action="../../DonmuahangListSvl_tan">
<input type="hidden" name="userId" value="<%=userId %>" >
<input type="hidden" name="action" value="1" >
<input type="hidden" name="crrApprSplitting" value="<%= obj.getCrrApprSplitting() %>" >
<input type="hidden" name="nxtApprSplitting" value="<%= obj.getNxtApprSplitting() %>" >

<input type="hidden" name="msg" value='<%= obj.getMsg() %>'>
<script language="javascript" type="text/javascript">
    thongbao();
</script> 

<div id="main" style="width:100%; padding-left:2px">
	<div align="left" id="header" style="width:100%; float:none">
    	<div style="width:70%; padding:5px; float:left" class="tbnavigation">
        	Danh sách ĐƠN MUA HÀNG
        </div>
        <div align="right" style="padding:5px" class="tbnavigation">
        	Chào mừng Bạn <%= userTen %> &nbsp;
        </div>
    </div>
     <div align="left" id="button" style=" border:1;width: 100%; height: 32px; padding: 1px; float: none"  class="tbdarkrow">
			
			<TABLE  border="0" cellpadding="0" cellspacing="0">
								<TR class = "tbdarkrow">
									 
									 <TD width="40px" align="left">
									
									<span id="btnthem">	
										<A href="javascript:taomoi()"> <IMG
										src="../images/add32.png" title="Tìm kiếm" alt="Tìm kiếm" border="1px" style="border-style: outset;width: 25px;height: 25px"></A> 
									</span>
									
									</TD>
																		 
									<TD width="30px" align="left">
									<span id="btnUndo">	
										  <A href="javascript:clearform()"> <IMG  
										  src="../images/convert.gif" title="Undo" alt="Undo" border="1px" style="border-style: outset;width: 25px;height: 25px"></A>
									</span>
									</TD>
									
									<td width="30px" align="left">
									<A href="javascript:submitform()"> <IMG
										src="../images/timkiem_e.png" title="Tìm kiếm" alt="Tìm kiếm" border="1px" style="border-style: outset"></A>
									</td>
									<td width="30px" align="left">
									<A href="javascript:print_pdf()">
										<IMG src="../images/pdf.jpg" title="In báo cáo" alt="In báo cáo" 
											border="1px" style="border-style: outset ;width:30px;height: 30px" >
									</A>
									</td>
									  
								 
								</TR>
								</TABLE>
				   			
					 
			</div>
    <div>
    	
    	
	               
    	
    </div>
  	<div id="cotent" style="width:100%; float:none">
  			
    	 
        <div align="left" style="width:100%; float:none; clear:left; font-size:0.7em">
        	<fieldset>
            	<legend><span class="legendtitle"> ĐƠN MUA HÀNG </span>&nbsp;&nbsp;
            	 
                </legend>
                
                		 <LEGEND class="legendtitle">Tiêu chí tìm kiếm &nbsp;</LEGEND>
							<TABLE  width="100%" cellpadding="6" cellspacing="0">
								<tr>
								  	<TD class="plainlabel">Mã MH     </TD>
								    <TD class="plainlabel"><input type="text" name="txtMaMH" style="width:200px" onchange="submitform()" value="<%=obj.getMamuahang()%>"></TD>
								</tr>
								<tr>
								  	<TD class="plainlabel">Nhà cung cấp</TD>
								    <td class="plainlabel">
								    <select name="cbNhacungcap" onchange="submitform()" style="width:200px">
				                    	<option value="" > </option> 
								    <%
				                        while(listKH.next()){
				                        	if(obj.getNhacungcap().trim().equals(listKH.getString("NHACUNGCAP"))){
												%>
													<option selected="selected" value="<%=listKH.getString("NHACUNGCAP")%>"> <%=listKH.getString("TEN") %> </option>
												<%
												}else{
												%>
													<option value="<%=listKH.getString("NHACUNGCAP")%>"> <%=listKH.getString("TEN")%> </option>
												<%
				                        	   }
				                        	   
				                           }
				                    	%>
                    				</select>
                    				</td>
						      	</TR>
								<tr>
								  	<TD class="plainlabel">Trạng thái</TD>
								    <td class="plainlabel">  <%
				                            String mang[] =new String[]{"0","1", "2"};
				                    		String mangten[] =new String[]{"Chưa chốt","Đã chốt", "Đã xóa"};
				                    	%>                     
				                    	<select name="cbTrangthai"  onchange="submitform()" style="width:200px">
				                    	 <option value="">  </option> 
				                    	<%
				                    	for(int j=0;j<mang.length;j++){
											 if(obj.getTrangthai().trim().equals(mang[j])){
											 %>
											 <option selected="selected" value="<%=mang[j]%>"> <%=mangten[j] %> </option>
											 <%
											 }else{
											 %>
											 <option value="<%=mang[j]%>"> <%=mangten[j] %> </option>
											 <% 
											 }
										 }
				                    	%>
                    					</select>
                    				</td>
						      	</TR>
						      	
						     </TABLE>
                
            	<TABLE width="100%" border="1" cellspacing="1" cellpadding="4">
					<TR class="tbheader">
					 	<!-- <TH align="center" width="4%">Số đề nghị mua hàng</TH> -->
					 	<TH align="center" width="2%">STT </TH>
					 	<TH align="center" width="5%">MÃ MH </TH>
	                    <TH align="center" width="8%">NGÀY CHỨNG TỪ </TH>
	                    <TH align="center" width="10%">NHÀ CUNG CẤP</TH>
	                    <TH align="center" width="10%">TRẠNG THÁI</TH>
	                    <TH align="center" width="10%">TỔNG TIỀN</TH>
	                    <TH align="center" width="8%">NGÀY TẠO</TH>
	                    <TH align="center" width="8%">NGƯỜI TẠO</TH>
	                    <TH align="center" width="8%">TÁC VỤ</TH>
	                </TR>	                
					<%
					int m = 0;
	                    
                   		if(dataList != null)
                   		{
                   			while(dataList.next())
                   			{  		
                   				String style="";
                   				if((m % 2 ) == 0) { %>
		                         	<TR class='tbdarkrow'  >
		                        <%}else{ %>
		                          	<TR class='tblightrow' >
		                        <%} %>
		                        	<TD align="center" style="font-weight: bold"> <%= (m+1) %></TD>
				                    <TD align="center"><%= dataList.getString("MAMH") %></TD>
				                    <TD align="center"><%= dataList.getString("NGAYCHUNGTU") %></TD>
				                    <TD align="center"><%= dataList.getString("TEN") %></TD>
				                    <%String tt = dataList.getString("TRANGTHAI");
				                   		 if(tt.equals("1")){ %>	
				                    <TD align="center" style="color: blue; font-weight: bold">
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
				                    <TD align="center"><%= dataList.getString("TONGTIEN") %></TD>
				                    <TD align="center"><%= dataList.getString("NGAYTAO") %></TD>
				                    <TD align="center"><%= dataList.getString("NGUOITAO") %></TD>	
				                    <TD align="center">
					                    <A href = "../../DonmuahangNewSvl_tan?userId=<%=userId%>&display=<%= dataList.getString("MaMH") %>">
						                    <IMG src="../images/Display20.png" alt="Hiển thị" title="Hiển thị" border=0>
					                    </A>&nbsp;
				                    <% if(tt.equals("0") || tt.equals("1")){ %>
		                               <A href = "../../DonmuahangNewSvl_tan?userId=<%=userId%>&update=<%= dataList.getString("MaMH")%>">
		                               		<IMG src="../images/edit32.png" width="20" height="20"  
		                               		alt="Cap nhat" title="Cập nhật" border=0>
										</A>&nbsp;
                                		<A id='chotphieu<%=dataList.getString("MaMH")%>'href="">
                                			<img src="../images/Chot.png" alt="Chốt" width="20" height="20" 
                                			title="Chốt" border="0" 
                                			onclick="if(!confirm('Bạn có muốn chốt đơn hàng này?')){ 
                                						return false;
                                					}else{ 
                                						processing('<%="chotphieu"+dataList.getString("MaMH")%>', 
                                						'../../DonmuahangListSvl_tan?userId=<%=userId%>&chot=<%= dataList.getString("MaMH")%>');
                                					}"  >
										    </A>
                                		<A href = "../../DonmuahangListSvl_tan?userId=<%=userId%>&delete=<%= dataList.getString("MaMH") %>">
											<img src="../images/DeleteRed_32.png" width="20" height="20" border=0 
                                					 alt="Xóa" title="Xóa" onclick="if(!confirm('Bạn muốn xóa đơn hàng này?')) return false;">
                                		</A>&nbsp;
                                	<%} %>
			                    	</TD>
				                </TR>
		                     <% m++; } dataList.close(); } %>
		                     
		                     <tr class="tbfooter" > 
						 <TD align="center" valign="middle" colspan="13" class="tbfooter">
						 	<%if(obj.getNxtApprSplitting() >1) {%>
								<img alt="Trang Dau" src="../images/first.gif" style="cursor: pointer;" onclick="View('erpDmhForm', 1, 'view')"> &nbsp;
							<%}else {%>
								<img alt="Trang Dau" src="../images/first.gif" > &nbsp;
								<%} %>
							<% if(obj.getNxtApprSplitting() > 1){ %>
								<img alt="Trang Truoc" src="../images/prev.gif" style="cursor: pointer;" onclick="Prev('erpDmhForm', 'prev')"> &nbsp;
							<%}else{ %>
								<img alt="Trang Truoc" src="../images/prev_d.gif" > &nbsp;
							<%} %>
							
							<%
								int[] listPage = obj.getNextSplittings();
							 if(listPage!=null){
								for(int i = 0; i < listPage.length; i++){
							%>
							
							<% 							
							
							if(listPage[i] == obj.getNxtApprSplitting()){ %>
							
								<a  style="color:white;"><%= listPage[i] %>/ <%=obj.getTheLastSplitting() %></a>
							<%}else{ %>
								<a href="javascript:View('erpDmhForm', <%= listPage[i] %>, 'view')"><%= listPage[i] %></a>
							<%} %>
								<input type="hidden" name="list" value="<%= listPage[i] %>" />  &nbsp;
							<%}
								}%>
							
							<% if(obj.getNxtApprSplitting() < obj.getTheLastSplitting()){ %>
								&nbsp; <img alt="Trang Tiep" src="../images/next.gif" style="cursor: pointer;" onclick="Next('erpDmhForm', 'next')"> &nbsp;
							<%}else{ %>
								&nbsp; <img alt="Trang Tiep" src="../images/next_d.gif" > &nbsp;
							<%} %>
							<%if(obj.getNxtApprSplitting() == obj.getTheLastSplitting()) {%>
						   		<img alt="Trang Cuoi" src="../images/last.gif" > &nbsp;
					   		<%}else{ %>
					   			<img alt="Trang Cuoi" src="../images/last.gif" style="cursor: pointer;" onclick="View('erpDmhForm', -1, 'view')"> &nbsp;
					   		<%} %>
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