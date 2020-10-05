<%@page import="model.BoardBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//전체 게시글 내용을 jsp로 갖고온다.
	BoardDAO bdao=new BoardDAO();

	//전체 게시글을 리턴받는다.
	Vector<BoardBean> vec=bdao.getAllBoard();
%>
<center>
<h2>전체 게시글</h2>
<table width="700" border="1" bgcolor="blue">
<!-- 번호, 제목, 작성자, 작성일, 조회수 -->
	<tr height="40">
		<td width="50" align="center">번호</td>
		<td width="300" align="center">제목</td>
		<td width="100" align="center">작성자</td>
		<td width="150" align="center">작성일</td>
		<td width="100" align="center">조회수</td>
	</tr>
	<%
		//벡터에 저장되어 있는 빈클래스들을 하나씩 추출한다.
		for(int i=0;i<vec.size();i++) {
			BoardBean bean=vec.get(i);
		
	%>
	<tr height="40">
		<td width="50" align="center"><%=i+1%></td>
		<td width="300" align="left">
			<a href="BoardInfo.jsp?num=<%=bean.getNum()%>">
			<%=bean.getSubject() %>
			</a>
		</td>
		<td width="100" align="center"><%=bean.getWriter() %></td>
		<td width="150" align="center"><%=bean.getReg_date() %></td>
		<td width="100" align="center"><%=bean.getRe_readcount() %></td>
	</tr>
<% 
		}
%>
	<tr height="40">
		<td align="center" colspan="5">
			<input type="button" value="글쓰기" onclick="location.href='BoardWriteForm.jsp'">
		</td>
	</tr>
</table>
</center>
</body>
</html>