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
		//요청된 값이 한글일 때 세팅하는 코드
		request.setCharacterEncoding("EUC-KR");
		
		//문자열과 몇번반복이라는 값을 읽어들여서
		//문자열이 반복한 횟수만큼 출력
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