<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String name=request.getParameter("name");
	String id=request.getParameter("id");
	String nic=request.getParameter("nic");
	int pw=Integer.parseInt(request.getParameter("pw"));
	String email=request.getParameter("email");
	String tel=request.getParameter("tel");
%>
<script type="text/javascript">
	alert("가입완료");
</script>
<h1>입력된 정보 확인</h1>
이름 : <%= name %><br>
아이디: <%= id %><br>
별명: <%= nic %><br>
비밀번호: <%= pw %><br>
이메일: <%= email %><br>
전화번호: <%= tel %><br>
<a href='javascript:history.go(-1)'>뒤로가기</a>
</body>
</html>