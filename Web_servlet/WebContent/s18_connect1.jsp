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
	String str = request.getParameter("gender");
	if(str.equals("man")){
%>
	<jsp:forward page="s18_man.jsp"></jsp:forward>
<%
	}else{
%>
	<jsp:forward page="s18_woman.jsp"></jsp:forward>
<%
	}
%>
</body>
</html>