<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  
1. 라디오버튼으로 성별(m,w)를 준 후 선택하여 m을 선택하면 man, w를 
선택하면 woman을 출력해라. (jsp파일 두개로 코드 작성) 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="s16_connect.jsp">
<input type="radio" name="gender" value="m">m<br>
<input type="radio" name="gender" value="w">w<br>
<input type="submit" value="제출">
</form>

</body>
</html>