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
	int dan = 0;
	String inputdan = request.getParameter("dan");
	
	if(inputdan == null) {
		dan = 2;
	} 
	else {
		dan = Integer.parseInt(inputdan);
	}
%>

<table>
<%
	for(int i = 1; i <= 9; i++) {
		out.println("<tr>");
		for(int j =2; j <= dan; j++) {
			out.println("<td>" + j + "*" + i + "=" + j*i + "</td>");
		}
		out.println("</tr>");
	}
%>
</table>

</body>
</html>