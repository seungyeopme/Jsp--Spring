<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<body>
<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
${now }
<br>
<fmt:formatDate value="${now }"/>
<br>
<fmt:formatDate value="${now }" type="date"/>
<br>
<fmt:formatDate value="${now }" type="time"/>
</body>
</html>