<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>���� ���</h2>
<%
	request.getParameter("euc-kr");
%>
<!-- 
JSP������ ��ü ����!!
Member be=new favoBean(); 
-->
<jsp:useBean id="be" class="bean.favoBean">

	<!-- JSP������ �ڹٺ� Ŭ������ �����͸� �ִ´� -->
	<!-- ��ü �� ���ν�Ų�� -->
	<jsp:setProperty name="be" property="*"/>
</jsp:useBean>

<h3>
�����ϴ� ������ <jsp:getProperty property="music" name="be"/>
�Դϴ�.</h3>


<h3>�����ϴ� ������ <%=be.getColor()%>�Դϴ�.</h3>
<!-- 
request�� �Ѿ�� �����͸�
�ڹ� ���̶� ���ν��Ѻδ� ���� useBean
-->
</body>
</html>