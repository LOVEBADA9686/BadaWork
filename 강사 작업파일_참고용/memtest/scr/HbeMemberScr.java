package a.b.c.memtest.scr;

import java.util.Scanner;


public class HbeMemberScr {
	
	// 회원정보 전체 조회
	public static void hmemSelectAll() {
		System.out.println("회원정보 전체조회 >>> : ");
		
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
