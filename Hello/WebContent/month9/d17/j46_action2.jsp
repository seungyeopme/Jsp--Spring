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
	String admin=request.getParameter("admin");
	if(admin.equals("1")){
%>
	<jsp:forward page="j46_action3.jsp"/>
<%
	}else if (admin.equals("2")){
%>
	<jsp:forward page="j46_action4.jsp"/>
<%
	}
%>
</body>
</html>