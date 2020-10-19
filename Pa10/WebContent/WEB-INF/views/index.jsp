<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
get방식 사용 말고 3개의 정수를 request 객체에 저장한 후 추출하여 합과 평균 출력
-->
<!DOCTYPE html>
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
<%
	request.setAttribute("no1", 10);
	request.setAttribute("no2", 20);
	request.setAttribute("no3", 30);
%>
</div>

${no1+no2+no3}
${(no1+no2+no3)/3}



</body>
</html>