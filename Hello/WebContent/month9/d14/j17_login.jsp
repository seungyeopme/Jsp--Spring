<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
id:_________________
pw:_________________
�����ư

<h2>
����� ���̵�� __�̰� �н������ __�Դϴ�.
</h2>

request: ����� ������ ����Ǿ� �ִ� ��ü request�� getParameter()�� �̿��ؼ� ������� ���� ����
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
	%>
	<h2>���̵��<%=id%>�̰� �н������ <%=pw%>�Դϴ� </h2>
</body>
</html>