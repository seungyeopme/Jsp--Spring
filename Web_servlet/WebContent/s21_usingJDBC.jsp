<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, month9.d23.*" %>

<jsp:useBean id="reg" class="month9.d23.s21_RegisterM"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" bordercolor="red">
      <tr><td>ID</td>
          <td>PW</td>
          <td>NAME</td>
          <td>EMAIL</td>
          <td>ADR</td>
          <td>JOB</td>
     </tr>
     <%
     	//getRegi()함수 호출
     	Vector<s21_RegisterBean> v=reg.getRegi();
     	
     	for(int i=0;i<v.size();i++) {
     		//벡터의 값을 registerbean 객체에 저장..
     		s21_RegisterBean regi=v.get(i);
     %>
     <tr>
     	<td><%=regi.getId() %></td>
     	<td><%=regi.getPw() %></td>
     	<td><%=regi.getName() %></td>
     	<td><%=regi.getEmail() %></td>
     	<td><%=regi.getAdr() %></td>
     	<td><%=regi.getJob() %></td>
     </tr>
     <%} %>
     </table>
</body>
</html>