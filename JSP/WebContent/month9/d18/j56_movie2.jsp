<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="mu1" class="bean.MovieBean">
<jsp:setProperty property="*" name="mu1" />
</jsp:useBean>
<center>
<table>
<tr>
	<td>영화제목</td>
	<td>
		<jsp:getProperty property="title" name="mu1" />
	</td>
</tr>
<tr>
	<td>가격</td>
	<td>
		<jsp:getProperty property="price" name="mu1" />
	</td>
</tr>
<tr>
	<td>감독</td>
	<td>
		<jsp:getProperty property="director" name="mu1" />
	</td>
</tr>
<tr>
	<td>시놉시스</td>
	<td>
		<jsp:getProperty property="synopsis" name="mu1" />
	</td>
</tr>
<tr>
	<td>장르</td>
	<td>
		<jsp:getProperty property="genre" name="mu1" />
	</td>
</tr>
</table>
</center>
</body>
</html>