package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;
import a.b.c.board.scr.KbdBoardScr_1;


public class KbdBoardScr_1 {
	
	// �Խ������� ��
	public static final String[] insert_label = {"������", "�ۼ���", "�۳���", "��й�ȣ"};
	public static final String[] update_label = {"�۹�ȣ", "������", "�۳���"};
	private static String[] sVals;
	
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
		System.out.println("KbdBoardScr.kboardSelect() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ��ȸ >>> : " + bnum);
		
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
		public static void kboardInsert(String[] sVal3) {
			System.out.println("KbdBoardScr.kboardInsert() �Լ� ���� >>> : ");
			sVals = null;
			System.out.println("ȸ������ �Է� >>> : " + sVals.length);
			
			for (int i=0; i < sVals.length; i++) {
				System.out.println(insert_label[i] + ">>> : " + sVals[i]);
			}
			
			
			String bnum = KbdBoardChabun.gubunNum();
			String bsubject = sVals[0];
			String bwriter = sVals[1];
			String bpw = sVals[2];
			String bcontents = sVals[3];
			
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
		public static void kboardUpdate(String[] sVal4) {
			
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
		public static void kboardDelete(String bnum2) {
			
			String bnum = "B0101";
			
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
		
		// �Խ��� INSERT, UPTADE ���� �Է��ϱ�
		public static String[] getParmaeter(int iVal) {
			
			String sVal[] = null;
			
			// �Խ��� ��� �Ķ����
			if(3 == iVal) {
				
				sVal = new String[insert_label.length];
				
				Scanner sc2 = new Scanner(System.in);
				
				System.out.println("����� �Խ��������� �Է��Ͻÿ� >>> : " + insert_label.length);
				System.out.println("����� �Խ��� �迭�� ���� >>> : " + sVal.length);
				
				for (int i=0; i < sVal.length; i++) {
					System.out.println(insert_label[i] + "��(��) �Է��Ͻÿ� :: " );
					sVal[i] = sc2.next();
					System.out.println(insert_label[i] + " ������ >>> : " + sVal[i]);
				}
			}			
			
			// �Խ��� ���� �Ķ���� 
			if (4 == iVal) { 
			
				sVal = new String[update_label.length];				
				
				Scanner sc3 = new Scanner(System.in);
				
				System.out.println("������ �Խ��������� �Է��Ͻÿ� >>> : " + update_label.length);
				System.out.println("������ �Խ������� �迭�� ���� >>> : " + sVal.length);
				
				for (int i=0; i < sVal.length; i++) {
					
					System.out.println(update_label[i] + "��(��) �Է��Ͻÿ� :: " );
					
					sVal[i] = sc3.next();
					
					System.out.println(update_label[i] + " ������ >>> : " + sVal[i]);
				}
			}
			
			return sVal;
		}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��� CRUD::ISUD �׽�Ʈ >>> : ");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n�Խ������� ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
			int isud = sc.nextInt();
			if (0 == isud) {
				System.out.println("���α׷� ����  !!");
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
				System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
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
				System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
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