/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-09-23 11:16:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.kbd.mem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.com.kbd.mem.service.MemberService;
import a.b.c.com.kbd.mem.service.MemberServiceImpl;
import a.b.c.com.kbd.mem.vo.MemberVO;
import a.b.c.com.common.CodeUtil;
import java.util.ArrayList;

public final class memSelectAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("a.b.c.com.kbd.mem.service.MemberService");
    _jspx_imports_classes.add("a.b.c.com.common.CodeUtil");
    _jspx_imports_classes.add("a.b.c.com.kbd.mem.service.MemberServiceImpl");
    _jspx_imports_classes.add("a.b.c.com.kbd.mem.vo.MemberVO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>글 전체조회</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	* {\r\n");
      out.write("		margin: 0 auto;\r\n");
      out.write("		/*text-align: center;*/\r\n");
      out.write("	}\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("	td, th {\r\n");
      out.write("		 padding: 5px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.tt {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	//체크박스 체크 확인하기 \r\n");
      out.write("	function checkOnly(chk){\r\n");
      out.write("		// alert(\">>> : \" + chk);\r\n");
      out.write("		var chkObj = document.getElementsByName(\"mnumCheck\");\r\n");
      out.write("		console.log(\"chkObj >>> : \" + chkObj);\r\n");
      out.write("		for (var i=0; i < chkObj.length; i++){\r\n");
      out.write("			if (chkObj[i] != chk){\r\n");
      out.write("				chkObj[i].checked = false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	$(document).ready(function(){	\r\n");
      out.write("\r\n");
      out.write("		// 등록하기 \r\n");
      out.write("		$(\"#I\").click(function(){			\r\n");
      out.write("			location.href='/testKbd/kbd/mem/mem.html';			\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 전체조회\r\n");
      out.write("		$(\"#SALL\").click(function(){			\r\n");
      out.write("			var isudType = document.memSelectAllForm.ISUD_TYPE.value = \"SALL\";			\r\n");
      out.write("			send(isudType);		\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 수정하기 \r\n");
      out.write("		$(\"#U\").click(function(){			\r\n");
      out.write("\r\n");
      out.write("			var nCnt = chkInfo();			\r\n");
      out.write("			if (nCnt == 0){	\r\n");
      out.write("				console.log('체크박스를 체크하세요');\r\n");
      out.write("				alert('체크박스를 체크하세요');\r\n");
      out.write("			}else{				\r\n");
      out.write("				// jQuery 버전 \r\n");
      out.write("				var v1 = $(\"#ISUD_TYPE\").val('U');\r\n");
      out.write("				alert(\"v1 >>> : \" + v1.val());\r\n");
      out.write("				send(v1);				\r\n");
      out.write("			}			\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		// 삭제하기 \r\n");
      out.write("		$(\"#D\").click(function(){			\r\n");
      out.write("			\r\n");
      out.write("			var nCnt = chkInfo();\r\n");
      out.write("			if (nCnt == 0){	\r\n");
      out.write("				console.log('체크박스를 체크하세요');\r\n");
      out.write("				alert('체크박스를 체크하세요');\r\n");
      out.write("			}else{				\r\n");
      out.write("				// jQuery 버전 \r\n");
      out.write("				var v2 = $(\"#ISUD_TYPE\").val('D');\r\n");
      out.write("				alert(\"v2 >>> : \" + v2.val());\r\n");
      out.write("				send(v2);\r\n");
      out.write("			}					\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 체크박스 체크 카운트\r\n");
      out.write("		function chkInfo(){			\r\n");
      out.write("			var obj = document.getElementsByName(\"mnumCheck\");\r\n");
      out.write("			var nCnt = 0;			\r\n");
      out.write("			for(var i=0; i < obj.length; i++){ \r\n");
      out.write("	          	if (obj[i].checked == true){ \r\n");
      out.write("	          		nCnt++;\r\n");
      out.write("	          	}		          			            \r\n");
      out.write("	        }			\r\n");
      out.write("			console.log('nCnt >>> : ' + nCnt);			\r\n");
      out.write("			return nCnt;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		// submit \r\n");
      out.write("		function send(isudType){\r\n");
      out.write("			alert(\"isudType send >>> : \" + isudType);\r\n");
      out.write("			\r\n");
      out.write("			$(\"#memSelectAllForm\").attr({\r\n");
      out.write("				\"action\":\"/testKbd/mem?ISUD_TYPE=\"+isudType,\r\n");
      out.write("				\"method\":\"GET\",\r\n");
      out.write("				\"enctype\":\"application/x-www-form-urlencoded\"\r\n");
      out.write("			}).submit();\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>	\r\n");
      out.write("</head>\r\n");
 request.setCharacterEncoding("EUC-KR");
      out.write(" \r\n");
      out.write("SELECT ALL\r\n");

	Object obj = request.getAttribute("aListAll");
	if (obj == null) return;
	
	ArrayList<MemberVO> aList = (ArrayList<MemberVO>)obj;
	int nCnt = aList.size();
	out.println(":::: 전체 조회 건수  " + nCnt + " 건");	

      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td calspan=\"2\">\r\n");
      out.write("<font size=\"4\" color=\"blue\">\r\n");
      out.write("	<img src=\"/testKbd/img/img_mando/ase.gif\" width=\"25\" height=\"25\" alter=\"image\">\r\n");
      out.write("	BOARD TEST\r\n");
      out.write("</font>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("<hr>\r\n");
      out.write("<form name=\"memSelectAllForm\" id=\"memSelectAllForm\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<thead>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td class=\"tt\"><input type=\"checkbox\" name=\"chkAll\" id=\"chkAll\"></td>\r\n");
      out.write("	<td class=\"tt\">순번</td>\r\n");
      out.write("	<td class=\"tt\">회원번호</td>\r\n");
      out.write("	<td class=\"tt\">이름</td>\r\n");
      out.write("	<td class=\"tt\">아이디</td>\r\n");
      out.write("	<td class=\"tt\">성별</td>\r\n");
      out.write("	<td class=\"tt\">생년월일</td>\r\n");
      out.write("	<td class=\"tt\">핸드폰</td>\r\n");
      out.write("	<td class=\"tt\">이메일</td>\r\n");
      out.write("	<td class=\"tt\">주소</td>\r\n");
      out.write("	<td class=\"tt\">취미</td>\r\n");
      out.write("	<td class=\"tt\">사진</td>	\r\n");
      out.write("	<td class=\"tt\">수정일</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</thead>\r\n");

	String gender = "";
	String birth = "";
	String hp = "";
	String tel = "";
	String email = "";
	String addr = "";
	String hobby = "";
	
	for(int i=0; i<nCnt; i++){		
		MemberVO mvo = aList.get(i);
		gender = CodeUtil.gender(mvo.getMgender());
		birth = CodeUtil.birth(mvo.getMbirth());
		hp = CodeUtil.hp(mvo.getMhp());
		addr = mvo.getMzonecode() + " " + mvo.getMroadaddress().replace("@", " " );
		hobby = CodeUtil.hobbys(mvo.getMhobby());				

      out.write("					\r\n");
      out.write("<tbody>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td class=\"tt\">\r\n");
      out.write("		<input type=\"checkbox\" id=\"mnumCheck\" name=\"mnumCheck\" value=");
      out.print( mvo.getMnum() );
      out.write(" onclick=\"checkOnly(this)\">\r\n");
      out.write("	</td>		\r\n");
      out.write("	<td class=\"tt\">");
      out.print( i + 1 );
      out.write("</td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( mvo.getMnum() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( mvo.getMname() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( mvo.getMid() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( gender );
      out.write(" </td>	\r\n");
      out.write("	<td class=\"tt\">");
      out.print( birth );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( hp );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( mvo.getMemail() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( addr );
      out.write("</td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( hobby );
      out.write("</td>\r\n");
      out.write("	<td class=\"tt\"><img src=\"/testKbd/fileupload/member/");
      out.print( mvo.getMphoto() );
      out.write(" \" border=\"1\" width=\"25\" height=\"25\" alt=\"image\"></td>	\r\n");
      out.write("	<td class=\"tt\">");
      out.print( mvo.getUpdatedate() );
      out.write(" </td>			\r\n");
      out.write("</tr>	\r\n");

	}//end of if

      out.write("						\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"20\" align=\"right\">\r\n");
      out.write("		<input type=\"hidden\" name=\"ISUD_TYPE\" id=\"ISUD_TYPE\" value=\"\">			\r\n");
      out.write("		<input type=\"button\" value=\"등록\" id=\"I\">\r\n");
      out.write("		<input type=\"button\" value=\"조회\" id=\"SALL\">\r\n");
      out.write("		<input type=\"button\" value=\"수정\" id=\"U\">\r\n");
      out.write("		<input type=\"button\" value=\"삭제\" id=\"D\">									\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>	\r\n");
      out.write("</tbody>			\r\n");
      out.write("</table>\r\n");
      out.write("</form>		\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
