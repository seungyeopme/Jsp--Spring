<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="model.MemberDAO" %> 
<!-- MemberDAO Ŭ���� ����Ʈ -->

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
	// ��� ���������� ���� �ϳ��� ���ڿ��� �����ؼ� ����
	mbean.setHobby(txt);
	
	MemberDAO md=new MemberDAO();
	md.insertMember(mbean);
	
	response.sendRedirect("MemberList.jsp");
	//ȸ������ �Ϸ�Ǹ� ȸ������ �����ִ� �������� �̵�.
	
	%>
	
</body>
</html>
	




