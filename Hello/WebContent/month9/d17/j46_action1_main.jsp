<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
j46_action1.jsp => Html5구조 만든다.
j46_action2.jsp => 이전 페이지에서 선택한 라디오버튼에 따라 forward태그를 이용해 이동할 페이지를 달리한다.
j46_action3.jsp => 사용자를 누르면 배경색이 red로 출력
j46_action4.jsp => 관리자를 누르면 배경색이 yellow로 출력
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j46_action2.jsp" method="get">
아이디:<input name="id"> <br>
암 호:<input type="password" name="pw"><br>
<input type="radio" name="admin" value="1">사용자
<input type="radio" name="admin" value="2">관리자
<br>
<input type="submit" value="로그인">
</form>
</body>
</html>