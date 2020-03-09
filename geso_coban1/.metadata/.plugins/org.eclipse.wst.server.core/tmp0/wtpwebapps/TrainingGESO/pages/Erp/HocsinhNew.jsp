<%@ page import="java.sql.ResultSet"%>
<%@ page import="geso.training.bean.hocsinh.IhocSinh"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//Lấy giá trị session 
	IhocSinh obj = (IhocSinh) session.getAttribute("hocsinh");
	//Lấy thông tin người dùng
	String userId = (String) session.getAttribute("userId");
	String userName = (String) session.getAttribute("userTen");
	//Lấy danh sách lớp
	ResultSet Rslop = obj.getRsLop();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SalesUp - Project</title>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK rel="stylesheet" type="text/css" media="print"
	href="../css/impression.css">
<LINK rel="stylesheet" href="../css/main.css" type="text/css">
<link type="text/css" rel="stylesheet" href="../css/mybutton.css">
<script type="text/javascript" src="../scripts/jquery.min.1.7.js"></script>
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
	})
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
	function saveform() {
		var number=document.getElementById("tenhocsinh").value;  
		var malop=document.getElementById("optionchonlop").value;  
		
		if(number=="" || malop=="")
		{
			alert("Bạn chưa nhập tên hoặc lớp");  
			
		}
		else{
			document.forms["hocsinhlist"].action.value = "luumoi";
			document.forms["hocsinhlist"].submit();
		}
	}
	function editform() {
		document.forms["hocsinhlist"].action.value = "chinhsua";
		document.forms["hocsinhlist"].submit();
	}
</script>
</head>
<body>
	<form name="hocsinhlist" method="post" action="../../HocSinhUpdateSvl">
		<input type="hidden" name="action" value="1">
		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 100%; padding: 5px; float: left"
					class="tbnavigation">Quản lí học sinh</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Chào mừng Bạn
					<%=userName%>
				</div>
			</div>
		</div>
		<div id="cotent" style="width: 100%; float: none">
			<div align="left"
				style="width: 100%; float: none; clear: left; font-size: 0.7em">
				<fieldset>
					<LEGEND class="legendtitle">Tiêu chí tìm kiếm &nbsp;</LEGEND>
					
					<% if(obj.getMaHS()==""){
					%>
				<A href="javascript:saveform()"> <IMG
						src="../images/1455966997_save.png" title="Save" alt="Save"
						border="1px" style="border-style: outset">
					</A> <a> </a>
					<%
						} else {%>
							<A href="javascript:editform()"> <IMG src="../images/Save30.png" title="Edit" alt="Edit" border="1px"
									style="border-style: outset">
								</A><% 
						}
						%>


					<TABLE width="100%" cellpadding="6" cellspacing="0">
						<tr>
							<TD class="plainlabel">Tên lớp</TD>
							<TD class="plainlabel"><select name="lop" id="optionchonlop" 
								style="width: 200px">
									<option selected="selected" value="">Chọn lớp</option>
									<%
										//Hiện danh sách lớp
										if (Rslop != null) 
										{
											while (Rslop.next()) 
											{
												if (obj.getMaLop().equals(Rslop.getString("PK_SEQ"))) 
												{
													%>
									<option selected="selected"
										value="<%=Rslop.getString("PK_SEQ")%>">
										<%=Rslop.getString("TENLOP")%></option>
									<%
												} else {
													%>
									<option value="<%=Rslop.getString("PK_SEQ")%>"><%=Rslop.getString("TENLOP")%>
									</option>
									<%
														}
											}}
													%>
							</select></TD>
						</tr>
						<tr>
							<td><input type="text" value="<%=obj.getTenHS()%>"
								name="tenhocsinh" id="tenhocsinh"></td>
						</tr>

					</TABLE>
				</fieldset>
			</div>
		</div>
	</form>
</body>
</html>
<%
	obj.DBClose();
%>
