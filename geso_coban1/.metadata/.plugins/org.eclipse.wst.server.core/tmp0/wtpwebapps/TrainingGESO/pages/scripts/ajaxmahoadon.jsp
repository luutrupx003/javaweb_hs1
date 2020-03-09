<%@page import="geso.erp.db.sql.dbutils"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.net.URLDecoder"%>
<%
	try {
		dbutils db = new dbutils();
		String smartId = "";
		String khId = "";
		String khTen = "";
		String command = "";
		request.setCharacterEncoding("UTF-8");

		String query = (String) request.getQueryString();
		query = new String(query.substring(query.indexOf("q=") + 2,
				query.indexOf("&limit=")).getBytes("UTF-8"), "UTF-8");
		query = URLDecoder.decode(query, "UTF-8").replace("+", " ");
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		command = "select distinct dh.PK_SEQ,k.TEN";
		command += " from donhang dh join ERP_KHACHHANG k on dh.KHACHHANG_FK=k.PK_SEQ";
		command += " where ( dh.PK_SEQ like '%" + query + "%' ) ";
		command += " order by dh.PK_SEQ";
		System.out.println("MAHD : " + command);

		ResultSet dh = db.get(command);
		if (dh != null) {
			int m = 0;
			String khb;
			while (dh.next()) {
				khId = dh.getString("PK_SEQ");
				khTen = dh.getString("TEN");

				if (khTen.toUpperCase().startsWith(query.toUpperCase())
						|| khTen.toUpperCase().indexOf(
								query.toUpperCase()) >= 0
						|| khId.toUpperCase().startsWith(
								query.toUpperCase())
						|| khId.toUpperCase().indexOf(
								query.toUpperCase()) >= 0) 
				{
					String sanpham = khId + "-->" + khTen;
					out.println(sanpham + "\n");
					m++;
					if (m >= 50)
						break;
				}
			}
			dh.close();
		}
		db.shutDown();
		db = null;
	} catch (SQLException e) {
	}
%>