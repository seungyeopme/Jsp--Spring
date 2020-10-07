<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<c:forTokens var="city" items="서울.부산.울산.전주" delims=",">
${city}
</c:forTokens>
</body>
</html>