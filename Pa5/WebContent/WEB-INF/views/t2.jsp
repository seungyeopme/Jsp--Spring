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
<!-- path: id, name 속성으로 지정된다. model 값 추출해서 value에 저장 -->
	<form:form modelAttribute = "ma" action="r" >
	이름:<form:input path="name" />
	아이디:<form:input path="id"/>
	비밀번호:<form:input path="pw"/>
	<button type="submit">확인</button>
	</form:form>
</body>
</html>