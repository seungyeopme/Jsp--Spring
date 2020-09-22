<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
콤보박스에 select~option(naver, daum, google) 세 항목을 만들고 항목을 선택하여 해당 사이트로 이동하는 프로그램을 작성해라.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" method="get" action="s4_result.jsp">
	<select name="site">
    	<option value="http://www.naver.com">naver</option>
    	<option value="http://daum.net">daum</option>
    	<option value="http://google.com">google</option>
    	<input type="submit" value="전송">
	</select>
	
	</form>

</body>
</html>