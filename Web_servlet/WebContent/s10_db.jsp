<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,month9.d22.*" %>
<%@ page import="java.sql.*" %>

<!-- s10_db.java와는 별개의 파일 -->

<!-- 
1. Class.forName()
=> 메소드를 이용해 JDBC드라이버를 로딩시킴

2. Connection객체
=> 데이터베이스에 연결해 작업을 수행할 수 있도록 만들어주는 중요 객체 

Connection은 객체 생성할 수 없다. (Connection은 인터페이스이다.)
------------------------------------------------------여기까지 하면 데이터베이스에 접근가능
실제 sql문을 실행하기 위해서는 Statement 객체를 생성해야함!!!

Statement stmt = conn.createStatement();

1. executeQuery() => select문과 같이 결과값이 여러 개일 경우에 사용됨
2. executeUpdate() => insert, update, delete문을 이용할 때는 주로 이 함수를 사용
					  (테이블 내용이 변경만 되고 결과값이 없을 경우에 사용됨)
					  
String sql="select * from student";
ResultSet r=stmt.executeQuery(sql);

while(r.next()){
	int age=r.getInt(1);
	String name=r.getString(2);
}
ResultSet => 반환된 값을 저장(행)

값을 가져올 때
int age=r.getInt(1);

PreparedStatement (Statement의 서브 인터페이스) (Statement의 단점 극복)
=> 간단하게 쿼리문을 작성할 수 있도록 

PreparedStatement pstmt=con.preparedStatement(sql);

String sql="insert into stu values(?,?,?,?,?)

? => 바인드 변수(매번 값이 바뀔 수 있으므로 미리 정해 놓지 않음)

pstmt.setString(1,name);
-->
<%
	Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	
	//1.JDBC드라이버 인스턴스 생성
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String id="",
		   pwd="",
		   name="",
		   email="",
		   phone="",
		   adr="",
		   job="";
	
	int cnt=0;
	//2.JDBC드라이버의 인스턴스를 통해 DBMS와 연결 생성
	try{
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.14:1521/orcl",
				"sys as sysdba", "1234");
		
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from tbl");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <table border="1" bordercolor="yellow">
   <tr>
      <td>ID</td>
      <td>PWD</td>
      <td>NAME</td>
      <td>EMAIL</td>
      <td>ADR</td>
      <td>JOB</td>
   </tr>
   <%
      if(rs!=null){
         while(rs.next()){
            id=rs.getString("id"); //내가 적은 id 값 가져오기
            pwd=rs.getString("pwd");
            name=rs.getString("name");
            email=rs.getString("email");
            adr=rs.getString("adr");
            job=rs.getString("job");
            %>
      <tr>
         <td><%=id%></td>
         <td><%=pwd%></td>
         <td><%=name%></td>
         <td><%=email%></td>
         <td><%=adr%></td>
         <td><%=job%></td>
      </tr>
   </table>
   <%
         }
      }
         }catch(Exception e){
            System.out.println("exception");
         }
         rs.close();
         stmt.close();
         con.close();
   %>
</body>
</html>