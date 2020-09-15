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
		//jsp 코드
		request.setCharacterEncoding("EUC-KR");
		
		String name=request.getParameter("name");
		out.println("이름 : "+ name + "<br>");
		
		String gender=request.getParameter("gender");
		out.println("성별");
		
		if(gender.equals("male")) {
			out.println("남자 <br>");
		}
		else 
			out.println("여자 <br>");
			
			String sing[]=request.getParameterValues("sing");
			
			out.println("좋아하는 가수");
			for(String str:sing) {
				int n=Integer.parseInt(str);
				
				switch(n) {
				case 1:
					out.println("다이너마이트");
					break;
				case 2:
					out.println("가장 보통의 존재");
					break;
				case 3:
					out.println("배드걸");
					break;
				case 4:
					out.println("마리아");
					break;
				}
			}
	%>
	<a href='javascript:history.go(-1)'>이전</a>

</body>
</html>