<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- ��ũ��Ʈ�� => �������� ����, �޼ҵ� ���� �Ұ��� -->
	<% 
	String name= n+ "����"; 
	%>
	
	<!-- ������� �Ǵ� �޼ҵ� ����(������ ��������) �տ��� ������ ���� �ʾƵ� �о���δ�. -->
	<%! 
	String n="jsp";
	%>
	
	���ڿ���<%=name %>
</body>
</html>