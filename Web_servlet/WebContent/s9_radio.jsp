<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
서블릿으로 다 출력하고 "다시"라는 하이퍼링크 누르면 이전페이지로 이동시켜라
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="s9_radio">
<label for="gen">성별</label>
<input type="radio" id="gen" value="man">man
<input type="radio" id="gen" value="woman">woman<br><br>

<label for="con">가입인사</label>
<textarea id="con" name="con" rows="3" cols="35"></textarea>
<input type="submit" value="전송">
</form>
</body>
</html>