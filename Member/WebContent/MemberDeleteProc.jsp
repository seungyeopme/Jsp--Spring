<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<%@page import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

  <jsp:useBean id="mbean" class="model.Memberbean">
    <jsp:setProperty property="*" name="mbean" />
  </jsp:useBean>

  <%
  	MemberDAO md = new MemberDAO();
  String id = request.getParameter("id");
  String pass = md.getPass(mbean.getId());

  if (mbean.getPw1().equals(pass)) {
	  	md.delete(id); //���̵����
	    response.sendRedirect("MemberList.jsp");
	  } else {
	  %>
	  <script type="text/javascript">
				alert("�н����尡 Ʋ�Ƚ��ϴ�");
				history.go(-1);
			</script>
	  <%
	  	}
  
  %>



</body>
</html>