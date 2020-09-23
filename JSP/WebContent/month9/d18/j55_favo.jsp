<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="j55_favorite.jsp" method="post">
	<fieldset>
		<legend>좋아하는 색</legend>
	<div>
		<input type="checkbox" name="color" value="red">빨간색
	</div>
	<div>
		<input type="checkbox" name="color" value="blue">파란색
	</div>
	<div>
		<input type="checkbox" name="color" value="green">녹색
	</div>
	</fieldset>
	
	<fieldset>
		<legend>좋아하는 음악</legend>
	<div>
		<input type="checkbox" name="music" value="kpop">케이팝
	</div>
	<div>
		<input type="checkbox" name="music" value="jpop">제이팝
	</div>
	<div>
		<input type="checkbox" name="music" value="pop">팝
	</div>
	</fieldset>
<div>
		<input type="submit" value="제출">
</div>

</form>

</body>
</html>