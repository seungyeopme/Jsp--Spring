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
Member be=new favoBean(); 
-->
<jsp:useBean id="be" class="bean.favoBean">

	<!-- JSP내용을 자바빈 클래스에 데이터를 넣는다 -->
	<!-- 전체 다 매핑시킨다 -->
	<jsp:setProperty name="be" property="*"/>
</jsp:useBean>

<h3>
좋아하는 음악은 <jsp:getProperty property="music" name="be"/>
입니다.</h3>


<h3>좋아하는 색상은 <%=be.getColor()%>입니다.</h3>
<!-- 
request로 넘어온 데이터를
자바 빈이랑 매핑시켜부는 것이 useBean
-->
</body>
</html>