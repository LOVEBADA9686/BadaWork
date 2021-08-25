// package
package aaa.bbb;

// import
import java.util.Date;
import java.util.Calendar;

/*
오버라이딩 : Overrideing
1. 상속 관계에서 일어나는 일이다. : extends, implements 
2. 부모클래스에 있는 자원 중 함수를 자식클래스로 함수를 가져오는 행위
3. 오버라이딩 한 함수 위에는  @Override 라고 오버라이드 어노테이션을 기술해야 한다. 
*/

public class Ex_A extends B
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:7: error: Ex_A is not abstract and does not override abstract method b() in B
public class Ex_A extends B
       ^
1 error
*/
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// jdk 1.5 추가된 @ 어노테이션 기술 
	// 1. 함수에 대한 설명
	// 2. 실제로 인터페이스 역활 : 물리적 기능을 하는 것
	// @Override : 부모클래스에서 b() 함수를 자식클래스로 오버라이딩 했다 
	@Override
	public void b(){
		System.out.println("B 추상클래스에있는 b() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
		System.out.println("추상함수를 자식클래스로 오버라이딩할 때는 abstract 키워드를 제거한다.");
	}

	@Override
	public void b_1(){
		System.out.println("B 추상클래스에있는 b_1() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
		System.out.println("추상함수를 자식클래스로 오버라이딩할 때는 abstract 키워드를 제거한다.");
	}

	@Override
	public void b_2(){
		System.out.println("B 추상클래스에있는 b_2() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
		System.out.println("추상함수를 자식클래스로 오버라이딩할 때는 abstract 키워드를 제거한다.");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// B 추상 클래스 사용하기 
		// 1. 추상 클래스는 자기 자신 클래스를 인스턴스 할 수가 없다.
		// 2. 추상 클래스를 사용하는 방법이 여러개 있다.
		// 3. 상속하는 방법이 있다. 
		// 4. 추상 클래스는 클래스 이기 때문에 extends 키워드를 사용해서 상속한다. 
		// 5. 추상 클래스를 상속하면 자식 클래스에 추상함수는 꼭 오버라이이딩 해야 한다. 
		// B b = new B();
		
		// 자식클래스선언 자식클래스 참조변수선언 = new 자식클래스() 인스턴스 
		Ex_A ea = new Ex_A();
		ea.b();

		// 어렵겠지만 가능하면 부모클래스 참조변수를 사용하자 
		// 부모클래스선언 부모클래스 참조변수선언 = new 자식클래스() 인스턴스 
		B b1 = new Ex_A();
		b1.b();

		// 클래스이름.일반함수이름();
		B.staticB();

		// 추상클래스에서는 getInstance() 함수로 객체를 메모리에 올린다.
		// new 키워드 vs getInstance() 함수
		// new 키워드 : new 인스턴스할 때 마다 주소값이 변경된다.
		// getInstance() : 최초에 메모리에 올린 주소값 하나만 사용한다. 		
		Date d = B.getInstance();
		System.out.println("d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));

		Date da = new Date();
		System.out.println("da >>> : " + da);
		System.out.println("da >>> : " + System.identityHashCode(da));

		// 빌트인 Calendar 클래스 를 getInstance() 함수로 사용해 보기 
		Calendar rightNow = Calendar.getInstance();
		System.out.println("rightNow >>> : \n" + rightNow);
	}
}

// 추상 클래스
// 추상 함수를 만들려면 클래스도 추상 클래스이어야 한다. abstract 키워드를 사용해야 한다. 
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:23: error: B is not abstract and does not override abstract method b() in B
class B
^
1 error
*/
// class B
abstract class B
{
	/*
	public B(){
		System.out.println("B() 생성자");
	}
	*/
	// 추상 함수 : 함수에 {} 없다 : 함수를 구현 할 수가 없다. 
	// 추상 함수를 사용하려면 클래스 상속을 해서 
	// 자식 클래스에서 추상 함수를 오버라이딩 해서 
	// {} 추가한 후 구현체를 만는다. 
	public abstract void b();
	// public abstract void b(){}
	/*
	C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
	Ex_A.java:29: error: abstract methods cannot have a body
        public abstract void b(){}
                             ^
	1 error
	*/

	public abstract void b_1();
	public abstract void b_2();
	// 추상클래스에서도 일반 함수를 허락한다. 
	public void bM(){
		System.out.println("나는 추상클래스 B에 있는 일반함수 bM() 이다. ");
	}

	public static void staticB(){
		System.out.println("나는 추상클래스 B에 있는 static 일반함수 staticB() 이다. ");
		System.out.println("static 일반함수 staticB() 를 호출해서 변경하면 않된다.  ");
	}


	public static Date getInstance(){
		return new Date();
	}
}

// 인터페이스 클래스 
interface C
{
	public void c();
}