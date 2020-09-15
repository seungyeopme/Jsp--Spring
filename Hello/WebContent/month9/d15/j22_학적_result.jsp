<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	String major = request.getParameter("major");
	out.print(name + " " + id + " "+ gender + " " + major);
%>

</body>
</html>