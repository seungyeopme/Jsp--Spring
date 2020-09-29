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
<h3>세션 값 얻기</h3>
<%
	Enumeration	name=session.getAttributeNames();

	while(name.hasMoreElements()) {
		String n=name.nextElement().toString();
		String m=session.getAttribute(n).toString();
		
		out.print(m +" : "+n);
	}
%>
</body>
</html>