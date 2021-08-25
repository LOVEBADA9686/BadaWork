package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// randomOP : 0.0 ~ 1.0 사이 
		System.out.println("Math.random() >>> : " + Math.random());
		System.out.println("(Math.random()*100) >>> : " + (Math.random()*100));
		System.out.println("(int)(Math.random()*100) >>> : " + (int)(Math.random()*100));
		System.out.println("(int)(Math.random()*100) + 1 >>> : " + (int)(Math.random()*100) + 1);
		int answer = (int)(Math.random()*100) + 1;
		// int answer = (int)(Math.random()*45) + 1;
		
		System.out.println(" answer >>> : " + answer);

		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (int i=0; i < 10; i++ ){
			System.out.println("1 과 100상의 값을 입력하세요 !!");
			count++;			
			input = sc.nextInt();
			
			if (answer == input){
				System.out.println("정답 입니다. !! " + count++ + " 번");
				break;
			}else if (answer < input){
				System.out.println("더 작은 수를 입력하세요 !!\n");
			}else if(answer > input){
				System.out.println("더 큰 수를 입력하세요 !!\n");
			}

			if (count == 10){
				System.out.println("게임 오버 >>> : 답 은 " + answer + " 입니다. ");
				break;
			}
		}
	}
}
