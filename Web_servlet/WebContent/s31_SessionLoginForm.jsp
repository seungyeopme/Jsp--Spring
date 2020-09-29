<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
text-align: center;
}
table{
width:70%;
margin: 0 auto;
}
td{
height: 50px;
}
</style>
</head>
<body>
<h3>세션</h3>
<form action="s31_SessionLoginProc1.jsp" method="post">
<table border="1px">
<tr>
	<td>아이디</td>
	<td><input name="id" value=""></td>
</tr>
<tr>
	<td>패스워드</td>
	<td><input type="password" name="pw"></td>
</tr>
<tr>
	<td colspan="2">
	<input type="submit" value="로그인">
	</td>
</tr>
</table>
</form>
</body>
</html>