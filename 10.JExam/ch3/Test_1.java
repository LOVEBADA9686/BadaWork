// package
package a.b.c.ch3;

// import


public class Test_1
{
	// 상수
	// 멤버변수
	// 생성자
	
	//함수
	public int a(){
		System.out.println("Test_1.a() 함수 시작 >>> : ");
		System.out.println("Test_!.a() 함수 끝 >>> : ");

		return 1+2;
	}	
		public void b(){
		System.out.println("Test_1.b() 함수 시작 >>> : ");
		System.out.println("Test_!.b() 함수 끝 >>> : ");	
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Test_1 t1 = new Test_1();
		System.out.println("t1 주소값 >>> : " + t1);
		t1.a();
		System.out.println("ti.a() >>> : " + t1.a());

		int i = t1.a();
		System.out.println("i >>> : " + i);

		t1.b();
		// System.out.println("t1.b() >>> : " + t1.b());
	}
}
