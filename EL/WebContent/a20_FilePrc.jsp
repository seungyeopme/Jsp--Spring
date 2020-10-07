<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
cos.jar 파일은
-> MultipartRequest 클래스를 제공해줌

매개변수 5개
(MultipartRequest와 연결할 request 객체가 필요,
서버 측에 저장 될 경로 필요,
최대파일크기,
파일 인코딩방식,
파일 중복처리)
-->
<html>
<body>
<%
	request.setCharacterEncoding("euc-kr");

	String fol="";
	String save="/load";
	String encType="UTF-8"; //한글 설정
	
	int maxSize=10*1024*1024; //5MB 정도 제한됨
	
	//서버 상의 실제 경로를 찾아냄
	ServletContext con=getServletContext();
	fol=con.getRealPath(save);
	System.out.println(fol);
	
	try{
		MultipartRequest m = new MultipartRequest(request,fol,maxSize,encType,new DefaultFileRenamePolicy());	
%>
<%=m.getParameter("name") %>
<%
	out.println(fol);

	} catch(Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>