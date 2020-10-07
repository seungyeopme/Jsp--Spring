<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 
학점을 가져와서 score 변수에 넣기
시험 점수 출력 -> c:out

90점 이상 ~ 100점 미만 -> A학점
80점 이상 ~ 90점 미만 -> B학점
그 외 F
-->
<!DOCTYPE html>
<html>
<body>

<c:set var="score" value="${param.score }" />
<c:out value="${score }" />

<!--  
<c:if test="${param.score>=90 }">
A학점
</c:if>
<c:if test="${param.score>=80 and param.score<=90  }">
B학점
</c:if>
<c:if test="${param.score<79 }">
F학점
</c:if>
-->

<c:choose>
<c:when test="${score>=90 && score<=100 }">A학점
</c:when>

<c:when test="${score>=80 && score<=90 }">B학점
</c:when>

<c:otherwise>F학점</c:otherwise>
</c:choose>

</body>
</html>