<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
��ȭ ���� ��ȸ �ý���

�⵵
��ȭ select~option
�����ư

=> ��ȭ ���� ��ȸ
�⵵: 2020��
��ȭ��: ������ ����

�ٽ���ȸ(�����۸�ũ)
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	String year="2020��";
	String movie=request.getParameter("movie");
%>

<h2>��ȭ ���� ��ȸ</h2>
�⵵ :<%=year%><br>
��ȭ�� :<%=movie%><br>

<a href='javascript:history.go(-1)'>�ٽ���ȸ</a>
</body>
</html>