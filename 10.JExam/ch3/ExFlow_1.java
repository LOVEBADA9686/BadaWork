// package
package a.b.c.ch3;

// import

// 프로그램에서 제어 흐름 : Flow Control : 관계식의 결과가 ture 일 때만 수행 된다.

// Flow Chart : 순서도 
// 하이레벨 랭귀지 : Flow Control : if, switch, for, while, do while
// 자바 : Flow Control : if, switch, for, while, do while

public class ExFlow_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// if 문은 조건식의 결과가 true 일 때만 수행 된다. 
		// if () {}
		// if 꼭 있어야 한다.
		// () : 조건식 쓰는 곳 : 조건식의 결과가 true 일 때만 if 문의 블럭이 수행 되거나 
		//                    같은 라인 바로 밑 라인이 수행된다.

		if (true)
		{
			System.out.println("if문이 조건식의 결과가 true 일 경우에 수행된다.");
		}

		if (false)
		{
			
		}else{
			System.out.println("else 절은 if문이 조건식의 결과가 false 일 경우에 수행된다.");
		}

		boolean bool = false;
		
		if (!bool) // 지역변수
		{
			System.out.println("if문이 조건식의 결과가 true 일 경우에 수행된다.");
		}
		
		System.out.println(bool);

		if (bool)
		{
			
		}else{
			System.out.println("else 절은 if문이 조건식의 결과가 false 일 경우에 수행된다.");
		}

		
		int x = 1;
		int y = 0;
		int sum = x / y;
		
		if (sum > 0)
		{
		}
	}
}
