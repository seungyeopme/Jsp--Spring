<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
���Ⱑ ����!!
������ ���� �� ���ٸ��� �������� ����� 4���� ����(html, css, �ڹٽ�ũ��Ʈ,jsp)��
�� ����ؼ� ����ض�.
-->
<!DOCTYPE html>
<html>
<head>
<style>
	h1{
		text-align:center;
	}
	input[type=submit],input[type=reset]{
		margin:5px 10px;
		border-radius: 3px;
	}
	form{
		text-align: center;
		margin:0 auto;
		background-color: aliceblue;
	}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>ȸ���� ���� �Է� ��</h1>
<form action="j57_result.jsp">
<table>
<tbody>
<tr>
	<td>
		<span>�̸�</span>
	</td> 
	<td>
		<input name="name">
	</td>
</tr>

<tr>
	<td>
		<span>���̵�</span>
	</td> 
	<td>
		<input name="id">
	</td>
</tr>

<tr>
	<td>
		<span>����</span>
	</td> 
	<td>
		<input name="nic">
	</td>
</tr>

<tr>
	<td>
		<span>��й�ȣ</span>
	</td> 
	<td>
		<input type="password" name="pw">
	</td>
</tr>

<tr>
	<td>
		<span>�̸���</span>
	</td> 
	<td>
		<input type="email" name="email">
	</td>
</tr>

<tr>
	<td>
		<span>��ȭ��ȣ</span>
	</td> 
	<td>
		<input type="tel" name="tel">
	</td>
</tr>
</tbody>
</table>
<input type="submit" value="����"><input type="reset" value="���">
</form>
</body>
</html>