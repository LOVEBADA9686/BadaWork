package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.HbeBoardService;
import a.b.c.board.service.HbeBoardServiceImpl;
import a.b.c.board.vo.HbeBoardVO;
import a.b.c.common.HbeBoardChabun;
import a.b.c.mem.scr.HbeMemberScr_1;

public class HbeBoardScr_1 {
	
	// �Խ������� ��
	public static final String[] insert_label = {"������", "�ۼ���", "�۳���", "��й�ȣ"};
	public static final String[] update_label = {"�۹�ȣ", "������", "�۳���"};	

	// ��ü ��ȸ
	public static void hboardSelectAll(){
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	

			ArrayList<HbeBoardVO> aList = hs.hboardSelectAll();

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					HbeBoardVO hvo = aList.get(i);	
					HbeBoardVO.printHbeBoardVO(hvo);
				}		
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// ���� ��ȸ
	public static void hboardSelect(String bnum){
		System.out.println("HbeBoardScr.hboardSelect() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ��ȸ >>> : " + bnum);
				
		try {
			// ���� ȣ�� 
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
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
		
	}
	
	// �� �Է�
	public static void hboardInsert(String sVal[]){
		System.out.println("HbeBoardScr.hboardInsert() �Լ� ���� >>> : ");
		System.out.println("ȸ������ �Է� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(insert_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = HbeBoardChabun.gubunNum();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bpw = sVal[2];
		String bcontents = sVal[3];
		
		try {
			// ���� ȣ�� 
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
				System.out.println("�Խñ� " + nCnt + " �� ��� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ��� ����.");
			}			
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// �� ���� 
	public static void hboardUpdate(String sVal[]){
		System.out.println("HbeBoardScr.hboardUpdate() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(update_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = sVal[0];		
		String bsubject = sVal[1];
		String bcontents = sVal[2];
		
		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBcontents(bcontents);
						
			int nCnt = hs.hboardUpdate(hvo);	
			
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
	public static void hboardDelete(String bnum){
		System.out.println("HbeBoardScr.hboardDelete() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + bnum);

		try {
			// ���� ȣ�� 
			HbeBoardService hs = new HbeBoardServiceImpl();	
			HbeBoardVO hvo = null;
			hvo = new HbeBoardVO();
			
			hvo.setBnum(bnum);
						
			int nCnt = hs.hboardDelete(hvo);	
			
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
		
		// �Խ��� ��� �Ķ���� 
		if (3 == iVal) { 			
			
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
				System.out.println("���α׷� ���� !!"); 
				break;	
			}
			 
			
			switch(isud) {
				case 1:		
					try {
						HbeBoardScr_1.hboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:
					System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						HbeBoardScr_1.hboardSelect(bnum);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						String sVal3[] = HbeBoardScr_1.getParameter(3);
						HbeBoardScr_1.hboardInsert(sVal3);
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						String sVal4[] = HbeBoardScr_1.getParameter(4);
						HbeBoardScr_1.hboardUpdate(sVal4);
					}catch(Exception e) {						
					}				
					break;
					
				case 5:
					System.out.println("��ȸ���� �۹�ȣ�� �Է��Ͻÿ� >>> : ");
					Scanner sc2 = new Scanner(System.in);
					try {
						String bnum = sc2.next();
						HbeBoardScr_1.hboardDelete(bnum);							
					}catch(Exception e) {						
					}								
					break;					
			}
		}
	}
}
