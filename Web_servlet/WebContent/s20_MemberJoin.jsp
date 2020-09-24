<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 여기서 실행 -->
<!-- 
s20_MemberJoin.jsp
s20_MemberList.jsp
위 두개 파일에서 실행!!
-->
<!-- 
s20_MemberBean: 자바빈클래스
(getter, setter)
->useBean으로부터 한꺼번에 데이터를 받아옴

s20_MemberJoin.jsp : HTML 폼 형식
-> 전송버튼 ->s20_MemberJoinProc.jsp 페이지 이동

s20_MemberJoinProc.jsp: 데이터 값들 다 받아옴
s20_MemberDAO: DB에 대한 코드(접속, 쿼리문들...)
                  입력한 값들을 테이블에 삽입 등 조작
s20_MemberList.jsp: 삽입한 데이터들 폼으로 뜸
s20_MemberIn.jsp: MemberList.jsp에서 넘긴 id를 받아줌
	       데이터베이스에서 한 회원의 정보 가져옴
-->
<!DOCTYPE html>
<html>
<head>
<style>
	

</style>
</head>
<body>
<form action="s20_MemberJoinProc.jsp" method="get">
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
			<input type="checkbox" name="hobby" value="h2">영화
			<input type="checkbox" name="hobby" value="h3">독서
		</td>
	</tr>
	<tr>
		<td>
			당신의 직업:<select name="job">
						<option value="teacher">교사</option>
						<option value="lawyer">변호사</option>
						<option value="doctor">의사</option>
					</select> 
		</td>
	</tr>
	<tr>
		<td>당신의 연령: <input type="radio" name="age" value="t1">10대
					  <input type="radio" name="age" value="t2">20대
					  <input type="radio" name="age" value="t3">30대
		
		</td>
	</tr>
	<tr>
		<td>하고싶은말: <textarea name="info"></textarea></td>
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