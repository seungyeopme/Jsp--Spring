<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	//��������
	int result = 0;
	
	//�� ������ ��û�� POST�� ��쿡�� ����
	//�� ��(Form)�� ���� ���޵� �͸� ����
	//�ʱ� �ε� �� ���� ����
	if(request.getMethod().equals("POST")) {
		//�����ڸ� ������
		String op = request.getParameter("operator");
		
		//���ڿ� ���·� ���޵� ���ڵ��� int�� ��ȯ��
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		//�� �����ں� ó��
		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if(op.equals("*")) {
			result = num1 * num2;
		}
		else if(op.equals("/")) {
			result = num1 / num2;
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>����</title>
</head>
<body>
<h3>����</h3>
<hr>
<form name=form1 method=post>
<input type="text" name="num1" width=200 size="5">
<select name="operator">
	<option selected>+</option>
	<option>-</option>
	<option>*</option>
	<option>/</option>
	</select>

<input type="text" name="num2" width=200 size="5">
<input type="submit" value="���" name="B1">
<input type="reset" value="�ٽ� �Է�" name="B2">
</form>
<hr>

����� : <%=result %>
</body>
</html>