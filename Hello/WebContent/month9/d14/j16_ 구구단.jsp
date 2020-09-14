<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- for문을 사용하여 구구단 출력 2단~9단까지 -->
	<%
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				out.print(i+"*"+j+"="+i*j + "<br>");
			}
		}
	%>

</body>
</html>