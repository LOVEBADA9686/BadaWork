// package
package a.b.c.ch3;

// import


public class ExArray_1_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		String aa = "abcdefghijklmnopqrstuvwxyz";
		String aA = aa.toUpperCase();
		String n = "0123456789";
		String m = "+-*/%";
		String s = "~!@#$^&()[]{}";

		System.out.println("aa >>> : " + aa);
		System.out.println("aA >>> : " + aA);
		System.out.println("n >>> : " + n);
		System.out.println("m >>> : " + m);
		System.out.println("s >>> : " + s);

		// 스트링 길이를 구해서(문자 배열), charAt(int index) 를 이용해서
		// 콘솔에 각문자와 16진수를 출력하시오 (16진수는 0x 표기하기)

		// char 데이터타입 c 지역변수로 선언 및 디폴트 값으로 초기화 한 후 
		// 각 for 문에서 재사용한다. 
		char c = '\u0000';

		System.out.println("\n영문자 소문자 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < aa.length(); i++ )
		{			
			c = aa.charAt(i);
			System.out.println("aa.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n영문자 대문자 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < aA.length(); i++ )
		{			
			c = aA.charAt(i);
			System.out.println("aA.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n숫자 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < n.length(); i++ )
		{			
			c = n.charAt(i);
			System.out.println("n.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n연산자 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < m.length(); i++ )
		{			
			c = m.charAt(i);
			System.out.println("m.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n특수기호 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < s.length(); i++ )
		{			
			c = s.charAt(i);
			System.out.println("s.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
	}
}
