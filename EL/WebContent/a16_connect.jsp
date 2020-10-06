<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<c:choose>

<c:when test="${param.rad==1 }">

<c:redirect url="a16_1.jsp"></c:redirect>

</c:when>

<c:otherwise>

<c:redirect url="a16_2.jsp"></c:redirect>

</c:otherwise>

</c:choose>
</body>
</html>