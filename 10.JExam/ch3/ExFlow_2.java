// package
package a.b.c.ch3;

// import


public class ExFlow_2 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("if 연산을 할 데이터가 잘 있는 경우");
		int age = 7;

		if (age >= 8)
		{
			System.out.println("학교에 다닙니다.");
		}else{
			System.out.println("학교에 다니지 않습니다.");
		}

		boolean bool = age >= 8;
		System.out.println("bool >>> : " + bool);
		if (bool)
		{
			System.out.println("학교에 다닙니다.");
		}else{
			System.out.println("학교에 다니지 않습니다.");
		}
	}
}
