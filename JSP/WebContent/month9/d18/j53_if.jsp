<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
������ ���� �ڵ� �����ض�.
j53_if.html => �̸�, �����ϴ� ���� ���� �� ����(option)
j53_if.jsp => �����ϴ� �� value���̶� ���ؼ� ���

���� ��� => ~�� ~���� �����ϳ׿�.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("euc-kr");

	String n=request.getParameter("name");
	String c=request.getParameter("color");
%>
<%=n %>�� <%=c %>���� �����ϳ׿�.
</body>
</html>