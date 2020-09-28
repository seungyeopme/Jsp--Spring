<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
2. 다음을 보고 코드를 구현해라.

(개발 시 유효성 체크를 할 때 보통 자바스크립트 파일로 설정한다.)
아이디, 나이는 반드시 입력되어야 하고 나이는 수치 데이터만 입력가능하도록 
유효성을 체크하는 자바스크립트 파일

s26_param.jsp 파일을 포함시켜 아이디, 나이에 데이터가 잘 
입력되었는지 점검하여 서블릿으로 입력된 값을 받아 전송(html 폼 구조)

param.java(서블릿)

Html 문서의 입력 양식에 입력한 내용을 처리하는 서블릿 클래스
-->
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function on() {
	if(document.form.id.value==""){
		alert("아이디 입력해라");
		return false;
	}
	else if(document.form.age.value==""){
		alert("나이 입력해라");
		return false;
	}
	else if(isNaN(document.form.age.value)){
		alert("숫자로 입력해라");
		return false;
	}
	else 
		return true;
}
</script>
</head>
<body>
<form name="form" action="param" method="post">
아이디 : <input name="id"><br>
나이: <input name="age">
<input type="submit" value="전송" onclick="on()">
</form>
</body>
</html>