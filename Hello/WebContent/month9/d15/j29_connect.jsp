<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- j29.html 파일에서 실행 -->
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
		<%=food %>를 가장 좋아한다.
		<%=pro %>가 가장 재밌다.
		
		<%
			//세션객체 종료시키는 함수
			session.invalidate();
		}else{
			out.println("연결 불가능");
		}
		%>
</body>
</html>