<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>

<%
	String[] studyJSP = (String[]) request.getAttribute("study");
	ArrayList<String> listJSP = (ArrayList<String>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>el_06_1</title>
</head>
<body>
<h3>el_06_1</h3>
<hr>
[�迭�� �޴� ���(JSP) -1]<br />
<%for(int i =0; i<studyJSP.length; i++){ %>
	studyJSP[] �迭�� <%=i %>����(�ε���) �� : <%=studyJSP[i] %><br/>
<%} %>
<br />
[�迭�� �޴� ���(EL)]<br />
<!-- study[]�� �������� �ۼ����� �ʾ�����, 27���� �Ѿ�� study[]�� ������ �� �ִ�. -->
study[] �迭�� 0����(�ε���) �� : ${study[0] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[1] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[2] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[3] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[4] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[5] }<br />
study[] �迭�� 0����(�ε���) �� : ${study[6] }<br />
<br /><hr><br />
[����Ʈ�� �޴� ���(JSP)]<br />
<%
for(int i = 0; i < listJSP.size(); i++){
	out.println("ArrayList �迭�� " + i + "���� ��" + listJSP.get(i) + "<br />");
}
%>
<br/>
[����Ʈ�� �޴� ���(EL)]<br/>
ArrayList �迭�� 0���� �� : ${list[0] }<br/>
ArrayList �迭�� 0���� �� : ${list[1] }<br/>
ArrayList �迭�� 0���� �� : ${list[2] }<br/>
ArrayList �迭�� 0���� �� : ${list[3] }<br/>
ArrayList �迭�� 0���� �� : ${list[4] }<br/>
<br /><hr><br />

[���ε� ��ü(mvo)�� �޴� ���(EL)]<br />
�̸� : ${mvo.irum }<br />
���̵� : ${mvo.id }<br />
��й�ȣ : ${mvo.pw }<br />
���� : ${mvo.age }<br />
�ּ� : ${mvo.addr }<br />
��ȭ��ȣ : ${mvo.tel }<br />
<br /><hr><br />

[����Ʈ ������ ��ü�� �����  ��ü �迭�� �޴� ���]<br />
mlist 0���� �� : ${mlist[0].irum },
			  ${mlist[0].id },
			  ${mlist[0].pw },
			  ${mlist[0].age },
			  ${mlist[0].addr },
			  ${mlist[0].tel }<br/>
mlist 4���� �� : ${mlist[4].irum },
			  ${mlist[0].id },
			  ${mlist[0].pw },
			  ${mlist[0].age },
			  ${mlist[0].addr },
			  ${mlist[0].tel }<br />
</body>
</html>