<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"
   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
UpServlet.java(����)
@WebServlet("/upload.do") ����
-->
<html>
<body>
<%
request.setCharacterEncoding("UTF-8");%>
<form action="upload.do" method="post" enctype="multipart/form-data">
�۾��� : <input type="text" name="name"><br>
���� : <input type="text" name="title"><br>   
���� : <input type="file" name="upload"><br>
<input type="submit" value="����">   
</form>
</body>
</html>