package a.b.c.memtest.scr;

import java.util.Scanner;


public class HbeMemberScr {
	
	// ȸ������ ��ü ��ȸ
	public static void hmemSelectAll() {
		System.out.println("ȸ������ ��ü��ȸ >>> : ");
		
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
						HbeMemberScr.hmemSelectAll();
					}catch(Exception e) {
						
					}
					break;
					
				case 2:
				
					break;
					
				case 3:
					
					break;
					
				case 4:
							
					break;
					
				case 5:
					
					break;					
			}
		}

	}

}
