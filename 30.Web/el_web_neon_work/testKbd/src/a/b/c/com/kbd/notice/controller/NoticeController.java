package a.b.c.com.kbd.notice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.GetChabun;
import a.b.c.com.kbd.notice.service.NoticeService;
import a.b.c.com.kbd.notice.service.NoticeServiceImpl;
import a.b.c.com.kbd.notice.vo.NoticeVO;


@WebServlet("/notice")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR"); 
		PrintWriter out = response.getWriter();
		
		String isudtype = request.getParameter("ISUD_TYPE");
		if(isudtype !=null) isudtype.toUpperCase();
		
		if(isudtype !=null && isudtype.length() > 0){
			System.out.println("isudtype >>> : " + isudtype);
			System.out.println("remoteIP >>> : " + request.getRemoteAddr());
			System.out.println("method >>> : " + request.getMethod());
			
			// notice 전체 조회
			if("SALL".equals(isudtype)){
				System.out.println("notice 정보 전체 조회 isudtype >>> : " + isudtype);
				
				NoticeService bs = new NoticeServiceImpl();
				ArrayList<NoticeVO> aListAll = bs.noticeSelectAll();
				
				if(aListAll !=null && aListAll.size() > 0) {
					
					request.setAttribute("aListAll", aListAll);
					RequestDispatcher rd = request.getRequestDispatcher("/kbd/notice/noticeSelectAll.jsp");
					rd.forward(request, response);
					
				}else{
					out.println("<script>");
					out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
					out.println("</script>");
				}
			}
			
			// notice 조회 : S U D ----------------------------------
			if("S".equals(isudtype) || "U".equals(isudtype)){
				System.out.println("공지사항 조건조회 : S U D isudtype >>> : " + isudtype);
				
				String nnum = request.getParameter("nnumCheck");
				if(nnum !=null && nnum.length() > 0){
					System.out.println("공지사항 번호 >>> : " + nnum);
					
					//서비스 호출하기
					NoticeService ns = new NoticeServiceImpl();
					NoticeVO nvo = null;
					nvo = new NoticeVO();
					
					nvo.setNnum(nnum);
					ArrayList<NoticeVO> aListS = ns.noticeSelect(nvo);
					
					if(aListS !=null && aListS.size() > 0){
						System.out.println("aListS.size() >>> : " + aListS.size());
						request.setAttribute("aListS", aListS);
						RequestDispatcher rd = request.getRequestDispatcher("/kbd/notice/noticeSelect.jsp");
						rd.forward(request, response);
						
					}else{
						out.println("<script>");
						out.println("alert('글 조회 실패')");
						out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
						out.println("</script>");
					}
				}else{
					System.out.println("공지사항 번호가 없습니다. ");
				}
			}

				// 공지사항 수정-------------------------------------------------
				if("UOK".equals(isudtype)){
					System.out.println("공지사항 수정 isudtype >>> : " + isudtype);
					
					String nnum = request.getParameter("nnum");
					String nsubject = request.getParameter("nsubject");
					String nmemo = request.getParameter("nmemo");
					System.out.println("nnum >>> : " + nnum);
					System.out.println("nsubject >>> : " + nsubject);
					System.out.println("nmemo >>> : " + nmemo);
					
					// 서비스 호출하기
					NoticeService ns = new NoticeServiceImpl();
					NoticeVO nvo = null;
					nvo = new NoticeVO();
					
					nvo.setNnum(nnum);
					nvo.setNsubject(nsubject);
					nvo.setNmemo(nmemo);
					
					int nCnt = ns.noticeUpdate(nvo);
					
					if(nCnt > 0) {
						System.out.println("공지사항 정보가 수정 되었습니다." + nCnt);
						request.setAttribute("nCnt", new Integer(nCnt));
						RequestDispatcher rd = request.getRequestDispatcher("/kbd/notice/noticeUpdate.jsp");
						rd.forward(request, response);
					}else{
						System.out.println("글 수정 실패 !!!!");
						out.println("<script>");
						out.println("alert('글 수정 실패')");
						out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
						out.println("</script>");
					}
				}
				
				// notice 등록
				if("I".equals(isudtype)){
					System.out.println("notice 등록 isudtype >>> : " + isudtype);
					
					String nnum = "";
					String nsubject = "";
					String nmemo = "";
					String nphoto = "";
					
					boolean fileUploadBool = request.getContentType().toLowerCase().startsWith("multipart/form-data");
					System.out.println("fileUploadBool >>> : " + fileUploadBool);
					
					if(fileUploadBool) {
						System.out.println("파일 업로드 루틴 >>> : ");
						
						String filePaths = CommonUtils.NOTICE_IMG_UPLOAD_PATH;
						int size_limit = CommonUtils.NOTICE_IMG_FILE_SIZE;
						String encode_type = CommonUtils.NOTICE_IMG_ENCODE;
						
						FileUploadUtil fu = new FileUploadUtil();
						boolean bool = fu.fileUpldad3(request, filePaths, size_limit, encode_type);
						
						if(bool) {
							
							nsubject = fu.getParameter("nsubject");
							nmemo = fu.getParameter("nmemo");
			
							// 사진
							ArrayList<String> aFileName = fu.getFileNames();
							nphoto = aFileName.get(0);
						}else{
							System.out.println("파일 업로드 실패");
						}
					}
					
				
				// 채번
				nnum = GetChabun.getNoticeChabun("d");
				System.out.println("nnum >>> : " + nnum);
				System.out.println("nsubject >>> : " + nsubject);
				System.out.println("nmemo >>> : " + nmemo);
				System.out.println("nphoto >>> : " + nphoto);
				
				NoticeService ns = new NoticeServiceImpl();
				NoticeVO nvo = null;
				nvo = new NoticeVO();
				
				nvo.setNnum(nnum);
				nvo.setNsubject(nsubject);
				nvo.setNmemo(nmemo);
				nvo.setNphoto(nphoto);
				
				NoticeVO.printlnNoticeVO(nvo);
				
				int nCnt = ns.noticeInsert(nvo);
				
				if(nCnt > 0){
					System.out.println("notice정보" + nCnt + "건 등록 되었습니다.");
					
					request.setAttribute("nCnt", new Integer(nCnt));
					
					RequestDispatcher rd = request.getRequestDispatcher("/kbd/notice/noticeInsert.jsp");
					rd.forward(request, response);
				}else{
					System.out.println("notice 정보 등록 실패 !!!!!");
					out.println("<script>");
					out.println("location.href='/testKbd/notice/notice.html'");
					out.println("</script>");
				}
			}
		}else{
			System.out.println("isudtype 을 잘 보내시오 !!!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
