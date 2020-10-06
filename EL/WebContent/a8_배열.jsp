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
<table border="1" style="text-align:center;">
<tr>
	<th>index</th>
	<th>count</th>
	<th>food</th>
</tr>
<c:forEach var="f" items="${food}" varStatus="status">
<tr>
	<td>${status.index}</td>
	<td>${status.count}</td>
	<td>${f}</td>
</tr>
</c:forEach>
</table>
</body>
</html>