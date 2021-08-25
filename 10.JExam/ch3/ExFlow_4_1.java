// package
package a.b.c.ch3;

// import
import java.util.Scanner;

/*
java.util.Scanner
int nextInt()
조건 1세 100세 
age 조건이 60살 이상인 경우에 '경로우대입니다.' '입장료는 0원입니다.'
*/

public class ExFlow_4_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		

		System.out.println("나이를 입력하시오 !!");		
		Scanner sc = new Scanner(System.in); // jdk 1.5
		
		int age = sc.nextInt();
		System.out.println("age >>> : " + age);	
		int charge;

		if (1 <= age && age <= 100)
		{
			if (age < 8)
			{
				charge = 1000;
				System.out.println("취학 전 아동입니다.");
			}
			else if (age < 14)
			{
				charge = 2000;
				System.out.println("초등학생입니다.");
			}
			else if (age < 20)
			{
				charge = 2500;
				System.out.println("중, 고등학생입니다.");
			}
			else if (age >= 60)
			{
				charge = 0;
				System.out.println("경로우대입니다.");
			}
			else {
				charge = 3000;
				System.out.println("일반인입니다.");			
			}

			System.out.println("입장료는 " + charge + "원입니다.");
				
		}else{
			System.out.println("나이를 잘 입력하시오 !!");
		}
		
	}
}
