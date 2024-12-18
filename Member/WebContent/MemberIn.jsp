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
  <!-- memberlist에서 넘긴 id 값을 받아주고 데이터베이스에서 클릭한 id값의 해당 값을 정보를 출력함 -->
  <%
  	String id = request.getParameter("id"); //mamberlist에서 넘긴 id 값을 받음 
  MemberDAO md = new MemberDAO();
  Memberbean mbean = md.oneMember(id); //해당하는 id의 해당정보 리턴받음
  %>
  <center>

    <h1>회원 정보</h1>
    <table width="800" border="1">
      <tr height="100">
        <td align="center" width="150">아이디</td>
        <td width="250"><%=mbean.getId()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">이메일</td>
        <td width="250"><%=mbean.getEmail()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">전화번호</td>
        <td width="250"><%=mbean.getTel()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">취미</td>
        <td width="250"><%=mbean.getHobby()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">직업</td>
        <td width="250"><%=mbean.getJob()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">나이</td>
        <td width="250"><%=mbean.getAge()%></td>
      </tr>
      <tr height="100">
        <td align="center" width="150">하고싶은말</td>
        <td width="250"><%=mbean.getInfo()%></td>
      </tr>
      <tr height="100">
        <td colspan="4" align="center">
          <button
            onclick="location.href='MemberJoin.jsp'">
            회원가입</button>
          <button
            onclick="location.href='MemberList.jsp'">
            목록보기</button>
          <button
            onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">
            회원 정보수정</button>
          <button
            onclick="location.href='MemberDeleteForm.jsp?id=<%=mbean.getId()%>'">
            회원 탈퇴</button>
        </td>
      </tr>

    </table>
  </center>

</body>
</html>