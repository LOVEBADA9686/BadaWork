// package : 패키지 키워드를 선언 한다. 
// 패키지명은 a.b.c 선언한다. 
// ; : 패키지 선언문(문장, statement)를 종결한다.
package a.b.c;

// MainTest 사용자 정의 클래스이름 클래스로 선언 한다. 
// public 키워드를 선언 한다. : 어느 패키지에서나 사용 가능한다.
// class 키워드를 선언 한다. : 사용자 정의 클래스 MainTest  를 클래스로 선언 한다. 
// MainTest 클래스 블럭(scope, 영역) 현재 기준으로 11라인 부터 25라인 까지 이다. 
// 클래스 블럭(scope, 영역)표시는 {} 브레이스 연산자로 열고 닫는다.
public class MainTest {

	// 콘솔 어플리케이션 시작점인 main() 함수를 선언 한다. 
	// main() 함수의 블럭(scope, 영역)은 16라인 부터 24라인 까지이다.
	// main() 함수의 블럭은 {} 브레이스 연산자로 열고 닫는다. 
	public static void main(String[] args){
		// main() 블럭(scope, 영역)안에서 첫 라인부터 문장을 한 라인씩 읽어서 수행한다.
		// 이러한 방식을 인터프리트 방식이라고 한다. 
		System.out.println("MainTest main() 함수 시작 >>> : ");
		System.out.println("콘솔어플리케이션에서는 main() 함수가 시작점이다.");
		System.out.println("main() 함수 블럭 안에서는 인터프리트 방식(순차적)으로 수행된다.");
		System.out.println("MainTest main() 함수 끝 >>> : ");

	} // end of main 함수 
} // end of MainTest 클래스 