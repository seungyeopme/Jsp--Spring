<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
����, ���ϱ� ���� ó���ϴ� ���

@RequestMapping

����       ���ϱ�
��1:100   ��1:100
��2:50    ��2:50
���:50   ���:5000
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
	<a href="t1?n1=30&n2=50">�׽�Ʈ</a>
	<%=request.getAttribute("msg") %>����<br>
	��1 : <%=request.getAttribute("n1") %><br>
	��2 : <%=request.getAttribute("n2") %><br>
	��� : <%=request.getAttribute("result") %><br>
</body>
</html>