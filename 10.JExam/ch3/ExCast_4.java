// package
package a.b.c.ch3;

// import

/*
미국정보교환표준부호(American Standard Code for Information Interchange)
ASCII(아스키)는 영문 알파벳을 사용하는 대표적인 문자 인코딩이다
영문자(대, 소문자), 숫자, 특수기호

ASCII : 1BYTE : 영문자(대, 소문자), 숫자, 특수기호 : 2진수, 8진수, 10진수, 16진수 표현한다.
	우리는 16진수를 사용한다 : 전세계 표준이 16진수 이다. 
UNICODE : 2BYTE : 코드 체계
	UTF-8, UTF-16, UTF-32
*/

// 자바에서는 
// 문자는 char 기초자료형을 사용한다.
// 문자열  String 클래스를 사용한다. 문자의 배열이다. 
	
public class ExCast_4 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 자바에서 문자열을 String 클래스로 사용한다.
		
		// String : 빌트인 클래스 
		// str : 참조변수 : 함수 안에서 선언 했기 때문에 지역변수 이다. 
		// str 참조변수에 문자열 abc 을 초기화 한다.
		String str = "abc";
		System.out.println("str >>> : " + str);

		// charAt() 함수는 문자열을 문자로 하나씩 쪼개서 받을 수 있는 함수
		// 문자를 하나씩 쪼개는 것을 index 라고 부른다.
		char c0 = str.charAt(0);
		System.out.println("char c0 >>> : " + c0);
		// 인코딩 : incoding
		// 명시적 형변환 : explicit casting
		System.out.println("(int) c0 >>> : " + (int)c0);

		int i0 = c0; // 자동 형변환, 묵시적 형변환, implicit casting
		System.out.println("int i0 >>> : " + i0);

		// 디코딩 : decoding
		System.out.println("(char)i0 >>> : " + (char)i0);

		// decoding : 명시적 형변환 : explicit casting
		char c00 = (char)i0;
		System.out.println("char c00 >>> : " + c00);

		
		char c1 = str.charAt(1);
		System.out.println("char c1 >>> : " + c1);
		// 인코딩 : incoding
		// 명시적 형변환 : explicit casting
		System.out.println("(int) c1 >>> : " + (int)c1);

		int i1 = c1; // 자동 형변환, 묵시적 형변환, implicit casting
		System.out.println("int i1 >>> : " + i1);

		// 디코딩 : decoding
		System.out.println("(char)i1 >>> : " + (char)i1);

		// decoding : 명시적 형변환 : explicit casting
		char c11 = (char)i1;
		System.out.println("char c11 >>> : " + c11);


		char c2 = str.charAt(2);
		System.out.println("char c2 >>> : " + c2);
		// 인코딩 : incoding
		// 명시적 형변환 : explicit casting
		System.out.println("(int) c2 >>> : " + (int)c2);

		int i2 = c2; // 자동 형변환, 묵시적 형변환, implicit casting
		System.out.println("int i2 >>> : " + i2);

		// 디코딩 : decoding
		System.out.println("(char)i2 >>> : " + (char)i2);

		// decoding : 명시적 형변환 : explicit casting
		char c22 = (char)i2;
		System.out.println("char c22 >>> : " + c22);

	}
}
