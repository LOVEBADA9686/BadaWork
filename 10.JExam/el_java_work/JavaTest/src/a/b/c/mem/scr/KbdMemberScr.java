package a.b.c.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.kbdmem.KbdMember;
import a.b.c.mem.service.KbdMemberService;
import a.b.c.mem.service.KbdMemberServiceImpl;
import a.b.c.mem.vo.KbdMemberVO;

public class KbdMemberScr {
	
	// ȸ������ ��ü ��ȸ
	public static void kmemSelectAll() {
		System.out.println("ȸ������ ��ü��ȸ >>> : ");
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		ArrayList<KbdMemberVO> aList = ks.kmemSelectAll();
		
		if(aList !=null && aList.size() > 0) {
			for(int i=0; i < aList.size(); i++) {
				
				KbdMemberVO kvo = aList.get(i);
				KbdMemberVO.printKbdMemberVO(kvo);
			}
		}else {
			System.out.println("aList �� �����Ͱ� ���׿� >>> " + aList);
		}
		
	}
	
	// ȸ������ �˻� : ������ȸ
	public static void kmemSelect(String knum) {
		System.out.println("ȸ������ ������ȸ >>> : ");
		
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
		System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
	}
}

	// ȸ������ ��� : ȸ����ȣ�� ä������ ���
	public static void kmemInsert() {
		System.out.println("ȸ������ ��� >>> : ");
		
		String knum = "202108060010";
		String kname = "HHHH";
		String kid = "HH00";
		String kpw = "HH1234"; 
		String kbirth = "20210801";
		String kgender = "01";
		String ktel = "03212341234";
		String khp = "01012341234"; 
		String kemail = "GG00@naver.com";
		String kaddr = "���� ��õ�� ���굿 88"; 
		String khobby = "01";
		String kphoto = "abc07.jpg";
		String kskill = "Ư��8";
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
			System.out.println("ȸ�� ��ȣ �Է� ���� >>> : " + bool);
		}else {
			System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
		}
	}
	
	// ȸ������ ����
	public static void kmemUpdate() {
		System.out.println("ȸ������ ���� >>> : ");
		
		String knum = "202108060011";				
		String kemail = "HH00@naver.com";
		String kaddr = "���� ��õ�� ���굿 8822"; 
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
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}else {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}
	}
	
	// ȸ�� ���� : FLAG ���� DELETYN : N
	public static void kmemDelete() {
		System.out.println("ȸ������ ���� >>> : ");
		
		String knum = "2021080600";
		
		KbdMemberService ks = new KbdMemberServiceImpl();
		
		KbdMemberVO kvo = null;
		kvo = new KbdMemberVO();
		kvo.setKnum(knum);
		
		boolean bool = ks.kmemDelete(kvo);
		
		if (bool) {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}else {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ CRUD::ISUD �׽�Ʈ >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\nȸ������ ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
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
					System.out.println("��ȸ���� ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
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
