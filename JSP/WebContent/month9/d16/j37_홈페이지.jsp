<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행 -->
<!-- 아래 두개 파일과 연결 -->
<!-- j37_top.jsp -->
<!-- j37_bot.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table width="600" border="1">
	<!-- top -->
	<tr height="150">
		<td width="600" align="center">
			<%@ include file="j37_top.jsp" %>
		</td>
	</tr>
	
	<!-- center -->
	<tr height="400">
	<td width="600" align="center">
	<img src="avatar.jpg" width="500" height="300">
	
	<!-- bottom -->
	<tr height="150">
		<td width="600" align="center">
			<%@include file="j37_bot.jsp" %>
		</td>
	</tr>
	</table>
	</center>

</body>
</html>