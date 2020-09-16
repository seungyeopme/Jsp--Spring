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
	
	String name="jisu";
	String id="java";
	String pw="1234";

	if(id.equals(request.getParameter("id"))&&
			pw.equals(request.getParameter("pw"))){
		response.sendRedirect("j38_suc.jsp?name="+name/*+URLEncoder.encode(name,"UTF-8")*/);
	}
	else{
		response.sendRedirect("j38_Log.jsp");
	}
%>

</body>
</html>