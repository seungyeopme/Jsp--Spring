<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%=n1%> <!-- 1 --> <!-- 멤버변수이기 때문에 전연변수처럼 인식한다. 그래서 앞에서 출력해도 읽어들인다.-->
	
	<!-- 멤버변수 및 메소드 선언 -->
	<%!
		int n1=1;
		int n2=2;
		
		public int add(){
			return n1+n2;
		}		
		String m;
		int n3;
	%>
	
	
	<%=add()%> <!-- 3 -->
	<%=m%>	<!-- null -->
	<%=n3%>	<!-- 0 -->
</body>
</html>