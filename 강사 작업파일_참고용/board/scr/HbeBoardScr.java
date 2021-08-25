package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.HbeBoardService;
import a.b.c.board.service.HbeBoardServiceImpl;
import a.b.c.board.vo.HbeBoardVO;
import a.b.c.common.HbeBoardChabun;

public class HbeBoardScr {

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
	public static void hboardInsert(){
		
		String bnum = HbeBoardChabun.gubunNum();
		String bsubject = "테스트제목12";
		String bwriter = "테스트 글쓴이12";
		String bpw = "test12";
		String bcontents = "글쓰기 테스트12";
		
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
	public static void hboardUpdate(){
		
		String bnum = "B0001";		
		String bsubject = "테스트제목10";
		String bcontents = "글쓰기 테스트10";
		
		try {
			// 서비스 호출 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBcontents(bcontents);
						
			int nCnt = hs.hboardUpdate(hvo)		;	
			
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
	public static void hboardDelete(){
		
		String bnum = "B0001";		

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
						HbeBoardScr.hboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:
					System.out.println("조회조건 글번호를 입력하시오 >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						HbeBoardScr.hboardSelect(bnum);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						HbeBoardScr.hboardInsert();
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						HbeBoardScr.hboardUpdate();
					}catch(Exception e) {						
					}				
					break;
					
				case 5:
					try {
						HbeBoardScr.hboardDelete();
					}catch(Exception e) {						
					}	
					break;					
			}
		}
	}
}
