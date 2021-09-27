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
		
		String isudType = request.getParameter("ISUD_TYPE");	
		
		if (isudType !=null && isudType.length() > 0){
			isudType = isudType.toUpperCase();
			
			// �������� ��� ------------------------------------------------------------------------------
			if ("I".equals(isudType)){
				System.out.println("�������׵��isudType >>> : " + isudType);
				
                boolean bool = request.getContentType().toLowerCase().startsWith("multipart/form-data");				
				if (bool){
					System.out.println("�������׵�� ���Ͼ��ε� ��ƾ :: bool >>> : " + bool);
					
					String filePaths = CommonUtils.NOTICE_IMG_UPLOAD_PATH;
	                int size_limit = CommonUtils.NOTICE_IMG_FILE_SIZE;
	                String  encode_type = CommonUtils.NOTICE_IMG_ENCODE;
					
					FileUploadUtil fu = new FileUploadUtil();					
					boolean bFile = fu.fileUpload3(request, filePaths, size_limit, encode_type);
					
					if (bFile){
						
						// ���� ȣ���ϱ� 
						NoticeService ns = new NoticeServiceImpl();
						NoticeVO nvo = null;
						nvo = new NoticeVO();
						
						String nnum = GetChabun.getNoticeChabun("d");
						System.out.println("nnum >>> : " + nnum);
						
						// �������� ��ȣ
						nvo.setNnum(nnum);
						// �������� ����
						nvo.setNsubject(fu.getParameter("nsubject"));
						// ��������  ����
						nvo.setNmemo(fu.getParameter("nmemo"));						
						// ����
						ArrayList<String> aFileName = fu.getFileNames();
						String nphoto = aFileName.get(0);				
						nvo.setNphoto(nphoto);
						
					
						System.out.println("NoticeController �������� ��� >>> I ");
						NoticeVO.printlnNoticeVO(nvo);
					
						int nCnt = ns.noticeInsert(nvo);
						if (nCnt > 0){						
							request.setAttribute("nCnt", new Integer(nCnt));				
							RequestDispatcher rd = request.getRequestDispatcher("/kbd/notice/noticeInsert.jsp");
							rd.forward(request, response);						
						}else{
							out.println("<script>");				
							out.println("location.href='/testKbd/kbd/notice/notice.html'");
							out.println("</script>");
						}
					
					}else{
						System.out.println("�������� ��� �� ���� ���ε� ���� ");
					}	
				}				
			} // �������� ��� end
			
			// ��ü �������� ��ȸ ------------------------------------------------------------------------
			if ("SALL".equals(isudType)){
				System.out.println("������������ ��ü��ȸ isudType >>> : " + isudType);
				
				// ���� ȣ���ϱ� 
				NoticeService ns = new NoticeServiceImpl();
				ArrayList<NoticeVO> aListAll = ns.noticeSelectAll();
				
				if (aListAll !=null && aListAll.size() > 0) {
					
					request.setAttribute("aListAll", aListAll);					
					RequestDispatcher rd= request.getRequestDispatcher("/kbd/notice/noticeSelectAll.jsp");
					rd.forward(request, response);
					
				}else {
					out.println("<script>");					
					out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
					out.println("</script>");
				}		
			} // ��ü ȸ������ ��ȸ end
			
			// �������� ��ȸ : S U D ---------------------------------------------------------------------
			if ("S".equals(isudType) || "U".equals(isudType)){
				System.out.println("�������� ������ȸ : S U D isudType >>> : " + isudType);

				String nnum = request.getParameter("nnumCheck");				
				if (nnum !=null && nnum.length() > 0){
					System.out.println("�������� ��ȣ >>> :  " + nnum);
					
					// ���� ȣ���ϱ� 
					NoticeService ns = new NoticeServiceImpl();
					NoticeVO nvo = null;
					nvo = new NoticeVO();
					
					nvo.setNnum(nnum);					
					ArrayList<NoticeVO> aListS = ns.noticeSelect(nvo);
					
					if (aListS !=null && aListS.size() > 0) {
						System.out.println("aListS.size() >>> : " + aListS.size());						
						request.setAttribute("aListS", aListS);					
						RequestDispatcher rd= request.getRequestDispatcher("/kbd/notice/noticeSelect.jsp");
						rd.forward(request, response);
						
					}else {
						out.println("<script>");
						out.println("alert('�� ��ȸ ����')");
						out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
						out.println("</script>");
					}									
				}else{
					System.out.println("�������� ��ȣ��  �����ϴ�. ");
				}		
			}
			
			// �������� ���� ------------------------------------------------------------------------------
			if ("UOK".equals(isudType)){
				System.out.println("�������� ���� isudType >>> : " + isudType);
				
				String nnum = request.getParameter("nnum");
				String nsubject = request.getParameter("nsubject");
				String nmemo = request.getParameter("nmemo");				
				System.out.println("nnum >>> : " + nnum);
				System.out.println("nsubject >>> : " + nsubject);
				System.out.println("nmemo >>> : " + nmemo);
				
				// ���� ȣ���ϱ� 
				NoticeService ns = new NoticeServiceImpl();
				NoticeVO nvo = null;
				nvo = new NoticeVO();
				
				nvo.setNnum(nnum);
				nvo.setNsubject(nsubject);
				nvo.setNmemo(nmemo);
				
				int nCnt = ns.noticeUpdate(nvo);
				
				if (nCnt > 0) {
					System.out.println("�������� ������  ���� �Ǿ����ϴ�." + nCnt);					
					request.setAttribute("nCnt", new Integer(nCnt));										
					RequestDispatcher rd= request.getRequestDispatcher("/kbd/notice/noticeUpdate.jsp");
					rd.forward(request, response);
					
				}else {
					System.out.println("�� ���� ���� !!!!");
					out.println("<script>");	
					out.println("alert('�� ���� ����')");
					out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
					out.println("</script>");
				}
			}			
			
			// �������� ���� ------------------------------------------------------------------------------
			if ("DOK".equals(isudType)){
				System.out.println("�������� ���� isudType >>> : " + isudType);
				
			
				String nnum = request.getParameter("nnumCheck");				
				if (nnum !=null && nnum.length() > 0){
					System.out.println("�������� ��ȣ >>> :  " + nnum);
					
					// ���� ȣ���ϱ� 
					NoticeService ns = new NoticeServiceImpl();
					NoticeVO nvo = null;
					nvo = new NoticeVO();
					
					nvo.setNnum(nnum);
					int nCnt = ns.noticeDelete(nvo);
					
					if (nCnt > 0) {
						System.out.println("�������� ������  ���� �Ǿ����ϴ�." + nCnt);					
						request.setAttribute("nCnt", new Integer(nCnt));										
						RequestDispatcher rd= request.getRequestDispatcher("/kbd/notice/noticeDelete.jsp");
						rd.forward(request, response);
						
					}else {
						System.out.println("�� ���� ���� !!!!");
						out.println("<script>");	
						out.println("alert('�� ���� ����')");
						out.println("location.href='/testKbd/notice?ISUD_TYPE=SALL'");
						out.println("</script>");
					}
				}else{
					System.out.println("�������� ��ȣ�� �� �ѱ⼼�� !!!! ");
				}	
			}	
		}else{
			System.out.println("form �±׿��� hidden Ÿ���� ISUD_TYPE �� �ѱ⼼�� >>> : ");
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