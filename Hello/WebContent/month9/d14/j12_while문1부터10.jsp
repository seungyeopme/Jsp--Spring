<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 1~10까지 합 (while문) -->
	
	<!-- 자바 코드 -->
	<%
		int sum = 0;
		int i = 0;

        while(i++ < 10) {
			sum += i;
		}
        //out.println(sum); 
	%>
	
	<!-- jsp 코드 -->
	while문 1~ 10까지의 합은 <%=sum%>
</body>
</html>