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
	String coffee=request.getParameter("coffee_menu");
	int num=Integer.parseInt(request.getParameter("num"));
	int money=Integer.parseInt(request.getParameter("money"));
	
	int gae=0;
	int total=0;
	int namuge=0;
	String co=" ";
	
	switch(coffee) {
	case "americano":
		gae=4000;
		break;
	case "latte":
		gae=4500;
		break;
	case "capuchino":
		gae=4500;
		break;
	
	case "frpuchino":
		gae=4500;
		break;
	}
	total=gae*num;
	namuge=money-total;
%>
<ul>
	<li>Ŀ������:<%=coffee %></li>
	<li>���� <%=gae %></li>
	<li>�ѱݾ�<%=total %></li>
	<li>�Ž�����<%=namuge %></li>
</ul>
</body>
</html>