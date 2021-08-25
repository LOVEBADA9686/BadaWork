// package
package a.b.c.ch4;

// import

public class  Ex_MessageTest
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_MessageInterface eme = new Ex_MessageEngImpl();
		eme.sayHello("Hyun Byung eun");

		Ex_MessageInterface emk = new Ex_MessageKorImpl();
		emk.sayHello("현병은");

	}
}


/*
// Ex_MessageInterface.java
// package a.b.c.ch4;
// public interface Ex_MessageInterface
interface Ex_MessageInterface
{
	public void sayHello(String name);
}

// Ex_MessageEngImpl.java
// package a.b.c.ch4;
// public class Ex_MessageEngImpl implements Ex_MessageInterface
class Ex_MessageEngImpl implements Ex_MessageInterface
{
	@Override
	public void sayHello(String name){
		System.out.println("Hello, " + name + "!!");
	}
}

// Ex_MessageKorImpl.java
// package a.b.c.ch4;
// public class Ex_MessageKorImpl implements Ex_MessageInterface
class Ex_MessageKorImpl implements Ex_MessageInterface
{
	@Override
	public void sayHello(String name){
		System.out.println("안녕하세요, " + name + "!!");
	}
}
*/