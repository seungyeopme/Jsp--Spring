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
<h2>회원 가입</h2>
<form action="j47_action2.jsp" method="post">
<table width="500" border="1">
	<tr height="50">
		<td width="150" align="center">
			아이디
		</td>
		<td width="350" align="center">
			<input type="text" name="id" size="30"
			placeholder="id입력해요">
		</td>
	</tr>
	
	<tr height="50">
		<td width="150" align="center">
			패스워드
		</td>
		<td width="350" align="center">
			<input type="password" name="pw" size="30"
			placeholder="비번은 영문자만">
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
			전화번호
		</td>
		<td width="350" align="center">
			<input type="tel" name="tel" size="30">
		</td>
	</tr>
	
	<tr height="50">
		<td align="center" colspan="2">
			<input type="submit" value="회원가입">
		</td>
	</tr>
</table>
</form>
</center>
</body>
</html>