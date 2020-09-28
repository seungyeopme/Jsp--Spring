<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
	
	//"아이디 저장" 체크박스가 체크되었는지 판단
	String save=request.getParameter("save");
	String id=request.getParameter("id");
	
	if(save!=null) {
		//아이디 저장 버튼 누르면
		//1번째 -> String key값
		//2번째 -> value값
		Cookie co=new Cookie("id",id);
		
		//3000.. 3분간 유효..
		//3분 지나면 id값 지워짐
		co.setMaxAge(60*5);
		
		//사용자에게 쿠키값 넘긴다.
		response.addCookie(co);
		
		out.write("쿠기 생성완료");
	}
%>
</body>
</html>