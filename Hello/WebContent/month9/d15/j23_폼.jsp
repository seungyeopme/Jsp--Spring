<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���⼭ ���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action=j23_��_result.jsp method="post">
<table>
	<tr>
		<td>�̸� :		</td>
		<td>
			<input name="name" size="20">
		</td>
	</tr>
	
	<tr>
		<td>���� :		</td>
		<td>
			<input type="radio" name="gender" value="male" checked="checked">����
			<input type="radio" name="gender" value="female">����
		</td>
	</tr>
	
	<tr>
		<td>�����ϴ� ���� : </td>
		<td>
			<input type="checkbox" name="sing" value="1">BTS
			<input type="checkbox" name="sing" value="2">��ϳ� �̹߰�
			<input type="checkbox" name="sing" value="3">��ȿ��
			<input type="checkbox" name="sing" value="4">ȭ��
		</td>
	</tr>
	
	<tr align="center">
		<td>
			<input type="submit" value="����">
		</td>
		<td>
			<input type="reset" value="���">
		</td>
	</tr>
</table>

</form>

</body>
</html>