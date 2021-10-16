<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Spring Hello</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// alert("ready >>> : ");

		//GET방식
		$(document).on("click", "#getbtn", function() {
			alert("getbtn >>> : 진입");

			$("#methodForm").attr({
				"action" : "helloWorld_get.kbd",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		});

		//POST방식
		$(document).on("click", "#postbtn", function() {
			alert("postbtn >>> : 진입 ");

			$("#methodForm").attr({
				"action" : "helloWorld_post.kbd",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		});
	})
</script>
</head>
<body>
	<h3>Spring Hello</h3>
	<hr>
	<a href="helloWorld_Controller_find.kbd">HelloWorld 실행</a>
	<br>
	<a href="helloWorld_get.kbd">HelloWorld GET Method 실행</a>
	<br>
	<a href="helloWorld_post.kbd">HelloWorld POST Method 실행</a>
	<br>
	<form name="methodForm" id="methodForm">
		<button type="button" id="getbtn">GET</button>
		<button type="button" id="postbtn">POST</button>
	</form>
	<hr>
	<a href="viewJsp_1_stringTest_find.kbd">viewJsp_1_stringTest_find.kbd
		실행</a>
	<br>
	<a href="viewJsp_2_modelandview_find.kbd">viewJsp_2_modelandview_find.kbd
		실행</a>
	<br>
	<a href="viewJsp_3_voidTest_find.kbd">viewJsp_3_voidTest_find.kbd
		실행</a>
	<br>
	<hr>
	<a href="formdata_find.kbd">FORM DATA 실행</a>
	<hr>
	<a href="autowired_test.kbd">오토와이어드(의존성 주입 : DI) 실행</a><br>
	<hr>
	<a href="autowired_test_filed.kbd">오토와이어드(외존성 주입 : DI) 필드 실행</a><br>
</body>
</html>