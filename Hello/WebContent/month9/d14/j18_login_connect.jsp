<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>회원정보보기</h2>
	
	<%
		request.setCharacterEncoding("EUC-KR");
		
		String id=request.getParameter("id");
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		String email=request.getParameter("email");
		String tel=request.getParameter("tel");
	
		String[] h = request.getParameterValues("hobby");
		
		String job=request.getParameter("job");
		String age=request.getParameter("age");
		String info=request.getParameter("info");
	%>
</body>
</html>