package a.b.c.ch5;

import java.util.Scanner;

public class Ex_String_4_1 {
	
	// 더하기
	public int addM(int x, int y) {				
		return x + y;
	}
	// 빼기
	public int subM(int x, int y) {		
		return x - y;
	}
	// 곱하기 
	public int mulM(int x, int y) {		
		return x * y;
	}
	// 나누기
	public int divM(int x, int y) {		
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("사칙연산 프로그램입니다. !!");
		System.out.println("연산자를를 넣으세요 + - * /");
		System.out.println("프로그램을 종료하려면 q 또는 Q 넣으세요");
		
		Scanner sc = new Scanner(System.in);
		// String dX = sc.next();
		// String dY = sc.next();
		// int x = Integer.parseInt(dX);
		// int y = Integer.parseInt(dY);
		// 연산자 : + - * / 
		char oper = '\u0000';
		int x = 0;
		int y = 0;

		while (true)
		{
			// 연산자 
			oper = sc.next().charAt(0);
						
			if (0x2b == oper)
			{
				System.out.println("더하기 하기 >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int addSum = exm1.addM(x, y);
				System.out.println(x + " + " + y + " = "  + addSum);				
			}
			if (0x2D == oper)
			{
				System.out.println("빼기 하기 >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int subSum = exm1.subM(x, y);
				System.out.println(x + " - " + y + " = "  + subSum);				
			}
			if (0x2A == oper)
			{
				System.out.println("곱하기 하기 >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int mulSum = exm1.mulM(x, y);
				System.out.println(x + " * " + y + " = "  + mulSum);				
			}
			if (0x2f == oper)
			{
				System.out.println("나누기 하기 >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int divSum = exm1.divM(x, y);
				System.out.println(x + " / " + y + " = "  + divSum);				
			}

			if (0x71 == oper || 0x51 == oper)
			{
				System.out.println("oper >>> : " + oper);
				// break;
				System.out.println("프로그램을 종료 합니다. ");
				System.exit(0);
			}
		}
	}

}
