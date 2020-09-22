<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a=Integer.parseInt(request.getParameter("num"));
int sum=0;
for(int i=0;i<=a;i++){
sum+=i;
}
%>
<%=sum %>

</body>
</html>