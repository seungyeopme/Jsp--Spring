<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <center>
    <h1>ȸ�� Ż��</h1>
    <table width="800" border="1">

      <form action="MemberDeleteProc.jsp" method="post">
        <tr height="100">
          <td align="center" width="150">���̵�</td>
          <td width="250"><%=request.getParameter("id")%></td>
        </tr>
        <tr height="100">
          <td align="center" width="150">��й�ȣ</td>
          <td width="250"><input type="password" name="pw1"></td>
        </tr>
        <tr height="100">
          <td align="center" colspan="2">
          <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
           <input type="submit" value="ȸ�� Ż��">
      </form>
           <button onclick="location.href='MemberList.jsp'">ȸ�� ��ü����</button>
           
            </tr>
    </table>
  </center>
</body>
</html>