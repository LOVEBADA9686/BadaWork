<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="a.b.c.com.kbd.mem.service.MemberService" %>
<%@ page import="a.b.c.com.kbd.mem.service.MemberServiceImpl" %>
<%@ page import="a.b.c.com.kbd.mem.vo.MemberVO" %>
<%@ page import="a.b.c.com.common.CodeUtil" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ��ü��ȸ</title>
<style type="text/css">
	*{
	margin: 0 auto;
	/*text-align: center*/	
	}
	
	div{
		margin: 50px 0px 0px 100px;
	}
	
	td, th{
		padding: 5px;
	}
	
	.tt{
		text-align: center;
	}
	
	.photo{
		border:1px solid red;
		width:160px;
		height: 180px;
		display: block;
		margin-reft: auto;
		margin-rigth: auto;
	}
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- ���� �ּҷ� OPEN API CDN �ҷ����� -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		// �̸���
		$('#memail2').change(function(){
			$('#memail2 option:selected').each(function(){
				if($(this).val()== '1'){//�����Է��� ���
					var aa = $("#memail1").val();
				//alert("aa >>> : " + aa);
				$("#memail1").val(''); // �� �ʱ�ȭ
				$("#memail1").attr("readonly", false); // Ȱ��ȭ
			}else{
				$("#memail1").val($(this).text()); // ���ð� �Է�
				$("#memail1").attr("readonly", true); // ��Ȱ��ȭ
			}});
		});
		
		// ������ȣ
		$("#zonecode").click(function(){
			console.log("zonecode >>> : ");
			new daum.Postcode({
				oncomplete: function(data){
					$("#zonecode").val(data.zonecode); //5�ڸ� ��������ȣ ���
					$("#mroadaddress").val(data.roadAddress); // ���θ� �ּ�
					$("#mjibunaddress").val(data.jibunAddress); //�����ּ�
				}
			}).open();
		});
	});
	
	function memUpdate(actionUpdate){
		console.log("boardUpdate ���� >>> : " + catrionUpdate);
		
		if('U' == actionUpdate) {
			var v1 = "UOK";
			document.memUpdateForm.action="/testKbd/mem?ISUD_TYPE="+V1;
		}
		
		if('D' == actionUpdate){
			var v2 = "DOK";
			document.memUpdateForm.action="/testKbd/mem?ISUD_TYPE="+V2;
		}
			document.memUpdateForm.method="POST";
			document.memUpdateForm.enctype="application/x-www-form-urlencoded";
			document.memUpdateForm.submit();
	}
	
	function checkAction(actionName){
		console.log("actionName ���� >>> : " + actionName);
		
		if('I' == actionName){
			location.href="/testKbd/kbd/mem/mem.html";
		}
		if('SALL' == actionName){
			location.href="/testKbd/mem?ISUD_TYPE=SALL";
		}
	}
</script>
</head>
<body>
<body onload="compCheck()">
<% request.setCharacterEncoding("EUC-KR"); %>
SELECT
<%
	Object obj = request.getAttribute("aListS");
	if(obj == null) return;
	
	ArrayList<MemberVO> aList = (ArrayList<MemberVO>)obj;
	int nCnt = aList.size();
	out.println(":::: ���� ��ȸ >>> : " + nCnt + " ��");
	
	String mgender = "";
	String mbirth = "";
	String mhp = "";
	String mtel = "";
	String memail = "";	
	String mzonecode = "";
	String mroadaddress = "";	
	String mroadaddressdetail = "";
	String mjibunaddress = "";
	String mhobby = "";	
	
	MemberVO mvo = null;
	if(nCnt == 1){
		mvo = aList.get(0);
		
		// ����
		mgender = mvo.getMgender();
		// �������
		mbirth = CodeUtil.birth(mvo.getMbirth());
		// �ڵ���
		mhp = CodeUtil.hp(mvo.getMhp());
		// ��ȭ��ȣ
		mtel = CodeUtil.tel(mvo.getMtel());		
		// �̸��� 
		memail = mvo.getMemail();
		//�ּ�
		mzonecode = mvo.getMzonecode();
		mroadaddress = mvo.getMroadaddress();
		String addr[] = mroadaddress.split("@");
		mroadaddress = addr[0];
		mroadaddressdetail = addr[1];
		mjibunaddress = mvo.getMjibunaddress();
		//���
		mhobby = mvo.getMhobby();
	}
