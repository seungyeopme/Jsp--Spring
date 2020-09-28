<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
1.파일을 두개 생성(s25_one.jsp, s25_two.jsp)하여
 jsp:forward태그, jsp:param를 사용하여 two.jsp로 
 페이지를 이동해 “tom의 취미는 tennis이다”라고 출력해라. 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name="tennis";
%>

<jsp:forward page="s25_two.jsp">
	<jsp:param name="name" value="tom"/>
    <jsp:param name="tennis" value="<%=name %>"/>
</jsp:forward>
</body>
</html>
