// package
package a.b.c.ch3;

// import

// 변수를 지역변수 와 멤버변수를 구별해야 하는 이유는
// 각 변수의 사용 유효 범위를 정확하게 알아야 한다. 

public class ExOper_1 
{
	// 상수 
	// 멤버변수
	int num;
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		int num = 10;

		// 데이터 타입 int 형인 num 지역변수를 호출해서 콘솔에 출력하시오

		// 부호 연산자
		System.out.println(num);
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		num = -num;
		System.out.println(num);

		// 산술 연산자 
		System.out.println( 5 - 3 );
		System.out.println( 3 - 5 );	
		System.out.println( 5 / 3 );
		System.out.println( 3 / 5 );	
		System.out.println( 5 % 3 );
		System.out.println( 3 % 5 );	


		// 증가, 감소 연산자 
		// ++ : int i = i + 1; : 연산한 결과값이 나옴
		// -- : int i = i - 1; : 연산하기 전의 값이 나옴

		// ++i : 연산을 한 결과 값
		// i++ : 연산하기 전의 값

		// while, for, if 에서 count(숫자)를 증가, 감소 시킬때 주로 사용한다.

		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);

		int lastScore2 = --gameScore;
		System.out.println(lastScore2);

		
		int gameScore1 = 150;
		
		int lastScore11 = gameScore1++;
		System.out.println(lastScore11);

		int lastScore22 = gameScore1--;
		System.out.println(lastScore22);

	}
}
