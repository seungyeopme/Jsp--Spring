<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<%
	java.util.List<String> season = new java.util.ArrayList<String>();
	season.add("spring");
	season.add("summer");
	season.add("fall");
	season.add("winter");
	
	request.setAttribute("list", season);
	request.setAttribute("index", 1);
	
	//겨울 출력
	//3가지 방법으로 winter 출력
%>
${list[3]}
<br>
${list[index+2]}


</body>
</html>