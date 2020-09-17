<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
영화 정보 조회 시스템

년도
영화 select~option
예약버튼

=> 영화 정보 조회
년도: 2020년
영화명: 날씨의 아이

다시조회(하이퍼링크)
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j49_result.jsp" method="post">
<h2>영화 예매</h2>
영화선택:<select name="movie">
    <option value="날씨의 아이" selected>날씨의 아이</option>
    <option value="내안의 그놈">내안의 그놈</option>
    <option value="추격자">추격자</option>
    <option value="광해">광해</option>
</select>
<input type="submit" value="예약">
</form>

</body>
</html>