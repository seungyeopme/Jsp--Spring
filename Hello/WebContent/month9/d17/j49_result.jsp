<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
영화 정보 조회 시스템

년도
영화 select~option
예약버튼

=> 영화 정보 조회
년도: 2020년
영화명: 날씨의 아이

다시조회(하이퍼링크)
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
	String year="2020년";
	String movie=request.getParameter("movie");
%>

<h2>영화 정보 조회</h2>
년도 :<%=year%><br>
영화명 :<%=movie%><br>

<a href='javascript:history.go(-1)'>다시조회</a>
</body>
</html>