<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="month9.d24.s20_MemberBean" %>
<%@ page import="month9.d24.s20_MemberDAO" %>
<%@ page import="java.util.Vector" %>
<!-- 여기서 실행 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 모든 회원 정보 가져오는 파일 -->
<%
	//객체 생성
	//DAO: Data Access Object 데이터 접근 객체
	s20_MemberDAO md=new s20_MemberDAO();
	
	Vector<s20_MemberBean> v= 
			md.allMember();
%>
<center>
<table width="800" border="1">
	<tr height="50">
		<td align="center" width="150">아이디</td>
		<td align="center" width="250">이메일</td>
		<td align="center" width="200">전화번호</td>
		<td align="center" width="200">취미</td>
	</tr>
	
	<%
		for(int i=0; i<v.size(); i++) {
			
			//멤버빈 객체에 저장시켜라.
			s20_MemberBean bean=v.get(i);
	%>
	<tr height="50">
		<td align="center" width="150">
		<a href="MemberIn.jsp?id=<%=bean.getId() %>"><%=bean.getId() %></a></td>
		<td align="center" width="150"><%=bean.getEmail() %></td>
		<td align="center" width="150"><%=bean.getTel() %></td>
		<td align="center" width="150"><%=bean.getHobby() %></td>
	</tr>
	<%
		}
	%>
</table>
</center>
</body>
</html>