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
		//�ڹ��ڵ�
		int i,sum=0;
		for(i=1; i<=10; i++){
			if(i<10) {
	%>
		<!-- jsp �ڵ�  -->
		<%=i +" + "%> 
	<%
		//�ڹ��ڵ�
		}
			else{
				out.println(i+"=");
			}
			sum+=i;
		}
	%>
	
	<!-- jsp �ڵ� -->
	<%=sum%>

</body>
</html>