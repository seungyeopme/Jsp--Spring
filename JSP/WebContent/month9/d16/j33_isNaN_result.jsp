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
		int n=Integer.parseInt(request.getParameter("num"));
		
		for(int i=1; i<=n; i++){
			out.println(i);
		}
	%>

</body>
</html>