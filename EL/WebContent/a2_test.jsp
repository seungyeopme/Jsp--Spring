<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
. [] 둘 중에 하나를 이용해서 사용자가 입력한 값을 얻어옴
-->
아이디: ${param.id}
비번: ${param["pw"]}
${param.id=="ee"}
</body>
</html>