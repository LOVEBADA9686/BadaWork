<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>b_1</title>
</head>
<body>
<h3>b_1</h3>
<hr>
<%
	String abc = String.valueOf(request.getAttribute("abc")); 
	out.println("b_1.jsp ::: abc >>> : abc >>> : " + abc + "<br>");
	
	Object obj = request.getAttribute("aListRequest");
	//if(obj == null) return;
	ArrayList<String> _aList = (ArrayList<String>)obj;
	if(_aList !=null && _aList.size() > 0){
		for(int i=0; i < _aList.size(); i++){
			out.println("b_1.jsp ::: _aList.get("+i+") >>> : " + _aList.get(i) + "<br>");	
			System.out.println("b_1.jsp ::: _aList.get("+i+") >>> : " + _aList.get(i));
		}
	}
	
	
	String abc00 = String.valueOf(session.getAttribute("abc00")); 
	out.println("b_1.jsp ::: abc00 >>> : " + abc00 + "<br>");
	
	
	Object objSession = session.getAttribute("aListSession");
	if(objSession == null) return;
	
	ArrayList<String> _aListSession = (ArrayList<String>)objSession;
	if(_aListSession !=null && _aListSession.size() > 0){
		for(int i=0; i < _aListSession.size(); i++){
			out.println("b_1.jsp ::: _aListSession.get("+i+") >>> : " + _aListSession.get(i) + "<br>");	
			System.out.println("b_1.jsp ::: _aListSession.get("+i+") >>> : " + _aListSession.get(i));
		}
	}
	
	String abc11 = String.valueOf(application.getAttribute("abc11")); 
	out.println("b_1.jsp ::: abc11 >>> : " + abc11 + "<br>");
	
	Object objApplicatoin = session.getAttribute("aListApplicatoin");
	if(objSession == null) return;
	
	ArrayList<String> _aListApplicatoin = (ArrayList<String>)objApplicatoin;
	if(_aListApplicatoin !=null && _aListApplicatoin.size() > 0){
		for(int i=0; i < _aListApplicatoin.size(); i++){
			out.println("b_1.jsp ::: _aListApplicatoin.get("+i+") >>> : " + _aListApplicatoin.get(i) + "<br>");	
			System.out.println("b_1.jsp ::: _aListApplicatoin.get("+i+") >>> : " + _aListApplicatoin.get(i));
		}
	}

%>
</body>
</html>