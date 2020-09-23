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
	String name=request.getParameter("name");
	String swim=request.getParameter("swim");
%>
<%=name%>님의 취미는 <%=swim%>입니다.
</form>
</body>
</html>