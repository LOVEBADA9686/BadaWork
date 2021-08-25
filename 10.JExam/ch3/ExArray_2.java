// package
package a.b.c.ch3;

// import


public class ExArray_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		String str[] = new String[] {"abc", "def", "ghi"};
		System.out.println("str >>> " + str);
		System.out.println("스트링 배열 클래스의 배열의 길이 :: str.length >>> " + str.length);
		
		int strLen = str.length;
		for (int i=0; i < strLen; i++ )
		{
			System.out.println("str["+i+"] >>> : " + str[i]);
			for (int j=0; j < str[i].length(); j++)
			{
				System.out.println("str["+i+"].charAt("+j+") >>> : " + str[i].charAt(j));
				System.out.println("str["+i+"].charAt("+j+") >>> : 0x" + 
										Integer.toHexString(str[i].charAt(j)));
			}
		}

		// new String[] 이 생략된 스트링 배열 
		String str1[] = {"abc", "def", "ghi"};
		System.out.println("str1 >>> " + str1);
		System.out.println("스트링 배열 클래스의 배열의 길이 :: str1.length >>> " + str1.length);

		// str1[] 콘솔에 출력해 보기
		int str1Len = str1.length;
		for (int i=0; i < str1Len; i++ )
		{
			System.out.println("str1["+i+"] >>> : " + str1[i]);
			for (int j=0; j < str1[i].length(); j++)
			{
				System.out.println("str1["+i+"].charAt("+j+") >>> : " + str1[i].charAt(j));
				System.out.println("str1["+i+"].charAt("+j+") >>> : 0x" + 
										Integer.toHexString(str1[i].charAt(j)));
			}
		}

	}
}
