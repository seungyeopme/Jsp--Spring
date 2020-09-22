<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
아이디 비어있으면 경고
아이디는 4글자 이상이어야 함

inline-block
왼쪽 배치
 -->
<!DOCTYPE html>
<html>
<head>
<style>
	
</style>
<script type="text/javascript">
function on(){
	var id = document.getElementsByName("id");
		if(id.length<=3){
			alert("아이디는 4자 이상")
			return false;
		}
		else
			return true;
		}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="s13" method="get">
이름: <input type="text" name="name"><br>
주민등록번호: <input type="text" name="ju" placeholder="-없이 입력하세요"><br>
아이디: <input type="text" name="id"><br>
비밀번호: <input type="password" name="pass"><br>
비밀번호 확인: <input type="password" name="passcheck"><br>
이메일: <input type="text" name="email"><br>
우편번호: <input type="text" name="post"><br>
주소: <input type="text" name="addr"><br>
핸드폰 번호: <input type="text" name="tel"><br>
직업:
<select name="job">
<option value="student">학생</option>
<option value="programer">컴퓨터/인터넷</option>
<option value="reporter">언론</option>
</select><br>
메일 SMS 정보 수신 <input type="radio" name="yesno" value="yes">수신 <input type="radio" name="yesno" value=no>수신 거부<br>
<input type="submit" value="회원가입" onclick="on()"> <input type="reset" value="취소">
</form>

</body>
</html>