package a.b.c.ch2;

/*
String 클래스는 
rt.jar 에 java.lang.String 으로 존재 한다.

a.b.c.ch2.Data_2 사용자 정의 클래스에서
rt.jar 에 있는 를 호출한다.
import java.lang.String;

자바 문법에서 
java.lang.* 패키지에 있는 클래스는 
사용 빈도도 많고 기초 클래스 이기 때문에
개발자가 사용자 정의 클래스를 만들면 
기본적으로 import 시켜 놓는다. 

java.lang.* 패키지 외 
다른 패키지는 무조건 import 해서 사용해야 한다. 
*/

/*
1. 이 사용자 정의 클래스를 패키지 밖에서도 호출하기 위해서 : public 
2. 이 사용자 정의 클래스를 일반 클래스로 선언 : class 
3. 이 사용자 정의 클래스의 이름은 : Data_2
*/
public class Data_2 {
	
	/*
		1. main 함수 : 이 클래스의 시작점 
		2. public : 패키지 밖에서 호출하기 
		3. static : main 함수를 메모리 올려주세요 (JVM)
		4. void : 메인 함수에 return 키워드 사용불가 : 리턴 값이 없다.
		5. main : 메인 함수 : 자바에서 정해진 함수 이름 : 변경 불가  
		6. () : main 에 아규먼트가 들어오는 공간 
		7. String : 빌트인 클래스 
		8. [] : 배열 연산자
		9. args : 아규먼트 변수명 : 이것은 변경이 가능하다.	
    */
	public static void main(java.lang.String[] args){
		
		// 콘솔에 출력 하시오 
		System.out.println("main() 함수은 프로그램의 시작점 이다. >>> : ");
		System.out.println("함수 블럭에서는 인터프리트 방식으로 수행된다. >>> : ");
		System.out.println("자바 기초 자료형 배우기 시작 >>> : ");

	} // end of main 함수 
	
} // end of Data_2
