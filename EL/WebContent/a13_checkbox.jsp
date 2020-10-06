<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="a13_result.jsp">
<table border="1" bgcolor="skyblue">
	<caption><strong>내가 관심있는 것</strong></caption>
	<tr>
		<td><input type="checkbox" name="inter" value="a">a
			<input type="checkbox" name="inter" value="b">b
			<input type="checkbox" name="inter" value="c">c
			<input type="checkbox" name="inter" value="d">d
		</td>
	</tr>
	<tr>
		<td><input type="submit" value="제출"></td>
	</tr>
</table>
</form>
</body>
</html>