<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String name=request.getParameter("name");
	String id=request.getParameter("id");
	String nic=request.getParameter("nic");
	int pw=Integer.parseInt(request.getParameter("pw"));
	String email=request.getParameter("email");
	String tel=request.getParameter("tel");
%>
<script type="text/javascript">
	alert("���ԿϷ�");
</script>
<h1>�Էµ� ���� Ȯ��</h1>
�̸� : <%= name %><br>
���̵�: <%= id %><br>
����: <%= nic %><br>
��й�ȣ: <%= pw %><br>
�̸���: <%= email %><br>
��ȭ��ȣ: <%= tel %><br>
<a href='javascript:history.go(-1)'>�ڷΰ���</a>
</body>
</html>