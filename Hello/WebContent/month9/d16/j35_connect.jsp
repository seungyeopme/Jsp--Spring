<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String age=request.getParameter("age");
	String name=(String)request.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<!-- ������ pink -->
<body bgcolor="pink">
	<!-- ����, �̸� ���(ǥ����) -->
	���� : <%=age %>
	�̸� : <%=name %>
</body>
</html>