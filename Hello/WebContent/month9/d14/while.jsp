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
		//��û�� ���� �ѱ��� �� �����ϴ� �ڵ�
		request.setCharacterEncoding("EUC-KR");
		
		//���ڿ��� ����ݺ��̶�� ���� �о�鿩��
		//���ڿ��� �ݺ��� Ƚ����ŭ ���
		String m=request.getParameter("msg");
		int n=Integer.parseInt(request.getParameter("num"));
		int cnt=0;
		
		while(n>cnt) {
	%>
	
		<%=m%><!-- jsp -->
	<% 
		cnt++;
		}
	%>

</body>
</html>