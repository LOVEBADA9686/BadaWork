package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;


public class KbdBoardScr {
	
	// ��ü ��ȸ
	public static void kboardSeletectAll() {
		
		try {
			//���� ȣ��
			KbdBoardService ks = new KbdBoardServiceImpl();
			
			ArrayList<KbdBoardVO> aList = ks.kboardSelectAll();
			
			if(aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {
					KbdBoardVO kvo = aList.get(i);
					KbdBoardVO.printKbdBoardVO(kvo);
				}
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// ���� ��ȸ
	public static void kboardSelect(String bnum) {
		
		try {
			//���� ȣ��
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
 				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
 			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
		// �� �Է�
		public static void kboardInsert() {
			
			
			String bnum = "B0202";
			String bsubject = "������ �׽�Ʈ �׽�Ʈ����02";
			String bwriter = "�����ҷ��� �׽�Ʈ �۾���02";
			String bpw = "test02";
			String bcontents = "���� �۾��� �׽�Ʈ02";
			
			try {
				// ���� ȣ��
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
					
					System.out.println("�Խñ�" + nCnt + "�� ��� �Ǿ����ϴ�.");
					
				}else {
					System.out.println("�Խñ� ��� ����.");
				}
			}catch(Exception e) {
				System.out.println("��� �� ������ >>> : " + e.getMessage());
			}
		}	
		
		// �� ����
		public static void kboardUpdate() {
			
			String bnum = "B0005";
			String bsubject = "�����̰�";
			String bcontents = "�����̰� �� ���� ������";	
			
			try {
				// ���� ȣ��
				KbdBoardService ks = new KbdBoardServiceImpl();
				KbdBoardVO kvo = null;
				kvo = new KbdBoardVO();
				
				kvo.setBnum(bnum);
				kvo.setBsubject(bsubject);
				kvo.setBcontents(bcontents);
				
				int nCnt = ks.kboardUpdate(kvo);
				
				if(nCnt > 0) {
					System.out.println("�Խñ�" + nCnt + "�� ���� �Ǿ����ϴ�.");
				}else {
					System.out.println("�Խñ� ���� ����");
				}
			}catch(Exception e) {
				System.out.println("���� �� ������ >>> : " + e.getMessage());
			}
			
		}
		
		// �� ����
		public static void kboardDelete() {
			
			String bnum = "B0202";
			
			try {
				// ���� ȣ��
				KbdBoardService ks = new KbdBoardServiceImpl();
				KbdBoardVO kvo = null;
				kvo = new KbdBoardVO();
				
				kvo.setBnum(bnum);
				
				int nCnt = ks.kboardDelete(kvo);
				
				if(nCnt > 0) {
					System.out.println("�Խñ�" + nCnt + "�� ���� �Ǿ����ϴ�.");
				}else {
					System.out.println("�Խñ� ���� ����");
				}
			}catch(Exception e) {
				System.out.println("���� �� ������ >>> : " + e.getMessage());
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��� CRUD::ISUD �׽�Ʈ >>> : ");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n�Խ������� ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
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
				System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
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