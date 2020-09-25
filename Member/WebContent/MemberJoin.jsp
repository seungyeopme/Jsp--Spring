<!-- 
1. Memberbean : 자바빈 클래스(게터세터)
id,pw,job...등등 필드에 입력한 값을 빈 클래스에 저장하는 클래스.
->useBean으로부터 한꺼번에 데이터 받아옴

2. MemberJoin.jsp : HTML 가입 폼

3. MemberJoinProc.jsp : 멤버조인에서 전송 누르면 이동되는 페이지.
-> 멤버조인에 입력된 데이터 모두 자바빈 클래스에 useBean으로 저장.
-> MemberDAO 클래스 호출하여 useBean으로 저장한 데이터 한번에 디비로 저장.
> 작업이 완료되면 MemberList 클래스로 이동(회원정보 모두 띄워주기)

4. MemberDAO : 데이터베이스 연결하는 클래스.
-> db접속, 쿼리문, 등등

5. MemberList.jsp : 입력한 회원정보 화면에 출력하는 페이지.

6. MemberIn.jsp : 멤버리스트에서 아이디 클릭시 이동되는 페이지. 리스트에서 불러온 아이디값을 전달받음.
디비에서 선택된 아이디를 가진 한 회원의 정보 조회
하단에 수정버튼 만들어서 MemberUpdateForm.jsp 페이지로 이동

7. MemberUpdateForm.jsp : 회원정보 수정 폼.

8. MemberUpdateFormProc.jsp : 수정 폼에서 수정된 값 디비로 전송하는 페이지.
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
				<td>아이디:</td>
				<td><input name="id"></td>
			</tr>
			<tr>
				<td>비번:</td>
				<td><input type="password" name="pw1"></td>
			</tr>
			<tr>
				<td>비번확인:</td>
				<td><input type="password" name="pw2"></td>
			</tr>
			<tr>
				<td>이메일:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>번호:</td>
				<td><input type="tel" name="tel"></td>
			</tr>
			<tr>
				<td>당신의 취미:</td>
				<td><input name="hobby" type="checkbox" value="cam">캠핑
					<input name="hobby" type="checkbox" value="movie">영화 <input
					name="hobby" type="checkbox" value="book">독서</td>
			</tr>
			<tr>
				<td>직업:</td>
				<td><select name="job">
						<option value="teacher">교사</option>
						<option value="student">학생</option>
						<option value="sal">회사원</option>
				</select></td>
			</tr>
			<tr>
				<td>연령:</td>
				<td>
				<input name="age" type="radio" value="10s">10대 
				<input name="age" type="radio" value="20s">20대 
				<input name="age" type="radio" value="30s">30대 
				<input name="age" type="radio" value="40s">40대
				</td>
			</tr>
			<tr>
				<td>하고싶은 말:</td>
				<td><textarea name="info" cols="10" rows="3"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="가입"> <input type="reset"
			value="취소">
	</form>
</body>
</html>