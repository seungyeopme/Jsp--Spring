<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%=n1%> <!-- 1 --> <!-- ��������̱� ������ ��������ó�� �ν��Ѵ�. �׷��� �տ��� ����ص� �о���δ�.-->
	
	<!-- ������� �� �޼ҵ� ���� -->
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