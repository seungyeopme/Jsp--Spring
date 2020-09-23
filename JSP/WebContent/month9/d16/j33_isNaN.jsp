<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
1.다음과 같은 웹 페이지를 작성해라. 
자바스크립트 언어로 숫자 부분에 아무것도 입력 안하고 입력완료버튼을 누르면 
“데이터 입력” 이라는 경고창을 출력하고 문자를 입력하면 “문자열은 안된다”라고 
경고창에 출력해라. 숫자를 입력하면 1부터 그 숫자까지 출력된다. 
(isNaN함수 사용 , request 객체 사용)
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function on() {
			if(!isNaN(aa.num.value)){ //숫자, 공백일 경우
				alert("데이터 입력");
				return false;
			}
			if(isNaN(aa.num.value)) {
				alert("문자열은 안된다")
				aa.num.value="";
				return false;
			}
			return true;
		}
	</script>

	<form action="j33_isNaN_result.jsp" name="aa" onsubmit="on()">
	숫자: <input name="num">
	<input type="submit" value="입력완료">
	</form>
</body>
</html>