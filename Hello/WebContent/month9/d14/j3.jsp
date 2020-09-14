<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 스크립트릿 => 지역변수 선언, 메소드 선언 불가능 -->
	<% 
	String name= n+ "공부"; 
	%>
	
	<!-- 멤버변수 또는 메소드 선언(일종의 전역변수) 앞에서 선언을 하지 않아도 읽어들인다. -->
	<%! 
	String n="jsp";
	%>
	
	문자열은<%=name %>
</body>
</html>