<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
id:_________________
pw:_________________
제출버튼

<h2>
당신의 아이디는 __이고 패스워드는 __입니다.
</h2>

request: 사용자 정보가 저장되어 있는 객체 request의 getParameter()를 이용해서 사용자의 정보 추출
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
	%>
	<h2>아이디는<%=id%>이고 패스워드는 <%=pw%>입니다 </h2>
</body>
</html>