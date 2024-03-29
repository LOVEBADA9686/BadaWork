<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="a.b.c.com.kbd.board.service.BoardService" %>
<%@page import="a.b.c.com. kbd.board.service.BoardServiceImpl" %>
<%@page import="a.b.c.com.kbd.board.vo.BoardVO" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.4.1.js"   
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="   
	crossorigin="anonymous">
</script>
<title>글 전체조회</title>
<style type="text/css">
	*{
		margin: 0 auto;
		/*text-align: center;*/
	}
	
	div {
		margin: 50px 0px 0px 100px;
	}
	
	td, th{
		padding: 5px
	}
	
	.tt{
		text-align: center;
	}
</style>
<script scr="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	window.onload = function () {
	 var isudType = $.urlParam('ISUD_TYPE');
	 if(isudType == 'D'){
		 boardUpdate('D');
	 }
	}
	
	$.urlParam = function(name){
	    var results = new RegExp('[\?&amp;]' + name + '=([^&amp;#]*)').exec(window.location.href);
	    return results[1] || 0;
	}


	function boardUpdate(actionUpdate){
		
		if(actionUpdate == 'TEST'){
			console.log($("#boardUpdateForm").serialize());
		} else {
			console.log("boardUpdate 진입 >>> : " + actionUpdate);
			
			if('U' == actionUpdate) {
				var v1 = "UOK";
				document.boardUpdateForm.action="/testKbd/board?ISUD_TYPE="+v1;
			}
			
			if('D' == actionUpdate) {
				var v2 = "DOK";
				document.boardUpdateForm.action="/testKbd/board?ISUD_TYPE=DOK";
			}
			
			document.boardUpdateForm.method="POST";
			document.boardUpdateForm.enctype="applecation/x-www-form-urlencoded";
			document.boardUpdateForm.submit();
		}
		
	}

	function checkAction(actionName){
		console.log("actionName 진입 >>> : " + actionName);
		
		if('I' == actionName) {
			location.href="/testKbd/kbd/board/board.html";
		}
		if('SALL' == actionName){
			location.href="/testKbd/board?ISUD_TYPE=SALL";
		}
	}
</script>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR"); %>
SELECT

<%
	Object obj = request.getAttribute("aListS");
	if(obj == null) return;
	
	ArrayList<BoardVO> aList = (ArrayList<BoardVO>)obj;
	int nCnt = aList.size();
	out.println(":::: 조건 조회 >>> : " + nCnt + "건");
	
	String bnum="";
	String bsubject="";
	String bwriter="";
	String bpw="";
	String bmemo="";
	String bphoto="";
	String deleteyn="";
	String insertdate="";
	String updatedate="";
	
	if(nCnt == 1) {
		BoardVO bvo = aList.get(0);
		
		bnum = bvo.getBnum();
		bsubject = bvo.getBsubject();
		bwriter = bvo.getBwriter();
		bpw = bvo.getBpw();
		bmemo = bvo.getBmemo();
		bphoto = bvo.getBphoto();
		deleteyn = bvo.getDeleteyn();
		insertdate = bvo.getInsertdate();
		updatedate = bvo.getUpdatedate();
	}
%>
<hr>
<div>
<form name="boardUpdateForm" id="boardUpdateForm">
<table boarder="1">
<tr>
	<td colspan="2" align="center">
	
		<font size="4" style="color:blue;">게시판 글 수정 && 삭제</font>
		<img src="/testKbd/img/img_mando/ase.gif" width="25" height="25" alt="image">
	</td>
</tr>
<tr>
	<td class="tt">글 번호</td>
	<td><input type="text" name="bnum" id="bnum" size="20" value="<%= bnum %>" readonly></td>
</tr>
<tr>
	<td class="tt">제목</td>
	<td><input type="text" name="bsubject" id="bsubject" value="<%= bsubject %>" size="55"></td>
</tr>
<tr>
	<td class="tt">이름</td>
	<td><input type="text" name="bwriter" id="bwriter" value="<%= bwriter %>" size="20" ></td>
</tr>
<tr>
	<td class="tt">비밀번호</td>
	<td><input type="text" name="bpw" id="bpw" value="<%= bpw %>" size="20" ></td>
</tr>
<tr>
	<td class="tt">삭제여부</td>
	<td><input type="text" name="deleteyn" size="20" value="<%= deleteyn %>" disabled></td>
</tr>
<tr>
	<td class="tt">입력일</td>
	<td><input type="text" name="insertdate" size="20" value="<%= insertdate %>" disabled></td>
</tr>
<tr>
	<td class="tt">수정일</td>
	<td><input type="text" name="updatedate" size="20" value="<%= updatedate %>" disabled></td>
</tr>
<tr>
	<td class="tt">내용</td>
	<td>
	<textarea name="bmemo" id="bmemo" cols="50" rows="10"><%= bmemo %></textarea>
</td>
</tr>
<tr>
	<td class="tt">사진</td>
	<td>
	<img src="/testKbd/fileupload/board/<%= bphoto %>" border="1" width="40" height="50" alt="image">
</td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE">
	<input type="button" value="수정" onclick="boardUpdate('U')"/>
	<input type="button" value="삭제" onclick="boardUpdate('D')"/>
	<input type="button" value="테스트" onclick="boardUpdate('TEST')"/>
	<input type="reset" value="취소" />
	&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="입력" onclick="checkAction('I')" />
	<input type="button" value="목록" onclick="checkAction('SALL')">
</td>
<tr>
</table>
</form>
</div>
</body>
</html>