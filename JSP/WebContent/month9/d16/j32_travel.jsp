<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
가고 싶은 여행지를 
select~option으로 만들어 신청하면 이렇게 출력된다.

다시 조회라는 하이퍼링크를 누르면 이전 페이지로 이동한다.
<a href = '.a.jsp'> 다시 조회
국내 여행: 울산
해외 여행: 홍콩
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method=get action="j32_travel_result.jsp">
		국내 여행: 
		<select name="kor">
			<option value="Ulsan">울산</option>
			<option value="Busan">부산</option>
		</select>
		<br>
		해외 여행:
		<select name="notkor">
			<option value="Kyoto">교토</option>
			<option value="Osaka">오사카</option>
		</select>
		<input type="submit" value="확인">
	</form>
</body>
</html>