<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="model.MemberDAO" %> 
<!-- MemberDAO 클래스 임포트 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<% 
	request.setCharacterEncoding("euc-kr");
	String hobby[]=request.getParameterValues("hobby");
	String txt=" ";
	for(int i=0;i<hobby.length;i++){
		txt+=hobby[i];
		
	}
%>

<jsp:useBean id="mbean" class="model.Memberbean">
<jsp:setProperty property="*" name="mbean"/>
</jsp:useBean>

<% 
	// 취미 복수선택한 값을 하나의 문자열로 저장해서 셋팅
	mbean.setHobby(txt);
	
	MemberDAO md=new MemberDAO();
	md.insertMember(mbean);
	
	response.sendRedirect("MemberList.jsp");
	//회원가입 완료되면 회원정보 보여주는 페이지로 이동.
	
	%>
	
</body>
</html>
	




