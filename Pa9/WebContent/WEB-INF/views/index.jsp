<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<!-- 
get������� 3���� �����͸� �����ϰ� ����ϴ� ���α׷�
EL���
��1: 100
��2: 200
��3: 300

��ũ��Ʈ�� ���
��1: 100
��2: 200
��3: 300
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
	EL���
	��1:${param.su1 }<br>
	��2:${param.su2 }<br>
	��3:${param.su3 }<br>
	<br>
	��ũ��Ʋ�� ���
	��1:<%=request.getParameter("su1") %><br>
	��2:<%=request.getParameter("su2") %><br>
	��3:<%=request.getParameter("su3") %><br>
	</div>
</body>
</html>