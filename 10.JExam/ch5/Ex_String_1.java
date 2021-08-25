// package
package a.b.c.ch5;

// import


public class Ex_String_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		String s = "";
		int sLen = s.length();
		System.out.println("sLen >>> : " + sLen);

		String s1 = "      ";
		int sLen1 = s1.length();
		System.out.println("sLen1 >>> : " + sLen1);

		String s2 = "  kosmo hello world     ";
		System.out.println("s2 >>> : " + s2);		
		int sLen2 = s2.length();		
		System.out.println("sLen2 >>> : " + sLen2);

		// trim() 함수는 문자열의 앞, 뒤의 공백 문자를 제거하는 함수, 단 문자열 중간 해당 없음 
		String s3 = s2.trim();
		System.out.println("s3 >>> : " + s3);
		int sLen3 = s3.length();
		System.out.println("sLen3 >>> : " + sLen3);

		String sNull = null;
		System.out.println("sNull >>> : " + sNull);
		// 컴파일은 성공, 실행이 실패 NullPointerException
		// System.out.println("sNull.length() >>> : " + sNull.length());
		/*
			sNull >>> : null
			Exception in thread "main" java.lang.NullPointerException
			 at a.b.c.ch5.Ex_String_1.main(Ex_String_1.java:40)
		*/

		// "" : 길이가 0 (length()) 0 인 빈 문자열 
		// null : null 데이터 : 데이터가 없다. 
		// String  문자열 if 문으로 Validation 할 때는 
		String sVal = "";
		if (sVal !=null && sVal.length() > 0)
		{
			System.out.println("길이가 0인 데이터 걸러내기 :: length() 0 Validation >>> : ");
		}
		String sVal1 = null;
		if (sVal1 !=null && sVal1.length() > 0)
		{
			System.out.println("null 데이터 걸러내기 :: null Validation >>> : ");
		}
	}
}
