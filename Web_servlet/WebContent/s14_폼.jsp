<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
아이디: --------
패스워드: ------
패스워드확인: -------
이메일:---------
전화번호:-------
당신의 취미: (체크박스) 캠핑 영화 독서...
당신의 직업: (셀렉트옵션) 교사 학생 직장인...
당신의 연령: (라디오) 10대 20대 30대...
하고싶은말: (textarea)
회원가입: (submit)
취소: (reset)

MemberJoin.jsp
-->
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MemberJoin.jsp" method="get">
<table>
	<tr>
		<td>아이디: <input type="text" name="id"></td>
	</tr>
	<tr>
		<td>패스워드: <input type="password" name="pw1"></td>
	</tr>
	<tr>
		<td>패스워드확인: <input type="password" name="pw2"></td>
	</tr>
	<tr>
		<td>이메일: <input type="email" name="email"></td>
	</tr>
	<tr>
		<td>전화번호: <input type="tel" name="tel"></td>
	</tr>
	<tr>
		<td>
			당신의 취미: <input type="checkbox" name="hobby" value="h1">캠핑
		</td>
	</tr>
	<tr>
		<td>당신의 직업: <input type="text" name="job"></td>
	</tr>
	<tr>
		<td>당신의 연령: <input type="text" name="age"></td>
	</tr>
	<tr>
		<td>하고싶은말: <textarea></textarea></td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="회원가입">
			<input type="reset" value="취소">
		</td>
	</tr>
</table>
</form>

</body>
</html>