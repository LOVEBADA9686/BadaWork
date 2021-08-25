// package
package a.b.c.ch3;

// import


public class ExFlow_8_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 2중 for 문 : 2차원 배열과 동일하다.
		// int i=0 는 지역 변수이다. 

		/*
			외부 for문 첫 번째 변수 값이 수행 되면 
				내부 for문이 횟수 만큼 수행되고  
			다시 외부 for문 두 번째 변수 값이 수행 되면 
				내부 for문이 횟수 만큼 수행되고  
			외부 for문 횟수 만큼 수행 된다.
		*/
		// 외부 for문 
		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n외부 for i >>> : " + i + "\n");
			// 내부 for 문 
			for (int j=0; j < 3; j++ )
			{
				System.out.println("내부 for j >>> : " + j);
			}
		}

		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n외부 for i >>> : " + i);
			// 내부 for 문 
			for (int j=0; j < 3; j++ )
			{
				System.out.print("내부 for j >>> : " + j + " : " );
			}
			System.out.println();
		}

		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n외부 for i >>> : " + i);
			// 내부 for 문 
			for (int j=0; j < 3; j++ )
			{
				System.out.print(j + "," );
			}
			System.out.println();
		}
	
	}
}
