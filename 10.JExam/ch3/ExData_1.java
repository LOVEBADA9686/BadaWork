package a.b.c.ch3;

// 기초 자료형 공부하기 : primitive type
//  jvm 은 숫자를 int 만 안다, int 가 아닌 것은 double 본다. 
// 1byte : 8bit : 00000000 : 0, 00000001 : 1 : 사람이 보는 2진수로 본다. 
/*
숫자
	byte : 1byte(8bit) : 0
	char : 2byte(양의정수로 16bit) : ' ', '\u0000'
	short : 2byte(16bit) : 0
	int : 4byte(32bit) : 0
	long : 8byte(64bit) : 0 : long l = 0l;
	float : 4byte(32bit) : 0.0 : float f = 0.0f;
	double : 8byte(64bit) : 0.0 : double d = 0.0d;
문자 : 자바에서 문자는 숫자로 본다. :  char
논리 boolean : 1byte : false 

캐스팅 연산자 : ()
--------------> 묵시적 형변환 : implicit casting 
byte < char < short < int < long < float < double 
      <------------- 명시적 형변환 : explicit casting
*/

public class ExData_1 {
	//  ExData_1 클래스 블럭에 기초자료형 byte 자료형을(데이터 타입) 멤버변수 선언 했다. 
	// 멤버변수는 생성자가 초기화 하기 때문에 선언과 동시에 직접 초기화 하지 않는다.
	// b 변수명의 유효범위(사용범위는) 클래스 블럭 전체이다.
	// 함수 블럭안에서 사용이 가능한다. 단. static, new 이용해서 
	byte b;

	public static void main(String[] args) {
		// 메인함수 블럭에 기초자료형 byte 자료형을(데이터 타입) 지역변수로 선언 했다.
		// b 변수명은  byte b = 0; 문자 하위에서 사용가능하고 그 유효범위는 main() 함수 블럭 끝 까지.
		byte b = 0;
		// "" 문자열은 + 연산자로 기초자료형 데이터를 서로 연결할 수 있다. 
		System.out.println("b >>> : " + b);


		// b = 128;
		b = 127;
		System.out.println("b >>> : " + b);
		/*
			클래스 자원 = 변수 + 함수 + 클래스(빌트인 클래스, 사용자 정의 클래스)
			1. 클래스 : 빌트인 클래스, 사용장의 클래스 : 패키지가 다르면 import 키워드 사용
			2. 변수 : 멤버변수 : static (클래스이름.변수이름), static 없는것(참조변수.변수이름) 
					 지역변수 : static이 없고, new 사용하지 않는다.(기초자료형)
			3. 함수 : static 있는 것 : 클래스이름.함수이름()
					 static 없는 것 : 참조변수.함수이름()
		*/
		/*
			Byte : java.lang.Byte : 자바에서 java.lang.* 패키지에 있는 클래스는 
									소스에서 import 하지 않아도 
									자바에서 import 를 자동으로 해준다. 
			MAX_VALUE : 상수(constant) : public static final byte MAX_VALUE = 127;
			MIN_VALUE : 상수(constant) : public static final byte MAX_VALUE = -128;
		*/
		System.out.println("Byte.MAX_VALUE >>> : " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE >>> : " + Byte.MIN_VALUE);


	} // end of main 함수 

} // end of ExData_1 클래스 