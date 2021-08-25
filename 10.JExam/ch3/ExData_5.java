/*
	ExData_5 클래스에서 
	리턴형이 있고, static 키워드 없는 함수 addMethod()를 만들어서 
	매개변수 int x, int y를 받아서 
	더하기 결과를 return 키워드 결과 값으로 만들기

	메인 함수에서 adMethod()에 
	지역변수 int형 x, y 를 선언한 후 10, 20으로 초기화 해서 
	아규먼트로 전달 해서 
	int sum 지역변수에 결과 값을 대입해서 
	콘솔에 출력 하시오.
*/

// package
package a.b.c.ch3;

// import


public class ExData_5 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public int addMethod(int x, int y){
		System.out.println("ExData_5.addMethod() 함수 시작 >>> : \n");
		System.out.println("ExData_5.addMethod() x >>> : " + x);
		System.out.println("ExData_5.addMethod() y >>> : " + y);

		int sum = x + y;
		System.out.println("ExData_5.addMethod() sum >>> : " + sum);

		System.out.println("\nExData_5.addMethod() 함수 끝 >>> : ");
		return sum;

		// return x + y;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_5.main() 함수 시작 >>> : \n");

		// 지역변수
		int x = 10;
		int y = 20;

		ExData_5 ed5 = new ExData_5();
		System.out.println("ed5 주소값 >>> : " + ed5);
		int sum = ed5.addMethod(x, y);
		System.out.println("ExData_5.main() sum >>> : " + sum);

		// 하기 호출 방법은 알고 만 있자
		System.out.println("ExData_5 >>> : " + new ExData_5().addMethod(x, y));

		int sum1 = new ExData_5().addMethod(x, y);
		System.out.println("ExData_5.main().addMethod() sum >>> : " + sum);
		
		System.out.println("\nExData_5.main() 함수 끝 >>> : ");
	}
}
