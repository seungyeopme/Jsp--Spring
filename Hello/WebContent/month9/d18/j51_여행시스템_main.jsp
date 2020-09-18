<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
여행 필드셋
복수 선택 (체크 박스)    
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j51_result.jsp" method="post">
	<fieldset>
		<legend>여행</legend>
	<div>
		<input type="checkbox" name="place" value="busan">부산
	</div>
	<div>
		<input type="checkbox" name="place" value="ulsan">울산
	</div>
	<div>
		<input type="checkbox" name="place" value="seoul">서울
	</div>
</fieldset>
<div>
		<input type="submit" value="제출">
</div>

</form>
</body>
</html>