<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="data1" action="r">
	<form:hidden path="s1" />
	<form:input path="s2"/>
	<form:password path="s3" showPassword="true" />
	<form:button disabled="true">확인</form:button>
	</form:form>
</body>
</html>