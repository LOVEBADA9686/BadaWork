// package
package a.b.c.ch3;

// import


public class ExArray_2_2
{
	// 상수 
	// 멤버변수
	int i;
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		/*
			Enhanced For Loop 장단점
			장점 :
			1) 배열의 크기를 조사할 필요가 없다.
			2) 반복문 본연의 반복문 구현에 집중하여 구현할 수 있다.

			단점 :
			1) 배열에서만 사용가능하고, 배열의 값을 변경하지 못하는 단점이 있습니다. 
		*/

		int i = 0;
		String strArray[] = {"Java", "Android", "C", "JavaScript", "Python"};
		System.out.println("String lang : strArray >>>>>>>>>>>>> : ");
		
		for (String lang : strArray )
		{
			/*
				lang = "Java";
				lang = "Android";
				lang = "C";
				lang = "JavaScript";
				lang = "Python";
			*/
			System.out.println("lang >>> : " + lang);
		}
		
		
		
		System.out.println("String a : args >>>>>>>>>>>>> : ");
		// 명령행 인수 읽어오기 : 향상된 포문 
		for (String a : args )
		{
			System.out.println("a >>> : " + a);
		}
		

		// 명령행 인수 읽어오기 : 일반 포문
		System.out.println("int i=0; i < args.length; i++ >>>>>>>>>>>>> : ");
		for (int i=0; i < args.length; i++ )
		{
			System.out.println("args["+i+"] >>> : " + args[i]);
		}


		/*
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_2 11 22 33
			String lang : strArray >>>>>>>>>>>>> :
			lang >>> : Java
			lang >>> : Android
			lang >>> : C
			lang >>> : JavaScript
			lang >>> : Python
			String a : args >>>>>>>>>>>>> :
			a >>> : 11
			a >>> : 22
			a >>> : 33
			int i=0; i < args.length; i++ >>>>>>>>>>>>> :
			args[0] >>> : 11
			args[1] >>> : 22
			args[2] >>> : 33		
		*/
	}
}
