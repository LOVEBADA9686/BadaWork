// package
package a.b.c.ch3;

// import


public class ExCast_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 자바에서는 = 대입연산자를 중심으로 좌 우의 데이터 타입은 동일 해야 한다.
		// 좌, 우의 테이터 타입이 같지 않으면 캐스팅 연산자 () 를 사용해서 데이터 타입을 동일하게 해야 한다.

		// 묵시적 형변환 : implicit casting
		byte b = 10;
		// int i = (int)b;
		int i = b; // 묵시적인 형변환이 된다. 

		System.out.println(b);		
		System.out.println(i);

		int i1 = 20;
		// float f = (float)i1;
		float f = i1;

		System.out.println(i1);		
		System.out.println(f);

		double d;
		d = i + f;
		System.out.println(d);

	}
}
