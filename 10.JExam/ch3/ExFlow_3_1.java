// package
package a.b.c.ch3;

// import


public class ExFlow_3_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		int age = 9;
		int charge;

		if (age < 8)
		{
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		if (age < 14)
		{
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		if (age < 20)
		{
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");			
		}

		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
