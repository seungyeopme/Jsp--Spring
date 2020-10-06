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
<c:url value="C:/Users/sys03/Desktop/1.jpg" var="data"></c:url>

${data}
<img src="${data}" width="100" height="100">

<br>
<c:set var="age" value="39" scope="page"></c:set>
<c:out value="${age}"></c:out>

<c:remove var="age" scope="page"></c:remove>
<c:out value="${age}">10</c:out>
<br>
<c:catch var="err">예외
	<%=1/0%>
</c:catch>
<c:out value="${err }"></c:out>
</body>
</html>