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
		mem.setId("�̹�");
		mem.setEmail("aa@naver.com");
	%>
���̵�: <%=mem.getId()%><br>
�̸���: <%=mem.getEmail()%>
</jsp:useBean>

</body>
</html>