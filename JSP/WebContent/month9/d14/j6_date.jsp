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
		float f=2.3f;
		int i=Math.round(f);
		java.util.Date date=new java.util.Date();
	%>
	<%=i%><!-- 2 -->
	<%=date.toString()%> <!-- Mon Sep 14 10:20:09 KST 2020 --> 
</body>
</html>