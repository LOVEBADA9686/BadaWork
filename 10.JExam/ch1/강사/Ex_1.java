package a.b.c.ch1;

public class Ex_1 {

	// main 함수 
	// 자바 버철 머신 : Java Virtual Machine : JVM : java.exe
	// main() 함수는 자바 콘솔 어플리케이션의 시작 점이다. 
	// java a.b.c.ch1.Ex_1 을 실행 하면
	// 1. 실제 물리적인 파일 위치에 가사 Ex_1.class 읽는다.
    // 2. Ex_1.class 를 메모리에 로드 한다.
    // 3. 로딩된 a.b.c.ch1.Ex_1 클래스에서 메인 함수가 호출되서 
	// 4. 메인 함수 블럭 첫번째 라인 부터 수행한다. 
    // 5. System.out.println() : println() 함수에 있는 아규먼트를 콘솔에 출력 하시오 
	public static void main(java.lang.String[] args){

		// 콘솔에 출력 하시오 
		java.lang.System.out.println("자바 문법 첫번째 예제 Ex_1 !!");
	} // end of main 함수 
} // end of Ex_1 클래스 