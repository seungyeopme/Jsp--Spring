<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String inter[]=request.getParameterValues("inter");
	pageContext.setAttribute("inter", inter);
%>
<h3>내가 관심 있는 것</h3>
<ul style="list-style-type: none">
<c:forEach items="${inter }" var="inter" varStatus="status">

		${inter }

</c:forEach>
</ul>
</body>
</html>