<%@page import="model.Memberbean"%>
<%@page import="model.MemberDAO"%>
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
String id=request.getParameter("id");
MemberDAO md=new MemberDAO(); // 디비 쿼리문 실행할 객체 생성
Memberbean mbean= md.oneMember(id);
%>
<center>
<h1>회원 정보 수정</h1>
<table width="800" border="1">
<form action="MemberUpdateFormProc.jsp" method="post">
   <tr height="50">
   <td align="center" width="150">ID</td>
   <td width="250"><%=mbean.getId() %></td>
   </tr>
   <tr height="50">
   <td align="center" width="150">EMAIL</td>
   <td width="250"><input type="email" name="email" value="<%=mbean.getEmail() %>"></td>
   </tr>
   <tr height="50">
   <td align="center" width="150">TEL</td>
   <td width="250"><input type="tel" name="tel" value="<%=mbean.getTel() %>"></td>
   </tr>
   <tr height="50">
   <td align="center" width="150">PASSWORD</td>
   <td width="250"><input type="password" name="pw1" value="<%=mbean.getPw1() %>"></td>
   </tr>
   
   <tr height="50">
   <td align="center" colspan="2">
   <input type="hidden" name="id" value="<%=mbean.getId() %>">
   <input type="submit" value="수정완료">
</form>
	<button onclick="location.href='MemberList.jsp'">회원 전체보기</button>
	</tr>
</table>
</center>
</body>
</html>