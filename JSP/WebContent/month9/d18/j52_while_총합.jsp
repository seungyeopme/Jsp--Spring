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
	int k = 0;
	int i = 0;

    while(i++ < 10){
		k += i;
	}
%>
while 1~ 10까지의 합은<%=k%> <br>
</body>
</html>