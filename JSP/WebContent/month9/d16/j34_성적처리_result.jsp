<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String name=request.getParameter("name");
	int kor=Integer.parseInt(request.getParameter("kor"));
	int eng=Integer.parseInt(request.getParameter("eng"));
	int math=Integer.parseInt(request.getParameter("math"));

	//����, ���
	//���� -> 90�� �̻��̸� A
	int total=kor+eng+math;
	double avg=total/3.0;
	String score="";
	
	if(avg>=90) {
		score="A";
	}else if(avg>=80) {
		score="B";
	}
	else {
		score="F";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<ul>
	<li>�̸�: <%=kor %></li>
	<li>���: <%=avg %></li>
	<li>���: <%=score %></li>
</ul>
</body>
</html>