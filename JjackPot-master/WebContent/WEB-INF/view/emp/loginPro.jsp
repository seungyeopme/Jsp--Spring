<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
    <c:if test="${check == 1 }">
      <c:redirect url="main.jp"/>
      
</c:if>

<c:if test="${check ==0 }">
<script>  
    alert("아이디가 맞지 않습니다..");
    history.go(-1);
</script>
</c:if>
	