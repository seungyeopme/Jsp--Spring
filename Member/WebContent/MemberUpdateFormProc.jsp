<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="mbean" class="model.Memberbean">
<jsp:setProperty property="*" name="mbean"/>
</jsp:useBean>
<%
MemberDAO md=new MemberDAO();
String id=request.getParameter("id");
String pass=md.getPass(id);

if(mbean.getPw1().equals(pass)){
	md.update(mbean);
	// 패스워드가 같다면 테이블 수정
}else{ %>
	<script type="text/javascript">
	alert("패스워드 불일치. 다시확인!");
	history.go(-1);
	</script>
	
<% } %>

</body>
</html>