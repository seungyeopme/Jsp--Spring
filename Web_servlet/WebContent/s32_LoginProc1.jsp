<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<%
	String id="pink";
	String pw="1234";
	String name="shin";
	
	if(id.equals(request.getParameter("id"))
	&& pw.equals(request.getParameter("pw"))){
		session.setAttribute("user",name);
		response.sendRedirect("s32_LoginProc2.jsp");
	}
	else{
		response.sendRedirect("s32_LoginForm.jsp");
	}
%>
</body>
</html>