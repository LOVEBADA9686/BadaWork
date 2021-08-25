package a.b.c.ch3;

/*
	ExData_3 클래스에 
	public void primeVal() 함수를 만들어서 
	main 함수에서 primeVal() 호출해서 실행 시키시오 

	primeVal() 함수가 실행되면 
	기초자료형 byte char short int long float double 의 
	최대값, 최소값을 콘솔에 출력하시오
	
*/
public class ExData_3 {
	
	// 상수
	// 멤버변수
	// 생성자
	
	// 함수
	public void primeVal() {
		System.out.println("ExData_3.primeVal() 함수 시작 >>> : \n");
		
		// byte : Byte : 최대값, 최소값
		System.out.println("Byte : 최대값 >>> : " + Byte.MAX_VALUE);
		System.out.println("Byte : 최소값 >>> : " + Byte.MIN_VALUE);

		// char : Character : 최대값, 최소값
		System.out.println("Character : 최대값 >>> : " + Character.MAX_VALUE);
		System.out.println("Character : 최소값 >>> : " + Character.MIN_VALUE);

		// short : Short : 최대값, 최소값
		System.out.println("Short : 최대값 >>> : " + Short.MAX_VALUE);
		System.out.println("Short : 최소값 >>> : " + Short.MIN_VALUE);

		// int : Integer : 최대값, 최소값
		System.out.println("Integer : 최대값 >>> : " + Integer.MAX_VALUE);
		System.out.println("Integer : 최소값 >>> : " + Integer.MIN_VALUE);

		// long : Long : 최대값, 최소값
		System.out.println("Long : 최대값 >>> : " + Long.MAX_VALUE);
		System.out.println("Long : 최소값 >>> : " + Long.MIN_VALUE);

		// float : Float : 최대값, 최소값
		System.out.println("Float : 최대값 >>> : " + Float.MAX_VALUE);
		System.out.println("Float : 최소값 >>> : " + Float.MIN_VALUE);

		// double : Double  : 최대값, 최소값
		System.out.println("Double : 최대값 >>> : " + Double.MAX_VALUE);
		System.out.println("Double : 최소값 >>> : " + Double.MIN_VALUE);

		System.out.println("\nExData_3.primeVal() 함수 끝 >>> : ");
	} // end of primeVal() 함수 

	// main() 함수 
	public static void main(String[] args) {
		System.out.println("ExData_3 main() 함수 시작 >>> : \n");

		ExData_3 ed3 = new ExData_3();
		ed3.primeVal();

		System.out.println("\nExData_3 main() 함수 끝 >>> : ");
	} // end of main 함수 
} // end of ExData_1 클래스 