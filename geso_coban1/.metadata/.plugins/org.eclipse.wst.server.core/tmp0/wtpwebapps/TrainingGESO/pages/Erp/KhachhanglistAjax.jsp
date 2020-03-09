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
		command = "select distinct top(30) Ma, pk_seq as khId, ten as khTen, diachi ";
		command += "from ERP_KHACHHANG where trangthai = '1' ";
		command += "and ( Ma like '%" + query + "%' or ten like (N'%"
				+ query + "%') ) ";
		command += "order by Ma, khId, khTen";
		System.out.println("ERP_KHACHHANG : " + command);

		ResultSet kh = db.get(command);
		if (kh != null) {
			int m = 0;
			String khb;
			while (kh.next()) {
				khb = kh.getString("khId");
				khId = kh.getString("Ma") + "-" + khb;
				khTen = kh.getString("khTen") + " - "
						+ kh.getString("diachi");

				if (khTen.toUpperCase().startsWith(query.toUpperCase())
						|| khTen.toUpperCase().indexOf(
								query.toUpperCase()) >= 0
						|| khId.toUpperCase().startsWith(
								query.toUpperCase())
						|| khId.toUpperCase().indexOf(
								query.toUpperCase()) >= 0) 
				{
					String khachhang = khId + "-->[" + khTen + "]";
					out.println(khachhang + "\n");
					m++;
					if (m >= 50)
						break;
				}
			}
			kh.close();
		}
		db.shutDown();
		db = null;
	} catch (SQLException e) {
	}
%>