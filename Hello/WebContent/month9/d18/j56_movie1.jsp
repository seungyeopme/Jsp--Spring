<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j56_movie2.jsp" method="post">
��ȭ ���� : <input name="title"><br> ���� : <input name="price"><br>
���� : <input name="director"><br> �ó�ý� :
<textarea name="synopsis" rows="1" cols="20"></textarea>
<br> 
�帣 : <select name="genre">
		<option value="����">����</option>
		<option value="ȣ��">ȣ��</option>
		<option value="���">���</option>
		<option value="�̽��׸�">�̽��׸�</option>
	</select> <br> <input type="submit" value="����">
</form>
</body>
</html>