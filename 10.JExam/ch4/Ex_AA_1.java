// package
package a.b.c.ch4;

// import


public class Ex_AA_1 implements A_interface, B_interface, C_interface
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	@Override
	public void a(){
		System.out.println("a()");
		
	}

	@Override
	public void b(){
		System.out.println("b()");		
	}

	@Override
	public void c(){
		System.out.println("c()");				
	}
	
	@Override
	public void d(){
		System.out.println("d()");						
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 자식클래스 자식클래스참조변수 = new 자식클래스() 인스턴스
		// 자식클래스참조변수로 부모 인터페이스에서 오버라이드한 함수를 참조할 수 있다. 
		Ex_AA_1 ea1 = new Ex_AA_1();
		ea1.a();
		ea1.b();
		ea1.c();
		ea1.c();

		// 부모인터페이스클래스 부모인터페이스클래스참조변수 = new 자식클래스() 인스턴스 
		// 부모인터페이스클래스참조변수 가지고 자기자신 부모인터페이스클래스에서 선언한 함수만 사용 가능 
		A_interface ai = new Ex_AA_1();
		ai.a();
		// ai.b();
		/*		
			C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_AA_1.java
			Ex_AA_1.java:50: error: cannot find symbol
							ai.b();
							  ^
			  symbol:   method b()
			  location: variable ai of type A_interface
			1 error
		*/
		
		B_interface bi = new Ex_AA_1();
		bi.b();

		C_interface ci = new Ex_AA_1();
		ci.c();
		ci.d();

	}
}

/*
interface A_interface
{
	public void a();
}


interface B_interface
{
	public void b();
}


interface C_interface extends D_interface
{
	public void c();
}

interface D_interface
{
	public void d();
}

*/