package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;


public class KbdBoardScr {
	
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
		public static void kboardInsert() {
			
			
			String bnum = "B0202";
			String bsubject = "삭제할 테스트 테스트제목02";
			String bwriter = "삭제할려함 테스트 글쓴이02";
			String bpw = "test02";
			String bcontents = "삭제 글쓰기 테스트02";
			
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
		public static void kboardUpdate() {
			
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
		public static void kboardDelete() {
			
			String bnum = "B0202";
			
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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("게시판 CRUD::ISUD 테스트 >>> : ");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n게시판정보 전체조회:1, 조건조회:2, 등록:3, 수정:4, 삭제:5, 종료:0");
			
			int isud = sc.nextInt();
			if (0 == isud) break;
			
			switch(isud) {
			case 1:
				try {
					KbdBoardScr.kboardSeletectAll();
				}catch(Exception e) {
				}
				break;
				
			case 2:
				System.out.println("조회조건 글번호를 입력하시오 >>> : ");
				Scanner sc1 = new Scanner(System.in);
				try {
					String bnum = sc1.next();
					KbdBoardScr.kboardSelect(bnum);
				}catch(Exception e) {
				}
				break;
				
			case 3:
				try {
					KbdBoardScr.kboardInsert();
				}catch(Exception e) {
				}
				break;
				
			case 4:
				try {
					KbdBoardScr.kboardUpdate();
				}catch(Exception e) {
				}
				break;
				
			case 5:
				try {
					KbdBoardScr.kboardDelete();
				}catch(Exception e) {
				}
				break;
			}
		}
	}
}