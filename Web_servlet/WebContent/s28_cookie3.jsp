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
	Cookie c=new Cookie("id","");
	
	//쿠키 유효시간 만료시킴
	c.setMaxAge(0);
	
	response.addCookie(c);
%>
<h3>쿠키가 삭제됨</h3>
<a href="s28_cookie2.jsp">쿠키 삭제 확인</a>
</body>
</html>