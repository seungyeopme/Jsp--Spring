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
		String na1=request.getParameter("names");
	%>
	
	<%
		String name1=(String)session.getAttribute("na1");
	%>
	<%=name1 %>안녕

</body>
</html>