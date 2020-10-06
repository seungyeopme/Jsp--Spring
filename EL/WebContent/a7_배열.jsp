<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<%
	String [] food={"pizza", "chicken", "burger"};
	pageContext.setAttribute("food", food);
%>
<c:forEach var="f" items="${food}">
${f }
</c:forEach>
</body>
</html>