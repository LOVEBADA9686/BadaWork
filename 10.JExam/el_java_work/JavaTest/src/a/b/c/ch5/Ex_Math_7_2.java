package a.b.c.ch5;

import java.util.Scanner;

public class Ex_Math_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		
		String [] c = {
				"�����ߴ� �Ӿ���??",
				"�̸� �߾Ҵ� ���ư���",
				"�̸� �� ���� ����",
				"�� ~�����߾�",
				"�� ����"
		};
		int d = (int)(Math.random()*(c.length));
		String e = "";
		e = c [d];
		if (b.equals(b)) {
			System.out.println(e);
		}
	}
}