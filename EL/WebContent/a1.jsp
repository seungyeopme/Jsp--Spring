<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
정수형:${10}
실수형:${1.2}
문자열:${"hi"}
<br>
\${1+2} : ${1+2} 
<br>
${5 mod 2}
${5>2}
<br>
<c:if a=${empty input}>
텅빈
</c:if>
<br>
<!-- 
getParameter() 대신 param객체 사용!
-->
</body>
</html>