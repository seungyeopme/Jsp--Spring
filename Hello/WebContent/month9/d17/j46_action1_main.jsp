<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
j46_action1.jsp => Html5���� �����.
j46_action2.jsp => ���� ���������� ������ ������ư�� ���� forward�±׸� �̿��� �̵��� �������� �޸��Ѵ�.
j46_action3.jsp => ����ڸ� ������ ������ red�� ���
j46_action4.jsp => �����ڸ� ������ ������ yellow�� ���
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j46_action2.jsp" method="get">
���̵�:<input name="id"> <br>
�� ȣ:<input type="password" name="pw"><br>
<input type="radio" name="admin" value="1">�����
<input type="radio" name="admin" value="2">������
<br>
<input type="submit" value="�α���">
</form>
</body>
</html>