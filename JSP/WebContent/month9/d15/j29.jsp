<%@ 
	page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    session="true"
%>
<!-- j29.html 파일에서 실행 -->
<!-- session="true"=> 디폴트 값이 true이기 때문에 굳이 안 적어주어도 되기는 하다. 현재 페이지의 세션 사용여부 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	session.setAttribute("ii",id);
	session.setMaxInactiveInterval(60);
%>
<form method="post" action="j29_connect.jsp">
	가장 좋아하는 음식은?
	<input type="radio" name="food" value="피자">피자
	<input type="radio" name="food" value="파스타">파스타
	<input type="radio" name="food" value="탕수육">탕수육
	
	좋아하는 언어는?
	<input type="radio" name="pro" value="jsp">제이에스피
	<input type="radio" name="pro" value="java">자바
	<input type="radio" name="pro" value="c">씨언어
	
	<input type="submit" value="결과">
	
	

</form>

</body>
</html>