<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���⼭ ����  -->
<!-- j28_SessionExe.jsp�� ���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String name="����";
		
		//������ �̿��� �����͸� ������Ŵ
		session.setAttribute("na1", name);
		
		//10�� ���� ����
		session.setMaxInactiveInterval(10);
	%>
	<a href="j28_SessionExe.jsp?names=<%=name %>">
	���ǽ��� �������� �̵�
	</a>
</body>
</html>