<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%! 
	int n=0;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		int n1=0;
		out.print(n1); //0
		
		out.print("<br>");
		out.print(++n); //1
	%>

</body>
</html>