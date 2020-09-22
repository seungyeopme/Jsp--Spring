<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
id, age값에 아무것도 입력 안하면 alert 출력
나이에 문자열로 입력했을 경우에도 alert 출력(isNaN)
-->
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function check() {
	if(document.fo.id.value==""){
		alert("아이디 입력");
		return false;
	}
	else if(document.fo.age.value=="") {
		alert("나이 입력");
		return false;
	}
	else if(isNaN(document.fo.age.value)){//문자열일 때 TRUE
		alert("숫자로 입력해라");
		return false;
	}
	else{
		return true;
	}
}

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="s7_para_connect" name="fo">
아이디:<input name="id"><br>
나 이:<input name="age"><br>
<input type="submit" value="전송" onclick="check()"> 
</form>
</body>
</html>