<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="r" modelAttribute="data1">
		<form:select path="s1">
			<form:option value="data1">one</form:option>
			<form:option value="data2">two</form:option>
			<form:option value="data3">three</form:option>
		</form:select>
		
		<form:select path="s2">
			<form:options items="${requestScope.dd }"/>
		</form:select>
		
		<form:checkbox path="s5" value="data1"/>one
		<form:checkbox path="s5" value="data2"/>two
		<form:checkbox path="s5" value="data3"/>three
		
		<br>
		
		<form:checkboxes items="${requestScope.dd }" path="s6"/>
		
		<hr>
		
		<form:radiobutton path="s4" value="data1"/>one
		<form:radiobutton path="s4" value="data2"/>two
		<form:radiobutton path="s4" value="data3"/>three
		
		<form:radiobuttons path="s3" items="${requestScope.dd }"/>
		
	</form:form>
</body>
</html>