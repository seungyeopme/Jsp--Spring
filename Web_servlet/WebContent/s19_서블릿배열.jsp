<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
원하는 항목 값을 얻어와 서블릿 클래스에서 출력해라.(s19.java)

취미는 for문으로 출력하고 "다시" 라는 하이퍼링크를 누르면
전 페이지로 이동시켜라.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="s19"><!-- 서블릿에 전송 -->
<span style="float:left;
			margin-right:10px">
<label for="job">직업</label>
<select id="job" name="job" size="1">
<option value="student">student</option>
<option value="IT">IT</option>
<option value="doctor">doctor</option>
</select>
</span>

<label for="inter" style="float:left;">취미</label>
<select id="inter" name="inter" size="4" multiple="multiple">
<option value="tennis">tennis</option>
<option value="walking">walking</option>
<option value="swim">swim</option>
<option value="health">health</option>
</select>

<input type="submit" value="sub">

</form>

</body>
</html>