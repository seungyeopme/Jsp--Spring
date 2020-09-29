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
	//세션에 값 설정 => 
	//상태 유지 위해서는 세션에 값을 저장한 후 이를 가져와서 사용한다.
	session.setAttribute("id","pink");
	session.setAttribute("pw", "2345");
%>
<h23>세션 값 설정</h3>
</body>
</html>