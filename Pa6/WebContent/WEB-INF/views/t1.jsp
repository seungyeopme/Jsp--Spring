<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="r">
	이름: <input name="name" value="${requestScope.data1.name }">
	아이디: <input name="id" value="${requestScope.data1.id }">
	패스워드: <input name="pw" value="${requestScope.data1.pw }">
	<button type="submit">확인</button>
	</form>
</body>
</html>