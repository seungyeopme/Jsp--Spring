<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>세션 값 얻기</h3>
<%
	//반환형이 object형이므로 다운캐스팅
	String id=(String)session.getAttribute("id");
	String pw=(String)session.getAttribute("pw");
%>
id: <%=id %><br>
pw: <%=pw %>
</body>
</html>