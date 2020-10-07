<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<form action="a20_FilePrc.jsp" method="post" enctype="multipart/form-data">
<table width="300" border="1">
	<tr height="40">
		<td width="100">이름</td>
		<td width="200"><input type="text" name="name"></td>
	</tr>

	<tr height="40">
		<td width="100">파일 선택</td>
		<td width="200"><input type="file" name="f"></td>
	</tr>
	
	<tr height="40">
		<td colspan="2" align="center">
			<input type="submit" value="파일업로드">
		</td>
	</tr>
</table>
</form>
</body>
</html>