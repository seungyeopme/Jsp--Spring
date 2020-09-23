<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 멤버변수, 전역변수 -->
	<%! 
		int n1;	
		String n2;
	%>
	
	<!-- 스크립트릿 => 지역변수 선언, 메소드 선언 불가능 -->
	<%
		int n3;
		String n4="스크립트릿";
	%>
	
	<%= n1 + ":"+n2 %>
</body>
</html>