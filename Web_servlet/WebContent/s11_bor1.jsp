<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
Border클래스(자바빈)를 만든 후 정보를 입력받는 bor1.jsp와 이를 처리하는 bor2.jsp를 작성해라.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="s11_bor2.jsp">
name: <input name="name"><br>
pass: <input name="pass"><br>
email: <input name="email"><br>
title: <input name="title"><br>
content: <textarea name="content" cols="30" rows="10"></textarea><br>
<input type="submit" value="제출">
</form>
</body>
</html>