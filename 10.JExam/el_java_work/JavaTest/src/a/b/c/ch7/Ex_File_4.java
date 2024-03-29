package a.b.c.ch7;

import java.util.Scanner;

// 재귀 : recursive 
// 재귀 함수는 자기 함수를 호출하는 것 아니라 자기하고 같은 함수를 호출한다고 생각하는 것이 좋다.
// 팩토리이라 : factorial 
public class Ex_File_4 {

	public static int factorial(int n) {
		
		if (n > 0) {
			System.out.println(n - 1);
			System.out.println(n + "*" + (n - 1));
			return n * factorial(n - 1);
		}else {
			return 1;
		}			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력 하시오 >>> : ");
		int i = sc.nextInt();
		
		System.out.println(i + "의 팩토리얼은 " + Ex_File_4.factorial(i) + "입니다.");
		
	}

}
