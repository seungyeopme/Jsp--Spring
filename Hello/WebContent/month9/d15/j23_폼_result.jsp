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
		//jsp �ڵ�
		request.setCharacterEncoding("EUC-KR");
		
		String name=request.getParameter("name");
		out.println("�̸� : "+ name + "<br>");
		
		String gender=request.getParameter("gender");
		out.println("����");
		
		if(gender.equals("male")) {
			out.println("���� <br>");
		}
		else 
			out.println("���� <br>");
			
			String sing[]=request.getParameterValues("sing");
			
			out.println("�����ϴ� ����");
			for(String str:sing) {
				int n=Integer.parseInt(str);
				
				switch(n) {
				case 1:
					out.println("���̳ʸ���Ʈ");
					break;
				case 2:
					out.println("���� ������ ����");
					break;
				case 3:
					out.println("����");
					break;
				case 4:
					out.println("������");
					break;
				}
			}
	%>
	<a href='javascript:history.go(-1)'>����</a>

</body>
</html>