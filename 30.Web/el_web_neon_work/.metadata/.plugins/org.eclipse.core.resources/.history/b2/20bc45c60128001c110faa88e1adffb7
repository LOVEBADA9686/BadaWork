<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl_09</title>
</head>
<body>
<h3>jstl_09</h3>
<hr>
<c:set var="num" value="123456789" />
<h3>숫자 포맷  : ${num }</h3>
형식 1 :<fmt:formatNumber value="${num }" groupingUsed="true"/><br/>
형식 2 :<fmt:formatNumber value="${num }" groupingUsed="false"/><br/>
형식 3 :<fmt:formatNumber value="${num }" pattern="#,##0"/><br/>
형식 4 :<fmt:formatNumber value="${num }" pattern="#,##0개"/><br/>

<h3>기타 포맷 : 통화, 백분율</h3>
<%-- 통화 기호를 입력할 경우 특수문자 : ㄹ -> 한자 --%>
금액 1 : <fmt:formatNumber value="${num }" type="currency" currencySymbol="￦"/><br/>
금액 2 : <fmt:formatNumber value="${num }" type="currency" currencySymbol="$"/><br/>
금액 3 : <fmt:formatNumber value="${num }" pattern="￦#,##0원" /><br/>
백분율 1 : <fmt:formatNumber value="0.123" type="percent"/><br/>
백분율 2 : <fmt:formatNumber value="0.123" pattern="0.00%"/><br/>
</body>
</html>