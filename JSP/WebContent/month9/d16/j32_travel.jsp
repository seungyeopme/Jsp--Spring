<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
���� ���� �������� 
select~option���� ����� ��û�ϸ� �̷��� ��µȴ�.

�ٽ� ��ȸ��� �����۸�ũ�� ������ ���� �������� �̵��Ѵ�.
<a href = '.a.jsp'> �ٽ� ��ȸ
���� ����: ���
�ؿ� ����: ȫ��
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method=get action="j32_travel_result.jsp">
		���� ����: 
		<select name="kor">
			<option value="Ulsan">���</option>
			<option value="Busan">�λ�</option>
		</select>
		<br>
		�ؿ� ����:
		<select name="notkor">
			<option value="Kyoto">����</option>
			<option value="Osaka">����ī</option>
		</select>
		<input type="submit" value="Ȯ��">
	</form>
</body>
</html>