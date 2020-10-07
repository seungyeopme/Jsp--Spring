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
%>
<select name="season">
<%
	java.util.ArrayList list=(java.util.ArrayList)request.getAttribute("list");

	//출력
	for(int i=0; i<list.size(); i++) {
%>
<option value="<%=list.get(i) %>"> <%=list.get(i) %>
<%
	}
%>
</select>
</body>
</html>