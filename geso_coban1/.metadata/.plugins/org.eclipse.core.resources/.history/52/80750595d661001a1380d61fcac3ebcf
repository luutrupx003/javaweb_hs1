<%@page import="geso.dms.center.util.Utility"%>
<%@page import="geso.erp.util.Utility_Kho"%>
<%@page import="geso.erp.db.sql.dbutils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page  import = "java.sql.ResultSet" %>
<%@ page import = "java.net.URLDecoder" %>
<%
	dbutils db =new dbutils();
	try
	{
		String command ="";
		command = " select distinct a.ma, a.ten, 0 as dongia, isnull(b.donvi, 'Chua xac dinh') as donvi"
				 +"\n	from ERP_SANPHAM a left join donvidoluong b on a.dvdl_fk = b.pk_seq ";
		
		
	
		
		System.out.println("San pham:"+ command);
		

		response.setHeader("Content-Type", "text/html");
		request.setCharacterEncoding("UTF-8");
		
	   	String query = (String)request.getQueryString(); 
	   	
	   	query = new String(query.substring(query.indexOf("&letters=") + 9, query.length()).getBytes("UTF-8"), "UTF-8");
	   	query = URLDecoder.decode(query, "UTF-8").replace("+", " ");
	   	
	   	Utility Ult = new Utility();
	   	query = Ult.replaceAEIOU(query);
		
		ResultSet sp = db.get(command);
		int j = 0;
		if(sp != null)
		{
			while(sp.next())
			{
				
				String MASP = sp.getString("ma");
				String TENSP = sp.getString("ten");
				String masp = Ult.replaceAEIOU(sp.getString("ma"));
				String tensp = Ult.replaceAEIOU(sp.getString("ten"));
				String donvi = Ult.replaceAEIOU(sp.getString("donvi"));
				
				if(masp.toUpperCase().startsWith(query.toUpperCase()) ||masp.toUpperCase().indexOf(query.toUpperCase()) >= 0 
						|| tensp.toUpperCase().indexOf(query.toUpperCase()) >= 0 || donvi.toUpperCase().indexOf(query.toUpperCase()) >= 0 )
				{
					if(TENSP.length() > 50)
						TENSP = TENSP.substring(0, 50);
					out.print("###" + sp.getString("ma") + " - " + TENSP +" [" + sp.getString("donvi") + "] ["+ sp.getString("dongia") + "]|"); //luu y: bat buoc phai co dau phan cach '|' o cuoi moi dong'
				}	
			}	
		}
		sp.close();
		db.shutDown();
		db=null;

	
	}	
	catch(Exception ex){
		if(db!=null){
			
			db.shutDown();
			db=null;
		}
	}
%>

