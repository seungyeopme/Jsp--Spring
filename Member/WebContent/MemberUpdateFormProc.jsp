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
	// �н����尡 ���ٸ� ���̺� ����
}else{ %>
	<script type="text/javascript">
	alert("�н����� ����ġ. �ٽ�Ȯ��!");
	history.go(-1);
	</script>
	
<% } %>

</body>
</html>