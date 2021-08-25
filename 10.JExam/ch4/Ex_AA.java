// packager
package aaa.bbb.ccc;

// import


public class Ex_AA
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 인터페이스 사용하는 방법
		// 부모인터페이스클래스 선언 부모인터페이스클래스 참조변수 선언 = new 부모인터페이스를상속한자식클래스();
		C c = new CImpl();
		// 부모인터페이스클래스 참조변수 
		c.c();
		c.c_1();
		int c_2 = c.c_2();
		System.out.println("c_2 >>> : " + c_2);
		boolean c_3 = c.c_3();
		System.out.println("c_3 >>> : " + c_3);

		int defalutM = c.defalutM();
		System.out.println("defalutM >>> : " + defalutM);

		boolean staticM = C.staticM();
		System.out.println("staticM >>> : " + staticM);
	}
}

// 인터페이스 클래스 
// 인터페이스 클래스 = 상수 + 추상함수 
// 상수 : public static final 데이터타입 XXX_XXXX = 리터럴; int i = 1;
// 추상함수 : 리턴형 함수이름();
// 인터페이스 클래스에 있는 추상함수는 구현부가 없다. 
// 반드시 인터페이스 클래스는 구현체(implementation)를 만들어서 사용해야 한다. 
// 인터페이스 클래스 구현체 클래스는 인터페이스클래스이름 + Impl 으로 한다. 
// 인터페이스 클래스 = 인터페이스클래스 + 인터페이스클래스Impl
interface C
{
	// 인터페이스에 선언된 함수는 모두 추상함수 이다.

	// abstract 키워드가 생략 된 상태 
	public /*abstract*/ void c();
	public /*abstract*/ void c_1();
	public /*abstract*/ int c_2();
	public /*abstract*/ boolean c_3();

	// jdk 1.8 : SE 8 에서 interface에 defalut, static 함수 사용가능
	public default int defalutM(){
		System.out.println("\nC.defalutM() 함수 시작 >>> ");

		System.out.println("interface 의 defalut 함수 >>> : ");
		System.out.println("참조변수로 함수를 호출할 수 있다..");
		System.out.println("implements 한 클래스에서 재정의 할 수 있다.");

		System.out.println("C.defalutM() 함수 끝 >>> ");
		return 0;
	}

	public static boolean staticM(){
		System.out.println("\nC.staticM() 함수 시작 >>> ");

		System.out.println("interface 의 static 함수 >>> : ");
		System.out.println("반드시 클래스명.함수이름() 으로 호출해야 한다.");
		System.out.println("재정의 하면 않된다.");
		boolean bool = false;

		System.out.println("C.staticM() 함수 끝 >>> ");
		return bool;
	}
}


/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_AA.java
Ex_AA.java:34: error: CImpl is not abstract and does not override abstract method c() in C
class CImpl implements C
^
1 error
*/
class CImpl implements C
{	
	@Override
	public void c(){
		System.out.println("\nCImpl.c() 함수 시작 >>> ");
		System.out.println("c() >>> : ");
		System.out.println("CImpl.c() 함수 끝 >>> \n");
	}

	@Override
	public void c_1(){
		System.out.println("\nCImpl.c_1() 함수 시작 >>> ");
		System.out.println("c_1() >>> : ");
		System.out.println("CImpl.c_1() 함수 끝 >>> \n");
	}

	@Override
	public int c_2(){
		System.out.println("\nCImpl.c_2() 함수 시작 >>> ");
		System.out.println("c_2() >>> : ");
		System.out.println("CImpl.c_2() 함수 끝 >>> \n");
		return 0;
	}

	@Override
	public boolean c_3(){
		System.out.println("\nCImpl.c()_3 함수 시작 >>> ");
		System.out.println("c_3() >>> : ");
		System.out.println("CImpl.c()_3 함수 끝 >>> \n");
		return false;
	}


}
