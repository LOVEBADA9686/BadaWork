package a.b.c.ch2;

public class Data_7 {

	public static void main(java.lang.String[] args){

		/*
			함수 블럭에서 선언하는 변수를 우리는 지역변수라고 지칭한다.
			지역변수는 함수내에서 태어나서 함수에서 돌아가신다.
			지역변수는 함수밖을 나갈 수가 없다.

			지역변수는 사용하기 전에 꼭 개발자가 의도적으로 초기화를 해야 한다. 
			초기화 : 변수 선언 후 최초로 변수에 대입하는 행위 

			지역변수의 초기화는 그 데이터의 default value로 초기화 한다. <-- 이게 변수를 잘 사용하는 방법 중 하나 
			지역변수의 초기화는 선언 과 동시에 default value로 초기한다. <-- 이게 변수를 잘 사용하는 방법 중 하나 
		*/

		// 기초자료형 지역변수로 초기화 
		byte b = 0;
		char c = ' '; // char 문자는 ' ' : 싱글쿼테이션으로 값이 없는 문자로 초기화 한다. 
		char c1 = '\u0000'; // 유니코드로 초기화해도 된다. 
		short s = 0;
		int i = 0;
		float f = 0.0f;
		float f1 = 0.0F;
		double d = 0.0d;
		double d1 = 0.0D;
		boolean bool = false;
		String sVal1 = ""; // String 문자열은 "" : 떠블쿼테이션으로 초기화 한다.
		String sVal2 = null; //  String 문자열은 null 로 초기화 할 수도 있다. 

		// Data_7 d7 = new Data_7();

		// 지역변수를 호출해서 콘솔에 출력하시오.
		System.out.println("b >>> : " + b);
		System.out.println("c >>> : " + c);
		System.out.println("c1 >>> : " + c1);
		System.out.println("s >>> : " + s);
		System.out.println("i >>> : " + i);
		System.out.println("f >>> : " + f);
		System.out.println("f1 >>> : " + f1);
		System.out.println("d >>> : " + d);
		System.out.println("d1 >>> : " + d1);
		System.out.println("bool >>> : " + bool);
		System.out.println("sVal1 >>> : " + sVal1);
		System.out.println("sVal2 >>> : " + sVal2);

	} // end of main 함수 	
} // end of Data_6


