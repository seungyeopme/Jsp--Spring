<%@ 
	page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    session="true"
%>
<!-- j29.html ���Ͽ��� ���� -->
<!-- session="true"=> ����Ʈ ���� true�̱� ������ ���� �� �����־ �Ǳ�� �ϴ�. ���� �������� ���� ��뿩�� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	session.setAttribute("ii",id);
	session.setMaxInactiveInterval(60);
%>
<form method="post" action="j29_connect.jsp">
	���� �����ϴ� ������?
	<input type="radio" name="food" value="����">����
	<input type="radio" name="food" value="�Ľ�Ÿ">�Ľ�Ÿ
	<input type="radio" name="food" value="������">������
	
	�����ϴ� ����?
	<input type="radio" name="pro" value="jsp">���̿�����
	<input type="radio" name="pro" value="java">�ڹ�
	<input type="radio" name="pro" value="c">�����
	
	<input type="submit" value="���">
	
	

</form>

</body>
</html>