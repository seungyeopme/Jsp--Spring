<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h2>결과 보기</h2>

<%
	String exp2 = request.getParameter("exp2");
	
	if(exp2.equals("+")){
%>
	결과는 ${ param.exp1 + param.exp3 }
	<%
		}
	if(exp2.equals("-")){
	%>
	결과는 ${ param.exp1 - param.exp3 }
	<%
		}
	if(exp2.equals("*")){
	%>
	결과는 ${ param.exp1 * param.exp3 }
	<%
		}
	if(exp2.equals("/")){
	%>
	결과는 ${ param.exp1 / param.exp3 }
	<%
		}
	%>
</center>
</body>
</html>