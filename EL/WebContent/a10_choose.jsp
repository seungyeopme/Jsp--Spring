<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<%
	String[]name={"오섭","용석","승철"};
	pageContext.setAttribute("name", name);
%>
<ul>
<c:forEach var="n" items="${name}" varStatus="status">
	<c:choose>
		<c:when test="${status.first}">
			<li style="color:orange;">${n}</li>
		</c:when>
		<c:otherwise>
			<li>${n}</li>
		</c:otherwise>
	</c:choose>
</c:forEach>
</ul>

<c:forEach var="n" items="${name}" varStatus="status">
	${n} 
	<c:if test="${not status.last}"> , </c:if>
</c:forEach>
</body>
</html>