<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- �������, �������� -->
	<%! 
		int n1;	
		String n2;
	%>
	
	<!-- ��ũ��Ʈ�� => �������� ����, �޼ҵ� ���� �Ұ��� -->
	<%
		int n3;
		String n4="��ũ��Ʈ��";
	%>
	
	<%= n1 + ":"+n2 %>
</body>
</html>