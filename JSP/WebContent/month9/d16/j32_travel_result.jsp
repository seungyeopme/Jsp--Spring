<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String str1=request.getParameter("kor");
	String str2=request.getParameter("notkor");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	��������: <%=str1 %><br>
	�ؿܿ���: <%=str2 %><br>
	<a href='javascript:history.go(-1)'>�ٽ���ȸ</a>
</body>
</html>