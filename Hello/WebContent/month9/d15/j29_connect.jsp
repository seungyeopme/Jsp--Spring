<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- j29.html ���Ͽ��� ���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
		
		String food=request.getParameter("food");
		String pro=request.getParameter("pro");
		
		String id=(String)session.getAttribute("ii");
		
		String str=session.getId();
		
		if(id!=null) {
	%>	
		<%=food %>�� ���� �����Ѵ�.
		<%=pro %>�� ���� ��մ�.
		
		<%
			//���ǰ�ü �����Ű�� �Լ�
			session.invalidate();
		}else{
			out.println("���� �Ұ���");
		}
		%>
</body>
</html>