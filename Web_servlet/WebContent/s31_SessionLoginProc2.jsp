<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 처리</h2>
<%
	//세션 이용하여 데이터 불러옴
	String id=(String)session.getAttribute("id");
	String pass=(String)session.getAttribute("pass");
%>
당신의 아이디는 <%=id %>이다.
</body>
</html>