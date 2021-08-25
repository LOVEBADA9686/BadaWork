// package
package a.b.c.ch3;

// import


public class ExArray_1_3
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// String 클래스는 문자열을 다루는 빌트인 클래스 : 문자 배열 : 
		String s = "abc";

		System.out.println("s >>> : " + s);
		System.out.println("s >>> : " + + System.identityHashCode(s));

		// 문자열의 길이를 구하는 함수 : public int length() : 문자열의 길이를 리턴하는 함수 
		int sLen = s.length();
		System.out.println("s.length() >>> : " + s.length());
		for (int i=0; i < sLen; i++)
		{
			// public char charAt(int index)
			System.out.println("s.charAt("+i+") >>> : " + s.charAt(i));
		}

		// length vs length() 차이
		// length 는 렝스 필드 : 배열의 길이를 구하는 필드 
		int iV[] = new int[3];
		int iVLen = iV.length;
		System.out.println("iVLen >>> : " + iVLen);
		// length() 는 랭스 함수 : String 클래스에 있는 함수 : 문자열의 길이를 구하는 함수 
		String ss = "abcd";
		int ssLen = ss.length();
		System.out.println("ssLen >>> : " + ssLen);
	}
}
