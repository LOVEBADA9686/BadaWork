package a.b.c.ch1;

public class Ex_1 {

	// main 함수
	// 자바 버철 머신 : Java Virtual Machine : JVM : java.exe
	// main() 함수는 자바 콘솔 어플리케이션의 시작 점이다.
	// java a.b.c.ch1.Ex_1 을 실행 하면
	1. 실제 물리적인 파일 위치에 가서 Ex_1.class 읽는다.
	2. Ex_1.class 를 메모리에 로드 한다.
	3. 로딩된 a.b.c.ch1.Ex_1 클래스에서 init() 함수와 main() 함수가 링크가 걸려 있다.
	4. 메인 함수 블럭 첫번째 라인부터 수행한다.
	5. System.out.println() : println() 함수에 있는 아규먼트를 콘솔에 출력하시오.
	public static void main(String[] args){

		// 콘솔에 출력 하시오
		// System : java.lang.System 클래스 자바프로그램에서 입출력, 프로퍼티 및 시스템 관련 일을 담당하는 클래스
		// out : System 클래스에 있는 out 필드(변수) : 콘솔에 출력하는 통로 역할을 한다.
		// println() : 콘솔에 println 함수의 아규먼트를 프린트 하는 함수 
		//			 : 프린트 하고 라인 하나는 떨어 뜨린다.
		java.lang.System.out.println("자바 문법 첫번째 예제 Ex_1 !!");
	} // end of main 함수
} // end of Ex_1클래스