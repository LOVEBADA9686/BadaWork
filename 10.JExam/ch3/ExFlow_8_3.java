// package
package a.b.c.ch3;

// import


public class ExFlow_8_3
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 외부 for 문
		/*
		for (int i=0; i < 9; i++ )
		{
			System.out.println("\n외부 for i >>> : " + i + "\n");
			// 내부 for 문 
			for (int j=0; j < 9; j++ )
			{
				System.out.println("내부 for j >>> : " + j);
			}			
		}

		for (int i=0; i < 9; i++ )
		{			
			for (int j=0; j < 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}			
		}
		System.out.println();

		// 구구단 1 ~ 9
		for (int i=1; i <= 9; i++ )
		{			
			for (int j=1; j <= 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}			
		}
		System.out.println();
*/
				// 구구단 1 ~ 9
				// 외부 for문 지역변수 i로 선언하고 1부터 9/가지 9번 돈다.
		for (int i=1; i <= 9; i++ )
		{			
			// 내부 for문 지역변수 j에 초기화 해서 1번 부터9번까지 돈다.
			// 외부 for문 i가 1 을 수행하면 내부 for문은 1부터 9까지 수행된다.
			for (int j=1; j <= 9; j++ )
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}			
		System.out.println();
	}

		for (int i=1; i <= 9; i++ )
		{			
			for (int j=1; j <= 9; j++ )
			{
				System.out.print("("+i+","+j+")");
			}			
		System.out.println();
	}
	
		for (int i=1; i <= 9; i++ )
		{			
			for (int j=1; j <= 9; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	