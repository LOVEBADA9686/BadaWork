// package
package a.b.c.ch4;

// import
import java.lang.Object;

public class ExClass_1 extends Object
{
	// 상수 
	// 멤버변수
	// 생성자
	public ExClass_1(){
		System.out.println("ExClass_1() 생성자");
	}

	// 함수 
	@Override 
	public String toString(){
		
		String str = "난 java.lang.Object root 클래스에 있는 toString() 함수이다. !!";
		String str1 = "사용자 정의 클래스 ExClass_1 클래스에서 java.lang.Object 부모 클래스에 있는";
		String str2 = "toString() 함수를 불러다 변경해서 사용하는 중이다.";
		String str3 = "부모 클래스에 있는 자원중 함수를 불러다 사용하는 오버라이딩이다.";

		// 	str.concat(str1).concat(str2).concat(str3) 
		//  함수를 .(링크 연산자) 를 이용해서 함수를 호출 방식을 메소드 체인 이라고 부른다. 
		return str.concat(str1).concat(str2).concat(str3);
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExClass_1.main() 함수 시작 >>> : ");
		
		/*
			사용자 정의 ExClass_1 를 인스턴스 하면 
			상속 관계를 확인하고 상속된 클래스를 먼저 메모리에 올린다.
			현재는 따로 상속하는 클래스가 없으므로 
			기본적으로 상속되는 java.lang.Object 클래스를 메모리에 
			먼저 올린다.
		*/
		ExClass_1 ec1 = new ExClass_1();
		System.out.println("ec1 주소값 >>> : " + ec1);
		System.out.println("ec1.toString() >>> : " + ec1.toString());
		
		
		System.out.println("ExClass_1.main() 함수 끝 >>> : ");
	}
}
