<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thông tin đăng kí</h1>
	<label>Username: </label>
	<span><%= request.getAttribute("username").toString()%></span><br>
	<label>Password: </label>
	<span><%= request.getAttribute("password").toString()%></span><br>
	<label>Họ Tên: </label>
	<span><%= request.getAttribute("hoTen").toString()%></span><br>
	<label>Email: </label>
	<span><%= request.getAttribute("email").toString()%></span><br>
</body>
</html>