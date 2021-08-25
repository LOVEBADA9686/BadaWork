package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_7_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("이름을 입력 해주세요");
		Scanner i = new Scanner(System.in);
		String i1 = i.next();
		
		String [] a = {
				"수고했다 속았지??",
				"이름 잘았다 돌아가라",
				"이름 ㅈ 같네 ㅎㅎ",
				"응 ~수고했어",
				"응 꺼져"
		}; 
		int b = (int)(Math.random()*(a.length));
		String c = "";
		c = a [b];
		if (i1.equals(i1)) {
			System.out.println(c);
		}
	}
}