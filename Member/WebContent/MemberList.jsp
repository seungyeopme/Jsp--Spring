<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- 벡터 등등 임포트 -->
<%@page import="java.util.Vector"%>
<%@ page import="model.Memberbean" %>
<%@ page import="model.MemberDAO" %>
<!DOCTYPE html>
<html>
<body>
<!-- 모든 회원 정보 가져오는 파일 -->
<%
   MemberDAO md=new MemberDAO(); //객체 만들어서 불러오기
   Vector<Memberbean> v=md.allMember();
%>
<center>
<table width="800" border="1">
   <tr height="50">
   <td align="center" width="150">아이디</td>
   <td align="center" width="250">이메일</td>
   <td align="center" width="200">전화번호</td>
   <td align="center" width="200">취미</td>   
   </tr>
   
   <%
     for(int i=0;i<v.size();i++){
        //멤버빈 객체에 저장시켜라.
        Memberbean bean = v.get(i); // i번째 회원 정보를 의미
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