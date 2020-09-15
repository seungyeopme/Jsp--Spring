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
<form action=j23_폼_result.jsp method="post">
<table>
	<tr>
		<td>이름 :		</td>
		<td>
			<input name="name" size="20">
		</td>
	</tr>
	
	<tr>
		<td>성별 :		</td>
		<td>
			<input type="radio" name="gender" value="male" checked="checked">남자
			<input type="radio" name="gender" value="female">여자
		</td>
	</tr>
	
	<tr>
		<td>좋아하는 가수 : </td>
		<td>
			<input type="checkbox" name="sing" value="1">BTS
			<input type="checkbox" name="sing" value="2">언니네 이발관
			<input type="checkbox" name="sing" value="3">이효리
			<input type="checkbox" name="sing" value="4">화사
		</td>
	</tr>
	
	<tr align="center">
		<td>
			<input type="submit" value="전송">
		</td>
		<td>
			<input type="reset" value="취소">
		</td>
	</tr>
</table>

</form>

</body>
</html>