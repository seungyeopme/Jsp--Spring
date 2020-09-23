<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 문자열 배열 하나 선언  -->
	<%!
		String name[]={"java","script","jsp"};
	%>
	
	<table border="1">
	<% 
		for(int i=0; i<name.length; i++) { 
	%>
			<tr>
				<td><%=i%></td>
				<td><%=name[i]%></td>
			</tr>
		<%}%>
	</table>
</body>
</html>