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
	�� bufferũ��: <%=a %>
	���� bufferũ��: <%=b %>

</body>
</html>