// package
package a.b.c.ch4;

// import


public class ExClass_Multi 
{
	// 상수 
	// 멤버변수
	// 생성자
	public ExClass_Multi(){
		System.out.println("ExClass_Multi() 생성자 >>> : ");
	}

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Interface_A ia = new Interface_AImpl();
		ia.interface_a();

		int b = ia.interface_b();
		System.out.println("b >>>: " + b);
		
		String c = ia.interface_c();
		System.out.println("c >>>: " + c);
		
		boolean d = ia.interface_d();
		System.out.println("d >>>: " + d);
	}
}

/*
컴파일 하는 방법
C:\00.KOSMO93\10.JExam\ch4>javac -d . ExClass_Multi.java Interface_A.java Interface_AImpl.java

실행
C:\00.KOSMO93\10.JExam\ch4>java a.b.c.ch4.ExClass_Multi
Interface_AImpl.interface_a() 함수 >>> :
b >>>: 100
c >>>: interface_c()
d >>>: false


*/