// package
package a.b.c.ch3;

// import


public class ExArray_1_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		char[] cA = new char[26];
		char ch = 'A';

		for (int i=0; i < cA.length; i++)
		{
			// 요소에 값 대입 
			cA[i] = ch;
			ch++;
		}
		System.out.println("영문자 대문자 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < cA.length; i++ )
		{
			// 요소의 값을 조회, 아스키 10진수로 형변환 해서 조회 
			System.out.println(cA[i] 
			// 8진수, 16진수로 조회 해보기 print 사용해서 한 줄로 보여주기, 각 알파벳 대문자를		
							  + " , 10진수 :: " + (int)cA[i]
							  + " , 8진수 :: 0" + Integer.toOctalString(cA[i])
							  + " , 16진수 :: 0x" + Integer.toHexString(cA[i])
							  + " , 16진수 :: 0X" + Integer.toHexString(cA[i])
							  + " , 2진수 :: " + Integer.toBinaryString(cA[i]));
		}	

		char[] ca= new char[26];
		char cha = 'a';

		for (int i=0; i < ca.length; i++)
		{
			// 요소에 값 대입 
			ca[i] = cha;
			cha++;
		}
		System.out.println("영문자 소문자 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < ca.length; i++ )
		{
			// 요소의 값을 조회, 아스키 10진수로 형변환 해서 조회 
			System.out.println(ca[i] 
			// 8진수, 16진수로 조회 해보기 print 사용해서 한 줄로 보여주기, 각 알파벳 대문자를		
							  + " , 10진수 :: " + (int)ca[i]
							  + " , 8진수 :: 0" + Integer.toOctalString(ca[i])
							  + " , 16진수 :: 0x" + Integer.toHexString(ca[i])
							  + " , 16진수 :: 0X" + Integer.toHexString(ca[i])
							  + " , 2진수 :: " + Integer.toBinaryString(ca[i]));
		}	
	}
}
