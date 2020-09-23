<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
1. 숫자하나를 입력받아 그 숫자에 해당하는 구구단을 출력해라.
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단의 단수를 입력하세요.</h1>
	<form method=get action="j30_gugudan_result.jsp">
		출력할 구구단 : <input type='text' name='dan'><br>
					<input type="submit" value="출력">
	</form>
</body>
</html>