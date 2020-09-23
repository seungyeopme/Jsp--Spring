<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
라디오 버튼에 따라 jsp:forward태그를 이용하여 이동할 페이지를 
따로 만들어라(s18_connect.jsp)

m을 선택하면 man.jsp로 이동해 “man” , w를 선택하면 
woman.jsp로 이동해 “woman”출력
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="s18_connect1.jsp" method="get">
<input type="radio" name="gender" value="man">남
<input type="radio" name="gender" value="woman">여
<input type="submit" value="제출">
</form>
</body>
</html>