// package
package a.b.c.ch3;

// import


public class ExArray_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 배열 : 객체 : new : 생성자 : 디폴트값 초기화 
		int[] i = new int[3]; // 요소가 [0], [1], [2]
		System.out.println("int형 일차원배열의 참조변수 i의 주소값 >>> : " + i);
		/*
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_1
			int형 일차원배열의 참조변수 i의 주소값 >>> : [I@15db9742

			[ : 1차원 배열 연산자 표기 
			I : int 형 : Integer
			@ : 구분자 
			15db9742 : JVM에 있는 주소값 
		*/
		System.out.println("기계에 있는 i 의 주소값 >>> : " + System.identityHashCode(i));

		System.out.println("배열에 있는 요소의 값을 참조할 때 ");
		System.out.println("배열참조변수[index(배열의 첨자)], 첫 번째 요소의 값을 참조 하시오  >>> :  " 
							+ "[0] :: " + i[0]); 
		System.out.println("배열참조변수[index(배열의 첨자)], 두 번째 요소의 값을 참조 하시오  >>> :  " 
							+ "[1] :: " + i[1]); 
		System.out.println("배열참조변수[index(배열의 첨자)], 세 번째 요소의 값을 참조 하시오  >>> :  " 
							+ "[2] :: " + i[2]); 

		int iLen = i.length;
		System.out.println("배열의 길이는 배열의 참조변수.length 필드 사용 >>> : 요소개수 - 1 :: " + iLen);

		/*
		for (int j=0; j <= iLen; j++ )
		{
			/*
			요소(element) 가 3개 : 0, 1, 2
			j <= iLen
			0 <= 3 : i[0]
            1 <= 3 : i[1]
            2 <= 3 : i[2] 

			3 <= 3 : i[3] : 4번째 요소는 데이터가 없는 것 
			java.lang.ArrayIndexOutOfBoundsException: 3
			*/
			// System.out.println("["+j+"] >>> : " + i[j]);
		// }
		
		/*
		[0] >>> : 0
		[1] >>> : 0
		[2] >>> : 0
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
				at a.b.c.ch3.ExArray_1.main(ExArray_1.java:54)

				java.lang.ArrayIndexOutOfBoundsException : 예외 클래스 : Exception class
				자바 배열의 인덱스의 값을 참조할 때
				참조할 인덱스 가 선언된 인덱스의 길이보다 넘치거나(길이가 길거나), 모자라면 (길이가 짧으면)나는 에러이다. 
		
		*/


		// 1차원 배열을 배열의 길이(length)를 이용해서 for 문으로 배열 요소 조회해 보기 
		for (int j=0; j < iLen; j++ )
		{
			System.out.println("["+j+"] >>> : " + i[j]);
		}
		
		i[0] = 11;
		i[1] = 12;
		i[2] = 13;

		for (int j=0; j < iLen; j++ )
		{
			System.out.println("["+j+"] >>> : " + i[j]);
		}

		// 배열 선언과 동시에 초기화 하는 방식 
		int ii[] = new int[]{1, 2, 3};
		System.out.println("int형 일차원배열의 참조변수 ii 의 주소값 >>> : " + ii);		
		System.out.println("기계에 있는 ii 의 주소값 >>> : " + System.identityHashCode(ii));
		for (int j=0; j < ii.length; j++ )
		{
			System.out.println("["+j+"] >>> : " + ii[j]);
		}

		// 배열 선언과 동시에 초기화 하는 방식, new int[] 생략하기 : 가장 많이 사용하는 방법 
		int iii[] = {1, 2, 3};
		System.out.println("int형 일차원배열의 참조변수 iii 의 주소값 >>> : " + iii);		
		System.out.println("기계에 있는 iii 의 주소값 >>> : " + System.identityHashCode(iii));
		for (int j=0; j < iii.length; j++ )
		{
			System.out.println("["+j+"] >>> : " + iii[j]);
		}
	}
}
