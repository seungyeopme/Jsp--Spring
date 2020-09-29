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
	//서버가 보낸 데이터가 클라이언트 폴더에 저장됨
	
	//1. 쿠키 생성
	Cookie c=new Cookie("id", "pink");

	//2. 유효기간 설정
	c.setMaxAge(365*24*60*60);
	
	//3. 클라이언트한테 쿠키 전송
	response.addCookie(c);
	
	//4. 쿠키를 생성하여 클라이언트에 전송
	response.addCookie(new Cookie("pw","1234"));
	response.addCookie(new Cookie("age","1234"));
%>
<h2>쿠키 설정</h2>
</body>
</html>