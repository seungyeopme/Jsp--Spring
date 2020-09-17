<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
- input()메소드
java, jsp, jquery, spring 4개 과목 점수를 전달받아 메소드를 구현해라.

- avg()메소드 
총점 전달받아 평균구하여 리턴받는 메소드

- pass()메소드
평균 전달받아 결과를 문자열로 리턴받는 메소드
60점 이상이면 "프로젝트 투입"
60점 미만이면 "재교육 실시"
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
			s="프로젝트 투입";
		}
		else
			s="재교육 실시";
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
총점: <%=tot %>
평균: <%=aver %>
결과: <%=pass(aver) %>
</body>
</html>