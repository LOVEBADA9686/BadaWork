package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_7_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("�̸��� �Է� ���ּ���");
		Scanner i = new Scanner(System.in);
		String i1 = i.next();
		
		String [] a = {
				"�����ߴ� �Ӿ���??",
				"�̸� �߾Ҵ� ���ư���",
				"�̸� �� ���� ����",
				"�� ~�����߾�",
				"�� ����"
		}; 
		int b = (int)(Math.random()*(a.length));
		String c = "";
		c = a [b];
		if (i1.equals(i1)) {
			System.out.println(c);
		}
	}
}