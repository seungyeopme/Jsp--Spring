<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	big �Լ� �ϳ� ����� �μ� �� ū �� ���Ϲޱ� 
	�Լ� ȣ�����
	-->
	<%!
		public int big(int a, int b) {
		return a>b?a:b;
	}
	%>
	
	<%=big(4,6)%>
</body>
</html>