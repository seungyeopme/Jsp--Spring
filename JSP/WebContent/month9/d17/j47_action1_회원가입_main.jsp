<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>ȸ�� ����</h2>
<form action="j47_action2.jsp" method="post">
<table width="500" border="1">
	<tr height="50">
		<td width="150" align="center">
			���̵�
		</td>
		<td width="350" align="center">
			<input type="text" name="id" size="30"
			placeholder="id�Է��ؿ�">
		</td>
	</tr>
	
	<tr height="50">
		<td width="150" align="center">
			�н�����
		</td>
		<td width="350" align="center">
			<input type="password" name="pw" size="30"
			placeholder="����� �����ڸ�">
		</td>
	</tr>
	
	<tr height="50">
		<td width="150" align="center">
			email
		</td>
		<td width="350" align="center">
			<input type="email" name="email" size="30">
		</td>
	</tr>
	
	<tr height="50">
		<td width="150" align="center">
			��ȭ��ȣ
		</td>
		<td width="350" align="center">
			<input type="tel" name="tel" size="30">
		</td>
	</tr>
	
	<tr height="50">
		<td align="center" colspan="2">
			<input type="submit" value="ȸ������">
		</td>
	</tr>
</table>
</form>
</center>
</body>
</html>