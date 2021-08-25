// package
package a.b.c.ch4;

// import


public class ExClass_C extends ExClass_P
{
	// 상수 
	// 멤버변수
	// 생성자
	public ExClass_C(){
		System.out.println("ExClass_C() 생성자 >>> : ");
	}

	// 함수 
	@Override
	public String toString(){
		
		return "ㅋㅋㅋㅋ";
	}

	@Override
	public String exClass_b(){
		return "ExClass_C.exClass_b() 함수 >>> : ";
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExClass_C.main() 함수 시작 >>> : ");

		/*
			1. ExClass_C 클래스를 인스턴스 하면 
			2. extends ExClass_P 부모 클래스를 먼저 찾아서 메모리에 로드한다.
			3. 자식 클래스 ExClass_C 를 메모리에 로드한다. 
		*/
		ExClass_C ecc = new ExClass_C();
		System.out.println("ecc 주소값 >>> : " + ecc);
		System.out.println("ecc.toString() >>> : " + ecc.toString());

		String a = ecc.exClass_a();
		System.out.println("a >>> : " + a);

		String b = ecc.exClass_b();
		System.out.println("b >>> : " + b);

		System.out.println("ExClass_C.main() 함수 끝 >>> : ");
	}
}
