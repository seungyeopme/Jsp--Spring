<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- aaa�� ȯ���մϴ�. -->
<% 
	request.setCharacterEncoding("EUC-KR");
%>
<%=request.getParameter("i") %>�� ȯ���մϴ�.
</body>
</html>