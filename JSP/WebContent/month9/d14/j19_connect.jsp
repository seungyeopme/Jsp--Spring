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
		int n=Integer.parseInt(request.getParameter("num"));
		if(n>50) {
			out.print("50보다 크다");
		}
		else
			out.print("50보다 작다");
	%>
</body>
</html>