// package
package a.b.c.ch3;

// import
import java.util.Scanner;

/*
패키지이름 : a.b.c.ch3
클래스이름 : ExFlow_Grade
함수이름 : gradeFun
변수 : 점수 : int score
    : 학점 : char grade

1. Scanner 클래스, nextInt() 함수 이용해서 
2. Scanner  없이 하는 방법 
점수         학점 
100 ~ 90점 : A
89 ~ 80점  : B
79 ~ 70점  : C
69 ~ 60점  : D
나머지 F
콘솔에 출력하기 
*/

public class ExFlow_Grade_4
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public void gradeFun(int score){
		System.out.println("\nExFlow_Grade_4.gradeFun() 함수 진입 >>> : \n");
		System.out.println("ExFlow_Grade_4.gradeFun() :: score >>> : " + score);
		
		char grade = ' ';

		if (score >= 90)
		{
			grade = 'A';
		}
		else if (score >= 80)
		{
			grade = 'B';
		}
		else if (score >= 70)
		{
			grade = 'C';
		}
		else if (score >= 60)
		{
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(score + "점 학점은 " + grade + "입니다.");

		System.out.println("\nExFlow_Grade_4.gradeFun() 함수 끝 >>> : \n");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.	
		System.out.println("\nExFlow_Grade_4.main() 함수 진입 >>> : \n");
		System.out.println("점수 입력을 하면 학점이 환산되어 나옵니다. >>> : ");

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (0 <= score && score <= 100)
		{
			ExFlow_Grade_4 eg4 = new ExFlow_Grade_4();
			eg4.gradeFun(score);
				
		}else{
			System.out.println("점수를 잘 입력하시오 !!");
		}
		System.out.println("\nExFlow_Grade_4.main() 함수 끝 >>> : \n");
	}
}
