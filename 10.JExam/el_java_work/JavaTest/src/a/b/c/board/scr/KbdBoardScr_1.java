package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;
import a.b.c.board.scr.KbdBoardScr_1;


public class KbdBoardScr_1 {
	
	// 게시판정보 라벨
	public static final String[] insert_label = {"글제목", "작성자", "글내용", "비밀번호"};
	public static final String[] update_label = {"글번호", "글제목", "글내용"};
	private static String[] sVals;
	
	// 전체 조회
	public static void kboardSeletectAll() {
		
		try {
			//서비스 호출
			KbdBoardService ks = new KbdBoardServiceImpl();
			
			ArrayList<KbdBoardVO> aList = ks.kboardSelectAll();
			
			if(aList !=null && aList.size() > 0) {
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
	public static void kboardSelect(String bnum) {
		System.out.println("KbdBoardScr.kboardSelect() 함수 진입 >>> : ");
		System.out.println("회원정보 조회 >>> : " + bnum);
		
		try {
			//서비스 호출
			KbdBoardService ks = new KbdBoardServiceImpl();
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			kvo.setBnum(bnum);
			
			ArrayList<KbdBoardVO> aList = ks.kboardSelect(kvo);
			
			if (aList !=null && aList.size() > 0) {
				for(int i=0; i < aList.size(); i++) {
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
		public static void kboardInsert(String[] sVal3) {
			System.out.println("KbdBoardScr.kboardInsert() 함수 진입 >>> : ");
			sVals = null;
			System.out.println("회원정보 입력 >>> : " + sVals.length);
			
			for (int i=0; i < sVals.length; i++) {
				System.out.println(insert_label[i] + ">>> : " + sVals[i]);
			}
			
			
			String bnum = KbdBoardChabun.gubunNum();
			String bsubject = sVals[0];
			String bwriter = sVals[1];
			String bpw = sVals[2];
			String bcontents = sVals[3];
			
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
				
				if(nCnt > 0) {
					
					System.out.println("게시글" + nCnt + "건 등록 되었습니다.");
					
				}else {
					System.out.println("게시글 등록 실패.");
				}
			}catch(Exception e) {
				System.out.println("등록 중 에러가 >>> : " + e.getMessage());
			}
		}	
		
		// 글 수정
		public static void kboardUpdate(String[] sVal4) {
			
			String bnum = "B0005";
			String bsubject = "현준이가";
			String bcontents = "현준이가 줄 띄어쓰기 도와줌";	
			
			try {
				// 서비스 호출
				KbdBoardService ks = new KbdBoardServiceImpl();
				KbdBoardVO kvo = null;
				kvo = new KbdBoardVO();
				
				kvo.setBnum(bnum);
				kvo.setBsubject(bsubject);
				kvo.setBcontents(bcontents);
				
				int nCnt = ks.kboardUpdate(kvo);
				
				if(nCnt > 0) {
					System.out.println("게시글" + nCnt + "건 수정 되었습니다.");
				}else {
					System.out.println("게시글 수정 실패");
				}
			}catch(Exception e) {
				System.out.println("수정 중 에러가 >>> : " + e.getMessage());
			}
			
		}
		
		// 글 삭제
		public static void kboardDelete(String bnum2) {
			
			String bnum = "B0101";
			
			try {
				// 서비스 호출
				KbdBoardService ks = new KbdBoardServiceImpl();
				KbdBoardVO kvo = null;
				kvo = new KbdBoardVO();
				
				kvo.setBnum(bnum);
				
				int nCnt = ks.kboardDelete(kvo);
				
				if(nCnt > 0) {
					System.out.println("게시글" + nCnt + "건 삭제 되었습니다.");
				}else {
					System.out.println("게시글 삭제 실패");
				}
			}catch(Exception e) {
				System.out.println("삭제 중 에러가 >>> : " + e.getMessage());
			}
		}
		
		// 게시판 INSERT, UPTADE 정보 입력하기
		public static String[] getParmaeter(int iVal) {
			
			String sVal[] = null;
			
			// 게시판 등록 파라미터
			if(3 == iVal) {
				
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
				System.out.println("프로그램 종료  !!");
				break;
			}
			
			
			switch(isud) {
			case 1:
				try {
					KbdBoardScr_1.kboardSeletectAll();
				}catch(Exception e) {
				}
				break;
				
			case 2:
				System.out.println("조회조건 글번호를 입력하시오 >>> : ");
				Scanner sc1 = new Scanner(System.in);
				try {
					String bnum = sc1.next();
					KbdBoardScr_1.kboardSelect(bnum);
				}catch(Exception e) {
				}
				break;
				
			case 3:
				try {
					String sVal3[] = KbdBoardScr_1.getParmaeter(3);
					KbdBoardScr_1.kboardInsert(sVal3);
				}catch(Exception e) {
				}
				break;
				
			case 4:
				try {
					String sVal4[] = KbdBoardScr_1.getParmaeter(4);
					KbdBoardScr_1.kboardUpdate(sVal4);
				}catch(Exception e) {
				}
				break;
				
			case 5:
				System.out.println("조회조건 글번호를 입력하시오 >>> : ");
				Scanner sc2 = new Scanner(System.in);
				try {
					String bnum = sc2.next();
					KbdBoardScr_1.kboardDelete(bnum);
				}catch(Exception e) {
				}
				break;
			}
		}
	}
}