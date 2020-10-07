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

<h2>회원 가입 정보 확인 페이지</h2>
<p>아이디: ${param.id }</p>
<p>아이디: ${param.pass }</p>
<p>아이디: ${param.email }</p>
<p>입력 하신 정보가 확실합니까?</p>
<form action="regist.member" method="post">
	<input type="hidden" name="command" value="regist">
	<input type="hidden" name="id" value="${param.id }">
	<input type="hidden" name="pass" value="${param.pass }">
	<input type="hidden" name="email" value="${param.email }">
	<input type="submit" value="회원가입 완료">
</form>
</body>
</html>