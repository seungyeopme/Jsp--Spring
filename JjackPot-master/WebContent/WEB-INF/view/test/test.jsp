<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>자동완성</title>
<script type="text/javascript" src="js/jquery/lib/jquery.js"></script>
<script type='text/javascript' src='js/jquery/lib/jquery.bgiframe.min.js'></script>
<script type='text/javascript' src='js/jquery/lib/jquery.ajaxQueue.js'></script>
<script type='text/javascript' src='js/jquery/jquery.autocomplete.js'></script>
<link rel="stylesheet" type="text/css" href="js/jquery/jquery.autocomplete.css" />
</head>
<body>

	<script>
	var availableTags = [
							'가나',
							'가나쵸콜렛',
							'갈갈이 삼형제',
							'북마크',
							'북까페',
							'엄마',
							'아빠',
							'북소리',
							'여러분',
							'소문',
							'소문난 식당',
							'나나나',
							'쇼',
							'쇼팽',
							'모나미',
							'한강',
							'강강수월래',
							'강촌',
							'제주도',
							'삼총사',
							'먹보',
							'먹소리',
							'수박',
							'수박 겉핥기'
						];
	</script>

	<form name="form1" method="post" action="result.php">
	  <input type="text" id="searchbox">
	  <input type="submit" id="sumit" value="검색">
	</form>

	<script>
	$(document).ready(function() {
	    $("#searchbox").autocomplete(availableTags,{ 
	        matchContains: true,
	        selectFirst: false
	    });
	});
	</script>

</body>
</html>