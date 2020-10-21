<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	aa.a1:<spring:message code="aa.a1" /><br>
	aa.a2:<spring:message code="aa.a2" arguments="${ary }" /><br>
	aa.a3:<spring:message code="aa.a3" /><br>
	bb.b1:<spring:message code="bb.b1" /><br>
</body>
</html>