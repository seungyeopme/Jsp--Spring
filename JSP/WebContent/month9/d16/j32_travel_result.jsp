<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String str1=request.getParameter("kor");
	String str2=request.getParameter("notkor");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	국내여행: <%=str1 %><br>
	해외여행: <%=str2 %><br>
	<a href='javascript:history.go(-1)'>다시조회</a>
</body>
</html>