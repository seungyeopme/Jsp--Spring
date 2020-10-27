<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='root' value="${pageContext.request.contextPath }/"/>
<!-- 상단 메뉴 부분 -->
<nav class="navbar navbar-expand-md bg-light navbar-light fixed-top shadow-lg">
	<a class="navbar-brand" href="${root }main">Board</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
	        data-target="#navMenu">
		<span class="navbar-toggler-icon"></span>        
	</button>
	<div class="collapse navbar-collapse" id="navMenu">
		<ul class="navbar-nav">
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">자유게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">스프링게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">데이터베이스게시판</a>
			</li>
			<li class="nav-item">
				<a href="${root }board/main" class="nav-link">HTML/CSS게시판</a>
			</li>
		</ul>
		
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a href="${root }user/login" class="nav-link">로그인</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/join" class="nav-link">회원가입</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/modify" class="nav-link">정보수정</a>
			</li>
			<li class="nav-item">
				<a href="${root }user/logout" class="nav-link">로그아웃</a>
			</li>
		</ul>
	</div>
</nav>