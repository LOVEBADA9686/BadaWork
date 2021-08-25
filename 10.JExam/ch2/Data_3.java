package a.b.c.ch2;


public class Data_3 {
	
	// 멤버변수
	// 클래스 내부에서 (함수 밖)에 선언하는 멤버변수는 선언 만 해서 사용한다.
	// 클래스를 인스턴스 하는 과정에서 생성자로 초기화 하기 때문이다.
	// 멤버변수는 참조변수를 초기화 한다.
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;

	public Data_3(){
		System.out.println("Data_3 클래스 Data_3() 생성자");
	}

	public static void main(java.lang.String[] args){

		DefaultValue dv = new DefaultValue();
		System.out.println("DefaultValue()의 dv 주소값 " + dv);
		System.out.println("byte 디폴트 값	 :: dv.b >>>     : " + dv.b);
		System.out.println("char 디폴트 값	 :: dv.c >>>     : " + dv.c);
		System.out.println("short 디폴트 값 :: dv.s >>>    : " + dv.s);
		System.out.println("int 디폴트 값	:: dv.i >>>      : " + dv.i);
		System.out.println("float 디폴트 값 :: dv.f >>>    : " + dv.f);
		System.out.println("double 디폴트 값 :: dv.d >>>	 : " + dv.d);
		System.out.println("boolean 디폴트 값 :: dv.bo >>> : " + dv.bo);
		System.out.println("String 디폴트 값 :: dv.str >>> : " + dv.str);

		Data_3 d3 = new Data_3();
		System.out.println("Data_3()의 d3 주소값 " + d3);
		System.out.println("byte 디폴트 값	 :: d3.b >>>     : " + d3.b);
		System.out.println("char 디폴트 값	 :: d3.c >>>     : " + d3.c);
		System.out.println("short 디폴트 값 :: d3.s >>>    : " + d3.s);
		System.out.println("int 디폴트 값	:: d3.i >>>      : " + d3.i);
		System.out.println("float 디폴트 값 :: d3.f >>>    : " + d3.f);
		System.out.println("double 디폴트 값 :: d3.d >>>	 : " + d3.d);
		System.out.println("boolean 디폴트 값 :: d3.bo >>> : " + d3.bo);
		System.out.println("String 디폴트 값 :: d3.str >>> : " + d3.str);


	} // end of main 함수 
	
} // end of Data_2

class DefaultValue
{
	// 멤버변수 
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	// 매개변수 없는 기본생성자 선언 
	public DefaultValue(){
		System.out.println("DefaultValue 클래스 DefaultValue() 생성자");
	}

}
