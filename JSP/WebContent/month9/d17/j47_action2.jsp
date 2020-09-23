<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>정보 출력</h2>
<%
	request.getParameter("euc-kr");
%>
<!-- 
JSP에서의 객체 생성!!
Member be=new Member(); 
-->
<jsp:useBean id="be" class="bean.Member">

	<!-- JSP내용을 자바빈 클래스에 데이터를 넣는다 -->
	<!-- 전체 다 매핑시킨다 -->
	<jsp:setProperty name="be" property="*"/>
</jsp:useBean>

<h3>
너의 아이디는 <jsp:getProperty property="id" name="be"/>
</h3>

<h3>
너의 비번은 <jsp:getProperty property="pw" name="be"/>
</h3>

<h3>
너의 이메일은 <jsp:getProperty property="email" name="be"/>
</h3>

<h3>너의 전화번호는 <%=be.getTel()%></h3>
<!-- 
request로 넘어온 데이터를
자바 빈이랑 매핑시켜부는 것이 useBean
-->
</body>
</html>