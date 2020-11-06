<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="/JackPot/js/jquery.form.min.js"></script>
<script src="/JackPot/js/jQuery.MultiFile.min.js"></script>

<link href="/JackPot/css/memo.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/JackPot/css/common.css" type="text/css" />

<head>
<title>메모</title>
</head>

<script>
	function checkIt() {
		var memoModi = eval("document.forms.multiForm");
		
		if(!memoModi.memo_title.value) {
			alert("제목을 입력하시요.");
			return false;
		}
	}
	
	
	/* 파일 다중 업로드 */
	$(document).ready(function(){
    
    	//use jQuery MultiFile Plugin 
	    $('#multiform input[name=org_file]').MultiFile({
    	    max: 3, //업로드 최대 파일 갯수 (지정하지 않으면 무한대)
        	accept: '',
	        maxfile: 4024, //각 파일 최대 업로드 크기
    	    maxsize: 12024,  //전체 파일 최대 업로드 크기
        	STRING: { //Multi-lingual support : 메시지 수정 가능
        		file: '<em title="Click to remove" onclick="$(this).parent().prev().click()">$file</em>',
        		remove : "<img src='/JackPot/images/memo/delete-photo.png'/>", //추가한 파일 제거 문구, 이미태그를 사용하면 이미지사용가능
    	        duplicate : "$file 은 이미 선택된 파일입니다.", 
        	    denied : "$ext 는(은) 업로드 할수 없는 파일확장자입니다.",
	            selected:'$file 을 선택했습니다.', 
    	        toomuch: "업로드할 수 있는 최대크기를 초과하였습니다.($size)", 
        	    toomany: "업로드할 수 있는 최대 갯수는 $max개 입니다.",
	            toobig: "$file 은 크기가 매우 큽니다. (max $size)"
    	    },
        	list:"#file-list" //파일목록을 출력할 요소 지정가능
	    });
	});
	

	/* 이미지 다중 업로드 */
	$(document).ready(function(){

		//use jQuery MultiFile Plugin 
	    $('#multiform input[name=org_img]').MultiFile({
    	    max: 3, //업로드 최대 파일 갯수 (지정하지 않으면 무한대)
        	accept: 'jpg|png|gif', //허용할 확장자(지정하지 않으면 모든 확장자 허용)
	        maxfile: 4024, //각 파일 최대 업로드 크기
    	    maxsize: 12024,  //전체 파일 최대 업로드 크기
        	STRING: { //Multi-lingual support : 메시지 수정 가능
        		remove : "<img src='/JackPot/images/memo/delete-photo.png'/>", //추가한 파일 제거 문구, 이미태그를 사용하면 이미지사용가능
    	        duplicate : "$file 은 이미 선택된 파일입니다.", 
        	    denied : "$ext 는(은) 업로드 할수 없는 파일확장자입니다.",
            	selected:'$file 을 선택했습니다.', 
	            toomuch: "업로드할 수 있는 최대크기를 초과하였습니다.($size)", 
    	        toomany: "업로드할 수 있는 최대 갯수는 $max개 입니다.",
        	    toobig: "$file 은 크기가 매우 큽니다. (max $size)"
	        },
    	    list:"#img-list", //파일목록을 출력할 요소 지정가능
	    });	
	});
	
	/* 선택한 이미지 파일 지우기 */
	$(document).ready(function() {
		$('.imgList').click(function() {
			$(this).hide();
			$("#multiform").append("<input type='hidden' name='cimg' value='"+this.text+"' />");
		});
	});
	
	/* 선택한 파일 지우기 */
	$(document).ready(function() {
		$('.fileList').click(function() {
			$(this).hide();
			$("#multiform").append("<input type='hidden' name='cfile' value='"+this.text+"' />");
		});
	});
</script>

<html>
<body>
<jsp:include page="memo_sidebar.jsp" flush="false" />

<!-- 메모 본문 : 내용 작성 폼 -->
<div class="main-container" id="main-layer">
	<div class="content-wrap">
		<div class="content-head">
			<h2 style="margin:5px; width:300px;">메모 수정</h2>
		</div>
		
		<form name="multiForm" method="post" id="multiform" action="memoModifyPro.jp?memoGroup=${memoGroup}" enctype="multipart/form-data"  onSubmit="return checkIt();">
		<div class="table">
			<div class="listInfo">
				<select name="memo_cate">
					<c:if test="${memoCateCount == 0}">
						<option value="0">폴더 없음</option>
					</c:if>
					<c:if test="${memoCateCount > 0}">
						<c:forEach var="memoCate" items="${memoCateList}">
							<c:if test="${memoCate.cate_num == dto.getMemo_cate()}">
								<option value="${memoCate.cate_num}" selected>${memoCate.cate_title}</option>
							</c:if>
							<c:if test="${memoCate.cate_num != dto.getMemo_cate()}">
								<option value="${memoCate.cate_num}">${memoCate.cate_title}</option>
							</c:if>
						</c:forEach>
					</c:if>
				</select>
			</div>
		</div>
		<div class="inputFileNImg">
			<input type="reset" value="새메모" onclick="window.location='memoInsert.jp?memoGroup=${memoGroup}'"/><br/>
			이미지 : <input type="file" name="org_img" title="이미지 첨부" id="imgInp"/>
			파일 : <input type="file" name="org_file" title="파일 첨부" id="fileInp" />
		</div>
		
		<div class="content-write">
			<table>
				<tr>
					<td>
						<input type="hidden" name="memo_num" value="${dto.memo_num}" />
						<c:if test="${dto.memo_state == 1}">
							<input type="checkbox" name="memo_state" value="2">중요
						</c:if>
						<c:if test="${dto.memo_state == 2}">
							<input type="checkbox" name="memo_state" value="2" checked>중요
						</c:if>
						<input type="text" name="memo_title" placeholder="제목을 입력하세요." value="${dto.memo_title}" />
					</td>
				</tr>
				<tr>
					<td>
						<textarea name="memo_content" rows="20" cols="100">${dto.memo_content}</textarea>			
					</td>
				</tr>
				<tr>
					<td>
						<div id="img-list">
		 					<c:if test="${imgCount > 0}">
								<c:forEach var="img" items="${img}">
									<a class="imgList"><img src='/JackPot/images/memo/delete-photo.png'/>${img.org_img}</a><br/>
								</c:forEach>
							</c:if>
						</div>
						<div id="file-list">
							<c:if test="${fileCount > 0}">
								<c:forEach var="file" items="${file}">
									<a class="fileList"><img src='/JackPot/images/memo/delete-photo.png'/>${file.org_file}</a><br/>
								</c:forEach>
							</c:if>
						</div>
					</td>
				</tr>
			</table>
			
			<div>
				<input type="submit" value="수정" />
				<input type="hidden" value="${memoGroup}" name="memoGroup" />
				<button type="button" onclick="window.location='memoList.jp?pageNum=${pageNum}&memoGroup=${memoGroup}'">취소</button>
			</div>
		</div>
		</form> 
	</div>
</div>
</body>
</html>