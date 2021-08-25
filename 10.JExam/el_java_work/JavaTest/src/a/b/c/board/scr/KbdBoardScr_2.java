package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;
import a.b.c.board.scr.KbdBoardScr_1;

public class KbdBoardScr_2 {
	
	// 게시판정보 라벨
	public static final String[] insert_label = {"글제목", "작성자", "글내용", "비밀번호"};
	public static final String[] update_label = {"글번호", "글제목", "글내용"};	

	// 전체 조회
	public static void kboardSelectAll(){
		
		try {
			// 서비스 호출 
			KbdBoardService ks = new KbdBoardServiceImpl();	

			ArrayList<KbdBoardVO> aList = ks.kboardSelectAll();

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					KbdBoardVO kvo = aList.get(i);	
					KbdBoardVO.printKbdBoardVO(kvo);
				}		
			}else {
				System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("등록 중 에러가 >>> : " + e.getMessage());
		}
	}
	
	// 조건 조회
	public static void kboardSelect(String sVal[]){
		System.out.println("KbdBoardScr.kboardSelect() 함수 진입 >>> : ");
		System.out.println("회원정보 조회 >>> : " + sVal[0]);
				
		try {
			// 서비스 호출 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			kvo.setBnum(sVal[0]);

			ArrayList<KbdBoardVO> aList = ks.kboardSelect(kvo);

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					KbdBoardVO _kvo = aList.get(i);	
					KbdBoardVO.printKbdBoardVO(_kvo);
				}		
			}else {
				System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("등록 중 에러가 >>> : " + e.getMessage());
		}
		
	}
	
	// 글 입력
	public static void kboardInsert(String sVal[]){
		System.out.println("KbdBoardScr.kboardInsert() 함수 진입 >>> : ");
		System.out.println("회원정보 입력 >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(insert_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = KbdBoardChabun.gubunNum();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bpw = sVal[2];
		String bcontents = sVal[3];
		
		try {
			// 서비스 호출 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			
			kvo.setBnum(bnum);
			kvo.setBsubject(bsubject);
			kvo.setBwriter(bwriter);			
			kvo.setBcontents(bcontents);
			kvo.setBpw(bpw);
			
			int nCnt = ks.kboardInsert(kvo);					
			
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
	public static void kboardUpdate(String sVal[]){
		System.out.println("KbdBoardScr.kboardUpdate() 함수 진입 >>> : ");
		System.out.println("회원정보 수정 >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(update_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = sVal[0];		
		String bsubject = sVal[1];
		String bcontents = sVal[2];
		
		try {
			// 서비스 호출 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			
			kvo.setBnum(bnum);
			kvo.setBsubject(bsubject);
			kvo.setBcontents(bcontents);
						
			int nCnt = ks.kboardUpdate(kvo);	
			
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
	public static void kboardDelete(String sVal[]){
		System.out.println("KbdBoardScr.kboardDelete() 함수 진입 >>> : ");
		System.out.println("회원정보 삭제 >>> : " + sVal[0]);

		try {
			// 서비스 호출 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			
			kvo.setBnum(sVal[0]);
						
			int nCnt = ks.kboardDelete(kvo);	
			
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
		
		if (2 == iVal || 5 == iVal) {
			sVal = new String[1];
			
			System.out.println("조회 또는 삭제할 게시판 글번호 입력하시오 >>> : ");
			
			Scanner sc25 = new Scanner(System.in);
			
			sVal[0] = sc25.next();
			
			System.out.println("조회 또는 삭제할 게시판 정보는 >>> : " + sVal[0]);
		}
		
		// 게시판 등록 파라미터 
		if (3 == iVal) { 			
			
			sVal = new String[insert_label.length];	
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("등록할 게시판정보를 입력하시오 >>> : " + insert_label.length);
			System.out.println("등록할 게시판 배열의 길이 >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				System.out.println(insert_label[i] + "을(를) 입력하시오 :: " );
				sVal[i] = sc3.next();
				System.out.println(insert_label[i] + " 정보는 >>> : " + sVal[i]);
			}
		}			
		
		// 게시판 수정 파라미터 
		if (4 == iVal) { 
		
			sVal = new String[update_label.length];				
			
			Scanner sc4 = new Scanner(System.in);
			
			System.out.println("수정할 게시판정보를 입력하시오 >>> : " + update_label.length);
			System.out.println("수정할 게시판정보 배열의 길이 >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				
				System.out.println(update_label[i] + "을(를) 입력하시오 :: " );
				
				sVal[i] = sc4.next();
				
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
						KbdBoardScr_2.kboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:				
					try {
						String sVal2[] = KbdBoardScr_2.getParameter(2);
						KbdBoardScr_2.kboardSelect(sVal2);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						String sVal3[] = KbdBoardScr_2.getParameter(3);
						KbdBoardScr_2.kboardInsert(sVal3);
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						String sVal4[] = KbdBoardScr_2.getParameter(4);
						KbdBoardScr_2.kboardUpdate(sVal4);
					}catch(Exception e) {						
					}				
					break;
					
				case 5:				
					try {
						String sVal5[] = KbdBoardScr_2.getParameter(5);
						KbdBoardScr_2.kboardDelete(sVal5);							
					}catch(Exception e) {						
					}								
					break;					
			}
		}
	}
}
