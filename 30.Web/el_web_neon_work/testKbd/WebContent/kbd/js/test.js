
	alert("자바스크립트 블럭 시작 >>> : ");
	
		alert("제이쿼리 블럭 시작 >>> : ");
		
		//폼태그 데이터 JSP 보내기 
		$("#boardBtn").click(function(){
			alert("boardBtn click() 함수 진입 >>> : ");
			console.log("boardBtn click() 함수 진입 >>> : ");
			var v1 = $("#ISUD_TYPE").val();
			alert("v1 >>> : " + v1);
			
			$("#boardWrite")
			.attr({
					"action":"/testKbd/board?ISUD_TYPE="+v1,
				    "method":"POST",
				    "enctype":"multipart/form-data"
			       })
			.submit();	
		});		
