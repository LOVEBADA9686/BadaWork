<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_01</title>
</head>
<body>
<h3>jstl_01</h3>
<hr>
<c:set var="code" value="avc001" scope="request" />
<c:set var="name" value="��ǻ��" scope="request" />
<c:set var="price" value="500000" scope="request" />
<jsp:forward page="jstl_02_1.jsp" />
</body>
</html>