<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 여기서 실행 -->
<!-- 
<radio button>
o blue
o yellow
o red
o orange
확인 버튼

확인 버튼을 누르면 윤혁은 ---색을 좋아한다.
             배경색을 클릭한 색으로 바꾸기
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <form action = "j20_colorchange_connect.jsp">
        <input type = "radio" name = "color" value = "blue">파랑
        <input type = "radio" name = "color" value = "yellow">노랑
        <input type = "radio" name = "color" value = "red">빨강
        <input type = "radio" name = "color" value = "orange">주황
        <input type = "submit" value ="확인">
    </form>
</body>
</html>