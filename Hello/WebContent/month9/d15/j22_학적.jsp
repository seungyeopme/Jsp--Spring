<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="j22_result.jsp">
	����: <input name="name"> <br>
	�й�: <input name="id"> <br>
	����: <input type="radio" name="gender" value="����" checked="checked">����
	<input type="radio" name="gender" value="����">���� <br>
	����: 
	<select name="major">
    	<option value="kor">�����а�</option>
    	<option value="eng">�����а�</option>
    	<option value="chn">�߹��а�</option>	
    </select>
    <br>
    <input type="submit" value="������">
</form>
</body>
</html>