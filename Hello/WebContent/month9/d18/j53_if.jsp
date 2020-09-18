<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
다음을 보고 코드 구현해라.
j53_if.html => 이름, 좋아하는 색에 대한 폼 구조(option)
j53_if.jsp => 좋아하는 색 value값이랑 비교해서 출력

실행 결과 => ~는 ~색을 좋아하네요.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("euc-kr");

	String n=request.getParameter("name");
	String c=request.getParameter("color");
%>
<%=n %>는 <%=c %>색을 좋아하네요.
</body>
</html>