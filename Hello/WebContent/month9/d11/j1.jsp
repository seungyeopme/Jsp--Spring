<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		//멤버변수, 메소드 선언 영역
		String name="jsp";
		int id=123;
	%>
	<%
		String n=name+"java";
	%>
	
	결과:<%=name%>
	결과1:<%=n%>

</body>
</html>