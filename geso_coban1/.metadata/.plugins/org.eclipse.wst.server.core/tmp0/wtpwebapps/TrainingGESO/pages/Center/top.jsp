<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page  import = "geso.dms.center.util.*" %>
<%	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
	String sum = (String) session.getAttribute("sum");
	Utility util = (Utility) session.getAttribute("util");
	if(!util.check(userId, userTen, sum)){
		response.sendRedirect("/Canfoco/index.jsp");
	}else{ %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<TITLE>&nbsp;</TITLE>

<META http-equiv="Content-Type" content="text/html; charset=utf-8">

<META http-equiv="Content-Style-Type" content="text/css">

<LINK rel="stylesheet" href="../css/main.css" type="text/css">
<script src="../scripts/jquery-1.8.1.js" type="text/javascript"></script>
<SCRIPT type="text/javascript">
 function submitform()
{
    document.forms["logoutForm"].submit();
}
</SCRIPT>
<script type="text/javascript">
var flag = true;
function abc()
{
	flag = false;
}

function Khoaso()
{
	var flag = document.getElementById('khoaso');
	flag.src = flag.src;

}
function confirmMe()
{
if(flag)
	 {
		$(window).bind('unload', function(){	
		   $.ajax({
		    cache: false,
		    async: false,
		    dataType: "script",
		        url: "../../ThongbaoAjax"
		    });
		}); 
	 }

}
</script>
</HEAD>
<BODY leftmargin="0" bottommargin="0" topmargin="0" rightmargin="0"  onbeforeunload="confirmMe()">

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">

	<TR bgcolor="#FFFFFF">
		<TD width="13%"  align="right" valign="middle" >
			<img src="../images/Canfoco.jpg" align="right" height = "40" width = "60">
		</TD>
		<TD align="right" valign="middle" class="blanc" >
		<table align="right">
			<tr>
				<td>&nbsp;
				</td>
				<td align="right">
					<A href="../../LogoutSvl" target="_parent" style="font-weight: bold;" >Đăng xuất &nbsp;&nbsp;</A>
					<A href="../../LoginSvl" onclick = "abc();" target="_parent" style="font-weight: bold;">Đổi mật khẩu &nbsp;&nbsp;</A>
				</td>
			</tr>
			<tr>
				<td align="left"><span style="text-align: left; font-size: 0.7em">
					<!-- <iframe  style="width: 300px ;height: 20px" id = "khoaso" src = "counter.jsp" frameborder="0" scrolling="no"> </iframe> -->
				</span></td>
				<td>&nbsp;</td>
			</tr>
		</table>
		</TD>
	</TR>
	
	
</TABLE>

</BODY>
</HTML>

<%}%>