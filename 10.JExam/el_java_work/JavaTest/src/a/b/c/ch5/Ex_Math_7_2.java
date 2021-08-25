package a.b.c.ch5;

import java.util.Scanner;

public class Ex_Math_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름을 입력하시오");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		
		String [] c = {
				"수고했다 속았지??",
				"이름 잘았다 돌아가라",
				"이름 ㅈ 같네 ㅎㅎ",
				"응 ~수고했어",
				"응 꺼져"
		};
		int d = (int)(Math.random()*(c.length));
		String e = "";
		e = c [d];
		if (b.equals(b)) {
			System.out.println(e);
		}
	}
}