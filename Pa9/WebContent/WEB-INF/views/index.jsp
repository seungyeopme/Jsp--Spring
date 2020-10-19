<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<!-- 
get방식으로 3개의 데이터를 전달하고 출력하는 프로그램
EL출력
수1: 100
수2: 200
수3: 300

스크립트릿 출력
수1: 100
수2: 200
수3: 300
-->
<html>
<head>
<meta charset="EUC-KR">
<style type="text/css">
	*{
		font-size: 25px;
		margin: 0px;
	}
</style>
</head>

<body>
<a href="t1?su1=10&su2=20&su3=30">test1</a>
	<div>
	EL출력
	수1:${param.su1 }<br>
	수2:${param.su2 }<br>
	수3:${param.su3 }<br>
	<br>
	스크립틀릿 출력
	수1:<%=request.getParameter("su1") %><br>
	수2:<%=request.getParameter("su2") %><br>
	수3:<%=request.getParameter("su3") %><br>
	</div>
</body>
</html>