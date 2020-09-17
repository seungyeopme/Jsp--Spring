<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="mem" class="bean.Member">
	<%
		mem.setId("미미");
		mem.setEmail("aa@naver.com");
	%>
아이디: <%=mem.getId()%><br>
이메일: <%=mem.getEmail()%>
</jsp:useBean>

</body>
</html>