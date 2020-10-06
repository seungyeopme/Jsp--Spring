<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<c:forEach var="cnt" begin="1" end="10" varStatus="status">
${cnt}
</c:forEach>
</body>
</html>