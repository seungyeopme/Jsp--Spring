<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.168:1521/orcl","sys as sysdba","1234");
	PreparedStatement pstm=con.prepareStatement("insert into item values(?,?,?)");

	try{
		pstm.setString(1,request.getParameter("name"));
		pstm.setInt(2,Integer.parseInt(request.getParameter("price")));
		pstm.setString(3,request.getParameter("description"));

		pstm.executeUpdate();
		pstm.close();
		con.close();

		out.print("전송완료");
		}catch(Exception e){
			System.out.print("오류");
		}
%>
</body>
</html>