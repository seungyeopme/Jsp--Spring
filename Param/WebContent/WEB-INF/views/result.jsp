<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>result</h2>
	<a href='t1?a=10&b=20&c=30'>t1</a><br>
	<form action='t2' method='post'>
		a:<input name="a"><br>
		b:<input name="b"><br>
		c:<input name="c"><br>
		<input type="submit" value="submit">
	</form>
	<a href='t3?a=10&b=20&c=30'>t3</a><br>
	<a href='t4/10/20/30'>t4</a><br>
	<a href='t5?a=10&b=20&c=30'>t5</a><br>
	<a href='t6?a=10&b=20&c=30'>t6</a><br>
</body>
</html>