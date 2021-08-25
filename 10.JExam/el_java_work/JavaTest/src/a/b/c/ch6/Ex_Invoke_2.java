package a.b.c.ch6;

/*
Exception : 예외 클래스의 최상위 클래스 
try {} catch() {} finally {} 구문 : 예외 처리하기 
throws 키워드 : 예외 처리 미루기  : 호출한 함수에 예외 던지기
throw 키워드 : 사용자 정의 예외

Checked Exception
컴파일 할 때
받드시 예외 처리를 해야 한다.
예외 발생시 롤백을 하지 않음
IOException
ClassNotFoundException etc.

UnChecked Exception
실행 할 때
명시적으로 하지 않아도 된다.
예외 발생시 클백을 해야 한다.
NullpointerException
ClassCastException  etc. 
*/
public class Ex_Invoke_2 {

	public Ex_Invoke_2() {
		System.out.println("Ex_Invoke_2() 생성자 >>> : ");	
	}
	
	public int aM() {
		System.out.println("aM() 함수 시작 >>> : ");
		
		System.out.println("aM() 함수 ");
		// aM()함수 블럭에서 bM() 함수를 호출한다. invoke 한다. 
		int sum = bM();
		System.out.println("aM() sum >>> : " + sum);
		System.out.println("aM() 함수 끝 >>> : ");
		
		return sum;
	}

	public int bM() {
		System.out.println("bM() 함수 시작 >>> : ");
		
		System.out.println("bM() 함수 ");
		// bM()함수 블럭에서 cM() 함수를 호출한다. invoke 한다. 
		int sum = cM();
		System.out.println("bM() sum >>> : " + sum);
		System.out.println("bM() 함수 끝 >>> : ");
		
		return sum;
	}

	public int cM() {
		System.out.println("cM() 함수 시작 >>> : ");
		
		System.out.println("cM() 함수 ");
		// cM()함수 블럭에서 dM() 함수를 호출한다. invoke 한다. 
		int sum = dM();
		System.out.println("cM() sum >>> : " + sum);
		System.out.println("cM() 함수 끝 >>> : ");
		
		return sum;
	}

	public int dM() {
		System.out.println("dM() 함수 시작 >>> : ");
		
		System.out.println("dM() 함수 ");
		
		int sum = 0;
		
		try {
			sum = 1 / 0;	
			
			System.out.println("dM() sum >>> : " + sum);
		}catch(ArithmeticException a) {
			System.out.println("에러가 >>> : " + a);
			System.out.println("에러가 a.getMessage() >>> : " + a.getMessage());
			a.printStackTrace();
		}
		
		
		System.out.println("dM() 함수 끝 >>> : ");
		
		return sum;
	}
	
	// main() 함수가 있으면 콘솔 어플리케이션이라고 부른다. 
	// 콘솔 어플리케이션에서 함수의 시작점은  main() 함수 이다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_2 :: main() 함수 시작 >>> : ");
		System.out.println("Ex_Invoke_2 :: main() 함수 첫 라인 부터 인터프리트 방식으로 수행 된다. >>> : ");
		
		// 사용자 정의 클래스 참조변수 사용하기
		Ex_Invoke_2 exi2 = new Ex_Invoke_2();
		System.out.println("exi2 주소값 >>> : " + exi2);
		
		// 메인함수 블럭에서 참조변수 exi2 로 aM()를 호출한다. invoke 한다. 
		int sum = exi2.aM();
		System.out.println("main sum >>> : " + sum);
	}
}

// main() -> aM() -> bM() -> cM() -> dM() -> cM() -> bM() -> aM() -> main()
