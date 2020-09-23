<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
여기가 메인!!
다음을 보고 좀 색다르게 이제까지 배웠던 4개의 과목(html, css, 자바스크립트,jsp)을
다 사용해서 출력해라.
-->
<!DOCTYPE html>
<html>
<head>
<style>
	h1{
		text-align:center;
	}
	input[type=submit],input[type=reset]{
		margin:5px 10px;
		border-radius: 3px;
	}
	form{
		text-align: center;
		margin:0 auto;
		background-color: aliceblue;
	}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원의 정보 입력 폼</h1>
<form action="j57_result.jsp">
<table>
<tbody>
<tr>
	<td>
		<span>이름</span>
	</td> 
	<td>
		<input name="name">
	</td>
</tr>

<tr>
	<td>
		<span>아이디</span>
	</td> 
	<td>
		<input name="id">
	</td>
</tr>

<tr>
	<td>
		<span>별명</span>
	</td> 
	<td>
		<input name="nic">
	</td>
</tr>

<tr>
	<td>
		<span>비밀번호</span>
	</td> 
	<td>
		<input type="password" name="pw">
	</td>
</tr>

<tr>
	<td>
		<span>이메일</span>
	</td> 
	<td>
		<input type="email" name="email">
	</td>
</tr>

<tr>
	<td>
		<span>전화번호</span>
	</td> 
	<td>
		<input type="tel" name="tel">
	</td>
</tr>
</tbody>
</table>
<input type="submit" value="전송"><input type="reset" value="취소">
</form>
</body>
</html>