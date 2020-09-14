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
	big 함수 하나 만들어 두수 중 큰 값 리턴받기 
	함수 호출까지
	-->
	<%!
		public int big(int a, int b) {
		return a>b?a:b;
	}
	%>
	
	<%=big(4,6)%>
</body>
</html>