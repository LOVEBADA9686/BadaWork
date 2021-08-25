package a.b.c.ch2;


public class Data_4 {
	
	// 멤버변수
	// 클래스변수 	: 멤버변수에 static 키워드를 선언하면 클래스 변수
	//            static 키워드가 선언되어 있으면 뒤에오는 변수를 메모리에 초기화 한다. :  디폴트 값으로 
	//            클래스변수는 생성자를 이용하지 않는다. 
	static byte b;
	static char c;
	static short s;
	static int i;
	static float f;
	static double d;
	static boolean bo;
	static String str;

	public Data_4(){
		System.out.println("Data_4 클래스 Data_4() 생성자");
	}

	public static void main(java.lang.String[] args){

		// System.out.println("b >>> : " + b);
		/*
			static 키워드를 보고 jvm 이 main 함수를 메모리 올림 : 메모리에 올라가 있는 메인 함수에서 :: static context
			멤버변수 byte b를 호출하면 :: non-static variable b 
			byte b는 메모리 없다고 오류를 발생한다.

			byte b 를 메모리 올리는 방법
			1. new 연산자 사용하기
				Data_4 d4 = new Data_4();
				System.out.println("d4.b >>> : " + d4.b);
			3. static 키워드 사용하기 
				static byte b;
				System.out.println("Data_4.b >>> : " + Data_4.b);

				static 키워드가 붙은 자원을 사용할 때는 
				패키지명.클래스이름.스태틱키워드붙은변수명;
				Data_4.b;
		*/
		/*
			C:\00.KOSMO93\10.JExam\ch2>javac -d . Data_4.java
			Data_4.java:22: error: non-static variable b cannot be referenced from a static context
					System.out.println("b >>> : " + b);
													^
			1 error
		*/

		System.out.println("Data_4.b >>> : " + Data_4.b);
		System.out.println("Data_4.c >>> : " + Data_4.c);
		System.out.println("Data_4.s >>> : " + Data_4.s);
		System.out.println("Data_4.i >>> : " + Data_4.i);
		System.out.println("Data_4.f >>> : " + Data_4.f);
		System.out.println("Data_4.d >>> : " + Data_4.d);
		System.out.println("Data_4.bo >>> : " + Data_4.bo);
		System.out.println("Data_4.str >>> : " + Data_4.str);

	} // end of main 함수 	
} // end of Data_4


