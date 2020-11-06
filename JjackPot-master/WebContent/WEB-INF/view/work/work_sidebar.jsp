<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="/JackPot/css/common.css?ver=1" type="text/css" /> 
<link rel="stylesheet" href="/JackPot/css/basic.css?ver=2" type="text/css" />
<link rel="stylesheet" href="/JackPot/css/sub.css?ver=3" type="text/css" />    
<link rel="stylesheet" href="/JackPot/css/work.css?ver=8" type="text/css" />  

<script src="resource/ckeditor.js"></script>
<html>
<head>
<style type="text/css">



.listFolder ul{
  display:none;
}

.scrollBlind{
	width:230px;
	height:100%;
	overflow-y:scroll;

} 
</style>

<script>
	/* 메뉴 슬라이드 업&다운 */
	$(document).ready(function() {
		$(".listFolder>a").click(function() {
			var subMenu = $(this).next("ul");
			
			if(subMenu.is(":visible")) {
				subMenu.slideUp();
			} else {
				subMenu.slideDown();
			}
		});
	});
	
	
	/* 메모 이동 : 레이어 팝업 */
	function wrapWindowByMask(){
		//화면의 높이와 너비를 구한다.
		var maskHeight = $(document).height();  
		var maskWidth = $(window).width();  

		//마스크의 높이와 너비를 화면의 높이와 너비로 설정한다.
		$('.maskMove').css({'width':maskWidth,'height':maskHeight});  

		//애니메이션 효과
		$('.maskMove').fadeTo("slow",0.5);   
	
		// 레이어 팝업을 가운데로 띄운다.
		var left = ($(window).scrollLeft() + ($(window).width() - $('.windowMove').width())/2);
		var top = ($(window).scrollTop() + ($(window).height() - $('.windowMove').height())/2);
	
		// css 스타일 변경
		$('.windowMove').css({'left':left, 'top':top, 'position':'absolute'});

		// 레이어 팝업 띄운다.
		$('.windowMove').show();
	}

	$(document).ready(function(){
		//검은 마스크 배경과 레이어 팝업 띄운다.
		$('.btnMove, .btnRecover').click(function(e){
			e.preventDefault();
			wrapWindowByMask();
		});

		//닫기 버튼을 눌렀을 때
		$('.windowMove .close').click(function (e) {  
		    //링크 기본동작은 작동하지 않도록 한다.
	    	e.preventDefault();  
		    $('.maskMove, .windowMove').hide();  
		});       

		//검은 마스크을 눌렀을 때
		$('.maskMove').click(function () {  
	    	$(this).hide();  
		    $('.windowMove').hide();  
		});      
	});
	



</script>

	<div id="page-container">
		<div id="sidebar" style="  background-color: white;margin: 0;">
  <jsp:include page="/sidebar.jp"></jsp:include>
</div>
   <span id="brand" class="brand none">  
	</span>	 
   </a>
			</div>
			
			<div id="subarea">	
				<div id="leftmenu-jp">
					<div class="leftmenu-top">
						<h2><a href="/JackPot/work.jp">근태관리  </a></h2>
					</div>
					
					<div id="leftmenuarea" class="scrollBlind">
					<ul class="menulist" style="margin:0;padding:0;list-style:none;">
					<li></li>
					<li></li>
						<li ><a href="/JackPot/work.jp">근태관리  </a><br></li>
							<!-- <li ><a href="/JackPot/work_all.jp">월별 근태관리   </a><br> -->
						</li>
						<li><hr color=" lightgrey " size="1"></li>
		
					
							
					
						
				
					</ul>
				</div>
			</div>
			</div>
			</div>
