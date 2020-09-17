<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
취미 시스템
-독서, 영화, 등산, 자전거, 여행

체크 박스로 만들어서 복수형으로 선택

내가 선택한 것들을 ul(불릿)형태로 출력
원하는 디자인 꾸미기(style)
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>취미 시스템</h2>
<form action="j50_result.jsp" method="post">
 <label><input type="checkbox" name="hobby" value="독서">독서</label>
 <label><input type="checkbox" name="hobby" value="영화">영화</label>
 <label><input type="checkbox" name="hobby" value="등산">등산</label>
 <label><input type="checkbox" name="hobby" value="자전거">자전거</label>
 <label><input type="checkbox" name="hobby" value="여행">여행</label>
 <br>
 <input type="submit" value="제출">
</form>

</body>
</html>