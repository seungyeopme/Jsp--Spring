<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
. 라디오버튼으로 성별(m,w)를 준 후 선택하여 m을 선택하면 man, w를 
선택하면 woman을 출력해라. 서블릿으로 변경해라. 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="s17">
<input type="radio" name="gender" value="m">m<br>
<input type="radio" name="gender" value="w">w<br>
<input type="submit" value="제출">
</form>
</body>
</html>