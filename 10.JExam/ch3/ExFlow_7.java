// package
package a.b.c.ch3;

// import


public class ExFlow_7 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		
		//for (/* 초기화식 */; /* 조건식 */ ; /* 증감식 */)
		//{
			// 문장 : 수행문
		//}

		/*
			1. 초기화식 수행 
			2. 조건식 : 연산의 결과가 논리값으로 온다. true, false
			3. 수행문 : 조건식이 true 일 때 수행
			4. 증감식 수행 
			2. 조건식으로 다시 가서 : 조건식이 true 
			3. 수행문 : 조건식이 true 일 때 수행
			4. 증감식 수행 
			이것을 반복 하는데 2. 조건식이 false 일 때 까지 	
		*/

		int i;
		int sum;
		for (i=1, sum=0; i <= 10; i++ )
		{
			System.out.println("for >>> : " + i);
			sum += i; // sum = sum + i
			System.out.println("for sum >>> : " + sum);
		}

		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		System.out.println("i >>> : " + i);

	}
}
