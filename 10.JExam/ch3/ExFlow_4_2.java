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

public class ExFlow_4_2 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public void ticketFun(int age){
		System.out.println("\n ExFlow_4_2.ticketFun() 함수 시작 >>> : \n");	
		System.out.println("ExFlow_4_2.ticketFun :: age >>> : " + age);	
		
		// 지역변수
		int charge;

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

		System.out.println("\n ExFlow_4_2.ticketFun() 함수 시작 >>> : \n");	
	}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExFlow_4_2.main() 함수 시작 >>> : \n");	

		System.out.println("나이를 입력하시오 !!");		
		Scanner sc = new Scanner(System.in); // jdk 1.5
		
		int age = sc.nextInt();
		System.out.println("age >>> : " + age);	

		if (1 <= age && age <= 100)
		{
			ExFlow_4_2 ef42 = new ExFlow_4_2();
			ef42.ticketFun(age);
				
		}else{
			System.out.println("나이를 잘 입력하시오 !!");
		}
		
		System.out.println("\nExFlow_4_2.main() 함수 끝 >>> : ");	
	}
}
