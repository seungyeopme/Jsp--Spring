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

<!-- 배경색은 pink -->
<body bgcolor="pink">
	<!-- 나이, 이름 출력(표현식) -->
	나이 : <%=age %>
	이름 : <%=name %>
</body>
</html>