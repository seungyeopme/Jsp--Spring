<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="month9.d24.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- s20_MemberList.jsp에서 넘긴 id를 받아줌 -->
<%
	//해당하는 id의 회원정보 리턴받겠다.
	String id =request.getParameter("id");
	s20_MemberDAO md=new s20_MemberDAO();
	s20_MemberBean mbean=md.oneMember(id);
%>
<center>
<h1>회원 정보</h1>
</center>
<table width="800" border="1">
	<tr height="50">
		<td align="center" width="150">아이디</td>
		<td width="250"><%=mbean.getId() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">이메일</td>
		<td width="250"><%=mbean.getEmail() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">전화</td>
		<td width="250"><%=mbean.getTel() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">취미</td>
		<td width="250"><%=mbean.getHobby() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">직업</td>
		<td width="250"><%=mbean.getJob() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">나이</td>
		<td width="250"><%=mbean.getAge() %></td>
	</tr>
	
	<tr height="50">
		<td align="center" width="150">하고싶은말</td>
		<td width="250"><%=mbean.getInfo() %></td>
	</tr>
</body>
</html>