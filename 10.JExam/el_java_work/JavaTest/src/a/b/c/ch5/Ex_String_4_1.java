package a.b.c.ch5;

import java.util.Scanner;

public class Ex_String_4_1 {
	
	// ���ϱ�
	public int addM(int x, int y) {				
		return x + y;
	}
	// ����
	public int subM(int x, int y) {		
		return x - y;
	}
	// ���ϱ� 
	public int mulM(int x, int y) {		
		return x * y;
	}
	// ������
	public int divM(int x, int y) {		
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��Ģ���� ���α׷��Դϴ�. !!");
		System.out.println("�����ڸ��� �������� + - * /");
		System.out.println("���α׷��� �����Ϸ��� q �Ǵ� Q ��������");
		
		Scanner sc = new Scanner(System.in);
		// String dX = sc.next();
		// String dY = sc.next();
		// int x = Integer.parseInt(dX);
		// int y = Integer.parseInt(dY);
		// ������ : + - * / 
		char oper = '\u0000';
		int x = 0;
		int y = 0;

		while (true)
		{
			// ������ 
			oper = sc.next().charAt(0);
						
			if (0x2b == oper)
			{
				System.out.println("���ϱ� �ϱ� >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int addSum = exm1.addM(x, y);
				System.out.println(x + " + " + y + " = "  + addSum);				
			}
			if (0x2D == oper)
			{
				System.out.println("���� �ϱ� >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int subSum = exm1.subM(x, y);
				System.out.println(x + " - " + y + " = "  + subSum);				
			}
			if (0x2A == oper)
			{
				System.out.println("���ϱ� �ϱ� >>> : ");
				x = sc.nextInt();
				y = sc.nextInt();
				
				Ex_String_4_1 exm1 = new Ex_String_4_1();
				int mulSum = exm1.mulM(x, y);
				System.out.println(x + " * " + y + " = "  + mulSum);				
			}
			if (0x2f == oper)
			{
				System.out.println("������ �ϱ� >>> : ");
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
				System.out.println("���α׷��� ���� �մϴ�. ");
				System.exit(0);
			}
		}
	}

}
