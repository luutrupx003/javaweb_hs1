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
		String masp = "";
		String command = "";
		request.setCharacterEncoding("UTF-8");

		String query = (String) request.getQueryString();
		query = new String(query.substring(query.indexOf("q=") + 2,
				query.indexOf("&limit=")).getBytes("UTF-8"), "UTF-8");
		query = URLDecoder.decode(query, "UTF-8").replace("+", " ");
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		command = "select PK_SEQ ";
		command += "from ERP_SANPHAM  ";
		System.out.println("SanPham : " + command);

		ResultSet kh = db.get(command);
		if (kh != null) {
			int m = 0;
			String khb;
			while (kh.next()) {
				masp = kh.getString("PK_SEQ");
				String khachhang = masp;
					out.println(khachhang + "\n");
					m++;
					if (m >= 50)
						break;
				}
			kh.close();
			}
		db.shutDown();
		db = null;
	} catch (SQLException e) {
	}
%>