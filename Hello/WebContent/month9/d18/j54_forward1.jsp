<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행 -->
<!-- 
j54_forward1.jsp => forward 태그를 사용해 페이지 이동
                    param 태그를 사용해 값 지정
j54_forward2.jsp => 값 읽어와서 출력

실행 결과) 홍길동님의 취미는 수영입니다.
-->
<%
	request.setCharacterEncoding("euc-kr");
%>
<%
	String name="홍길동";
	String swim="수영";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 
<jsp:forward page="j54_forward2.jsp">
		<jsp:param name="name" value="<%=name %>" />
		<jsp:param name="swim" value="<%=swim %>" />	
</jsp:forward>

</body>
</html>