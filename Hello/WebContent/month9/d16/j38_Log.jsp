<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���⼭ ���� -->
<!-- 
���̵�, ��ȣ �Է¹޴� �α��� ��(j38_Log.jsp)
�α��ο� ������ ���� �� (j38_suc.jsp��) �������� ��
�ٽ� �α��� ������ ���ư��� �α��� ���� ó�� �������� (j38_fru.jsp)�� �ۼ��ض�.
sendRedirect��� �������� �� suc.jsp���Ͽ�
jisu �� ȯ���մϴ�.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="j38_fru.jsp">
	���̵�: <input name="id">
	���: <input name="pw">
		<input type="submit" value="�α���">
</form>
</body>
</html>