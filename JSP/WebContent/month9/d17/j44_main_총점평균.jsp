<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
- input()메소드
java, jsp, jquery, spring 4개 과목 점수를 전달받아 메소드를 구현해라.

- avg()메소드 
총점 전달받아 평균구하여 리턴받는 메소드

- pass()메소드
평균 전달받아 결과를 문자열로 리턴받는 메소드
60점 이상이면 "프로젝트 투입"
60점 미만이면 "재교육 실시"
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="j44_result.jsp">
		JAVA : <input name="jave"><br>
		JSP : <input name="jsp"><br>
		JQUERY : <input name="jquery"><br>
		Spring : <input name="spring"><br>
		<input type="submit" value="제출">
	</form>
</body>
</html>