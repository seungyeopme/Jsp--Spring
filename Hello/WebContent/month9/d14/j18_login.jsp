<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
h2{
text-align: center;
}
form{
margin: 0 auto; text-align: center;
width: 400px; height: 400px;
}
</style>
</head>
<body>

<center>

<h2> ȸ������</h2>

<form action="j18_login_connect.jsp" method="post">

	<table width="500" border="1">
		<tr height="50">
			<td width="150" align="center"> ���̵�</td>
			<td widht="350" align="center"><input type="text" name="id" size="40"></td>
		<tr height="50">
			<td width="150" align="center"> �н�����</td>
			<td widht="350" align="center"><input type="password" name="pass1" size="40"></td>
		<tr height="50">
			<td width="150" align="center"> �н�����Ȯ��</td>
			<td widht="350" align="center"><input type="password" name="pass2" size="40"></td>
		<tr height="50">
			<td width="150" align="center"> �̸���</td>
			<td widht="350" align="center"><input type="email" name="email" size="40"></td>
		<tr height="50">
			<td width="150" align="center"> ��ȭ��ȣ</td>
			<td widht="350" align="center"><input type="tel" name="tel" size="40"></td>
		<tr height="50">
			<td width="150" align="center"> ����ǰ��ɺо�</td>
			<td width="350" align="center">
				<input type="checkbox" name="hobby" value="ķ��">ķ��   
				<input type="checkbox" name="hobby" value="���">���   
				<input type="checkbox" name="hobby" value="��ȭ">��ȭ   
				<input type="checkbox" name="hobby" value="����">����   
			</td>
		</tr>
		<tr height="50">
			<td width="150" align="center"> �����������</td>
			<td width="350" align="center">
				<select name="job">
					<option value="����">����</option>
					<option value="��ȣ��">��ȣ��</option>
					<option value="�ǻ�">�ǻ�</option>
					<option value="�����">�����</option>
				</select>
			</td>
		</tr>
		<tr height="50">
			<td width="150" align="center"> ����ǿ�����</td>
			<td width="350" align="center">
				<input type="radio" name="age" value="10">10��   
				<input type="radio" name="age" value="20">20��   
				<input type="radio" name="age" value="30">30��   
				<input type="radio" name="age" value="40">40��   
			</td>
		</tr>
		<tr height="50">
			<td width="150" align="center"> �ϰ������</td>
			<td width="350" align="center">
				<textarea rows="5" cols="40" name="info"></textarea>
			</td>
		</tr>
		<tr height="50">
			<td align="center" colspan="2">
				<input type="submit" value="ȸ������">
				<input type="reset" value="���">
			</td>
		</tr>
	</table>
</form>
</center>
</body>
</html>