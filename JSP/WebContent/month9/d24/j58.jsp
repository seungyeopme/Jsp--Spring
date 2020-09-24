<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<!-- 
좋아하는 계절을 체크박스로 설정한다. (checked)
value는 정수
-->
<form action="j58_connect.jsp">
<input type="checkbox" name="season" value="1">봄
<input type="checkbox" name="season" value="2" checked="checked">여름
<input type="checkbox" name="season" value="3">가을
<input type="checkbox" name="season" value="4">겨울
<input type="submit" value="전송">
</form>
</body>
</html>