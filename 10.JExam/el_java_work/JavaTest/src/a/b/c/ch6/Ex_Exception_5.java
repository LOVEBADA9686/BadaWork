package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("콘솔에 데이터를 입력 하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int x = sc.nextInt();
			System.out.println("입력한 데이터 x = " + x);
			int y = sc.nextInt();
			System.out.println("입력한 데이터 y = " + y);
			int z = x / y;
			System.out.println("연산 결과 " + x + " / " + y + " = " + z);
		
		}catch (Exception e) {
			System.out.println("e 에러가 >>> : " + e.getMessage());
		}finally {
			System.out.println("finally 블럭 ");
		}
		
		System.out.println("try-catch-finally 블럭 이후 >>> : ");
	}
}
