<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>클라이언트를 얻어온 쿠키들</h2>
<%
	Cookie [] c=request.getCookies();
	for(Cookie cook: c) {
		out.print(cook.getName()+":"+cook.getValue());
	}
%>
</body>
</html>