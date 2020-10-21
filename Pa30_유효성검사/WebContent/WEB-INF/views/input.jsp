<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="in" method="post">
	s1: <input type="text" name="s1"><br>
	<spring:hasBindErrors name="data1">
		<c:if test="${errors.hasFieldErrors('s1') }">
               ${errors.getFieldError('s1').defaultMessage}   
  		</c:if>
	</spring:hasBindErrors>
	
	s2: <input type="text" name="s2"><br>
	<spring:hasBindErrors name="data1">
		<c:if test="${errors.hasFieldErrors('s2') }">
               ${errors.getFieldError('s2').defaultMessage}   
        </c:if>
	</spring:hasBindErrors>
	<button type="submit">확인</button>
	</form>
</body>
</html>