<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="mgr" class="bean.MemberMgr" />
<%
	request.setCharacterEncoding("euc-kr");
	
	String id=request.getParameter("id");
	
	boolean result=mgr.checkid(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
db에 있는 id를 가져오려면..
MemberMgr의 객체를 만든다..
-->
<%
	if(result){
		out.print("이미 존재하는 id입니다.");
	}
	else{
		out.print("사용가능한 id입니다.");
	}
%>
</body>
</html>