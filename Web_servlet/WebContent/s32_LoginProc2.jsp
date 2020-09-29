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
	//name값을 얻어와 name이 null이면
	//s32_LoginForm.jsp로 페이지 이동
	//null이 아니면 (  )님 안녕하세요!
	if(session.getAttribute("user")==null){
		response.sendRedirect("s32_LoginForm.jsp");
		
	}else{
		
	%>
		<%=session.getAttribute("user")%>님 안녕하세요
		<form method="post"
		action="s32_Logout.jsp">
		<input type="submit" value="로그아웃">
		</form>
<% 	
	}
%>
</body>
</body>
</html>