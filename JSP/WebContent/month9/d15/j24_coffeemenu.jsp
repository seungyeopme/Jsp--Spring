<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action=j24_coffeemenu_result.jsp method="post">
<h1>커피메뉴</h1>
<input type="radio" name="coffee_menu" value="americano" checked="checked">아메리카노 (4000원)
<br>
<input type="radio" name="coffee_menu" value="latte">카페라떼 (4500원)
<br>
<input type="radio" name="coffee_menu" value="capuchino">카푸치노 (4500원)
<br>
<input type="radio" name="coffee_menu" value="frpuchino">프라푸치노 (7500원)
<br>
수량 : <input type="text" name="num" size="5"> <br>
입금액 : <input type="text" name="money">
<input type="submit" value="주문처리" name="start">




</body>
</html>