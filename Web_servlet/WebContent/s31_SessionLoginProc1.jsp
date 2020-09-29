<%@page import="java.util.Enumeration"%>
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
	request.setCharacterEncoding("EUC-KR");
	
	//데이터 읽어들임
	//id, password 읽어와서 세션에 저장
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	
	//세션의 유지시간 설정
	session.setMaxInactiveInterval(60);
%>
당신 아이디는 <%=id %>이다.
<a href="s31_SessionLoginProc2.jsp">다음페이지로 이동</a>
</body>
</html>