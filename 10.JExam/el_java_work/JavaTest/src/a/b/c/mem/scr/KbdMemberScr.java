package a.b.c.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.kbdmem.KbdMember;
import a.b.c.mem.service.KbdMemberService;
import a.b.c.mem.service.KbdMemberServiceImpl;
import a.b.c.mem.vo.KbdMemberVO;

public class KbdMemberScr {
	
	// 회원정보 전체 조회
	public static void kmemSelectAll() {
		System.out.println("회원정보 전체조회 >>> : ");
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		ArrayList<KbdMemberVO> aList = ks.kmemSelectAll();
		
		if(aList !=null && aList.size() > 0) {
			for(int i=0; i < aList.size(); i++) {
				
				KbdMemberVO kvo = aList.get(i);
				KbdMemberVO.printKbdMemberVO(kvo);
			}
		}else {
			System.out.println("aList 에 데이터가 없네요 >>> " + aList);
		}
		
	}
	
	// 회원정보 검색 : 조건조회
	public static void kmemSelect(String knum) {
		System.out.println("회원정보 조건조회 >>> : ");
		
		KbdMemberVO kvo = null;
		kvo = new KbdMemberVO();
		kvo.setKnum(knum);
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		ArrayList<KbdMemberVO> aList = ks.kmemSelect(kvo);
		
		if (aList !=null && aList.size() > 0) {
			for(int i=0; i < aList.size(); i++); {
			
			KbdMemberVO _kvo = aList.get(0);
			KbdMemberVO.printKbdMemberVO(_kvo);
			
		}
	}else {
		System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
	}
}

	// 회원정보 등록 : 회원번호는 채번로직 사용
	public static void kmemInsert() {
		System.out.println("회원정보 등록 >>> : ");
		
		String knum = "202108060010";
		String kname = "HHHH";
		String kid = "HH00";
		String kpw = "HH1234"; 
		String kbirth = "20210801";
		String kgender = "01";
		String ktel = "03212341234";
		String khp = "01012341234"; 
		String kemail = "GG00@naver.com";
		String kaddr = "서울 금천구 가산동 88"; 
		String khobby = "01";
		String kphoto = "abc07.jpg";
		String kskill = "특기8";
		String kjob = "01";
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		KbdMemberVO kvo = null;
		kvo = new KbdMemberVO();
		kvo.setKnum(knum);
		kvo.setKname(kname);
		kvo.setKid(kid);
		kvo.setKpw(kpw);
		kvo.setKbirth(kbirth);
		kvo.setKgender(kgender);
		kvo.setKtel(ktel);
		kvo.setKhp(khp);
		kvo.setKemail(kemail);
		kvo.setKaddr(kaddr);
		kvo.setKhobby(khobby);
		kvo.setKphoto(kphoto);
		kvo.setKskill(kskill);
		kvo.setKjob(kjob);
		
		boolean bool = ks.kmemInsert(kvo);
		
		if (bool) {
			System.out.println("회원 번호 입력 성공 >>> : " + bool);
		}else {
			System.out.println("회원 정보 입력 실패 >>> : " + bool);
		}
	}
	
	// 회원정보 수정
	public static void kmemUpdate() {
		System.out.println("회원정보 수정 >>> : ");
		
		String knum = "202108060011";				
		String kemail = "HH00@naver.com";
		String kaddr = "서울 금천구 가산동 8822"; 
		String khobby = "03";				
		String kjob = "02";
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		KbdMemberVO kvo = null;
		kvo = new KbdMemberVO();
		kvo.setKnum(knum);
		kvo.setKemail(kemail);
		kvo.setKaddr(kaddr);
		kvo.setKhobby(khobby);
		kvo.setKjob(kjob);
		
		boolean bool = ks.kmemUpdate(kvo);
		if(bool) {
			System.out.println("회원 정보 수정 성공 >>> : " + bool);
		}else {
			System.out.println("회원 정보 수정 실패 >>> : " + bool);
		}
	}
	
	// 회원 삭제 : FLAG 삭제 DELETYN : N
	public static void kmemDelete() {
		System.out.println("회원정보 삭제 >>> : ");
		
		String knum = "2021080600";
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		KbdMemberVO kvo = null;
		kvo = new KbdMemberVO();
		kvo.setKnum(knum);
		
		boolean bool = ks.kmemDelete(kvo);
		
		if (bool) {
			System.out.println("회원 정보 삭제 성공 >>> : " + bool);
		}else {
			System.out.println("회원 정보 삭제 실패 >>> : " + bool);
		}
	}
	
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
						KbdMemberScr.kmemSelectAll();
					}catch(Exception e) {
					}
					break;
					
				case 2:
					System.out.println("조회조건 회원번호를 입력하시오 >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String knum = sc1.next();
						KbdMemberScr.kmemSelect(knum);
					}catch(Exception e) {
					}
					break;
					
				case 3:
					try {
						KbdMemberScr.kmemInsert();
					}catch(Exception e) {
					}
					break;
					
				case 4:
					try {
						KbdMemberScr.kmemUpdate();
					}catch(Exception e) {
					}
							
					break;
					
				case 5:
					try {
						KbdMemberScr.kmemDelete();
					}catch(Exception e) {
					}
					break;					
			}
		}
	}
}
