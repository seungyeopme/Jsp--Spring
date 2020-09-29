<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.invalidate();
	         //무효화하다
%>
<script>
	alert("로그 아웃");
	location.href="s32_LoginForm.jsp";
</script>
</body>
</html>
