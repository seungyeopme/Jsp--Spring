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

<회원 가입/ 수정 /삭제 프로그램>

1. MemberJoin.jsp

(HTML5로 폼 구조 만듬) - "회원가입"버튼을 누르면 MemberJoinProc.jsp 로 페이지 이동

​

2. MemberJoinProc.jsp

- MemberJoin.jsp에서 입력했던 값들을 읽어들인다.(useBean사용)

- 회원들 삽입, 삭제, 수정을 위해 MemberDAO라는 클래스를 만듬

- "회원가입"버튼을 눌르면 회원이 추가되기 때문에 insertMember라는 함수를 호출했다.

insertMember함수는 MemberDAO에서 만들것이다.

- 회원가입을 하면 목록이 뜨도록 MemberList.jsp로 페이지 이동

​

3. MemberDAO.java

- 오라클 데이터 베이스에 연결하고 select,insert,update,delete작업을 실행해주는 클래스

- 입력한 정보들을 데이터 베이스(테이블)에 저장하기 위해 만듬

insertMember(): 한 사람의 회원 정보를 저장한다(추가)

                     입력폼에서 적은 데이터들을 테이블에 저장한다(setString)

allMember(): 모든 회원들을 조회한다(select * from mem)

                 모든 회원들이기 때문에 가변적길이인 Vector사용해서 

                 입력폼에서 적은 데이터들을 테이블에 저장한다(setString)

oneMember(): 한 사람 회원을 조회(id를 기준으로) 

                   한 사람 회원이기때문에 모든 정보들을 담고 있는 MemberBean클래스를 사용해서

       입력폼에서 적은 데이터들을 테이블에 저장한다(setString) 

getPass(String id): 매개변수 id를 기준으로 비밀번호가 맞는지 판단한다.

updateMember(MemberBean bean): 회원정보를 수정하고 싶으면 비밀번호를 입력해

                                                비밀번호가 맞으면 수정가능할 수 있도록 구현(update)

deleteMember(String id): 비밀번호를 입력해 비밀번호가 맞으면한 사람의 회원 삭제할 수 있도록 delete 명령 써서 구현          

​

4. MemberBean.java

useBean을 사용해 데이터 읽어들일 수 있도록 만듬(set:저장 get:얻기)

​

5. MemberList.jsp            

모든 회원의 정보를 출력해야하므로 MemberDAO에서 만든 Vector객체 생성하고 allMember()함수 호출한다. 웹에 모든 회원정보를 출력해야 한다. 즉 <table>태그를 사용해 id는 하이퍼링크 형태, 나머지 값은 폼에서 입력했던 값이 저장되었던 MemberBean.java에 있던 get()를 호출하여 출력한다.

​

6. MemberIn.jsp

- Memberlist에서 넘긴 id를 받아주고, 데이터 베이스에서 한회원의 정보를 가져옴

- table태그를 이용하여 회원의 정보를 리턴받는다.

- 버튼을 만들어 페이지 이동시킨다.(수정, 삭제, 목록보기, 회원가입)

​

7. MemberUpdateForm.jsp

- 회원정보수정하기 위해 id를 기준(하이퍼링크)으로 MemberDAO에서 만든 oneMember()호출한다.

"회원전체보기"버튼도 만들어 MemberList.jsp로 이동

"수정"버튼을 누르면 MemberUpdateProc.jsp페이지로 이동

​

8. MemberUpdateProc.jsp

"회원수정하기"버튼 누르면 수정할수 있도록 비밀번호가 일치하는지 확인하기위해

MemberDAO에서 만든 getPass함수 호출해 입력했던 비밀번호가 현재 입력한 비밀번호를 확인

비밀번호가 일치하면 MemberDAO에서 만든 update()함수 호출해서 수정할 수 있도록 구현

(update set where~~) 수정 후 다시 MemberList.jsp로 이동(잘 수정되었는지 보기 위해)

비밀번호 안맞으면 자바스크립트로 경고창 뜨게함(alert)

​

9. MemberDeleteForm.jsp

- 회원정보삭제하기 위해 id를 기준(하이퍼링크)으로 id값 불러온다.

"회원전체보기"버튼도 만들어 MemberList.jsp로 이동

"삭제"버튼을 누르면 MemberDeleteProc.jsp페이지로 이동

​

10. MemberDeleteProc.jsp

MemberUpdateProc.jsp와 비슷하게 비밀번호 확인해서 일치하면 MemberDAO에서 만든 delete()함수 호출해 삭제됨 (delete from where) 삭제 후  다시 MemberList.jsp로 이동(잘 수정되었는지 보기 위해)

비밀번호 안맞으면 자바스크립트로 경고창 뜨게함(alert)
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