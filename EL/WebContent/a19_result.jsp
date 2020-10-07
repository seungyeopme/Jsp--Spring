<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<!-- 
c:forEach => 1~9까지 1씩 증가
짝수 행일 때는 좋아하는 색
홀수 행은 yellow
 -->
<c:set var="gu" value="${param.gu }" />
<table width="500" align="center" border="1">
	<tr align="center" bgcolor="yellow">
		<td colspan="2">
			<c:out value="${gu }" />
		</td>
	</tr>
	<c:forEach var="dan" begin="1" end="9" varStatus="status">

	<c:choose>
	<c:when test="${dan%2==1 }">
	<tr bgcolor="yellow">
		<td>${gu }*${dan }</td>
		<td>${gu*dan }</td>
	</tr>
	</c:when>

	<c:when test="${dan%2==0 }">
	<tr bgcolor="red">
		<td>${gu }*${dan }</td>
		<td>${gu*dan }</td>
	</tr>
	</c:when>
	</c:choose>
	</c:forEach>
</table>
</body>
</html>