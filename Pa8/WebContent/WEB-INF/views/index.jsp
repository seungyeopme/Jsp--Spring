<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body leftmargin="0" topmargin="0">
	<a href="t1">t1</a><br><br><br><br>
	<a href="t2?a=30&b=60">���ڰ���</a>

	<div style="text-align: center; font-size: 1.5em">
	��1 : ${requestScope.n1 }<br>
	��2 : ${requestScope.n2 }<br>
	��� : ${requestScope.result }<br>
	</div>
	
</body>
</html>