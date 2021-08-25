// package
package a.b.c.ch4;

// import

// ConstTest_1 : 부모 클래스 
// Ex_Const_1 : 자식 클래스 
public class Ex_Const_1 extends ConstTest_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public Ex_Const_1(){
		super("부모클래스 생성자 호출");
		System.out.println("Ex_Const_1() 생성자 >>> : ");
	}

	public Ex_Const_1(String src){
		super(src);
		System.out.println("Ex_Const_1(String src) 생성자 >>> : ");
		System.out.println("Ex_Const_1(String src) 생성자 src >>> : " + src);
	}
	
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_Const_1 ec1 = new Ex_Const_1();
		System.out.println("ec1 >>> : " + ec1);

		Ex_Const_1 ec2 = new Ex_Const_1("부모클래스생성자호출");
		System.out.println("ec2 >>> : " + ec2);
	}
}
/*
class ConstTest_2 extends java.lang.Object
{
	public ConstTest_2(){
		System.out.println("ConstTest_2() 생성자 >>> : ");		
	}

	public ConstTest_2(String name){
		System.out.println("ConstTest_2(String name) 생성자 >>> : ");
		System.out.println("ConstTest_2() 생성자 name >>> : " + name);
	}
}
*/