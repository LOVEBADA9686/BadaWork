package a.b.c.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.mem.vo.HbeMemberVO;
import a.b.c.ch9.hbemem.HbeMember;
import a.b.c.mem.service.HbeMemberService;
import a.b.c.mem.service.HbeMemberServiceImpl;

public class HbeMemberScr {
	
	// 회원정보 전체 조회
	public static void hmemSelectAll() {
		System.out.println("회원정보 전체조회 >>> : ");
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		ArrayList<HbeMemberVO> aList = hs.hmemSelectAll();

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				HbeMemberVO hvo = aList.get(i);
				HbeMemberVO.printHbeMemberVO(hvo);
			}		
		}else {
			System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
		}
		
	}
	
	// 회원정보 검색 : 조건조회 
	public static void hmemSelect(String hnum) {
		System.out.println("회원정보 조건조회 >>> : ");
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		ArrayList<HbeMemberVO> aList = hs.hmemSelect(hvo);

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				HbeMemberVO _hvo = aList.get(i);
				HbeMemberVO.printHbeMemberVO(_hvo);
			}		
		}else {
			System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
		}	
		
	}
	
	// 회원정보 등록 : 회원번호는 채번로직 사용 
	public static void hmemInsert() {		
		System.out.println("회원정보 등록 >>> : ");	
		
		String hnum = "202108060008";
		String hname = "HHHH";
		String hid = "HH00";
		String hpw = "HH1234"; 
		String hbirth = "20210801";
		String hgender = "01";
		String htel = "03212341234";
		String hhp = "01012341234"; 
		String hemail = "GG00@naver.com";
		String haddr = "서울 금천구 가산동 88"; 
		String hhobby = "01";
		String hphoto = "abc07.jpg";
		String hskill = "특기8";
		String hjob = "01";
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		hvo.setHname(hname);
		hvo.setHid(hid);
		hvo.setHpw(hpw);
		hvo.setHbirth(hbirth);
		hvo.setHgender(hgender);
		hvo.setHtel(htel);
		hvo.setHhp(hhp);
		hvo.setHemail(hemail);
		hvo.setHaddr(haddr);
		hvo.setHhobby(hhobby);				
		hvo.setHphoto(hphoto);
		hvo.setHskill(hskill);
		hvo.setHjob(hjob);
		
		boolean bool = hs.hmemInsert(hvo);

		if (bool) {
			System.out.println("회원 정보 입력 성공 >>> : " + bool);	
					
		}else {
			System.out.println("회원 정보 입력 실패 >>> : " + bool);
		}			
	}
	
	// 회원정보 수정
	public static void hmemUpdate() {		
		System.out.println("회원정보 수정 >>> : ");
		
		String hnum = "202108060008";				
		String hemail = "HH00@naver.com";
		String haddr = "서울 금천구 가산동 8822"; 
		String hhobby = "04";				
		String hjob = "02";
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);			
		hvo.setHemail(hemail);
		hvo.setHaddr(haddr);
		hvo.setHhobby(hhobby);								
		hvo.setHjob(hjob);
		
		boolean bool = hs.hmemUpdate(hvo);
		if (bool) {
			System.out.println("회원 정보 수정 성공 >>> : " + bool);	
						
		}else {
			System.out.println("회원 정보 수정 실패 >>> : " + bool);
		}				
	}
	
	// 회원 삭제 : FLAG 삭제 DELETYN : N
	public static void hmemDelete() {
		System.out.println("회원정보 삭제 >>> : ");
		
		String hnum = "202108060008";				
	
		HbeMemberService hs = new HbeMemberServiceImpl();
		
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);			
		
		boolean bool = hs.hmemDelete(hvo);
		
		if (bool) {
			System.out.println("회원 정보 삭제 성공 >>> : " + bool);				
		}else {
			System.out.println("회원 정보 삭제 실패 >>> : " + bool);
		}			
	}

	// 메인 함수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("회원정보 CRUD::ISUD 테스트 >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n회원정보 전체조회:1, 조건조회:2, 등록:3, 수정:4, 삭제:5, 종료:0");
			
			int isud = sc.nextInt();	
			if (0 == isud) break;
			
			switch(isud) {
				case 1:		
					try {
						HbeMemberScr.hmemSelectAll();	
					}catch(Exception e) {						
					}				
					break;
					
				case 2:
					System.out.println("조회조건 회원번호를 입력하시오 >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String hnum = sc1.next();
						HbeMemberScr.hmemSelect(hnum);	
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						HbeMemberScr.hmemInsert();	
					}catch(Exception e) {						
					}	
					break;
					
				case 4:
					try {
						HbeMemberScr.hmemUpdate();	
					}catch(Exception e) {						
					}						
					break;
					
				case 5:
					try {
						HbeMemberScr.hmemDelete();	
					}catch(Exception e) {						
					}	
					break;					
			}
		}
	}
}
