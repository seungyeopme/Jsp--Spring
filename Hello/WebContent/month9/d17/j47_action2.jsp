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
Member be=new Member(); 
-->
<jsp:useBean id="be" class="bean.Member">

	<!-- JSP������ �ڹٺ� Ŭ������ �����͸� �ִ´� -->
	<!-- ��ü �� ���ν�Ų�� -->
	<jsp:setProperty name="be" property="*"/>
</jsp:useBean>

<h3>
���� ���̵�� <jsp:getProperty property="id" name="be"/>
</h3>

<h3>
���� ����� <jsp:getProperty property="pw" name="be"/>
</h3>

<h3>
���� �̸����� <jsp:getProperty property="email" name="be"/>
</h3>

<h3>���� ��ȭ��ȣ�� <%=be.getTel()%></h3>
<!-- 
request�� �Ѿ�� �����͸�
�ڹ� ���̶� ���ν��Ѻδ� ���� useBean
-->
</body>
</html>