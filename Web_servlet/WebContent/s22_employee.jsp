<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
다음 구조의 Employee 테이블을 생성하고 데이터를 추가해 테이블 출력해라.
(employee.jsp 파일 생성해서 구현) 
테이블 구조
Name
varchar2
20

Address
varchar2
50

Ssn
varchar2
50

데이터들
tom
seoul
970224-1039234

juli
pusan
001222-1038782

Jack
ulsan
981221-1829192
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	Connection con=null;
	Statement stmt=null;
	ResultSet r=null;

	String url="jdbc:oracle:thin:@192.168.1.168:1521/orcl";
	String id="sys as sysdba";
	String pass="1234";
	String sql="select * from Employee";
%>

<%
	try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection(url, id, pass);
	stmt=con.createStatement();
	r=stmt.executeQuery(sql);

	out.print("<table>");
	while(r.next()){
		out.print("<tr>");
		out.print("<td>"+r.getString(1)+"</td>");
		out.print("<td>"+r.getString(2)+"</td>");
		out.print("<td>"+r.getString(3)+"</td>");
		out.print("</tr>");
	}
	out.print("</table>");
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(r!=null)r.close();
		if(stmt!=null)stmt.close();
		if(con!=null) con.close();
}catch(Exception e){
	e.printStackTrace();
	}
}
%>
</body>
</html>