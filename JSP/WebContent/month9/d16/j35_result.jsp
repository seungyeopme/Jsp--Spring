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
	int age=Integer.parseInt(request.getParameter("age"));

	if(age<15) {
%>
	<script type="text/javascript">
		alert("15�� �̸��� ���� �Ұ���");
		history.go(-1);
	</script>		
<%	
	}
	else{
		request.setAttribute("name","����"); //���⸦ name�� �ְڴ�.
		RequestDispatcher re=request.getRequestDispatcher("j35_connect.jsp");
		
		re.forward(request, response);	
	}
%>
</body>
</html>