<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j56_movie2.jsp" method="post">
영화 제목 : <input name="title"><br> 가격 : <input name="price"><br>
감독 : <input name="director"><br> 시놉시스 :
<textarea name="synopsis" rows="1" cols="20"></textarea>
<br> 
장르 : <select name="genre">
		<option value="공포">공포</option>
		<option value="호러">호러</option>
		<option value="고어">고어</option>
		<option value="미스테리">미스테리</option>
	</select> <br> <input type="submit" value="제출">
</form>
</body>
</html>