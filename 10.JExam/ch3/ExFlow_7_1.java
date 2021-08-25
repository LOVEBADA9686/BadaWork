// package
package a.b.c.ch3;

// import

// ExFlow_7_1 클래스 메인 함수에서 for 을 사용해서
// 안녕하세요 문자열을 콘솔에 10번 출력하시오.

public class ExFlow_7_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 프로그램에서 모든 데이터는 다 순차적으로 담는다. 
		// 순차적 : 어커스, 배열, Array 
		// 순차의 시작점은 : 0 또는 1 
		// 하이 레벨 언어 : 어커스, 배열, Array 인덱스(첨자) 0 부터 시작한다. 
		// 간혹 데이터베이스에서 : 배열을 1 부터 시작한다. : Oracle 배열 1 부터 시작한다. 
		// for 문은 항시 배열과 같이 사용한다. 
		System.out.println("for 문 >>> : ");
		for (int i=0; i < 10; i++)
		{
			System.out.println("안녕하세요 " + i);
		}

		System.out.println("while 문 >>> : ");
		int i = 0;
		while (i < 10)
		{
			System.out.println("안녕하세요 " + i);
			i++;
		}
	}
}
