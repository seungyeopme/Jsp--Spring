<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 1~10���� �� (while��) -->
	
	<!-- �ڹ� �ڵ� -->
	<%
		int sum = 0;
		int i = 0;

        while(i++ < 10) {
			sum += i;
		}
        //out.println(sum); 
	%>
	
	<!-- jsp �ڵ� -->
	while�� 1~ 10������ ���� <%=sum%>
</body>
</html>