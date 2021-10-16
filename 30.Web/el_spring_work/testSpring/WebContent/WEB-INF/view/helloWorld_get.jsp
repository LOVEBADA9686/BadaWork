<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Spring GET</title>
</head>
<body>
<h3>Spring GET</h3>
<hr>
<h3>${get_msg}</h3>
<%
	String get_msg = String.valueOf(request.getAttribute("get_msg"));
	System.out.println("get_msg >>> : " + get_msg);
	out.println("get_msg >>> : " + get_msg);
%>
</body>
</html>