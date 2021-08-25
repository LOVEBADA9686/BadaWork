package a.b.c.ch1;

public class Ex_Const {

	// 멤버 변수 
	int i;
	char c;
	double d;
	boolean b;
	String s;

	// 생성자
	/*
	public Ex_Const(){
		System.out.println("Ex_Const() 생성자 >>> : ");
	}
	*/

	public static void main(String[] args){
		/*
		1. Ex_Const 사용자 정의 클래스를 사용하려고 선언
		2. Ex_Const 클래스를 사용하기 위한 변수를 선언 : 참조변수 : reference variable 
		3. = : 대입 연산자 
		4. new : new 키워드(연산자) : JVM이 new 키워드를 보면는 광분을 한다. 
								   new 키워드 뒤에오는 
			                       클래스이름() 생성자를 자바 소스코드에서 찾는다.
								   (Ex_Const() 생성자를 자바 소스코드에서 찾는다.)
			                       클래스이름() 생성자를 찾으면 이 생성자를 메모리에 로드한다.
			                       메모리에 로드 하면서 
								   멤버 필드에있는 변수들을 디폴트 값으로 초기화 한다. 
		*/
		Ex_Const ex_c = new Ex_Const();
		System.out.println("ex_c 주소값 >>> : " + ex_c);
		System.out.println("ex_c.i >>> : " + ex_c.i);
		System.out.println("ex_c.c >>> : " + ex_c.c);
		System.out.println("ex_c.d >>> : " + ex_c.d);
		System.out.println("ex_c.b >>> : " + ex_c.b);
		System.out.println("ex_c.s >>> : " + ex_c.s);

		Ex_Const ex_c_1 = new Ex_Const();
		System.out.println("ex_c_1 주소값 >>> : " + ex_c_1);
		System.out.println("ex_c_1.i >>> : " + ex_c_1.i);
		System.out.println("ex_c_1.c >>> : " + ex_c_1.c);
		System.out.println("ex_c_1.d >>> : " + ex_c_1.d);
		System.out.println("ex_c_1.b >>> : " + ex_c_1.b);
		System.out.println("ex_c_1.s >>> : " + ex_c_1.s);

	} // end of main 함수 

} // end of Ex_Const 클래스 

/*
##############################################
public Ex_Const(){
	System.out.println("Ex_Const() 생성자 >>> : ");
}

C:\00.KOSMO93\10.JExam\ch1>javap a.b.c.ch1.Ex_Const
Compiled from "Ex_Const.java"
public class a.b.c.ch1.Ex_Const {
  int i;
  char c;
  double d;
  boolean b;
  java.lang.String s;
  public a.b.c.ch1.Ex_Const();
  public static void main(java.lang.String[]);
}

##############################################
// public Ex_Const(){
//	System.out.println("Ex_Const() 생성자 >>> : ");
// }

C:\00.KOSMO93\10.JExam\ch1>javap a.b.c.ch1.Ex_Const
Compiled from "Ex_Const.java"
public class a.b.c.ch1.Ex_Const {
  int i;
  char c;
  double d;
  boolean b;
  java.lang.String s;
  public a.b.c.ch1.Ex_Const();
  public static void main(java.lang.String[]);
}

소스코드 상에 
생성자를 기술하지 않고 (소스코드를 작성하지 않은 상태에서)
클래스이름() : 매개변수가 없는 생성자를 요청하며는
Ex_Const ex_c = new Ex_Const();
JVA 이 기본 생성자 : default Constructor 를 
만들어 준다. 
이 기본 생성자가 멤버 필드에 있는 변수들을
그 변수의  default value 로 초기화 한다. 
*/