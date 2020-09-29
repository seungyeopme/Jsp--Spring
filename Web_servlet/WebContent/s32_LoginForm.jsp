<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
s32_LoginForm.jsp: 로그인폼
s32_LoginProc1.jsp: 회원인증 페이지(id, pw 입력받아서 if문으로 둘 다 일치하면 session에 이름 저장)
페이지를 이동, s32_LoginProc2.jsp로 이동(sendRedirect)
회원인증이 안되면 s32_LoginForm.jsp로 이동
-->
<!DOCTYPE html>
<html>
<body>
<form method="post" action="s32_LoginProc1.jsp">
<label for="userid">아이디:</label>
<input type="text" name="id" id="userid">
<br>

<label for="userpw">암호:</label>
<input type="password" name="pw" id="userpw">

<input type="submit" value="로그인">
<br>
</form>
</body>
</html>
