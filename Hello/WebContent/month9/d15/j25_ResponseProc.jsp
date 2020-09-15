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
<form action="j25_ResponseProc_result.jsp" method="get">
	<table width="400" border="1">
		<tr height="60">
			<td align="center" width="150">아이디</td>
			<td align="left" width="250">
				<input type="text" name="id">
			</td>
		</tr>

 		<tr height="60">
			<td align="center" widt="150">패스워드</td>
			<td align="left" width="250">
				<input type="password" name="pass">
			</td>
		</tr>

 		<tr height="60">
			<td colspan="2" align="center">
				<input type="submit" value="전송">
			</td>
		</tr>
	</table>
</form>
</center>
</body>
</html>