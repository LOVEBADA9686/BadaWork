// package
package a.b.c.ch5;

// import
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;


// 참조변수 사용법

/*
사용자정의 Ex_Reference 클래스의 자원 = 변수 3개 + 함수 1개
변수 3개, 
	상수 CONST_VAL 
	멤버변수 s
	멤버변수 i
함수 1개 
	Ex_Reference() 생성자 

위 자원을 사용하려고 
Ex_Reference exr = new Ex_Reference();
참조변수 exr 을 가지고 s, i 
*/
public class Ex_Reference
{
	// 상수
	public static final String CONST_VAL = "문자상수";
	// 멤버변수
	String s;
	int i;
	// 생성자
	public Ex_Reference(){
		System.out.println("Ex_Reference() 생성자");
	}

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		/*
			1. 참조변수는 주소값을 리턴한다.
			2. 주소값이 가르키는 데이터는 여러개 이다. 
			3. 빌트인 클래스에서 문자열, 문자, 숫자, 날짜, 데이터를 사용하는 클래스들은
			   참조변수에 주소값 대신 값을 나타낸다.
			   이유는 개발을 용이하게 하기위해서이다.
		*/
		// 사용자 정의 클래스를 new 연산자를 이용해서 참조변수로 사용하는 방법 
		Ex_Reference exr = new Ex_Reference();
		System.out.println("\n참조변수 주소값 :: exr >>> : " + exr);
		System.out.println("exr >>> : " + System.identityHashCode(exr));
		System.out.println("참조변수 주소값 :: exr.s >>> : " + exr.s);
		System.out.println("참조변수 주소값 :: exr.i >>> : " + exr.i);

		TestVO tvo = new TestVO();
		System.out.println("\n참조변수 주소값 :: tvo >>> : " + tvo);
		System.out.println("tvo >>> : " + System.identityHashCode(tvo));

		// rt.jar : built-in class : labrary : reference 사용하기 
		
		// 문자열
		String s = "abc";
		System.out.printl`n("\n참조변수 주소값 :: s >>> : " + s);
		System.out.println("s >>> : " + System.identityHashCode(s));

		String s1 = new String("abc");
		System.out.println("\n참조변수 주소값 :: s1 >>> : " + s1);
		System.out.println("s1 >>> : " + System.identityHashCode(s1));

		// 숫자
		Integer i = new Integer(10);
		System.out.println("\n참조변수 주소값 :: i >>> : " + i);
		System.out.println("i >>> : " + System.identityHashCode(i));
		
		// 날짜
		Date d = new Date();
		System.out.println("\n참조변수 주소값 :: d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));

		Calendar c = Calendar.getInstance();
		System.out.println("\n참조변수 주소값 :: c >>> : " + c);
		System.out.println("c >>> : " + System.identityHashCode(c));

		// 데이터 
		int ii[] = new int[3];
		System.out.println("\n참조변수 주소값 :: ii >>> : " + ii);
		System.out.println("ii >>> : " + System.identityHashCode(ii));

		ArrayList aList = new ArrayList();
		System.out.println("\n참조변수 주소값 :: aList >>> : " + aList);
		System.out.println("aList >>> : " + System.identityHashCode(aList));

		HashMap hp = new HashMap();
		System.out.println("\n참조변수 주소값 :: hp >>> : " + hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));
		
	}
}

/*
사용자정의 TestVO 클래스 자원 = 변수 2개 + 함수 5개;
변수 2개 
	멤버변수 sval
	멤버변수 ival
함수 5개 
	setSval(String sval)
	setIval(String ival)
	getSval()
	getIval()
	TestVO() 생성자
*/
class TestVO
{
	private String sval;
	private String ival;

	public TestVO(){
		
	}

	public void setSval(String sval){
		this.sval = sval;
	}
	public void setIval(String ival){
		this.ival = ival;
	}

	public String getSval(){
		return this.sval; 
	}
	public String getIval(){
		return this.ival; 
	}

}