<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="be" class="month9.d22.s11_bor">
<!-- Border be=new Border() -->
		<jsp:setProperty property="*" name="be"/>
	</jsp:useBean>
	<!-- be.get(name) -->
	<jsp:getProperty property="name" name="be"/>
	<jsp:getProperty property="pass" name="be"/>
	<jsp:getProperty property="email" name="be"/>
	<jsp:getProperty property="title" name="be"/>
	<jsp:getProperty property="content" name="be"/>
</body>
</html>