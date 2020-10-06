<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<form action="a16_connect.jsp">
아이디 : <input name="id"><br>
비번 : <input type="password" name="pw"><br>
<label><input type="radio" name="rad" value="1">개인</label>
<label><input type="radio" name="rad" value="2">그룹</label>
<input type="submit" value="제출">
</form>
</body>
</html>