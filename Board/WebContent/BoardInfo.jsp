<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="수정하기" onclick="location.href='BoardUpdateForm.jsp?num
=<%=bean.getNum() %>'">

<input type="button" value="삭제하기" onclick="location.href='BoardDeleteForm.jsp?num
=<%=bean.getNum() %>'">

<input type="button" value="목록하기" onclick="location.href='BoardList.jsp?num
=<%=bean.getNum() %>'">

</body>
</html>