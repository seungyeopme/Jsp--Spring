<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<!-- if문 사용법 -->
<c:if test="${4>3}">
	Hello
</c:if>
<br>
<c:if test="${i>3}">
	안녕하세요
</c:if>

<br>
<!--변수 선언 -->
<c:set var="sum" value="0"/>

<!-- 반복문 for-->
<c:forEach var="i" begin="1" end="10" step="${i=i+2 }" >
	<c:set var="sum" value="${sum=sum+i}"/>
</c:forEach>
${sum }
</body>
</html>