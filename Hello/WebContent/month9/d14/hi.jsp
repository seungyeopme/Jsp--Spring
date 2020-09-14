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
		String str;
	%>
	
	<%
		//request는 내장객체
		String name=request.getParameter("name");
		String food=request.getParameter("food");
		
		if(food.equals("ramen")) {
			str="ramen";
		}
		else if(food.equals("chicken")){
			str="chicken";
		}
	%>
	좋아하는 음식은 <%=str%>
	
</body>


</html>