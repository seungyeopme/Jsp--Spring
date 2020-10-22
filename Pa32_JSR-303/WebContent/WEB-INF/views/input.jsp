<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="in" method="post" modelAttribute="data1">
		s1:<form:radiobutton path="s1" value="true"/>true
			<form:radiobutton path="s1" value="false"/>false<br>
			<form:errors path="s1" />
		
		s2:<form:radiobutton path="s2" value="true"/>true
			<form:radiobutton path="s2" value="false"/>false<br>
			<form:errors path="s2" />
		
		s3:<form:input type="text" path="s3" />
			<form:errors path="s3" /><br>
		
		s4:<form:input type="text" path="s4" />
			<form:errors path="s4" /><br>
			
		s5:<form:checkbox path="s5" value="ch1" />ch1
			<form:errors path="s5" /><br>
		
		s6:<form:checkbox path="s6" value="ch2" />ch2
			<form:errors path="s6" /><br>
			
		s7:<form:input type="text" path="s7" />
			<form:errors path="s7" /><br>
		
		s8:<form:input type="text" path="s8" />
			<form:errors path="s8" /><br>
		
		s9:<form:input type="text" path="s9" />
			<form:errors path="s9" /><br>

		<form:button type="submit">확인</form:button>
	</form:form>
	<!-- 
	<form:form action="in" method="post" modelAttribute="data1">
	s1:<form:input path="s1" type="text" />
		<form:errors path="s1" />
	s2:<form:input path="s2" type="text" />
		<span style="color: red">
		<form:errors path="s2" />
		</span>
	<form:button type="submit">확인</form:button>
	</form:form>
	 -->
	<!--  
	<form action="in" method="post">
	s1:<form input name="data1" type="text">
	<spring:hasBindErrors name="data1">
	<c:if test="${errors.hasFieldErrors('s1')}">
		<spring:message code="${errors.getFieldError('s1').codes[0]}"></spring:message>
	</c:if>
	</spring:hasBindErrors>
	-->
</body>
</html>