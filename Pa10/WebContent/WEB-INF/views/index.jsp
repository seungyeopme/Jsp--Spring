<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
get��� ��� ���� 3���� ������ request ��ü�� ������ �� �����Ͽ� �հ� ��� ���
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