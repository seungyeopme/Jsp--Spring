<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
window.onload = function() {
	var btn = document.getElementById("member_reg_btn");
	btn.onclick = function() {
		location.assign("regist.member?command=member_form");
	};
};
</script>
</head>
<body>
<h1>SY의 홈페이지</h1>
<hr>

<button id="member_reg_btn">회원 가입 페이지</button>


</body>
</html>