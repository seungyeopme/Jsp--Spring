<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
글쓰기 버튼을 누르면 BoardWriteProc.jsp로 이동 
전체게시글보기 누르면 BoardList.jsp로 이동
-->
<html>
<head>
<meta charset="UTF-8">
<style>
	td{
		width: 200px;
	}
	table{
		background-color: skyblue;
	}
	
</style>
</head>
<body>
<center>
<h2>게시글 쓰기</h2>
</center>
<form action="BoardWriteProc.jsp" method="post">
<center>
<table border="1">
<tr>
	<td>작성자</td>
	<td><input style="width:300px;" type="text" name="writer"></td>
</tr>
<tr>
	<td>제목</td>
	<td><input style="width:300px;" type="text" name="title"></td>
</tr>
<tr>
	<td>이메일</td>
	<td><input style="width:300px;" type="email" name="email"></td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input style="width:300px;" type="password" name="password"></td>
</tr>
<tr height="170px">
	<td>글내용</td>
	<td>
		<textarea name="content" rows="10" cols="30"></textarea>
	</td>
</tr>
<tr>
	<td colspan="2">
		<center>
		<input type="submit" name="b1" value="글쓰기">&nbsp;&nbsp;
		<input type="reset" name="b2" value="다시작성">&nbsp;&nbsp;
		<input onclick="location.href='BoardList.jsp'" type="button" name="b3" value="전체 게시글보기">
		</center>
	</td>
</tr>
</table>
</center>
</form>
</body>
</html>