%>
<hr>
<div>
<form name="memUpdateForm" id="memUpdateForm">
<table border="1">
<script>
function compCheck(){
	console.log("compCheck >>> : ���� >>> : ");
	
	//����
	var gen = '<%= mgender %>';
	console.log("gen >>> : " + gen);
	if('01' == gen){
		document.getElementsByName("mgender")[0].checked = true;
	}
	if('02' == gen){
		document.getElementsByName("mgender")[1].checked = true;
	}
	
	// �̸���
	var email = '<%= memail %>';
	var emails = email.split('@');
	document.getElementById("memail").value = emails[0];
	document.getElementById("memail1").value = emails[1];
	
	// ���
	var hobs = '<%= mhobby %>';
	console.log("hobs >>> : " + hobs);
	var hob = hob.split(',');
	for (var m=0; m < hob.length; m++) {
		var hobVaalue = hob[m];
		console.log("hobValue >>> : " + hobValue);
		if('01' == hobValue) {
			document.getElementsByName("mhobby")[0].checked = true;
		}
		if('02' == hobValue) {
			document.getElementsByName("mhobby")[1].checked = true;
		}
		if('03' == hobValue) {
			document.getElementsByName("mhobby")[2].checked = true;
		}
		if('04' == hobValue) {
			document.getElementsByName("mhobby")[3].checked = true;
		}
		if('05' == hobValue) {
			document.getElementsByName("mhobby")[4].checked = true;
		}	
	}
}
</script>
<tr>
	<td colspan="3" align="center">
	
		<font size="4" style="color:blue;">ȸ������ ���� && ����</font>
		<img src="/testKbd/img/img_mando/ase.gif" width="25" height="25" alt="image">
	</td>
</tr>
<tr>
	<td>ȸ����ȣ</td>
	<td>
	<input type="text" name="mnum" id="mnum" value="<%= mvo.getMnum() %>" readonly />
	</td>
	<td rowspan="5">
		<img class="photo" src="/testKbd/fileupload/member/<%= mvo.getMphoto() %>" alt="image">	
	</td>
</tr>
<tr>
	<td>�̸�</td>
	<td><input type="text" name="mname" id="mname" value="<%= mvo.getMname() %>" readonly /></td>
</tr>
<tr>
	<td>���̵�</td>
	<td>
		<input type="text" name="mid" id="mid" style="width:100px" value="<%= mvo.getMid() %>" readonly />
	</td>
</tr>
<tr>
	<td>�н�����</td>
	<td>
		<input type="text" name="mpw" id="mpw" style="width:100px" value="<%= mvo.getMpw() %>" readonly />
	</td>
</tr>
<tr>
	<td>����</td>
	<td>
		<input type="radio" name="mgender" id="mgender" value="01" checked /> ����
		<input type="radio" name="mgender" id="mgender" value="02" /> ����
	</td>
</tr>
<tr>
	<td>�������</td>
	<td colspan="2">
		<input type="text" name="mbirth" id="mbirth" value="<%= mbirth %>" readonly />
	</td>
</tr>
<tr>
	<td>�̸���</td>
	<td colspan="2">
		<input type="text" name="memail" id="memail" style="width:100px" />
		@ <input type="text" name="memail" id="memail" style="width:100px"
			placeholder="�����Է�" />
		<select name="memail2" id="memail2">
			<option value="1" selected>�����Է�</option>
			<option value="naver.com">naver.com</option>
			<option value="gmail.com">gmail.com</option>
			<option value="daum.net">daum.net</option>
		</select>
	</td>
</tr>
<tr>
	<td>�ּ�</td>
	<td colspan="2">
		<input type="text" name="mzonecode" id="mzonecode"
			placeholder="������ȣ" style="width:50px" value="<%= mzonecode %>" >
		<input type="button" name="zonecode" id="zonecode" value="������ȣ ã��"><br>
		<input type="text" name="mroadaddress" id="mroadaddress" 
 			placeholder="���θ��ּ�" style="width:250px" value="<%= mroadaddress %>" ><br>
 		 		<input type="text" name="mroadaddressdetail" id="mroadaddressdetail" 
 			placeholder="���θ��ּ� ���ּ�" style="width:250px" value="<%= mroadaddressdetail %>" ><br>	
 		<input type="text" name="mjibunaddress" id="mjibunaddress"
 			 placeholder="�����ּ�" style="width:250px" value="<%= mjibunaddress %>">
 	</td>
 </tr>
 <tr>
 	<td>���</td>
 	<td colspan="2">
 		<input type="checkbox" name="mhobby" value="01" />�˰�����
 		<input type="checkbox" name="mhobby" value="02" />�ڵ�
 		<input type="checkbox" name="mhobby" value="03" />�м�����<br>
 		<input type="checkbox" name="mhobby" value="04" />�����ͺ��̽�
 		<input type="checkbox" name="mhobby" value="05" />��ũ��Ʈ
 	</td>
 </tr>
 <tr>
 	<td>�Ұ���</td>
 	<td colspan="2">
 		<textarea name="minfo" id="minfo" rows="5" cols="50"><%= mvo.getMinfo() %>
 		</textarea>
 	</td>
 </tr>
 <tr>
 	<td colspan="3" align="center">
 	<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE">
 	<input type="button" value="����" onclick="memUpdate('U')"/>
 	<input type="button" value="����" onclick="memUpdate('D')"/>
 	<input type="reset" value="���"/>
 	&nbsp;&nbsp;&nbsp;&nbsp;
 	<input type="button" value="�Է�" onclick="checkAction('I')" />
 	<input type="button" value="���" onclick="checkAction('SALL');" />
 </td>
 <tr>
 </table>
</form>
</div>
</body>
</html>