<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<title>Homework</title>
<style>
	#c{
		text-align: "center";
		margin-top: "0";
		size: "1.5em";
		background-color: "Skyblue";
	}
</style>
</head>
<body>
	<form method="post" action="test2">
		<table border="1" id="c">
			<tr>
				<td>a:</td>
				<td><input name="a" placeholder="정수를 입력하시오"></td>
			<tr>
			<tr>
				<td>b:</td>
				<td><input name="b" placeholder="정수를 입력하시오"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="더하기 계산"></td>
			</tr>
		</table>
	</form>
</body>
</html>
