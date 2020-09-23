<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>가고 싶은 여행지는?</h2>
<%
	request.setCharacterEncoding("euc-kr");
	String p[]=(request.getParameterValues("place"));
%>
<% 
for(int i=0;i<p.length;i++){
%>
<ul>
	<li><%=p[i] %></li>
</ul>	
<% 	
}
%>
</body>
</html>

</body>
</html>