<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("EUC-KR");

%>

<c:if test="${empty param.id }">
	아이디를 입력해라.
</c:if>

<c:if test="${not empty param.id}">
	안녕하세요 <c:out value="${param.id }님"></c:out>
</c:if>

</body>
</html>