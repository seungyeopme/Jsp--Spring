<%@page import="unit01.Member"%>
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
<!-- JSTL -->
<c:out value="hello world" />

<br>

<c:set var="msg" value="hi"></c:set>
${msg}

<br>

<c:set var="age">20</c:set>
${age}

<br>

<c:set var="mem" value="<%=new unit01.Member()  %>"></c:set>
<c:set target="${mem}" property="name" value="kim"></c:set>
<c:set target="${mem}" property="id" value="kim0309"></c:set>
${mem}


</body>
</html>