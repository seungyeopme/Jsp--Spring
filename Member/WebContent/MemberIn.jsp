<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<%
	response.setCharacterEncoding("EUC-KR");
%>
<%@ page import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <!-- memberlist���� �ѱ� id ���� �޾��ְ� �����ͺ��̽����� Ŭ���� id���� �ش� ���� ������ ����� -->
  <%
  	String id = request.getParameter("id"); //mamberlist���� �ѱ� id ���� ���� 
  MemberDAO md = new MemberDAO();
  Memberbean mbean = md.oneMember(id); //�ش��ϴ� id�� �ش����� ���Ϲ���
  %>
  <center>

    <h1>ȸ�� ����</h1>
    <table width="800" border="1">
      <tr height="100">
        <td align="center" width="150">���̵�</td>
        <td width="250"><%=mbean.getId()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">�̸���</td>
        <td width="250"><%=mbean.getEmail()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">��ȭ��ȣ</td>
        <td width="250"><%=mbean.getTel()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">���</td>
        <td width="250"><%=mbean.getHobby()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">����</td>
        <td width="250"><%=mbean.getJob()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">����</td>
        <td width="250"><%=mbean.getAge()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">�ϰ������</td>
        <td width="250"><%=mbean.getInfo()%></td>
      </tr>
      <tr height="100">
        <td colspan="4" align="center">
          <button
            onclick="location.href='MemberJoin.jsp'">
            ȸ������</button>
          <button
            onclick="location.href='MemberList.jsp'">
            ��Ϻ���</button>
          <button
            onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">
            ȸ�� ��������</button>
          <button
            onclick="location.href='MemberDeleteForm.jsp?id=<%=mbean.getId()%>'">
            ȸ�� Ż��</button>
        </td>
      </tr>

    </table>
  </center>

</body>
</html>