<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("euc-kr");
	String str=request.getParameter("adr");
	String name="나는";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="j42_foward3.jsp">
		<jsp:param name="name" value="<%=name %>" />
	</jsp:forward>
</body>
</html>