<!-- 
1. Memberbean : �ڹٺ� Ŭ����(���ͼ���)
id,pw,job...��� �ʵ忡 �Է��� ���� �� Ŭ������ �����ϴ� Ŭ����.
->useBean���κ��� �Ѳ����� ������ �޾ƿ�

2. MemberJoin.jsp : HTML ���� ��

3. MemberJoinProc.jsp : ������ο��� ���� ������ �̵��Ǵ� ������.
-> ������ο� �Էµ� ������ ��� �ڹٺ� Ŭ������ useBean���� ����.
-> MemberDAO Ŭ���� ȣ���Ͽ� useBean���� ������ ������ �ѹ��� ���� ����.
> �۾��� �Ϸ�Ǹ� MemberList Ŭ������ �̵�(ȸ������ ��� ����ֱ�)

4. MemberDAO : �����ͺ��̽� �����ϴ� Ŭ����.
-> db����, ������, ���

5. MemberList.jsp : �Է��� ȸ������ ȭ�鿡 ����ϴ� ������.

6. MemberIn.jsp : �������Ʈ���� ���̵� Ŭ���� �̵��Ǵ� ������. ����Ʈ���� �ҷ��� ���̵��� ���޹���.
��񿡼� ���õ� ���̵� ���� �� ȸ���� ���� ��ȸ
�ϴܿ� ������ư ���� MemberUpdateForm.jsp �������� �̵�

7. MemberUpdateForm.jsp : ȸ������ ���� ��.

8. MemberUpdateFormProc.jsp : ���� ������ ������ �� ���� �����ϴ� ������.
-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="MemberJoinProc.jsp" method="post">
		<table border=1>
			<tr>
				<td>���̵�:</td>
				<td><input name="id"></td>
			</tr>
			<tr>
				<td>���:</td>
				<td><input type="password" name="pw1"></td>
			</tr>
			<tr>
				<td>���Ȯ��:</td>
				<td><input type="password" name="pw2"></td>
			</tr>
			<tr>
				<td>�̸���:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>��ȣ:</td>
				<td><input type="tel" name="tel"></td>
			</tr>
			<tr>
				<td>����� ���:</td>
				<td><input name="hobby" type="checkbox" value="cam">ķ��
					<input name="hobby" type="checkbox" value="movie">��ȭ <input
					name="hobby" type="checkbox" value="book">����</td>
			</tr>
			<tr>
				<td>����:</td>
				<td><select name="job">
						<option value="teacher">����</option>
						<option value="student">�л�</option>
						<option value="sal">ȸ���</option>
				</select></td>
			</tr>
			<tr>
				<td>����:</td>
				<td>
				<input name="age" type="radio" value="10s">10�� 
				<input name="age" type="radio" value="20s">20�� 
				<input name="age" type="radio" value="30s">30�� 
				<input name="age" type="radio" value="40s">40��
				</td>
			</tr>
			<tr>
				<td>�ϰ���� ��:</td>
				<td><textarea name="info" cols="10" rows="3"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="����"> <input type="reset"
			value="���">
	</form>
</body>
</html>