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
	request.setCharacterEncoding("EUC-KR");
	String id="aaa";
	String pw="1234";
	
	String i=request.getParameter("id");
	String p=request.getParameter("pass");
	
	if(id.equals(i) && pw.equals(p)){
		//�� �� ��ġ�ϸ� ���������� �߰�
		response.sendRedirect("j25_main.jsp?i="+i);
	}
	else{
%>
	<script>
		alert("�α��� ����");
		history.go(-1);
	</script>
<%
	}
%>

</body>
</html>