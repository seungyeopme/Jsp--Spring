<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- ���� ��� ����Ʈ -->
<%@page import="java.util.Vector"%>
<%@ page import="model.Memberbean" %>
<%@ page import="model.MemberDAO" %>
<!DOCTYPE html>
<html>
<body>
<!-- ��� ȸ�� ���� �������� ���� -->
<%
   MemberDAO md=new MemberDAO(); //��ü ���� �ҷ�����
   Vector<Memberbean> v=md.allMember();
%>
<center>
<table width="800" border="1">
   <tr height="50">
   <td align="center" width="150">���̵�</td>
   <td align="center" width="250">�̸���</td>
   <td align="center" width="200">��ȭ��ȣ</td>
   <td align="center" width="200">���</td>   
   </tr>
   
   <%
     for(int i=0;i<v.size();i++){
        //����� ��ü�� ������Ѷ�.
        Memberbean bean = v.get(i); // i��° ȸ�� ������ �ǹ�
   %>
   <tr height="50">
   <td align="center" width="150">
   <a href="MemberIn.jsp?id=<%=bean.getId() %>"><%=bean.getId() %></a>
   </td>
   <td align="center" width="250">
   <%=bean.getEmail() %>
   </td>
   <td align="center" width="200">
   <%=bean.getTel() %>
   </td>
   <td align="center" width="200">
   <%=bean.getHobby() %>
   </td>
   <% } %>
   </tr>
   </table>
</center>
</body>
</html>