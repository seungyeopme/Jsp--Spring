<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	int dan=Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border='1' width='800'>
		<tr aligin='center' bgcolor='#FFFF66'>
			<td colspan='2'><%=dan %>단 출력 </tr>
		</tr>
		<%
			for(int i=1; i<10; i++) {
		%>
			<tr align='center'>
				<td width='400'>
					<%=dan %> * <%=i %>
				</td>
				<td width='400'>
					<%=i*dan %>
				</td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>