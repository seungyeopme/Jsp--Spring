<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- for���� ����Ͽ� ������ ��� 2��~9�ܱ��� -->
	<%
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				out.print(i+"*"+j+"="+i*j + "<br>");
			}
		}
	%>

</body>
</html>