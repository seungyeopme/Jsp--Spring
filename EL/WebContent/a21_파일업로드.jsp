<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"
   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
UpServlet.java(서블릿)
@WebServlet("/upload.do") 연결
-->
<html>
<body>
<%
request.setCharacterEncoding("UTF-8");%>
<form action="upload.do" method="post" enctype="multipart/form-data">
글쓴이 : <input type="text" name="name"><br>
제목 : <input type="text" name="title"><br>   
파일 : <input type="file" name="upload"><br>
<input type="submit" value="전송">   
</form>
</body>
</html>