<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
다음 코드를 구현해라.
s24_Person.java
=>본인 정보 저장하는 자바 빈

s24_PersonForm.jsp
=>이름, 별명, 직업, 이메일 입력받는 폼

s24_Person.jsp
=>자바 빈에 저장하고 정보 얻어와 출력
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="s24_Person.jsp" method="get">
<table>
<tr>
	<td>이름: </td><td><input name="name"></td>
</tr>
<tr>
	<td>별명: </td>
	<td><input name="nic"></td>
</tr>
<tr>
	<td>직업: </td>
	<td><input name="job"></td>
</tr>
<tr>
	<td>메일: </td>
	<td><input name="mail"></td>
</tr>
</table>
<input type="submit" value="전송">
</form>
</body>
</html>