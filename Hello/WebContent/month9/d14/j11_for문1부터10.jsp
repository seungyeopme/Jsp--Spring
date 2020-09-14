<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//자바코드
		int i,sum=0;
		for(i=1; i<=10; i++){
			if(i<10) {
	%>
		<!-- jsp 코드  -->
		<%=i +" + "%> 
	<%
		//자바코드
		}
			else{
				out.println(i+"=");
			}
			sum+=i;
		}
	%>
	
	<!-- jsp 코드 -->
	<%=sum%>

</body>
</html>