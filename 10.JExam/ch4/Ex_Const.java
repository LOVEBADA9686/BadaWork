// package
package a.b.c.ch4;

// import

// ConstTest_1 : 부모 클래스 
// Ex_Const : 자식 클래스 
public class Ex_Const extends ConstTest_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public Ex_Const(){
		/*
			C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_Const.java
			Ex_Const.java:17: error: call to this must be first statement in constructor
                this("장진영", 27);
                    ^
			1 error
		*/
		/*
			1. this() :  디스 함수라고 부른다. 자바에서 기능이 정의된 함수이다.
			2. 자기자신 클래스에서 오버로드된 생성자를 매개변수가 같은 생성자를 호출하는 함수이다.
			3. this() 함수는 생성자 블럭에서 맨 상단에 위치해야 한다.  JVM 규칙이다.	
		*/
		this("장진영", 27);
		System.out.println("Ex_Const() 생성자 >>> : ");
	}

	public Ex_Const(String name){
		this(name, 23);
		System.out.println("Ex_Const(String name) 생성자 >>> : ");
		System.out.println("name >>> : " + name);
	}

	public Ex_Const(int age){
		super("김상진");
		System.out.println("Ex_Const(int age) 생성자 >>> : ");
		System.out.println("age >>> : " + age);
	}

	public Ex_Const(String name, int age){
		/*
			1. super() :  슈퍼 함수라고 부른다. 자바에서 기능이 정의된 함수이다.
			2. 자기자신 클래스에서 상속해준 부모 클래스이 생성자를 호출한다.
			3. super() 함수는 생성자 블럭에서 맨 상단에 위치해야 한다.  JVM 규칙이다.	
		*/
		super();
		System.out.println("Ex_Const(String name, int age) 생성자 >>> : ");
		System.out.println("name, age >>> : " + name +", "+ age);
	}



	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_Const ec = new Ex_Const();
		// java.lang.Objec.toString();
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// ec >>> : a.b.c.ch4.Ex_Const@15db9742
		System.out.println("Ex_Const() 생성자 ec 주소값 JVM  >>> : " + ec); // toString() 생략된 것 
		System.out.println("Ex_Const() 생성자 ec 주소값 JVM  >>> : " + ec.toString());
		System.out.println("ec.getClass() >>> : " + ec.getClass());
		System.out.println("ec.getClass().getName() >>> : " + ec.getClass().getName());
		System.out.println("ec.hashCode() >>> : " + Integer.toHexString(ec.hashCode()));
		// System.identityHashCode(Object x)
		System.out.println("기계 >>> : " + System.identityHashCode(ec));

		// 생성자 오버로딩 호출 하기 
		Ex_Const ec_1 = new Ex_Const("김상진");
		System.out.println("ec_1 주소값 >>> : " + ec_1); // toString() 생략된 것 

		Ex_Const ec_2 = new Ex_Const(29);
		System.out.println("ec_2 주소값 >>> : " + ec_2); // toString() 생략된 것 

		Ex_Const ec_3 = new Ex_Const("김상진", 29);
		System.out.println("ec_3 주소값 >>> : " + ec_3); // toString() 생략된 것 
		

	}
}

/*
class ConstTest_1 extends java.lang.Object
{
	public ConstTest_1(){
		System.out.println("ConstTest_1() 생성자 >>> : ");
	}

	public ConstTest_1(String name){
		System.out.println("ConstTest_1(String name) 생성자 >>> : ");
		System.out.println("ConstTest_1() 생성자 name >>> : " + name);
	}
}
*/