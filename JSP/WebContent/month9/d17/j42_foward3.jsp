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
	String name=request.getParameter("name");
	String str=request.getParameter("adr");
%>
<%=name%> <%=str%>�� ���.

</body>
</html>