package a.b.c.ch6;

public class Ex_Invoke {

	public Ex_Invoke() {
		System.out.println("Ex_Invoke() 생성자 >>> : ");	
	}
	
	public void aM() {
		System.out.println("aM() 함수 시작 >>> : ");
		
		System.out.println("aM() 함수 ");
		// aM()함수 블럭에서 bM() 함수를 호출한다. invoke 한다. 
		bM();
		System.out.println("aM() 함수 끝 >>> : ");
	}

	public void bM() {
		System.out.println("bM() 함수 시작 >>> : ");
		
		System.out.println("bM() 함수 ");
		// bM()함수 블럭에서 cM() 함수를 호출한다. invoke 한다. 
		cM();
		
		System.out.println("bM() 함수 끝 >>> : ");
	}

	public void cM() {
		System.out.println("cM() 함수 시작 >>> : ");
		
		System.out.println("cM() 함수 ");
		// cM()함수 블럭에서 dM() 함수를 호출한다. invoke 한다. 
		dM();
		System.out.println("cM() 함수 끝 >>> : ");
	}

	public void dM() {
		System.out.println("dM() 함수 시작 >>> : ");
		
		System.out.println("dM() 함수 ");
		
		System.out.println("dM() 함수 끝 >>> : ");
	}
	
	// main() 함수가 있으면 콘솔 어플리케이션이라고 부른다. 
	// 콘솔 어플리케이션에서 함수의 시작점은  main() 함수 이다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke :: main() 함수 시작 >>> : ");
		System.out.println("Ex_Invoke :: main() 함수 첫 라인 부터 인터프리트 방식으로 수행 된다. >>> : ");
		
		// 사용자 정의 클래스 참조변수 사용하기
		Ex_Invoke exi = new Ex_Invoke();
		System.out.println("exi 주소값 >>> : " + exi);
		
		// 메인함수 블럭에서 참조변수 exi 로 aM()를 호출한다. invoke 한다. 
		exi.aM();

	}

}
