<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
- input()�޼ҵ�
java, jsp, jquery, spring 4�� ���� ������ ���޹޾� �޼ҵ带 �����ض�.

- avg()�޼ҵ� 
���� ���޹޾� ��ձ��Ͽ� ���Ϲ޴� �޼ҵ�

- pass()�޼ҵ�
��� ���޹޾� ����� ���ڿ��� ���Ϲ޴� �޼ҵ�
60�� �̻��̸� "������Ʈ ����"
60�� �̸��̸� "�米�� �ǽ�"
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{
			font-size:50px;
		}
	</style>
</head>
<body>
<%!
	public int total(int ja, int js, int jq, int s) {
		int tot=ja+js+jq+s;
		return tot;
	}
	public int avg(int tot) {
		int a=tot/4;
		return a;
	}
	public String pass(int a){
		String s="";
		if(a>=60) {
			s="������Ʈ ����";
		}
		else
			s="�米�� �ǽ�";
		return s;
	}
%>
<%
	int java=40;
	int jsp=100;
	int jquery=59;
	int spring=100;
	int tot=total(java,jsp,jquery,spring);
	int aver=avg(tot);
%>
����: <%=tot %>
���: <%=aver %>
���: <%=pass(aver) %>
</body>
</html>