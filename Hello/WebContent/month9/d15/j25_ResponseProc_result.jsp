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
	request.setCharacterEncoding("EUC-KR");
	String id="aaa";
	String pw="1234";
	
	String i=request.getParameter("id");
	String p=request.getParameter("pass");
	
	if(id.equals(i) && pw.equals(p)){
		//둘 다 일치하면 메인페이지 뜨게
		response.sendRedirect("j25_main.jsp?i="+i);
	}
	else{
%>
	<script>
		alert("로그인 실패");
		history.go(-1);
	</script>
<%
	}
%>

</body>
</html>