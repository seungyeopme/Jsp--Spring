<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="month9.d25.s24_Person">
<jsp:setProperty property="*" name="p"/>
</jsp:useBean>
<table>
<tr>
<td>이름: </td><td><%=p.getName() %></td>
</tr>
<tr>
<td>별명: </td><td><%=p.getNic() %></td>
</tr>
<tr>
<td>직업: </td><td><%=p.getJob() %></td>
</tr>
<tr>
<td>메일: </td><td><%=p.getMail() %></td>
</tr>
</table>
</body>
</html>