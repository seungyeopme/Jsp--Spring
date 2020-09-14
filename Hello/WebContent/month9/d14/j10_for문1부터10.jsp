<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 1부터 10까지 출력 -->
	<%
		for(int i=1; i<=10; i++) {
	%>
	<%=i %><br>
	<%}%>
</body>
</html>