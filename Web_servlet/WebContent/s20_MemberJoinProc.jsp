<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%@ page import="month9.d24.s20_MemberDAO" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String []hobby=request.getParameterValues("hobby");
	String txt=" ";
	
	//체크박스는 복수 선택가능하니까 이렇게 처리
	for(int i=0; i<hobby.length; i++) {
		txt+=hobby[i];
	}
%>
<!-- useBean을 이용해 한꺼번에 데이터를 받기 -->
<jsp:useBean id="mbean" class="month9.d24.s20_MemberBean"> <!-- 상위패키지.하위패키지.자바빈 파일명 -->
	<jsp:setProperty name="mbean" property="*"/>
</jsp:useBean>

<%
	//배열 내용을 하나의 스트링으로 저장한 변수를 입력
	mbean.setHobby(txt);

	//
	s20_MemberDAO md=new s20_MemberDAO();
	md.insertMember(mbean);
	
	//회원가입 완료 되면
	//회원정보 보여주는 페이지로 이동
	response.sendRedirect("s20_MemberList.jsp");
%>
</body>
</html>