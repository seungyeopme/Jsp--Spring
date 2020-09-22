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
	request.getParameter("euc-kr");
%>
	<jsp:useBean id="be" class="month9.d21.s5">
	<jsp:setProperty name="be" property="*"/>
	</jsp:useBean>
	
	<jsp:getProperty property="name" name="be"/>
	<jsp:getProperty property="price" name="be"/>
	<jsp:getProperty property="desc" name="be"/>
</body>
</html>