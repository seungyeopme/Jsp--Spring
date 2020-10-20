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
	<form:form action="r" modelAttribute="data1">
		<form:select path="s1">
			<form:option value="data1">one</form:option>
			<form:option value="data2">two</form:option>
			<form:option value="data3">three</form:option>
		</form:select>
		
		<form:select path="s2">
			<form:options items="${requestScope.dd }"/>
		</form:select>
	</form:form>
</body>
</html>