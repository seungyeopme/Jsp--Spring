<%@page import="model.BoardBean"%>
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
	int num=Integer.parseInt(request.getParameter("num").trim());
	BoardDAO bdao=new BoardDAO();

	BoardBean bean=bdao.getOneBoard(num);
%>
<center>
<h2>게시물 보기</h2>
<!-- 글번호, 조회수, 작성자, 작성일, 이메일, 제목, 글내용 -->
<table width="600" border="1" bgcolor="blue">
	<tr height="40">
		<td align="center" width="180"><%=bean.getNum() %>
		<td align="center" width="120">조회수</td>
		<td align="center" width="180"><%=bean.getReadcount() %></td>
	</tr>
	<tr height="40">
		<td align="center" width="120">작성자</td>
		<td align="center" width="180"><%=bean.getWriter() %>
		<td align="center" width="120">작성일</td>
		<td align="center" width="180"><%=bean.getReg_date() %></td>
	</tr>
	<tr height="40">
		<td align="center" width="120">이메일</td>
		<td align="center" colspan="3"><%=bean.getEmail() %>
	</td>
	</tr>
	<tr height="40">
		<td align="center" width="120">제목</td>
		<td align="center" colspan="3"><%=bean.getSubject() %>
	</td>
	</tr>
	<tr height="40">
		<td align="center" width="120">글내용</td>
		<td align="center" colspan="3"><%=bean.getContent()%></td>
	</tr>
	<tr height="40">
		<td align="center" colspan="4">
		<input type="button" value="답글쓰기" onclick="location.href='BoardReWriteForm.jsp?num=<%=bean.getNum()%>
		&ref=<%=bean.getRef()%>
		&re_step=<%=bean.getRe_step()%>
		&re_level=<%=bean.getRe_level()%>"'>
</table>
</center>


</body>
</html>