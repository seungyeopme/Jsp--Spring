<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
빼기, 곱하기 연산 처리하는 기능

@RequestMapping

빼기       곱하기
수1:100   수1:100
수2:50    수2:50
결과:50   결과:5000
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
	<a href="t1?n1=30&n2=50">테스트</a>
	<%=request.getAttribute("msg") %>계산기<br>
	수1 : <%=request.getAttribute("n1") %><br>
	수2 : <%=request.getAttribute("n2") %><br>
	결과 : <%=request.getAttribute("result") %><br>
</body>
</html>