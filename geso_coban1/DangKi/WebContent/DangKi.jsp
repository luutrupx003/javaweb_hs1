<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Đăng Kí</h1>
	<form action="DangKiSvl" method="post">
		<label>Username: </label>
		<input type="text" name="username" value=""/><br><br>
		<label>Password: </label>
		<input type="password" name="password" value=""/><br><br>
		<label>Họ tên: </label>
		<input type="text" name="hoTen" value=""/><br><br>
		<label>Emai: </label>
		<input type="email" name="email" value=""/><br><br>
		<button type="submit" name="dangKi">Đăng kí</button>
	</form>
</body>
</html>