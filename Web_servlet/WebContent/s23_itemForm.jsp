<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
다음 DB를 구현해라.

item테이블을 생성하고, s23_itemForm.jsp에서 정보 입력받아 
전송버튼을 누르면 s23_item.jsp로 입력된 정보가 전송된다. 
그 정보를 item테이블에 추가한다.

Name
varchar2
20
상품이름

Price
num 
8
가격

Description
varchar2
100
상품설명
-->
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form method="post" action="s23_item.jsp">
이름:<input name="name">
가격:<input name="price">
설명:<input name="description">
<input type="submit" value="전송">
</form>

</body>
</html>