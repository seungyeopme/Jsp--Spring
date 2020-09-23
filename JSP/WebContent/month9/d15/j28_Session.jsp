<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행  -->
<!-- j28_SessionExe.jsp와 연결 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String name="지혜";
		
		//세션을 이용해 데이터를 유지시킴
		session.setAttribute("na1", name);
		
		//10초 세션 유지
		session.setMaxInactiveInterval(10);
	%>
	<a href="j28_SessionExe.jsp?names=<%=name %>">
	세션실행 페이지로 이동
	</a>
</body>
</html>