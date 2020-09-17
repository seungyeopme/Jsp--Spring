<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>취미는?</h2>
<%
	request.setCharacterEncoding("euc-kr");
	String h[]=(request.getParameterValues("hobby"));
%>
<% 
for(int i=0;i<h.length;i++){
%>
<ul>
	<li><%=h[i] %></li>
</ul>	
<% 	
}
%>
</body>
</html>
<!--  
request.setCharacterEncoding("euc-kr");
	String h[]=(request.getParameterValues("hobby"));

 	for(int i=0; i<h.length; i++ ) { 
	out.println(h[i]);
-->