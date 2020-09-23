<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
정수 하나 입력받아

정수:_________
확인버튼

확인버튼을 누른후 50보다 크면 "50보다 크다" 
                               작으면 "50보다 작다"
-->
<!-- 여기서 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="j19_connect.jsp">
		정수입력: <input name="num">
		<input type="submit" value="확인">
	</form>
</body>
</html>