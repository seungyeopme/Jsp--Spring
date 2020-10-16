<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href='t1?a=10&b=20&c=30'>t1</a>
	<form action="t2" method="post">
		a:<input name="a"><br>
		b:<input name="b"><br>
		c:<input name="c"><br>
		<button type="submit">submit</button>
	</form>
	
	<a href='t4/10/20/30'>test4</a>
	<a href='t5?a=10&b=20&c=30'>test5</a>
</body>
</html>