<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���⼭ ���� -->
<!-- 
j54_forward1.jsp => forward �±׸� ����� ������ �̵�
                    param �±׸� ����� �� ����
j54_forward2.jsp => �� �о�ͼ� ���

���� ���) ȫ�浿���� ��̴� �����Դϴ�.
-->
<%
	request.setCharacterEncoding("euc-kr");
%>
<%
	String name="ȫ�浿";
	String swim="����";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 
<jsp:forward page="j54_forward2.jsp">
		<jsp:param name="name" value="<%=name %>" />
		<jsp:param name="swim" value="<%=swim %>" />	
</jsp:forward>

</body>
</html>