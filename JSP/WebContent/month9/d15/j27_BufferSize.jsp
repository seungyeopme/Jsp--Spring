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
		int a=out.getBufferSize();
		int b=out.getRemaining();	
	%>
	총 buffer크기: <%=a %>
	남은 buffer크기: <%=b %>

</body>
</html>