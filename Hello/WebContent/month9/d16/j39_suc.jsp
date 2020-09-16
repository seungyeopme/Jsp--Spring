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
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
%>
너 아이디는 <%=id %>이고
비번은 <%=pw %>이다.

</body>
</html>