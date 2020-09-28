<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
text-align: center;
}
table{
width:70%;
margin: 0 auto;
}
td{
height: 50px;
}
</style>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//사용자 컴퓨터의 쿠키 저장소부터
	//쿠키값을 읽어들임

	//값이 몇개인지 모르기 때문에 배열을 사용하여
	//쿠기 값을 저장한다.
	Cookie [] co=request.getCookies();
	
	String id="";
	
	//쿠키 값이 없을 수도 있기 때문에 null 처리 준다.
	if(co!=null) {
		for(int i=0; i<co.length; i++) {
			if(co[i].getName().equals("id")){
				id=co[i].getValue();
				break;
			}
			//원하는 데이터를 찾았기에 반복문 빠져나옴
		}
	}
%>

<h2>쿠키</h2>
<form name="f" action="s27_CookieLoginProc.jsp" method="post">
<table border="1px">
<tr>
<td>아이디</td>
<td><input name="id" value="<%=id %>"></td>
</tr>
<tr>
<td>패스워드</td>
<td><input type="password" name="pw"></td>
</tr>
<tr>
<td colspan="2"><input type="checkbox" name="save">아이디 저장</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="로그인"></td>
</tr>
</table>
</form>
</body>
</html>