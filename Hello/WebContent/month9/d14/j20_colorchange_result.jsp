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
	request.setCharacterEncoding("EUC-KR");
%>
<%
	String color = request.getParameter("color");
%>
<script type="text/javascript">
	document.body.style.background ="<%=color%>";
</script>

������
<%=color%>���� �����Ѵ�.
</body>
</html>