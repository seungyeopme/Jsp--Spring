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
	String java = request.getParameter("jave");
	String jsp = request.getParameter("jsp");
	String jquery = request.getParameter("jquery");
	String spring = request.getParameter("spring");

	int a = Integer.parseInt(java);
	int b = Integer.parseInt(jsp);
	int c = Integer.parseInt(jquery);
	int d = Integer.parseInt(spring);
%>
<%!
	double avg(int a,int b, int c, int d){
		return (a+b+c+d)/4;
	}
	String pass(double a){
		String b;
	if(a>=60){
		b="������Ʈ ����";
	}else{
		b="�米�� �ǽ�";
	}
	return b;
	}
%>
���� ����� : <%=avg(a,b,c,d) %><br>
<%=pass(avg(a,b,c,d)) %>
</body>
</html>