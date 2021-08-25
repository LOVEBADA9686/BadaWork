package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.HbeBoardService;
import a.b.c.board.service.HbeBoardServiceImpl;
import a.b.c.board.vo.HbeBoardVO;
import a.b.c.common.HbeBoardChabun;
import a.b.c.mem.scr.HbeMemberScr_1;

public class HbeBoardScr_1 {
	
	// 게시판정보 라벨
	public static final String[] insert_label = {"글제목", "작성자", "글내용", "비밀번호"};
	public static final String[] update_label = {"글번호", "글제목", "글내용"};	

	// 전체 조회
	public static void hboardSelectAll(){
		
		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	

			ArrayList<HbeBoardVO> aList = hs.hboardSelectAll();

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					HbeBoardVO hvo = aList.get(i);	
					HbeBoardVO.printHbeBoardVO(hvo);
				}		
			}else {
				System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("등록 중 에러가 >>> : " + e.getMessage());
		}
	}
	
	// 조건 조회
	public static void hboardSelect(String bnum){
		System.out.println("HbeBoardScr.hboardSelect() 함수 진입 >>> : ");
		System.out.println("회원정보 조회 >>> : " + bnum);
				
		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			hvo.setBnum(bnum);

			ArrayList<HbeBoardVO> aList = hs.hboardSelect(hvo);

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					HbeBoardVO _hvo = aList.get(i);	
					HbeBoardVO.printHbeBoardVO(_hvo);
				}		
			}else {
				System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("등록 중 에러가 >>> : " + e.getMessage());
		}
		
	}
	
	// 글 입력
	public static void hboardInsert(String sVal[]){
		System.out.println("HbeBoardScr.hboardInsert() 함수 진입 >>> : ");
		System.out.println("회원정보 입력 >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(insert_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = HbeBoardChabun.gubunNum();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bpw = sVal[2];
		String bcontents = sVal[3];
		
		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBwriter(bwriter);			
			hvo.setBcontents(bcontents);
			hvo.setBpw(bpw);
			
			int nCnt = hs.hboardInsert(hvo);					
			
			if (nCnt > 0) {				
				System.out.println("게시글 " + nCnt + " 건 등록 되었습니다.");				
			}else {
				System.out.println("게시글 등록 실패.");
			}			
		}catch(Exception e) {
			System.out.println("등록 중 에러가 >>> : " + e.getMessage());
		}
	}
	
	// 글 수정 
	public static void hboardUpdate(String sVal[]){
		System.out.println("HbeBoardScr.hboardUpdate() 함수 진입 >>> : ");
		System.out.println("회원정보 수정 >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(update_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = sVal[0];		
		String bsubject = sVal[1];
		String bcontents = sVal[2];
		
		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBcontents(bcontents);
						
			int nCnt = hs.hboardUpdate(hvo);	
			
			if (nCnt > 0) {				
				System.out.println("게시글 " + nCnt + " 건 수정 되었습니다.");				
			}else {
				System.out.println("게시글 수정 실패.");
			}			
		}catch(Exception e) {
			System.out.println("수정 중 에러가 >>> : " + e.getMessage());
		}				 
	}
	
	// 글 삭제
	public static void hboardDelete(String bnum){
		System.out.println("HbeBoardScr.hboardDelete() 함수 진입 >>> : ");
		System.out.println("회원정보 삭제 >>> : " + bnum);

		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
						
			int nCnt = hs.hboardDelete(hvo);	
			
			if (nCnt > 0) {				
				System.out.println("게시글 " + nCnt + " 건 삭제 되었습니다.");				
			}else {
				System.out.println("게시글 삭제 실패.");
			}			
		}catch(Exception e) {
			System.out.println("삭제 중 에러가 >>> : " + e.getMessage());
		}				 
	}
	
	
	// 게시판 INSERT, UPDATE 정보 입력하기 
	public static String[] getParameter(int iVal) {
	
		String sVal[] = null;
		
		// 게시판 등록 파라미터 
		if (3 == iVal) { 			
			
			sVal = new String[insert_label.length];	
			
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("등록할 게시판정보를 입력하시오 >>> : " + insert_label.length);
			System.out.println("등록할 게시판 배열의 길이 >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				System.out.println(insert_label[i] + "을(를) 입력하시오 :: " );
				sVal[i] = sc2.next();
				System.out.println(insert_label[i] + " 정보는 >>> : " + sVal[i]);
			}
		}			
		
		// 게시판 수정 파라미터 
		if (4 == iVal) { 
		
			sVal = new String[update_label.length];				
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("수정할 게시판정보를 입력하시오 >>> : " + update_label.length);
			System.out.println("수정할 게시판정보 배열의 길이 >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				
				System.out.println(update_label[i] + "을(를) 입력하시오 :: " );
				
				sVal[i] = sc3.next();
				
				System.out.println(update_label[i] + " 정보는 >>> : " + sVal[i]);
			}
		}
		
		return sVal;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("게시판 CRUD::ISUD 테스트 >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n게시판정보 전체조회:1, 조건조회:2, 등록:3, 수정:4, 삭제:5, 종료:0");
			
			int isud = sc.nextInt();	
			if (0 == isud) {
				System.out.println("프로그램 종료 !!"); 
				break;	
			}
			 
			
			switch(isud) {
				case 1:		
					try {
						HbeBoardScr_1.hboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:
					System.out.println("조회조건 글번호를 입력하시오 >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						HbeBoardScr_1.hboardSelect(bnum);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						String sVal3[] = HbeBoardScr_1.getParameter(3);
						HbeBoardScr_1.hboardInsert(sVal3);
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						String sVal4[] = HbeBoardScr_1.getParameter(4);
						HbeBoardScr_1.hboardUpdate(sVal4);
					}catch(Exception e) {						
					}				
					break;
					
				case 5:
					System.out.println("조회조건 글번호를 입력하시오 >>> : ");
					Scanner sc2 = new Scanner(System.in);
					try {
						String bnum = sc2.next();
						HbeBoardScr_1.hboardDelete(bnum);							
					}catch(Exception e) {						
					}								
					break;					
			}
		}
	}
}
