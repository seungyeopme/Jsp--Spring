<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>

	<table border="1" width="800">
	<!-- top -->
	<tr heigth="150">
		<td align="center" colspan="2">
			<jsp:include page="j37_top.jsp"/>
		</td>
	</tr>

	<!-- left -->
	<tr heigth="300">
		<td align="center" width="200">
			<jsp:include page="j37_left.jsp"/>
		</td>
		<!-- center -->
		<td align="center" width="600">
			<jsp:include page="j37_center.jsp"/>
		</td>
	</tr>
	
	<!-- bottom -->
	<tr heigth="100">
		<td align="center" colspan="2">
			<jsp:include page="j37_bot.jsp"/>
		</td>
	</tr>
	</table>
</body>
</html>