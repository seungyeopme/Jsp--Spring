<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
2. 네이버 홈페이지로 페이지를 강제 이동해라.
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	response.sendRedirect("http://www.naver.com");
%>
</body>
</html>