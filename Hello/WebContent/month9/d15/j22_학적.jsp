<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="j22_result.jsp">
	성명: <input name="name"> <br>
	학번: <input name="id"> <br>
	성별: <input type="radio" name="gender" value="남자" checked="checked">남자
	<input type="radio" name="gender" value="여자">여자 <br>
	전공: 
	<select name="major">
    	<option value="kor">국문학과</option>
    	<option value="eng">영문학과</option>
    	<option value="chn">중문학과</option>	
    </select>
    <br>
    <input type="submit" value="보내기">
</form>
</body>
</html>