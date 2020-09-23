<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	
	String []hobby=request.getParameterValues("hobby");
	String txt=" ";
	
	//체크박스는 복수 선택가능하니까 이렇게 처리
	for(int i=0; i<hobby.length; i++) {
		txt+=hobby[i];
	}
%>
<!-- useBean을 이용해 한꺼번에 데이터를 받기 -->
<jsp:useBean id="mbean" class="month9.d23.s20_MemberBean"> <!-- 상위패키지.하위패키지.자바빈 파일명 -->
	<jsp:setProperty name="mbean" property="*"/>
</jsp:useBean>

<%
	//배열 내용을 하나의 스트링으로 저장한 변수를 입력
	mbean.setHobby(txt);

	String id="sys as sysdba";
	String pass="1234";
	String url="jdbc:oracle:thin:@192.168.0.14:1521/orcl";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,id,pass);
		
		//해당 데이터 베이스에 접속!!
		String sql="insert into Mem values(?,?,?,?,?,?,?,?)";
		
		//바인드 변수에 맞게 데이터 맵핑
		//바인드 변수 => ? ? ? ? ? ? ? ?
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		//setString(get)
		pstmt.setString(1,mbean.getId());
		pstmt.setString(2,mbean.getPw1());
		pstmt.setString(3,mbean.getEmail());
		pstmt.setString(4,mbean.getTel());
		pstmt.setString(5,mbean.getHobby());
		pstmt.setString(6,mbean.getJob());
		pstmt.setString(7,mbean.getAge());
		pstmt.setString(8,mbean.getInfo());
		
		//insert, update, delete 사용 시 쓰는 메소드
		pstmt.executeUpdate();
		
		con.close();
	}catch(Exception e) {
		e.printStackTrace();		
	}
%>
완료
</body>
</html>