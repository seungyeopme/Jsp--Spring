<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행 -->
<!-- 
아이디, 암호 입력받는 로그인 폼(j38_Log.jsp)
로그인에 성공을 햇을 때 (j38_suc.jsp로) 실패했을 때
다시 로그인 폼으로 돌아가는 로그인 인증 처리 페이지를 (j38_fru.jsp)에 작성해라.
sendRedirect사용 성공했을 때 suc.jsp파일에
jisu 님 환영합니다.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="j38_fru.jsp">
	아이디: <input name="id">
	비번: <input name="pw">
		<input type="submit" value="로그인">
</form>
</body>
</html>