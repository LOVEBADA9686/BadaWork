package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.KbdBoardService;
import a.b.c.board.service.KbdBoardServiceImpl;
import a.b.c.board.vo.KbdBoardVO;
import a.b.c.common.KbdBoardChabun;
import a.b.c.board.scr.KbdBoardScr_1;

public class KbdBoardScr_2 {
	
	// �Խ������� ��
	public static final String[] insert_label = {"������", "�ۼ���", "�۳���", "��й�ȣ"};
	public static final String[] update_label = {"�۹�ȣ", "������", "�۳���"};	

	// ��ü ��ȸ
	public static void kboardSelectAll(){
		
		try {
			// ���� ȣ�� 
			KbdBoardService ks = new KbdBoardServiceImpl();	

			ArrayList<KbdBoardVO> aList = ks.kboardSelectAll();

			if (aList !=null && aList.size() > 0) {
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
	public static void kboardSelect(String sVal[]){
		System.out.println("KbdBoardScr.kboardSelect() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ��ȸ >>> : " + sVal[0]);
				
		try {
			// ���� ȣ�� 
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
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
		
	}
	
	// �� �Է�
	public static void kboardInsert(String sVal[]){
		System.out.println("KbdBoardScr.kboardInsert() �Լ� ���� >>> : ");
		System.out.println("ȸ������ �Է� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(insert_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = KbdBoardChabun.gubunNum();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bpw = sVal[2];
		String bcontents = sVal[3];
		
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
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ��� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ��� ����.");
			}			
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// �� ���� 
	public static void kboardUpdate(String sVal[]){
		System.out.println("KbdBoardScr.kboardUpdate() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(update_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = sVal[0];		
		String bsubject = sVal[1];
		String bcontents = sVal[2];
		
		try {
			// ���� ȣ�� 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			
			kvo.setBnum(bnum);
			kvo.setBsubject(bsubject);
			kvo.setBcontents(bcontents);
						
			int nCnt = ks.kboardUpdate(kvo);	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}				 
	}
	
	// �� ����
	public static void kboardDelete(String sVal[]){
		System.out.println("KbdBoardScr.kboardDelete() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + sVal[0]);

		try {
			// ���� ȣ�� 
			KbdBoardService ks = new KbdBoardServiceImpl();	
			KbdBoardVO kvo = null;
			kvo = new KbdBoardVO();
			
			kvo.setBnum(sVal[0]);
						
			int nCnt = ks.kboardDelete(kvo);	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}				 
	}
	
	
	// �Խ��� INSERT, UPDATE ���� �Է��ϱ� 
	public static String[] getParameter(int iVal) {
	
		String sVal[] = null;
		
		if (2 == iVal || 5 == iVal) {
			sVal = new String[1];
			
			System.out.println("��ȸ �Ǵ� ������ �Խ��� �۹�ȣ �Է��Ͻÿ� >>> : ");
			
			Scanner sc25 = new Scanner(System.in);
			
			sVal[0] = sc25.next();
			
			System.out.println("��ȸ �Ǵ� ������ �Խ��� ������ >>> : " + sVal[0]);
		}
		
		// �Խ��� ��� �Ķ���� 
		if (3 == iVal) { 			
			
			sVal = new String[insert_label.length];	
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("����� �Խ��������� �Է��Ͻÿ� >>> : " + insert_label.length);
			System.out.println("����� �Խ��� �迭�� ���� >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				System.out.println(insert_label[i] + "��(��) �Է��Ͻÿ� :: " );
				sVal[i] = sc3.next();
				System.out.println(insert_label[i] + " ������ >>> : " + sVal[i]);
			}
		}			
		
		// �Խ��� ���� �Ķ���� 
		if (4 == iVal) { 
		
			sVal = new String[update_label.length];				
			
			Scanner sc4 = new Scanner(System.in);
			
			System.out.println("������ �Խ��������� �Է��Ͻÿ� >>> : " + update_label.length);
			System.out.println("������ �Խ������� �迭�� ���� >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				
				System.out.println(update_label[i] + "��(��) �Է��Ͻÿ� :: " );
				
				sVal[i] = sc4.next();
				
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
				System.out.println("���α׷� ���� !!"); 
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
