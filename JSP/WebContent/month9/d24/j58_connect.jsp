<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.bb{
	font-size:40pt;
}

</style>
</head>
<body class="bb">
<!-- 
style적용
for문 switch 이용해서 좋아하는 계절 출력
-->	
<%
	String s[]=request.getParameterValues("season");
	for(int i=0; i<s.length;i++) {
		int n=Integer.parseInt(s[i]);
		
		switch(n) {
		case 1:
			out.print("봄");
			break;
		
		case 2:
			out.print("여름");
			break;
		
		case 3:
			out.print("가을");
			break;
		
		case 4:
			out.print("겨울");
			break;
		}
	}
%>
</body>
</html>