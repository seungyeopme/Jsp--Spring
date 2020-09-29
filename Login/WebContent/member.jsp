<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script.js"></script>

<script type="text/javascript">
function idCheck(id){
	//frm=document.regFrm;
	if(id=="") {
		alert("아이디 입력해라");
		//frm.id.focus();
		return;
	}
	else{
	//jsp 쿼리 스트링
	url="idCheck.jsp?id="+id;
	window.open(url,"check", "width=200, height=100");
	}
}
function zipSearch(){
	url="zipSearch.jsp?search=s";
	window.open(url,"zip","width=500, height=300, scrollbars=yes")
	
}
</script>

</head>
<body onload="regFrm.id.focus()">
<div align="center">
<form name="regFrm" action="memberProc.jsp" method="post">
<table border="1">
<tr>
	<td colspan="3">회원가입</td>
</tr>
<tr>
	<td>아이디</td>
	<td>
		<input name="id" type="text">
		<input type="button" value="ID중복확인" onclick="idCheck(document.regFrm.id.value)">
	</td>
	<td>
		아이디 적어라
	</td>
</tr>
<tr>
	<td>
		패스워드
	</td>
	<td>
		<input type="text">
	</td>
	<td>
		패스워드 적어라
	</td>
</tr>
<tr>
	<td>
		패스워드 확인
	</td>
	<td>
		<input type="text">
	</td>
	<td>
		패스워드 확인
	</td>
</tr>
<tr>
	<td>
		이름
	</td>
	<td>
		<input type="text">
	</td>
	<td>
		이름 적어라
	</td>
</tr>
<tr>
	<td>
		성별
	</td>
	<td>
		<input type="radio" name="gender"value="m">남
		<input type="radio" name="gender"value="f">여
	</td>
	<td>
		성별 선택해라
	</td>
</tr>
<tr>
	<td>
		생년월일
	</td>
	<td>
		<input type="text">ex)861111
	</td>
	<td>
		생년월일 적어라
	</td>
</tr>
<tr>
	<td>
		Email
	</td>
	<td>
		<input type="text">
		<input type="button" value="우편번호찾기" onclick="zipSearch()")>
	</td>
	<td>
		우편번호 검색
	</td>
</tr>
<tr>
	<td>
		주소
	</td>
	<td>
		<input type="text">
	</td>
	<td>
		주소를 적어라
	</td>
</tr>
<tr>
	<td>
		취미
	</td>
	<td>
		<input type="checkbox" name="hobby" value="h1">여행
		<input type="checkbox" name="hobby" value="h2">영화
		<input type="checkbox" name="hobby" value="h3">독서
		<input type="checkbox" name="hobby" value="h4">수영
		<input type="checkbox" name="hobby" value="h5">테니스
	</td>
	<td>
		취미선택
	</td>
</tr>
<tr>
	<td>
		직업
	</td>
	<td>
		<select name="job">
    		<option value="">선택해라</option>
    		<option value="1">회사원</option>
    		<option value="2">공무원</option>
    		<option value="3">학생</option>
		</select>
	</td>
	<td>
		직업선택
	</td>
<tr>
	<td colspan="3">
		<input type="button" value="회원가입" onclick="inputCheck()">
		<input type="reset" value="다시쓰기">
		<input type="button" value="로그인" onclick="javascript:location.href='login.jsp'">
	</td>
</tr>
</table>
</form>
</div>
</body>
</html>