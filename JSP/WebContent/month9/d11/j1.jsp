<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		//�������, �޼ҵ� ���� ����
		String name="jsp";
		int id=123;
	%>
	<%
		String n=name+"java";
	%>
	
	���:<%=name%>
	���1:<%=n%>

</body>
</html>